package business.concretes;

import business.abstracts.ICustomerVerificationService;
import entities.concretes.Customer;

import java.util.*;

public class CustomerVerificationManager implements ICustomerVerificationService {
    List<String> verifyEmails;

    public CustomerVerificationManager() {
        this.verifyEmails = new ArrayList<>();
    }

    @Override
    public void sendToVerifyMail(Customer customer) {
        System.out.println(
                "Sayın " + customer.getFirstName()
                        + ", " + customer.getEmail() + " adresine doğrulama maili gönderildi!");
    }

    @Override
    public boolean verifyMail(String email) {
        // doğrulama mailine tıklandığında çalışacak ve doğrulanmış mailler listesine ekleyecek
        try {
            verifyEmails.add(email);
            System.out.println("Mail adresi doğrulandı! Giriş yapabilirsiniz !");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public boolean checkVerifyAccount(String email) {
        if (verifyEmails.contains(email)) {
            return true; // doğrulanmış email listemde varsa true
        }
        return false;
    }
}
