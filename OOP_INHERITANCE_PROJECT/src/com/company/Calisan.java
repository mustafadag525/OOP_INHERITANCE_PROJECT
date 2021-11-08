package com.company;

public class Calisan {

    private String ad;
    private String soyad;
    private  int id;

    public Calisan(String ad,String soyad,int id)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
    }

    public void setAd(String ad)
    {
        this.ad=ad;
    }
    public String getAd()
    {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void bilgigoster()
    {
        System.out.println("çalısan bilgileri");
        System.out.println("ad: "+getAd());
        System.out.println("soyad: "+getSoyad());
        System.out.println("id: "+getId());
    }
}
