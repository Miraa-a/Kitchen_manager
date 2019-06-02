import java.util.ArrayList;
import dishes.Borscht;
import dishes.Salad;
import fridge.Fridge;
import product.Fruits;
import product.Product;
import product.Vegetables;
public class Chef {
    public static void main (String[] args){
        Fridge myFridge = new Fridge();

        //кладем продукты в холодильник
        for (int i = 0; i<5; i++) {
            myFridge.AddVegetable("Помидор", 19, 0.6);
        }

        for (int i = 0; i<3; i++) {
            myFridge.AddVegetable("Огурец", 16, 0.8);
        }

        for (int i = 0; i<5; i++) {
            myFridge.AddVegetable("Морковь", 33, 1.3);
        }

        for (int i = 0; i<1; i++) {
            myFridge.AddVegetable("Свекла", 48, 1.7);
        }

        for (int i = 0; i<3; i++) {
            myFridge.AddVegetable("Лук", 43, 1.7);
        }

        for (int i = 0; i<1; i++) {
            myFridge.AddVegetable("Капуста", 28, 1.8);
        }

        for (int i = 0; i<5; i++) {
            myFridge.AddVegetable("Картофель", 83, 2);
        }

        for (int i = 0; i<1; i++) {
            myFridge.AddMeatProduct("Говядина", 187, 18.9);
        }

        //берем продукты для блюд
        ArrayList<Product> productsForBorscht = new ArrayList<Product>();
        productsForBorscht.add(myFridge.GetMeatProductByName("Говядина"));
        productsForBorscht.add(myFridge.GetVegetableByName("Свекла"));
        for (int i = 0; i<5; i++) {
            productsForBorscht.add(myFridge.GetVegetableByName("Картофель"));
        }
        for (int i = 0; i<2; i++) {
            productsForBorscht.add(myFridge.GetVegetableByName("Лук"));
        }
        for (int i = 0; i<2; i++) {
            productsForBorscht.add(myFridge.GetVegetableByName("Морковь"));
        }
        for (int i = 0; i<1; i++) {
            productsForBorscht.add(myFridge.GetVegetableByName("Капуста"));
        }
        for (int i = 0; i<3; i++) {
            productsForBorscht.add(myFridge.GetVegetableByName("Помидор"));
        }

        ArrayList<Product> productsForSalad = new ArrayList<Product>();
        for (int i = 0; i<2; i++) {
            productsForSalad.add(myFridge.GetVegetableByName("Помидор"));
        }
        for (int i = 0; i<3; i++) {
            productsForSalad.add(myFridge.GetVegetableByName("Огурец"));
        }
        for (int i = 0; i<1; i++) {
            productsForSalad.add(myFridge.GetVegetableByName("Лук"));
        }

        //готовим блюда
        Borscht myBorscht = new Borscht(productsForBorscht);
        Salad mySalad = new Salad(productsForSalad);

        System.out.println(myBorscht.ToString());
        System.out.println(mySalad.ToString());


        //сортировка овощей для салата на основе их калорийности
        for (int i = 0; i<productsForSalad.size(); i++) {
            Product product = productsForSalad.get(i);
            if (product.getCalorie() < 1) {
                System.out.println("Калорийность " + product.getName() + " меньше единицы");
            }
            else {
                System.out.println("Калорийность " + product.getName() + " больше единицы");
            }
        }
        System.out.println();

        //поиск продукта в борще по параметрам
        for (int i = 0; i<productsForBorscht.size(); i++) {
            Product product = productsForBorscht.get(i);
            if ((product.getCalorie() < 30) & (product.getProtein() > 1)) {
                System.out.println("Под эти параметры подходит продукт " + product.getName());
            }
        }
    }
}
