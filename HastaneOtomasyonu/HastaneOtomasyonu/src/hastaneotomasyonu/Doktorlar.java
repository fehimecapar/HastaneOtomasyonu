
package hastaneotomasyonu;

import java.util.ArrayList;
public class Doktorlar {
    
    private ArrayList<String> doktor=new ArrayList<String>();//doktorun adı ve branşı
    private int hasta_sayisi=0;//hastanenin hasta sayısı
    
  
    
    public Doktorlar(){
        this.hasta_sayisi=0;
  }

    public Doktorlar(ArrayList<String> doktor, int hasta_sayisi) {
        this.doktor = doktor;
        this.hasta_sayisi = hasta_sayisi;
      
    }
    
 public int getHasta_sayisi() {
        return hasta_sayisi;
    }

    public void setHasta_sayisi(int hasta_sayisi) {
  
       this.hasta_sayisi = hasta_sayisi;
    }

    public void hasta_arttır()
    {
        setHasta_sayisi(hasta_sayisi++);
    }
    
    public void acil_doktorları()
    {
         doktor.add("1-Dr.HALİL BOYUNSUZ");
         doktor.add("2-Dr.HÜSEYİN ESEN");
         doktor.add("3-Dr.SEMA GÖRMEZ");
         doktor.add("4-Dr.SELİM TUNA UZALP");
         doktor.add("5-Dr.HALUK CEYLAN");
        System.out.println(doktor);
    }

    public void bashekim()
    {
       doktor.add("1-Uzm.Prof.Dr. MEHMET ÖZ");
        System.out.println(doktor);
    }
 
    public void beslenme_diyet()
    {
        doktor.add("1-Uzm.prof.Dr. CANAN KARATAY");
        doktor.add("2-Uzm.Dr.FATMA ALTUNER");
        System.out.println(doktor);
    }
    
    public void cocuk_cerrahi()
    {
       doktor.add("1-Uzm.Dr.EMİN YILMAZ");
       System.out.println(doktor);
    }
    public void cocuk_allerjisi()
    {
        System.out.println( doktor.add("1-Uzm.Dr.MEHMET ALICI"));
        System.out.println(doktor.add("2-Uzm.Dr.NESRİN GÜMÜŞ")); 
        System.out.println(doktor);
    }
    public void dermatoloji()
    {
        doktor.add("1-Uzm.Prof.Dr.İSMAİL SAPMAZ");
        doktor.add("2-Uzm.Dr.SERAP BİLEN");
        System.out.println(doktor);
    }
    public void estetik()
    {
        doktor.add("1-Uzm.Dr.PINAR OZTAS");
        System.out.println(doktor);
    }
    public void FTR()
    {
        doktor.add("1-Dr.BARIŞ DOĞAN");
        doktor.add("2-Uzm.Dr.BAŞAK ÖVEN");
        System.out.println(doktor);
    }
    public void genel_cerrahi()
    {
         System.out.println( doktor.add("1-Uzm.Dr.SERAP BOZDOĞAN"));
        System.out.println( doktor.add("2-Uzm.Dr.BARIŞ ÇABUK"));
        System.out.println(doktor);
    }
    public void gogus_hastaliklari()
    {
        doktor.add("1-Uzm.Dr.LEVENT KONUKOĞLU");
         doktor.add("2-Uzm.Dr.TOLGA MÜFTÜOĞLU");
         doktor.add("3-Uzm.Dr.AHMET YILMAZ");
         System.out.println(doktor);
    }
    public void dahiliye()
    {
        doktor.add("1-Uzm.Dr.AYGÜL ÇELİK");
        System.out.println(doktor);
    }
    
    public void onkoloji()
    {
       doktor.add("1-Uzm.Dr.CANAN ÖZCAN");
      doktor.add("2-Uzm.Dr.PINAR OZTAS");
      System.out.println(doktor);
    }
    public void kalp_damar_cerrahisi()
    {
       doktor.add("1-Uzm.Prof.Dr.İSMAİL SAPMAZ");
       System.out.println(doktor);
    }
    public void kbb()
    {
     doktor.add("1-Uzm.Dr.MEHMET ALICI");
      doktor.add("12-Uzm.Dr.NESRİN GÜMÜŞ");
      System.out.println(doktor);
    }
    public void noroloji()
    {
       doktor.add("1-Uzm.Dr.AYŞE YILMAZ");
       System.out.println(doktor);
    }
    public void nefroloji()
    {
        doktor.add("1-Uzm.Dr.MEHMET ABBAS");
        System.out.println(doktor);
    }
    public void obezite()
    {
       doktor.add("1-Uzm.Dr.CEM SOYLU");
        doktor.add("2-Uzm.Dr.DİLEK AYDIN");
        System.out.println(doktor);
    }
    public void ortopedi()
    {
       doktor.add("1-Uzm.Dr.AZİZ YEŞİL");
       
       System.out.println(doktor);
    }
}
