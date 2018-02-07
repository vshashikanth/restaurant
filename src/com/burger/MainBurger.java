package com.burger;





import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MainBurger implements HamBurgerMethods {
     ArrayList<BaseBurger> al;
    public MainBurger() {

    }
    public void showMenu() {
        System.out.println("you have entered into showMenu() method. " + this);
        BaseBurger b1 = new BaseBurger("A", 10.00);

        String[] a = {"lettuce", "tamatos", "carrot", "D"};
        double[] b = {2.0, 4.0, 6.0, 8.0};
        b1.setAdditionals(a);
        b1.setAdditionals_price(b);
        b1.setName_of_the_burger("BaseBurger");
        BaseBurger b2 = new BaseBurger("B", 20.00);
        BaseBurger b3 = new BaseBurger("C", 30.00);


        String[] c = {"lettuce", "tamatos", "carrot", "D", "E", "F"};
        double[] d = {2.0, 4.0, 6.0, 8.0, 10.0, 12.0};
        HealthyBurger hb1 = new HealthyBurger("A", 10.00);
        hb1.setAdditionals(c);
        hb1.setAdditionals_price(d);
        hb1.setName_of_the_burger("HealthyBurger");
        HealthyBurger hb2 = new HealthyBurger("B", 20.00);
        HealthyBurger hb3 = new HealthyBurger("C", 30.00);
        HealthyBurger hb4 = new HealthyBurger("D", 40.00);
        HealthyBurger hb5 = new HealthyBurger("E", 50.00);
        HealthyBurger hb6 = new HealthyBurger("F", 60.00);

        String[] e= {"chips","drinks"};
        double[] f= {10.0,12.0};
        DeluxBurger db1=new DeluxBurger("A",40);
        db1.setAdditionals(e);
        db1.setAdditionals_price(f);
        db1.setName_of_the_burger("DeluxBurger");
        DeluxBurger db2=new DeluxBurger("B",50);
        al=new ArrayList<BaseBurger>();
        al.add(b1);
        al.add(b2);
        al.add(b3);
        al.add(hb1);
        al.add(hb2);
        al.add(hb3);
        al.add(hb4);
        al.add(hb5);
        al.add(hb6);
        al.add(db1);
        al.add(db2);
        Iterator i=al.iterator();
        int j=0;
        int k=0;
        while(i.hasNext()) {
         BaseBurger burger=(BaseBurger) i.next();
if(burger.getClass().getName().equals("com.burger.BaseBurger")) {
    if(j==0) {
        System.out.println("Burger Name is: " + burger.getName_of_the_burger());
    j++;
    }
    System.out.println("Burger roll type is: " + burger.getBread_roll_type() + "  Burger price is: " + burger.getBurger_price());
    if(burger.getBread_roll_type().equals("C")) {
        String[] additionals = burger.getAdditionals();
        double[] price = burger.getAdditionals_price();
        System.out.println("additionals are: ");
        for (int l = 0; l < additionals.length; l++)
            System.out.println(additionals[l] + "  " + price[l]);

    }
}
else if(burger.getClass().getName().equals("com.burger.DeluxBurger")) {
    if(j==2) {
        System.out.println("Burger Name is: " + burger.getName_of_the_burger());
    j++;
    }
    System.out.println("Burger roll type is: " + burger.getBread_roll_type() + "  Burger price is: " + burger.getBurger_price());
    if(burger.getBread_roll_type().equals("B")) {
        String[] additionals = burger.getAdditionals();
        double[] price = burger.getAdditionals_price();
        System.out.println("additionals are: ");
        for (int l = 0; l < additionals.length; l++)
            System.out.println(additionals[l] + "  " + price[l]);
    }
}
else if(burger.getClass().getName().equals("com.burger.HealthyBurger")) {
    if(j==1) {
        System.out.println("Burger Name is: "+burger.getName_of_the_burger());
    j++;
    }
    System.out.println("Burger roll type is: " + burger.getBread_roll_type() + "  Burger price is: " + burger.getBurger_price());

    if(burger.getBread_roll_type().equals("F")) {
        String[] additionals = burger.getAdditionals();
        double[] price = burger.getAdditionals_price();
        System.out.println("additionals are: ");
        for (int l = 0; l < additionals.length; l++)
            System.out.println(additionals[l] + "  " + price[l]);
    }
}
        }
    }
    public void createOrder() {
        System.out.println("you have entered into createOrder() method. ");
    }
    public void viewOrder() {
        System.out.println("you have entered into viewOrder() method. ");
    }
    public void display() {
        System.out.println("you have entered into display() method. ");
    }
    public void updateOrder() {
        System.out.println("you have entered into updateOrder() method. ");
    }


    public static void main(String... a) {
        System.out.println("you have entered into main() method. ");
        System.out.println("1)showMenu\n2)createOrder\n3)viewOrder\n4)display\n5)updateOrder\n6)exit");
        System.out.println("select your choice.");
        int choice=0;
        MainBurger m=null;
        try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           choice=Integer.parseInt(br.readLine());
           if(choice==1) {
               m=new MainBurger();
               m.showMenu();
           }
           else if(choice==2) {
               System.out.println("this is createOrder");
           }
           else if(choice==3) {
               System.out.println("this is viewOrder");
           }
           else if(choice==4) {
               System.out.println("this is display");
           }
           else if(choice==5) {
               System.out.println("this is updateOrder");
           }
           else if(choice==6) {
                return;
           }
       }catch(java.io.IOException ioe) {
           ioe.printStackTrace();
       }

    }

}
