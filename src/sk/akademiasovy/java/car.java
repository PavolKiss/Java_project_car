package sk.akademiasovy.java;

import java.util.Random;

class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float gasConsumption;
    private boolean frontWiper;
    private boolean backWiper;
    private String plate;
    private String gas;
    private String color;



    //constructor

    public Car()
    {
        speed=0;
        engine=false;
        gasConsumption=7.5f;
        brand=null;
        frontWiper=false;
        backWiper=false;





    }
    public  Car(String brand, float consumption)
    {
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;


    }

    public  Car(String brand, float consumption,String city)
    {
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;
        generatePlate(city);


    }


    public  Car(String brand, float consumption,String city,String gas)
    {
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;
        generatePlate(city);
        this.gas=gas;


    }




    private void generatePlate(String city)
    {

        switch(city.toLowerCase())
        {
            case"trencin" : plate="TN-"; break;
            case"presov" : plate="PO-" ;break;
            case"bratislava" : plate="BA-"; break;
            case"nitra" : plate="NR-"; break;
            case"senec" : plate="SC-"; break;
            default: plate="KE-";

        }

        Random random = new Random();
        int i;
        for (i=0;i<3;i++)
        {
            int randomNumber=random.nextInt(10);
            plate=plate+randomNumber;
        }

        for (i=0;i<2;i++)
        {
            int randomNumber=random.nextInt(26)+'A';
            plate=plate+(char)randomNumber;
        }


    }






    public void setBrand(String value)
    {
        brand=value;
    }

    public void setGasConsumption(float gasConsumption)
    {
        this.gasConsumption=gasConsumption;

    }
    public void printInfo()
    {
        System.out.println("Brand:"+brand);
        System.out.println("GasConsumption:"+gasConsumption);
        System.out.println("Speed:"+speed);
        System.out.println("Engine:"+engine);
        System.out.println("FronWiper:"+frontWiper);
        System.out.println("Plate:"+plate);
        System.out.println("Gas:"+gas);


    }

    public void startEngine()
    {
        engine=true;
    }

    public void stoptEngine()
    {
        engine=false;
    }

    public void  increaseSpeed()
    {
        if(engine)
            speed=speed+10;

    }

    public void  increaseSpeed(int value)
    {
        if(engine&&value>0)
            speed+=value;

    }

    public void decreaseSpeed()
    {
        speed-=10;
        if(speed<0)
            speed=0;

    }
    public void stop()
    {

        speed=0;
    }

    public float getPrice(int distance, float costPerLiter)
    {
        float price;
        price=distance*gasConsumption*costPerLiter/100;
        return price;

    }

    public int getSpeed()
    {

        return speed;
    }


    public void turnOnFrontWiper()
    {
        frontWiper=true;
    }

    public void turnOffFrontWiper()
    {
        frontWiper=false;
    }



}
