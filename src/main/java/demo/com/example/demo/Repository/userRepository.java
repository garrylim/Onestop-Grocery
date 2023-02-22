package demo.com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import demo.com.example.demo.Entity.userEntity;

@Repository
public interface userRepository extends JpaRepository<userEntity, Integer> {

	@Query("SELECT u FROM User u where u.email = :email")
	public userEntity findUserByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public userEntity findUserByUsername(String username);
}