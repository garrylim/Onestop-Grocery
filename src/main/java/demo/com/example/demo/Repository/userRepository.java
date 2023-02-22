package demo.com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import demo.com.example.demo.Entity.userEntity;
<<<<<<< Updated upstream

@Repository
public interface userRepository extends JpaRepository<userEntity, Integer> {

	@Query("SELECT u FROM User u where u.email = :email")
	public userEntity findUserByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public userEntity findUserByUsername(String username);
}
=======
import java.util.ArrayList;
import java.util.List;

@Repository
public class userRepository {
	
	private List<userEntity> users = new ArrayList<>();

	public void saveUser(userEntity user) {
		users.add(user);
	}

	public userEntity findUserByEmail(String email) {
		for (userEntity user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

	public userEntity findUserByUsername(String username) {
		for (userEntity user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}
>>>>>>> Stashed changes
