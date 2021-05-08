package business.concretes;

import business.abstracts.VerificationService;
import entities.concretes.User;

public class VerificationManager implements VerificationService{

	
    @Override
    public boolean mailaut(User user) {

        String phone = user.geteMail();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean result = phone.matches(regex);
        if(result) {
           return  true;
        } else {
            System.out.println("Girilen Mail Formatý Yanlýþ, tekrar deneyiniz!");
            return false;
        }
      

    }

    @Override
    public boolean passwordaut(User user) {
        if (user.getPassword().length() >= 6 ){
            System.out.println(" Þifre oluþturuldu, doðrulama kodu gönderildi, gelen kutunuzu kontrol edin. ");
            return true;
        }
        else {
            System.out.println(" Þifre oluþturulmadý : Karakter yetersiz! ");
            return false;
        }
        
    }

    @Override
    public boolean nameAndSurname(User user) {

        if (user.getName().length()<2 && user.getLastName().length()<2){
            System.out.println("Ad ve Soyad iki karakterden fazla olmalýdýr");
                   return false;
        } 
        else {
        	 System.out.println(" Geçerli ad ve soyad. ");
       return true ;
        }
    }
}

