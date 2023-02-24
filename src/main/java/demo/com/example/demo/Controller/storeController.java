package demo.com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.com.example.demo.Entity.storeEntity;
import demo.com.example.demo.Repository.storeRepository;

@Controller
public class storeController {

    @Autowired
    private storeRepository storeRepository;

    @GetMapping("/createStore")
    public String addStore(Model model) {
        model.addAttribute("store", new storeEntity("",""));
        return "createStore";
    }

    @PostMapping("/createStore")
    public String createStore(@RequestParam("name") String name, @RequestParam("address") String address) {
        storeEntity store = new storeEntity(name, address);
        storeRepository.addStore(store);
        System.out.println("Store added: " + store.getName() + ", " + store.getAddress());
        return "index";
    }
}
