package demo.com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.com.example.demo.Entity.storeEntity;
import demo.com.example.demo.Services.storeService;

@Controller
public class storeController {

    @Autowired
    private storeService storeService;

    //create store
    @GetMapping("/createStore")
    public String showCreateStoreForm(Model model) {
        model.addAttribute("store", new storeEntity());
        return "createStore";
    }

    @PostMapping("/createStore")
    public String createStore(@ModelAttribute("store") storeEntity store) {
    storeService.createStore(store);
    return "redirect:/storeList";
    }

    @GetMapping("/storeList")
    public String showStoreList(@RequestParam(name = "q", required = false) String query, Model model) {
    if (query != null && !query.isEmpty()) {
        model.addAttribute("stores", storeService.searchStores(query));
    } else {
        model.addAttribute("stores", storeService.getAllStores());
    }
    return "storeList";
    }


    @GetMapping("/search")
    public String searchStores(@RequestParam(name = "q") String query, Model model) {
        model.addAttribute("stores", storeService.searchStores(query));
        return "search";
    }

     // Update Store
     @GetMapping("/updateStore/{id}")
     public String showUpdateForm(@PathVariable("id") Long id, Model model) {
         storeEntity store = storeService.getStoreById(id);
         model.addAttribute("store", store);
         return "updateStore";
     }
 
     @PostMapping("/updateStore/{id}")
     public String updateStore(@PathVariable("id") Long id, @ModelAttribute("store") storeEntity store) {
         storeService.updateStoreById(id, store);
         return "redirect:/storeList" + id;
     }
 
     // Delete Store
     @GetMapping("/deleteStore/{id}")
     public String deleteStore(@PathVariable("id") Long id, Model model) {
         storeService.deleteStore(id);
         return "redirect:/storeList";
     }
     
}

