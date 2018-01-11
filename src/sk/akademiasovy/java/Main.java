package sk.akademiasovy.java;

import java.util.Random;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Car car1;
        Car car2;
        Car car3;
        Car car4;
        car1 = new Car();
        car2 = new Car("Skoda 120L", 6.5f, "Presov","Gasoline");
        car3 = new Car("Seat Ibiza", 7.1f, "Bratislava","Diesel");
        car4=new Car("Chevrolet Camaro",15.5f,"Kosice","Gasoline");

        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);

        car1.printInfo();
        System.out.println();
        car2.printInfo();

        car2.startEngine();
        car2.increaseSpeed(80);
        System.out.println();
        car2.printInfo();
        System.out.println();
        System.out.println("Cost: KE---)Praha:" + car2.getPrice(1600, 1.33f));
        car1.startEngine();
        car1.increaseSpeed(90);
        car1.turnOnFrontWiper();
        car1.printInfo();

        System.out.println();

        if (car2.getSpeed() > car1.getSpeed())
            System.out.println("Skoda 120L is faster");
        else if (car1.getSpeed() > car2.getSpeed())
            System.out.println("Audi A8 is faster");
        else if (car1.getSpeed() == car2.getSpeed())
            System.out.println("Same speed");
        car3.printInfo();

        System.out.println();



        Car[] taxi;
        taxi= new Car[10];
        for(int i=0;i<10;i++)
        {
            taxi[i]=new Car("Kia Ceed",6.1f,"Kosice");
        }


        for (Car car:taxi) {
            car.startEngine();
            Random random = new Random();
            car.increaseSpeed(random.nextInt(31) + 40);

            car.printInfo();
            System.out.println();
        }

        int maxSpeed=0;
        for(Car car:taxi)
            if(car.getSpeed()>maxSpeed)
                maxSpeed=car.getSpeed();
        System.out.println("Maximum speed is: "+maxSpeed);
        for(Car car:taxi)
            if(car.getSpeed()==maxSpeed)
                car.printInfo();


        int average;
        int count=0;
        int arrayLength;

        arrayLength=taxi.length;
        System.out.println();
        for(Car car:taxi)
        {
            count=count+car.getSpeed();
        }
        System.out.println("Average of speed is: "+(double)count/arrayLength);

        int r= new Random().nextInt(arrayLength);
        car4.printInfo();


        System.out.println();






    }
}