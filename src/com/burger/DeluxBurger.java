package com.burger;

public class DeluxBurger extends BaseBurger {
    private String bread_roll_type;
    private double burger_price;
    private boolean meat;
    static private String name_of_the_burger;
   static  private String[] additionals=new String[2];
   static  private double[] additionals_price=new double[2];
    public DeluxBurger() {}
    public DeluxBurger(String bread_roll_type,double burger_price) {
       // System.out.println("you have entered into DeluxBurger parameterized constructor. ");
        this.bread_roll_type=bread_roll_type;
        this.burger_price=burger_price;
    }
    public void setBread_roll_type(String bread_roll_type) {
        this.bread_roll_type=bread_roll_type;
    }
    public String getBread_roll_type() {
        return bread_roll_type;
    }
    public void setBurger_price(double burger_price) {
        this.burger_price=burger_price;
    }
    public double getBurger_price() {
        return burger_price;
    }


    public void setName_of_the_burger(String name_of_the_burger) {
        this.name_of_the_burger=name_of_the_burger;
    }
    public String getName_of_the_burger() {
        return name_of_the_burger;
    }


    public void setAdditionals(String[] additionals) {

        for(int i=0;i<additionals.length;i++)
            this.additionals[i]=additionals[i];

    }
    public String[] getAdditionals() {
        return additionals;}


    public void setAdditionals_price(double[] additionals_price) {



        for(int i=0;i<additionals_price.length;i++)
            this.additionals_price[i]=additionals_price[i];

    }


    public double[] getAdditionals_price() { return additionals_price;}


public static void main(String... a) {
    System.out.println("this is main() in calss DeluxBurger. ");
}
}
