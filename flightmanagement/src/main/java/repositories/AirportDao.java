package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Airport;

@Repository
public interface AirportDao extends CrudRepository<Airport, String> {


}
