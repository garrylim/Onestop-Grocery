package demo.com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import demo.com.example.demo.Entity.storeEntity;

@Repository
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
}
