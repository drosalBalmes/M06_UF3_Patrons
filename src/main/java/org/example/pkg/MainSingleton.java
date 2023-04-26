package org.example.pkg;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1.equals(s2)){
            System.out.println("S1: " + s1.getUuid());
            System.out.println("S2: " + s2.getUuid());
        }
    }
}
