
package hastaneotomasyonu;
import java.util.ArrayList;
public class Hastalar {
    private ArrayList<String> isim=new ArrayList<String>();
    private  ArrayList<Integer> yas=new ArrayList<Integer>();
    private ArrayList<String> hastalık=new ArrayList<String>();
 
    
    public Hastalar(){     
   }

   
   
    public void hasta_adi_ekle(String ad)
    {
        isim.add(ad);
   }   
    public void yas_ekle(int yası)
    {
        yas.add(yası);
    }
   
   public void hastalik_ekle(String hastalik){
       hastalık.add(hastalik);
   }
    
   public void yazdır()//hastanın adını yasını ve randevu aldığı tıbbi birimi yazdıran metod
   {
       for(int i=0;i<isim.size();i++)
       {
           System.out.println(isim.get(i)+" "+yas.get(i)+" "+hastalık.get(i));
       }
   }
    
}
