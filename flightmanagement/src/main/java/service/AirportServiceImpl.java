package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import exception.RecordAlreadyPresentException;
import exception.ResourceNotFoundException;
import model.Airport;
import repositories.AirportDao;
@ComponentScan("repositories")
@Service
public class AirportServiceImpl implements AirportService {
	@Autowired
	AirportDao airportDao;
	@Override
	public Iterable<Airport> viewAllAirport() {
		return  airportDao.findAll();
	}
	@Override
	public Airport viewAirport(String airportCode) {
		Optional<Airport> findById = airportDao.findById(airportCode);
		if (findById.isPresent()) {
			return findById.get();
		}

		// return new ResponseEntity<Airport>(airport, HttpStatus.OK)}
		else
			throw new ResourceNotFoundException("Airport with airport code: " + airportCode + "not exists", findById, airportCode);
	}
	
	@Override
	public ResponseEntity<?> addAirport(Airport airport) {
		Optional<Airport> findById = airportDao.findById(airport.getAirportCode());
		try {
			if (!findById.isPresent()) {
				airportDao.save(airport);
				return new ResponseEntity<Airport>(airport, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"Airport with code : " + airport.getAirportCode() + " already present");
		} catch (RecordAlreadyPresentException e) {
			return new ResponseEntity<Airport>(airport, HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * modify an Airport
	 */
	@Override
	public Airport modifyAirport(Airport airport) {
		Optional<Airport> findById = airportDao.findById(airport.getAirportCode());
		if (findById.isPresent()) {
			airportDao.save(airport);
		} else
			throw new ResourceNotFoundException("Airport with code: " + airport.getAirportCode() + " not exists", findById, null);
		return airport;
	}

	/*
	 * remove an airport
	 */
	@Override
	public String removeAirport(String airportCode) {
		Optional<Airport> findById = airportDao.findById(airportCode);
		if (findById.isPresent()) {
			airportDao.deleteById(airportCode);
			return "Airport removed";
		} else
			throw new ResourceNotFoundException("Airport with code: " + airportCode + " not exists", findById, airportCode);

	}
}
