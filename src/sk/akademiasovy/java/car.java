package sk.akademiasovy.java;

public class car {
    private String brand;
    private int speed;
    private boolean engine;
    private float getConsumption;

    //konstruktor
    public car()
    {
        speed=0;
        engine=false;
        getConsumption=7.5f;
        brand=null;
    }

    public car(String brand, float consuption){
        speed=0;
        engine=false;
        getConsumption=consuption;
        this.brand=brand;
    }


    public void setBrand(String value) {
        brand=value;
    }

    public void setGetConsumption(float getConsumption)
    {
        this.getConsumption=getConsumption;
    }

    public void printInfo(){
        System.out.println("Brand "+brand);
        System.out.println("Gas "+getConsumption);
        System.out.println("Speed "+speed);
    }

    public void startEngine(){
        engine=true;
    }

    public void stopEngine(){
        engine=false;
    }

    public void increaseSpeed(){
        speed=speed+10;
    }
}
