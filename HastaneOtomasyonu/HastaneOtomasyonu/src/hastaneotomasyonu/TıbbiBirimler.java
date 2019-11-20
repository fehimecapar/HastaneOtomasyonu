
package hastaneotomasyonu;
import java.util.ArrayList;
import java.util.Scanner;

public class TıbbiBirimler extends Doktorlar {
    
    private ArrayList<String> adı= new ArrayList<String>();//tıbbi birimlerin adını bir arrayliste atadık

    public TıbbiBirimler() {
    }

    public TıbbiBirimler(ArrayList<String> doktor, int hasta_sayisi) {
        super(doktor, hasta_sayisi);
    }
   
    public void birimler() {
        
        adı.add("1-Acil Servis\n");
         adı.add("2-Başhekim\n");
        adı.add("3-Beslenme ve Diyet\n");
        adı.add("4-Çocuk cerrahisi\n");
        adı.add("5-Çocuk Allerjisi\n");
        adı.add("6-Deri ve Zührevi Hastalıkları(Dermatoloji)\n");
        adı.add("7-Estetik, Plastik ve Rekonstrüktif Cerrahisi\n");
        adı.add("8-Fizik Tedavi ve Rehabilitasyon\n");
        adı.add("9-Genel Cerrahi\n");
        adı.add("10-Göğüs Hastalıkları\n");
        adı.add("11-İç Hastalıkları(Dahiliye)\n");
        adı.add("12-Onkoloji");        
        adı.add("13-Kalp ve Damar Cerrahisi\n");
        adı.add("14-Kulak Burun Boğaz\n");
        adı.add("15-Nöroloji\n");
        adı.add("16-Nefroloji\n");
        adı.add("17-Obezite cerrahisi\n");
        adı.add("18-Ortopedi");
        System.out.println(adı);
    }
   
   

}