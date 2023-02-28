package demo.com.example.demo.Services;


import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public interface PaymentProcessor {
        boolean process();
    }
    
    public class GooglePayProcessor implements PaymentProcessor {
        public boolean process() {
            // process payment using Google Pay API 
            return false; //(we return to true because its just a test so we dont need to add google api in it) 
        }
    }
    
    public class CreditCardProcessor implements PaymentProcessor {
        public boolean process() {
            // process payment using credit card payment gateway
            return true;
        }
    }
    
    public class BillingService {
        private PaymentProcessor paymentProcessor;
    
        public BillingService(PaymentProcessor paymentProcessor) {
            this.paymentProcessor = paymentProcessor;
        }
    
        public boolean processPayment() {
            return paymentProcessor.process();
        }
    }
}

