import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Jepoy STORE");
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        Item t1 = new Item("Ford", "Car", 1500000.00f);

        Item t2 = new Item("Toyota", "Car", 2000000.00f);

        Item t3 = new Item("Mazda", "Car", 2500000.00f);

        Item t4 = new Item("Honda", "Car", 1000000.00f);

        Item t5 = new Item("Kia", "Car", 1000000.00f);

        Item t6 = new Item("Mitsubishi", "Car", 2220000.00f);

        Item t7 = new Item("Lexus", "Car", 3000000.00f);

        Item t8 = new Item("Isuzu", "Car", 2500000.00f);

        Item t9 = new Item("Porsche", "Car", 4000000.00f);

        Item t10 = new Item("Ferrari", "Car", 5000000.00f);

        INV.add(t1);
        INV.add(t2);
        INV.add(t3);
        INV.add(t4);
        INV.add(t5);
        INV.add(t6);
        INV.add(t7);
        INV.add(t8);
        INV.add(t9);
        INV.add(t10);
        for(Item d: INV){
            if(d.Getname()=="Ford"){
                System.out.println("Found!");
            }else{
                System.out.println("Not Found!");
            }
            total = total + d.Getprice();
        }
        System.out.println(total);
    }
}