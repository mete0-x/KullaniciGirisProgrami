
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
       
    //  While döngüsü yardımıyla kullanıvı giriş programı


       Scanner scanner = new Scanner(System.in);
 
       int giris_hakkı = 3;

       String sys_kullanici_adi = "Metehan TURGUT";
       String sys_parola = "123456";

       System.out.println("*************************************");
       System.out.println("Kullanıcı Grişine Hoşgeldiniz...");
       System.out.println("*************************************");

       while(true){
           System.out.println("Kullanıcı Adı : ");
           String kullanıcı = scanner.nextLine();
           System.out.println("Parola : ");
           String parola = scanner.nextLine();

             if(kullanıcı.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                 System.out.println("Hoşgeldiniz " +kullanıcı);
                 break;
            }
             else if(kullanıcı.equals(sys_kullanici_adi ) && !parola.equals(sys_parola)){
                 System.out.println("Parolanız yanlış ");
                 giris_hakkı -=1;   
            }
            else if(!kullanıcı.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                 System.out.println("Kullanıcı adınız yanlış");
                 giris_hakkı -=1;
           }
            else{
                 System.out.println("kullanıcı adınız ve parolanız yanlıştır.");
                 giris_hakkı -=1;
          }
                 if(giris_hakkı ==0){
                     System.out.println("Giriş hakkınız bitti.");
                }






        }
}
}