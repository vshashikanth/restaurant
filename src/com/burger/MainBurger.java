package com.burger;











import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainBurger implements HamBurgerMethods {
    static ArrayList<BaseBurger> al=new ArrayList<BaseBurger>();
     ArrayList<BaseBurger> order=new ArrayList<BaseBurger>();


     // default constructor.


    public MainBurger() {

    }

    // code of showMenu() method.


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
        for (int l = 0; l < additionals.length; l++) {
            if(additionals[l]!=null)
            System.out.println(additionals[l] + "  " + price[l]);

        }
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
        for (int l = 0; l < additionals.length; l++) {
        if(additionals[l]!=null)
            System.out.println(additionals[l] + "  " + price[l]);

        }
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
            if(additionals[l]!=null)
            System.out.println(additionals[l] + "  " + price[l]);

    }
}
        }

    }

    // code of creteOrder() method.

    public void createOrder() {
        int order_id=100;

        System.out.println("you have entered into createOrder() method. ");
        System.out.println("choose your order from 0)showMenu() in main menu. ");
        try {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        if(s.equals("0"))
            return;
        System.out.println("do you want to add to the same list or onather list. ");
        System.out.println("  1)same list.\n2)fresh list.");
        String number=null;


        number=reader.readLine();
        //System.out.println("select Burger Name,Burger roll type and additionals ");
        if(number.equals("2")) {
            this.order=new ArrayList<BaseBurger>();
            System.gc();
        }

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

                System.out.println("additionals are " + additionals1[0]);
                if (additionals1[0].equals("lettuce"))
                    price1[0] = 2.0;
                else if (additionals1[0].equals("tamatos"))
                    price1[0] = 4.0;
                else if (additionals1[0].equals("carrot"))
                    price1[0] = 6.0;
                else if (additionals1[0].equals("D"))
                    price1[0] = 8.0;
                burger.setAdditionals(additionals1);
                burger.setAdditionals_price(price1);
            }

            else if (burger_name.equals("HealthyBurger")) {
                burger = new HealthyBurger(burger_roll_type, burger_price);
                burger.setAdditionals(additionals1);
                burger.setAdditionals_price(price1);
            }

            else if (burger_name.equals("DeluxBurger")) {
                burger = new DeluxBurger(burger_roll_type, burger_price);

                System.out.println("additionals are " + additionals1[0]);
                if (additionals1[0].equals("chips"))
                    price1[0] = 10.0;
                else if (additionals1[0].equals("drinks"))
                    price1[0] = 12.0;
                burger.setAdditionals(additionals1);
                burger.setAdditionals_price(price1);
            }

            order.add(burger);
            System.out.println("size is: " + order.size());

        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        } catch (java.lang.NullPointerException ne) {
            System.out.println("entered into catch block. ");
            ne.printStackTrace();
        }
        order_id++;
        System.out.println("order id is: "+order_id);
        System.out.println(" hashCode of order ArrayList: "+order.hashCode());

    }

