package business.abstracts;

import dataAccess.abstracts.IHibernateCustomerDao;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    ICustomerValidationService _customerValidation;
    IHibernateCustomerDao _customerDao;
    ICustomerVerificationService _customerVerification;

    public BaseCustomerManager(ICustomerValidationService customerValidation,
                           IHibernateCustomerDao customerDao,
                           ICustomerVerificationService customerVerification) {
        this._customerValidation = customerValidation;
        this._customerDao = customerDao;
        this._customerVerification = customerVerification;
    }

    @Override
    public void register(Customer customer) {
        if (_customerValidation.allCheck(customer, _customerDao.getAll())) {
            _customerVerification.sendToVerifyMail(customer);
        } else {
            System.out.println("kayıt olunamadı");
        }
    }

    @Override
    public void login(String email,String password) {

        if(_customerVerification.checkVerifyAccount(email)){ //doğrulanmış mail listesinde var mı ?
            Customer searchCustomer = _customerDao.get(email); //ilgili email adresinin sahibini getir
            if(searchCustomer.getEmail() == email && searchCustomer.getPassword() == password){ // email ve parola kontrol
                System.out.println("Giriş yapıldı!");
            }else{
                System.out.println("Mail veya şifre yanlış!");
            }
        }else{
            System.out.println("Hesap doğrulanmamış giriş yapılamadı");
        }
    }

    @Override
    public void verifyAccount(Customer customer) {
        //doğrulama mailine tıklanmış gibi simüle ediyoruz!
        if(_customerVerification.verifyMail(customer.getEmail())){
            _customerDao.add(customer); // kullanıcı kayıdı tamamlandı
        }
    }
}
