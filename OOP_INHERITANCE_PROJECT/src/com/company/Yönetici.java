package com.company;

public class Yönetici extends  Calisan{
    private int sorumlu_KisiSayısı;

    public Yönetici(String ad, String soyad, int id, int sorumlu_KisiSayısı) {
        super(ad, soyad, id);
        this.sorumlu_KisiSayısı = sorumlu_KisiSayısı;
    }

    @Override
    public void bilgigoster() {
        super.bilgigoster();
        System.out.println("yöneticinin sorumlu olduğu kişi sayısı: "+sorumlu_KisiSayısı);
    }
    public void zamyap(double zam_miktarı)
    {
        System.out.println(getAd() +" calışanlara "+ zam_miktarı + " kadar zam yapıyor" );
    }
}
