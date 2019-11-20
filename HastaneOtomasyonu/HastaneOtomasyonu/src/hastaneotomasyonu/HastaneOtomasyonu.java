
package hastaneotomasyonu;

import java.util.ArrayList;
import java.util.Scanner;
public class HastaneOtomasyonu {
 
  
    public static void main(String[] args) {
        Doktorlar d=new Doktorlar();
        Hastalar h=new Hastalar();
      TıbbiBirimler t=new TıbbiBirimler();
      RandevularH randevu1=new RandevularH();
      Laboratuvar lab=new Laboratuvar();
      
      System.out.println("q-ÇIKIŞ");
        System.out.println("hastanenin tıbbi birimleri");
      
      Scanner s=new Scanner(System.in);
        t.birimler();
            
        
         System.out.println("pazar günleri acil birim hariç diğer tıbbi birimlerimiz hizmet vermemektedir");
     while(true){
          
         System.out.println("lütfen bir tane tıbbi birim seçiniz:");
        String secim=s.nextLine();
  
        if(secim.equals("q"))
        {
            System.out.println("sistemden çıkış yapılıyor..."); 
            break;
     }
                
        else if(secim.equals("1"))
        {
           d.acil_doktorları();
            System.out.println("lütfen acil doktoru secimi yapınız:(1-5 arası)");
            String secim2=s.nextLine();
            s.nextLine();
              if(secim2.equals("1"))
                    {
                        System.out.println("doktorun tatil günü pazartesi");
                        d.hasta_arttır();
                    }
              else if(secim2.equals("2"))
              {
                  System.out.println("doktorun tatil günü salı ");
                  d.hasta_arttır();
                          
              }
              else if(secim2.equals("3"))
              {
                  System.out.println("doktorun tatil günü çarşamba");
                  d.hasta_arttır();
              }
              else if(secim2.equals("4"))
              {
                  System.out.println("doktorun tatil günü perşembe");
                  d.hasta_arttır();
              }
              else{
                  System.out.println("doktorun tatil günü cuma");
                  d.hasta_arttır();
              }
        
        }
        else if(secim.equals("2"))
        {
            d.bashekim();
      }
        else if(secim.equals("3"))
        {
            d.beslenme_diyet();
            
            System.out.println("lütfen diyetisyen secimi yapınız:(1-2 arası)");
            String secim2=s.nextLine();
             s.nextLine();
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü cumartesi");
                d.hasta_arttır();
            }
            else{
                System.out.println("doktorun tatil günü cuma");
                d.hasta_arttır();
            }
             
            
        }
        else if(secim.equals("4"))
        {
           d.cocuk_cerrahi();
            System.out.println("hastanemizde sadece 1 tane cocuk allerjisi bölümü doktoru vardır."
                    + "doktorun tatil günü perşembe"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            }
             s.nextLine();
        }
        else if(secim.equals("5"))
        {
            d.cocuk_allerjisi();
            System.out.println("lütfen doktor secimi yapınız(1-2 arası):");
            String secim2=s.nextLine();
            
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü salı");
                d.hasta_arttır();
            }
            else
            {
                System.out.println("doktorun tatil günü cumartesi");
                d.hasta_arttır();
            }
            
        }
        else if(secim.equals("6"))
        {
            d.dahiliye();
              System.out.println("hastanemizde sadece 1 tane dahiliye bölümü doktoru vardır."
                    + "doktorun tatil günü perşembe"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            }
             s.nextLine();
        }
        else if(secim.equals("7"))
        {
            d.dermatoloji();
            System.out.println("lütfen doktor secimi yapınız");
            String secim2=s.nextLine();
           
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü cumartesi");
                d.hasta_arttır();
            }
            else{
                System.out.println("doktorun tatil günü cuma");
                d.hasta_arttır();
            } 
        }
        
        else if(secim.equals("8"))
        {
            d.estetik();
              System.out.println("hastanemizde sadece 1 tane estetik bölümü doktoru vardır."
                    + "doktorun tatil günü perşembe"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            } s.nextLine();
            
        }
        else if(secim.equals("9"))
        {
            d.genel_cerrahi();
            System.out.println("genel cerrahi seçimi yapınız:");
            String secim2=s.nextLine();
            
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü perşembe");
                d.hasta_arttır();
            }
            else
            {
                System.out.println("doktorun tatil günü pazartesi");
                d.hasta_arttır();
            }
             
        }
        else if(secim.equals("10"))
        {
            d.gogus_hastaliklari();
            System.out.println("doktor seçimi yapınız:(1-3)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü cuma");
                d.hasta_arttır();
            }
            else if(secim2.equals("2"))
            {
                System.out.println("doktorun tatil günü salı");
                d.hasta_arttır();
            }
            else{
                System.out.println("doktorun tatil günü cumartesi");
                d.hasta_arttır();
            }
             
        }
        else if(secim.equals("11"))
        {
            d.kalp_damar_cerrahisi();
               System.out.println("hastanemizde sadece 1 tane damar cerrahisi bölümü doktoru vardır."
                    + "doktorun tatil günü perşembe"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            }
            
        }
        
        else if(secim.equals("12"))
        {
            d.kbb();
            System.out.println("doktor secimi yapınız(1-2 arası)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals(1))
            {
                System.out.println("doktorun tatil günü salı:");
                d.hasta_arttır();
            }
            else{
                System.out.println("doktorun tatil günü çarşamba");
                d.hasta_arttır();
            }
        }
        else if(secim.equals("13"))
        {
            d.nefroloji();
                 System.out.println("hastanemizde sadece 1 tane nefroloji bölümü doktoru vardır."
                    + "doktorun tatil günü salı"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
           
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            }
             
        }
        
        else if(secim.equals("14"))
        {
            d.noroloji();
                   System.out.println("hastanemizde sadece 1 tane nöroloji bölümü doktoru vardır."
                    + "doktorun tatil günü salı"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            }
             s.nextLine();
        }
        else if(secim.equals("15"))
        {
            d.obezite();
            System.out.println("doktor secimi yapınız (1-2 arası)");
            String secim2=s.nextLine();
            
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü salı");
                d.hasta_arttır();
            }
            else{
                System.out.println("doktorun tatil günü çarşamba");
                d.hasta_arttır();
            }
            
        }
        else if(secim.equals("16"))
        {
            d.onkoloji();
            System.out.println("lütfen doktor secimi yapınız(1-2 arası)");
            String secim2=s.nextLine();
            s.nextLine();
            if(secim2.equals("1"))
            {
                System.out.println("doktorun tatil günü çarşamba");
                d.hasta_arttır();
            }
            else{
                System.out.println("doktorun tatil günü cuma");
                d.hasta_arttır();
            }
         
        }
        else if(secim.equals("17"))
        {
            d.ortopedi();
                   System.out.println("hastanemizde sadece 1 tane ortopedi bölümü doktoru vardır."
                    + "doktorun tatil günü salı"
                    + "doktordan randevu almak istiyor musunuz:(e/h)");
            String secim2=s.nextLine();
           s.nextLine();
            if(secim2.equals("e"))
            {
                d.hasta_arttır();
            }
            
        }
        else{
            System.out.println("hatalı bir işlem seçimi yaptınız...");
            break;
        }
        s.nextLine();
      }

        System.out.println(d.getHasta_sayisi());//hastanenin toplam hasta sayısı
        
        
        
        while(true)
        {
            
            System.out.print("hastanın adı ve soyadı(arada boşluk bırakınız):");
            String isim=s.nextLine();
            if(isim.equals("q"))
            {
                break;
            }
            else{
                
                System.out.print("hastanın yaşı:");
                int yas=s.nextInt();
                s.nextLine();
                System.out.println("hangi birimden randevu alacaksınız?");
                String hastalık=s.nextLine();
                h.hasta_adi_ekle(isim);
                h.hastalik_ekle(hastalık);
                h.yas_ekle(yas);    
                randevu1.hasta_adi_ekle(isim);
                
            }
   }
        h.yazdır();
        
        System.out.println("hastanedeki laboratuvar hizmetleri:");
        lab.lab();
        System.out.println("laboratuvarların çalışma saatleri 09.00 ile 17.00 arasıdır.");
        lab.calisma_saati();
     
          }
    
   
}
