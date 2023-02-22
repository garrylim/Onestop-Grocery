package demo.com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import demo.com.example.demo.Services.PaymentService;

@Controller
public class CommonController {

    @Autowired
	private PaymentService paymentService;
    
    @GetMapping("/")
	public String homepage() {
		return "index";
	}
}
