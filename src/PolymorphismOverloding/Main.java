package PolymorphismOverloding;

public class Main
{
    public static void main(String[] args) {
        Baike baike = new Baike();
        baike.run("runingg");
        baike.run("runing" , "hero");
        baike.run(1234);
    }
}
