package demo.com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.com.example.demo.Entity.userEntity;
import demo.com.example.demo.Repository.userRepository;

@Controller
public class CommonController {
    
	@Autowired
    private userRepository userRepository;

    @GetMapping("/")
	public String homepage() {
		return "index";
	}

    @GetMapping("/createUser")
    public String createUserPage() {
        return "createUser";
    }

    @PostMapping("/createUser")
    public String createUser(@RequestParam("email") String email, 
                             @RequestParam("username") String username, 
                             @RequestParam("password") String password,
                             Model model) {
        userEntity user = new userEntity(email, username, password);
        userRepository.addUser(user);
        System.out.println("Created new user: " + user.getEmail() + ", " + user.getUsername() + ", " + user.getPassword());
        model.addAttribute("message", "User created successfully!");
        return "index";
    }
}