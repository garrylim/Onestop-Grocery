package demo.com.example.demo.Controller;

import demo.com.example.demo.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BillingController {

    private final PaymentService paymentService;

    @Autowired
    public BillingController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/process-payment")
    public String processPayment(Model model) {
        PaymentService.PaymentProcessor paymentProcessor = new PaymentService().new GooglePayProcessor();

        PaymentService.BillingService billingService = paymentService.new BillingService(paymentProcessor);
        boolean paymentResult = billingService.processPayment();

        model.addAttribute("paymentResult", paymentResult);

        return "result";
    }

    @PostMapping("/process-payment")
    public String processPayment(@RequestParam("paymentMethod") String paymentMethod, Model model) {
        PaymentService.PaymentProcessor paymentProcessor;

        if (paymentMethod.equals("googlepay")) {
            paymentProcessor = new PaymentService().new GooglePayProcessor();
        } else if (paymentMethod.equals("creditcard")) {
            paymentProcessor = new PaymentService().new CreditCardProcessor();
        } else {
            // handle invalid payment method
            return "error";
        }

        PaymentService.BillingService billingService = paymentService.new BillingService(paymentProcessor);
        boolean paymentResult = billingService.processPayment();

        model.addAttribute("paymentResult", paymentResult);
        return "payment-result";
    }

}