// code of viewOrder() method.

    public void viewOrder() {
        System.out.println("you have entered into viewOrder() method. ");
        if(order.size()==0) {
            System.out.println(" no items added in list ");
        }
        Iterator i=order.iterator();
        double Total_item_price=0.0;
        double Total_additionals_price=0.0;
        double Total_price=0.0;
        BaseBurger bb=null;
        HealthyBurger hb=null;
        DeluxBurger db=null;
        while(i.hasNext()) {
            String[] additionals=new String[8];
            String[] additionals1=new String[8];
            double[] additionals_price=new double[8];
            bb=new BaseBurger();
            hb=new HealthyBurger();
            db=new DeluxBurger();
        BaseBurger burger=(BaseBurger)i.next();
        System.out.println("Name of the burger is:  "+burger.getName_of_the_burger()+"  bread roll type is:  "+burger.getBread_roll_type()+" burger price is:  "+burger.getBurger_price());
        //Total_burger_price=Total_burger_price+burger.getBurger_price();
        additionals=burger.getAdditionals();
        additionals_price=burger.getAdditionals_price();



            //System.out.println(additionals[2]);

                System.out.println("additional is:  "+additionals[0]+"  additional price is: "+additionals_price[0]);


                Total_item_price=burger.getBurger_price()+additionals_price[0];
                System.out.println(" Total item Price is:  "+Total_item_price);
                Total_price=Total_price+Total_item_price;


    }
        System.out.println("Total items price is:   "+Total_price);
    }


    public void display() {
        System.out.println("you have entered into display() method.  ");
    }

    // code of updateOrder() method.

    public void updateOrder() {
        System.out.println("you have entered into updateOrder() method. ");
        String Burger_Name=null;
        String Bread_Roll_Type=null;
        String[] additional_Name=null;
        double Burger_Price=0.0;
        double[] Additional_Price=null;
        BaseBurger burger=null;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(order.size()==0) {
            System.out.println("zero items added: go to option 2 to crete an order. ");
        return;
        }
        else {
            System.out.println("arraylist size is: "+order.size());
        }
                ListIterator li=order.listIterator();
        String[] additionals=null;
        String[] a = {"lettuce", "tamatos", "carrot", "D"};
        double[] b = {2.0, 4.0, 6.0, 8.0};
        String[] c = {"lettuce", "tamatos", "carrot", "D", "E", "F"};
        double[] d = {2.0, 4.0, 6.0, 8.0, 10.0, 12.0};
        String[] e= {"chips","drinks"};
        double[] f= {10.0,12.0};

       /* while(li.hasNext()) {
           BaseBurger burger1 =(BaseBurger)li.next();
           additionals=burger1.getAdditionals();

            System.out.println(" burger name: "+burger1.getName_of_the_burger()+"bread_roll_type is: "+burger1.getBread_roll_type()+" and additional is: "+additionals[0]);
        } */
        System.out.println(" Do you want to add or remove the burger. choose \n1).Add burger.\n2).Remove burger.");
        try {
        String number=br.readLine();
        if(number.equals("1")) {
            additional_Name=new String[8];
            Additional_Price=new double[8];
            System.out.println(" select burger name and ");
            Burger_Name=br.readLine();
            System.out.println("bread roll type ");
            Bread_Roll_Type=br.readLine();
            System.out.println(" additional name ");
            additional_Name[0]=br.readLine();

            if(Burger_Name.equals("BaseBurger")& Bread_Roll_Type.equals("A")) {
                Burger_Price=10.00;
                if(additional_Name[0].equals("lattuce"))
                Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                BaseBurger bb1=new BaseBurger(Bread_Roll_Type,Burger_Price);
                bb1.setAdditionals(additional_Name);
                bb1.setAdditionals_price(Additional_Price);
                li.add(bb1);
            }
            else if(Burger_Name.equals("BaseBurger")& Bread_Roll_Type.equals("B")) {
                Burger_Price=20.00;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                BaseBurger bb2=new BaseBurger(Bread_Roll_Type,Burger_Price);
                bb2.setAdditionals(additional_Name);
                bb2.setAdditionals_price(Additional_Price);
                li.add(bb2);
            }
            else if(Burger_Name.equals("BaseBurger")& Bread_Roll_Type.equals("C")) {
                Burger_Price=30.00;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                BaseBurger bb3=new BaseBurger(Bread_Roll_Type,Burger_Price);
                bb3.setAdditionals(additional_Name);
                bb3.setAdditionals_price(Additional_Price);
                li.add(bb3);
            }
            else if(Burger_Name.equals("HealthyBurger")&Bread_Roll_Type.equals("A")) {
              Burger_Price=10;
              if(additional_Name[0].equals("lattuce"))
                  Additional_Price[0]=2.0;
              else if(additional_Name[0].equals("tamatos"))
                  Additional_Price[0]=4.0;
              else if(additional_Name[0].equals("carrot"))
                  Additional_Price[0]=6.0;
              else if(additional_Name[0].equals("D"))
                  Additional_Price[0]=8.0;
              else if(additional_Name[0].equals("E"))
                  Additional_Price[0]=10.0;
              else if(additional_Name[0].equals("F"))
                  Additional_Price[0]=12.0;
                HealthyBurger hb1=new HealthyBurger(Bread_Roll_Type,Burger_Price);
                hb1.setAdditionals(additional_Name);
                hb1.setAdditionals_price(Additional_Price);
                li.add(hb1);
            }
            else if(Burger_Name.equals("HealthyBurger")&Bread_Roll_Type.equals("B")) {
                Burger_Price=20;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                else if(additional_Name[0].equals("E"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("F"))
                    Additional_Price[0]=12.0;
                HealthyBurger hb2=new HealthyBurger(Bread_Roll_Type,Burger_Price);
                hb2.setAdditionals(additional_Name);
                hb2.setAdditionals_price(Additional_Price);
                li.add(hb2);
            }
            else if(Burger_Name.equals("HealthyBurger")&Bread_Roll_Type.equals("C")) {
                Burger_Price=30;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                else if(additional_Name[0].equals("E"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("F"))
                    Additional_Price[0]=12.0;
                HealthyBurger hb3=new HealthyBurger(Bread_Roll_Type,Burger_Price);
                hb3.setAdditionals(additional_Name);
                hb3.setAdditionals_price(Additional_Price);
                li.add(hb3);
            }
            else if(Burger_Name.equals("HealthyBurger")&Bread_Roll_Type.equals("D")) {
                Burger_Price=40;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                else if(additional_Name[0].equals("E"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("F"))
                    Additional_Price[0]=12.0;
                HealthyBurger hb4=new HealthyBurger(Bread_Roll_Type,Burger_Price);
                hb4.setAdditionals(additional_Name);
                hb4.setAdditionals_price(Additional_Price);
                li.add(hb4);
            }
            else if(Burger_Name.equals("HealthyBurger")&Bread_Roll_Type.equals("E")) {
                Burger_Price=50;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                else if(additional_Name[0].equals("E"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("F"))
                    Additional_Price[0]=12.0;
                HealthyBurger hb5=new HealthyBurger(Bread_Roll_Type,Burger_Price);
                hb5.setAdditionals(additional_Name);
                hb5.setAdditionals_price(Additional_Price);
                li.add(hb5);
            }
            else if(Burger_Name.equals("HealthyBurger")&Bread_Roll_Type.equals("F")) {
                Burger_Price=60;
                if(additional_Name[0].equals("lattuce"))
                    Additional_Price[0]=2.0;
                else if(additional_Name[0].equals("tamatos"))
                    Additional_Price[0]=4.0;
                else if(additional_Name[0].equals("carrot"))
                    Additional_Price[0]=6.0;
                else if(additional_Name[0].equals("D"))
                    Additional_Price[0]=8.0;
                else if(additional_Name[0].equals("E"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("F"))
                    Additional_Price[0]=12.0;
                HealthyBurger hb6=new HealthyBurger(Bread_Roll_Type,Burger_Price);
                hb6.setAdditionals(additional_Name);
                hb6.setAdditionals_price(Additional_Price);
                li.add(hb6);
            }
            else if(Burger_Name.equals("DeluxBurger")&Bread_Roll_Type.equals("A")) {
                Burger_Price=40;
                if(additional_Name[0].equals("chips"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("drinks"))
                    Additional_Price[0]=12.0;
                DeluxBurger db1=new DeluxBurger(Bread_Roll_Type,Burger_Price);
                db1.setAdditionals(additional_Name);
                db1.setAdditionals_price(Additional_Price);
                li.add(db1);
            }
            else if(Burger_Name.equals("DeluxBurger")&Bread_Roll_Type.equals("B")) {
                Burger_Price=50;
                if(additional_Name[0].equals("chips"))
                    Additional_Price[0]=10.0;
                else if(additional_Name[0].equals("drinks"))
                    Additional_Price[0]=12.0;
                DeluxBurger db2=new DeluxBurger(Bread_Roll_Type,Burger_Price);
                db2.setAdditionals(additional_Name);
                db2.setAdditionals_price(Additional_Price);
                li.add(db2);
            }
            System.out.println("order size: "+order.size());
        }
        else if(number.equals("2")) {
            String burger_name=null;
            String burger_roll_type=null;
            String add=null;
            String[] additional=new String[8];

            System.out.println(" enter burger name to delete from order list. ");
            burger_name=br.readLine();
            System.out.println("enter burger roll type. ");
            burger_roll_type=br.readLine();
            System.out.println("enter additionals item name. ");
            add=br.readLine();
            System.out.println("li.hasNext()"+li.hasNext());
            int i=0;
            while(li.hasNext()) {
                BaseBurger BBurger=(BaseBurger)li.next();
                additional=BBurger.getAdditionals();
                if(burger_name.equals(BBurger.getName_of_the_burger()) & burger_roll_type.equals(BBurger.getBread_roll_type()) & add.equals(additional[0])) {
                    // code for remove only one object from order ArrayList.
                    if(i==0) {
                        li.remove();
                        System.out.println(" item is removed from the list. ");
                        i++;
                    }
                }
            }

        }

        }catch(java.io.IOException ioe) { ioe.printStackTrace(); }
    }

    // code of finalize() method.


    protected void finalize()  { System.out.println("this is finalize() method."); }


    // code of main(.) method.


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
                    m.viewOrder();
                } else if (choice.equals("4")) {
                    System.out.println("this is display");
                } else if (choice.equals("5")) {
                    System.out.println("this is updateOrder");
                    m.updateOrder();
                } else if (choice.equals("6")) {
                    m=null;
                    System.gc();
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
