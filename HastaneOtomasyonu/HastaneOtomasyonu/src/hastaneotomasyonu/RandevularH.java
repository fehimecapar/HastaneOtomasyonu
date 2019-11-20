
package hastaneotomasyonu;
import java.util.Random;

public class RandevularH extends Hastalar {
    private int tarih;//tarihi yaklaşan veya geçmiş tarihteki randevu
    Random random= new Random();
    public RandevularH() {
        
    }
  public int getTarih() {
        return tarih;
    }
    public void setTarih(int tarih) {
        
        this.tarih = tarih;
        
    }

    @Override
    public void hasta_adi_ekle(String ad) {
        super.hasta_adi_ekle(ad); //To change body of generated methods, choose Tools | Templates.
        this.tarih=random.nextInt(30);//hastaya ay içindeki rastgele günlerin birinde randevu verir.
        this.tarih+=1;
        System.out.println(ad+" ayın "+tarih+". gününe randevunuz ayarlanmıştır.");
    }

  
    
    
    
    
}
