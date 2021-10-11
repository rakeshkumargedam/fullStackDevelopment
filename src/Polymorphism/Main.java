package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Firing firing = new Firing();
        Firing awmgun = new Awm();
        Firing m416gun = new M416();
        firing.bullet();
        awmgun.bullet();
        m416gun.bullet();
    }
}
