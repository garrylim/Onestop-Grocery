package demo.com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import demo.com.example.demo.Entity.storeEntity;

@Repository
public interface storeRepository extends JpaRepository<storeEntity, Long> {

    @Query("SELECT se FROM storeEntity se WHERE LOWER(se.name) LIKE LOWER(CONCAT('%', :keyword, '%'))"
    + " OR LOWER(se.phoneNumber) LIKE LOWER(CONCAT('%', :keyword, '%'))"
    + " OR LOWER(se.localities) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<storeEntity> searchStores(@Param("keyword") String keyword);
    

}



