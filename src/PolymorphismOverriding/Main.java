package PolymorphismOverriding;

public class Main
{
    public static void main(String[] args) {
        Baike baike = new Baike();
        Baike Oil = new Oil();
        baike.run();
        Oil.run();

    }
}
