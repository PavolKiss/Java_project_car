package sk.akademiasovy.java;

public class Main {
    public static void main(String[] args) {
        car car1;
        car car2;
        car1=new car();
        car2=new car("Skoda 120L",6.5f);

        //znacka auta
        car1.setBrand("Audi A8");
        car1.setGetConsumption(9.9f);

        car1.printInfo();
    }
}
