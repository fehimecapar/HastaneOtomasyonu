
package hastaneotomasyonu;
import java.util.Random;
import java.util.ArrayList;
public class Laboratuvar { 
    private ArrayList<String> lab_adı=new ArrayList<String>();
    private int calisma_saati;//laboratuvarların çalışma saatleri...
    Random r=new Random();
    public Laboratuvar(){
        
    }

    public Laboratuvar( int calisma_saati) {
       
        this.calisma_saati = calisma_saati;
    }

    public void lab()
    {
        lab_adı.add("tahlil ünitesi");
        lab_adı.add("check-up");
        
        for(int i=0;i<lab_adı.size();i++)
        {
            System.out.println(lab_adı.get(i));
        }
    }


    
    public void calisma_saati()//laboratuvarların yoğun olarak çalıştığı saatleri random olarak verir.
    {
        for(int i=0;i<lab_adı.size();i++)
        {
             this.calisma_saati=r.nextInt(8);
        this.calisma_saati+=8;
            System.out.println(lab_adı.get(i)+" laboratuvarının yoğun olarak çalıştığı saat "+calisma_saati);
        }
    }
    
    
    
}
