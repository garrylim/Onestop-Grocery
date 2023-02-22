package demo.com.example.demo.Repository;

<<<<<<< Updated upstream
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> Stashed changes
import org.springframework.stereotype.Repository;

import demo.com.example.demo.Entity.storeEntity;

@Repository
<<<<<<< Updated upstream
public interface storeRepository extends JpaRepository<storeEntity, Integer> {

    @Query("SELECT s FROM Store s WHERE s.name = :name")
    public storeEntity findStoreByName(String name);
=======
public class storeRepository {

    private List<storeEntity> storeList = new ArrayList<>();

    public void addStore(storeEntity store) {
        storeList.add(store);
    }

    public storeEntity findStoreByName(String name) {
        for (storeEntity store : storeList) {
            if (store.getName().equals(name)) {
                return store;
            }
        }
        return null;
    }
>>>>>>> Stashed changes
}
