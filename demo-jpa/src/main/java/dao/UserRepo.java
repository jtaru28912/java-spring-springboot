package dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.User;
@Repository
public interface UserRepo extends CrudRepository<User,Integer>{
	

}
