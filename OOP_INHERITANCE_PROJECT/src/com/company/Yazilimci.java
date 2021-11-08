package com.company;

public class Yazilimci extends  Calisan{

    private String yazılım_dilleri;
    public Yazilimci(String ad,String soyad,int id,String yazılım_dilleri)
    {
        super(ad,soyad,id);
        this.yazılım_dilleri=yazılım_dilleri;
    }
    public void resetle(String isletim_sistemi)
    {
        System.out.println(getAd()+isletim_sistemi+" ni resetliyor");
    }

    @Override
    public void bilgigoster() {
        super.bilgigoster();
        System.out.println("yazılımcının bildiği diller: "+yazılım_dilleri);
    }
}
