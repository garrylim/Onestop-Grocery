package demo.com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import demo.com.example.demo.Entity.storeEntity;

@Repository
public interface storeRepository extends JpaRepository<storeEntity, Integer> {

    @Query("SELECT s FROM Store s WHERE s.name = :name")
    public storeEntity findStoreByName(String name);
}
