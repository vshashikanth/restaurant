package com.burger;







import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MainBurger implements HamBurgerMethods {
    static ArrayList<BaseBurger> al=new ArrayList<BaseBurger>();
     ArrayList<BaseBurger> order=new ArrayList<BaseBurger>();

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
        //al=new ArrayList<BaseBurger>();
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
        int order_id=100;

        System.out.println("you have entered into createOrder() method. ");
        System.out.println("choose your order from menu. ");
        //System.out.println("select Burger Name,Burger roll type and additionals ");
        String burger_name = null;
        String burger_roll_type = null;
        String[] additionals1 = null;
        double[] price1 = null;
        double burger_price = 0.0;
        double additionals_price = 0.0;
        String[] additionals2 = null;
        double[] price2 = null;
        String[] additionals3 = null;
        double[] price3 = null;
        BaseBurger burger = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Burger Name. ");
            burger_name = br.readLine();
            System.out.println("Enter Burger roll type. ");
            burger_roll_type = br.readLine();
            System.out.println("Enter additionals. ");
            additionals1 = new String[8];
            price1 = new double[8];

            additionals2 = new String[8];
            price2 = new double[8];
            additionals3 = new String[8];
            price3 = new double[8];
            additionals1[0] = br.readLine();
            //al=new ArrayList<BaseBurger>();
            Iterator iterator = al.iterator();

            while (iterator.hasNext()) {

                BaseBurger b = (BaseBurger) iterator.next();

                if (b.getName_of_the_burger().equals(burger_name)) {

                    if (b.getBread_roll_type().equals(burger_roll_type)) {

                        price1 = b.getAdditionals_price();
                        burger_price = b.getBurger_price();
                       // System.out.println("entered " + burger_price);

                    }
                }
            }
            if (burger_name.equals("BaseBurger")) {
                burger = new BaseBurger(burger_roll_type, burger_price);
                burger.setAdditionals(additionals1);
                burger.setAdditionals_price(price1);
            } else if (burger_name.equals("HealthyBurger")) {
                burger = new HealthyBurger(burger_roll_type, burger_price);
                burger.setAdditionals(additionals1);
                burger.setAdditionals_price(price1);
            } else if (burger_name.equals("DeluxBurger")) {
                burger = new DeluxBurger(burger_roll_type, burger_price);
                burger.setAdditionals(additionals1);
                burger.setAdditionals_price(price1);
            }

            order.add(burger);
            System.out.println("size is: "+order.size());
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        } catch (java.lang.NullPointerException ne) {
            System.out.println("entered into catch block. ");
            ne.printStackTrace();
        }
        order_id++;
        System.out.println("order id is: "+order_id);

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
        int order_id=101;

        String choice = null;
        MainBurger m = null;
        m = new MainBurger();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("1)showMenu\n2)createOrder\n3)viewOrder\n4)display\n5)updateOrder\n6)exit");
            System.out.println("select your choice.");
            try {

                choice = br.readLine();
                if (choice.equals("1")) {

                    m.showMenu();
                } else if (choice.equals("2")) {
                    System.out.println("this is createOrder");
                    m.createOrder();
                } else if (choice.equals("3")) {
                    System.out.println("this is viewOrder");
                } else if (choice.equals("4")) {
                    System.out.println("this is display");
                } else if (choice.equals("5")) {
                    System.out.println("this is updateOrder");
                } else if (choice.equals("6")) {
                    return;
                } else if (choice.equals("")) {
                    System.out.println("enter valid number");
                }

            } catch (java.io.IOException ioe) {
                ioe.printStackTrace();
            } catch (java.lang.Exception e) {
                System.out.println("entered in main() exception block ");
                e.printStackTrace();
            }
        }

    }

}
