package org.com.repo;
import org.com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // storage for CRUD ops
public interface Userrepo extends JpaRepository<User, Long> {

	User findByPhone(String phone);

}
