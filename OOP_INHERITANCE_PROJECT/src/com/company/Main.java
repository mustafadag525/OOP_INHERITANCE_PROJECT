package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("hoş geldiniz: ");
        String islemler="islemler\n" +
                "1.Yazılımcı islemeleri\n" +
                "2.Yönetici islemleri" +
                "çıkış için a'ya bas";
        System.out.println("---------");
        System.out.println(islemler);
        System.out.println("---------");
        while (true)
        {
            System.out.println("islem seç: ");
            String islem=scanner.nextLine();
            if(islem.equals("a"))
            {
                System.out.println("çıkış yapılıyor");
                break;
            }
            else if(islem.equals("1"))
            {
                Yazilimci yazilimci=new Yazilimci("mustafa dağ","dağ",1,"java ,c , python");
                String yazılımcıislem="1.reset at\n" +
                        "2.bilgi göster\n" +
                        "çıkış için a'ya bas";
                while (true)
                {
                    System.out.println("islem seç: ");
                    String yazılımcı_islem=scanner.nextLine();
                    if (yazılımcı_islem.equals("a"))
                    {
                        System.out.println("yazılımcı islemden çıkılıyor: ");
                        break;
                    }
                    else if(yazılımcı_islem.equals("1"))
                    {
                        System.out.println("isletim sistemi");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.resetle(isletim_sistemi);
                    }
                    else if (yazılımcı_islem.equals("2"))
                    {
                        yazilimci.bilgigoster();
                    }
                    else
                    {
                        System.out.println("geçersiz yazılımcı islem");
                    }



                }
            }
            else if(islem.equals("2"))
            {
                Yönetici yönetici=new Yönetici("salih","can",2,10);
                String yonetici_islem="Yönetici islem\n" +
                        "1.Zam yap\n" +
                        "2.Bilgileri göster\n" +
                        "çıkış için a'ya bas";
                System.out.println("------");
                System.out.println(yonetici_islem);
                System.out.println("------");
                while (true)
                {
                    System.out.println("islem seç: ");
                    String y_islem=scanner.nextLine();
                    if (islem.equals("a"))
                    {
                        System.out.println("yönetici isleminden çıkılıyor");
                    }
                    else if (islem.equals("1"))
                    {
                        System.out.println("ne kadar zam yapılacak: ");
                        double zam=scanner.nextDouble();
                        scanner.nextLine();
                        yönetici.zamyap(zam);
                    }
                    else if (islem.equals("2"))
                    {
                        yönetici.bilgigoster();
                    }
                    else
                    {
                        System.out.println("hatalı islem");
                    }
                }
            }
            else
            {
                System.out.println("geçersiz islem");
            }
        }


    }
}
