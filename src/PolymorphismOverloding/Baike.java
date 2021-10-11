package PolymorphismOverloding;

public class Baike
{
    public void run(String BaikeStatus){
        System.out.println("baike staus is " + BaikeStatus);
    }
    public void run(String BaikeStatus , String BaikeName){
        System.out.println("baike status " +BaikeStatus + " baike Name " + BaikeName);
    }
    public void run(int baikenumbers){
        System.out.println("baike number" +baikenumbers);
    }
}
