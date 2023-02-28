package demo.com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.com.example.demo.Entity.storeEntity;
import demo.com.example.demo.Repository.storeRepository;

@Service
public class storeService {

    @Autowired
    private storeRepository storeRepository;

    public storeEntity createStore(storeEntity store) {
        return storeRepository.save(store);
    }

    public List<storeEntity> searchStores(String keyword) {
        return storeRepository.searchStores(keyword);
    }

    public void updateStore(storeEntity store) {
        storeRepository.save(store);
    }

    public void deleteStore(Long id) {
        storeRepository.deleteById(id);
    }

    public storeEntity getStoreById(Long id) {
        return storeRepository.findById(id).orElse(null);
    }
    
    public void updateStoreById(Long id, storeEntity store) {
        storeEntity existingStore = storeRepository.findById(id).orElse(null);
        if (existingStore != null) {
            existingStore.setName(store.getName());
            existingStore.setPhoneNumber(store.getPhoneNumber());
            existingStore.setLocalities(store.getLocalities());
            storeRepository.save(existingStore);
        }
    }

    public List<storeEntity> getAllStores() {
        return storeRepository.findAll();
    }
}
