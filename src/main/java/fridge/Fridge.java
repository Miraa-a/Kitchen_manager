package fridge;
import product.*;
import java.util.ArrayList;

public class Fridge {
    ArrayList<Vegetables> vegetablesList = new ArrayList<Vegetables>();
    ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
    ArrayList<Meat> meatList = new ArrayList<Meat>();
    ArrayList<Fish> fishList = new ArrayList<Fish>();

    public void LookInTheFridge() {
        System.out.print("В холодильнике есть: \n");
        for (int i = 0; i < vegetablesList.size(); i++) {
            Vegetables vegetable = vegetablesList.get(i);
            System.out.print(vegetable.ToString());
        }

        for (int i = 0; i < fruitsList.size(); i++) {
            Fruits fruit = fruitsList.get(i);
            System.out.print(fruit.ToString());
        }

        for (int i = 0; i < meatList.size(); i++) {
            Meat meatProduct = meatList.get(i);
            System.out.print(meatProduct.ToString());
        }

        for (int i = 0; i < fishList.size(); i++) {
            Fish fishProduct = fishList.get(i);
            System.out.print(fishProduct.ToString());
        }
    }

    public void AddVegetable(Vegetables vegetable) {
        vegetablesList.add(vegetable);
    }

    public void AddVegetable(String Name, double calorie, double protein) {
        Vegetables vegetable = new Vegetables(Name, calorie, protein);
        vegetablesList.add(vegetable);
    }

    public Vegetables GetVegetableByName(String vegetableName) {
        int size = 0;
        if (size < vegetablesList.size()) {
            for (int i = 0; i < vegetablesList.size(); i++) {
                Vegetables vegetable = vegetablesList.get(i);
                if (vegetable.getName() == vegetableName) {
                    vegetablesList.remove(i);
                    return vegetable;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }

    public void AddFruits(Fruits fruit) {
        fruitsList.add(fruit);
    }

    public void AddFruits(String Name, double calorie, double protein) {
        Fruits fruit = new Fruits(Name, calorie, protein);
        fruitsList.add(fruit);
    }

    public Fruits GetFruitByName(String fruitName) {
        int size = 0;
        if (size < fruitsList.size()) {
            for (int i = 0; i < fruitsList.size(); i++) {
                Fruits fruit = fruitsList.get(i);
                if (fruit.getName() == fruitName) {
                    fruitsList.remove(i);
                    return fruit;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }
    

    public void AddMeatProduct(Meat meatProduct) {
        meatList.add(meatProduct);
    }

    public void AddMeatProduct(String Name, double calorie, double protein) {
        Meat meatProduct = new Meat(Name, calorie, protein);
        meatList.add(meatProduct);
    }

    public Meat GetMeatProductByName(String meatName) {
        int size = 0;
        if (size <= meatList.size()) {
            for (int i = 0; i < meatList.size(); i++) {
                Meat meatProduct = meatList.get(i);
                if (meatProduct.getName() == meatName) {
                    meatList.remove(i);
                    return meatProduct;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }

    public void AddFishProduct(Fish fishProduct) {
        fishList.add(fishProduct);
    }

    public void AddFishProduct(String Name, double calorie, double protein) {
        Fish fishProduct = new Fish(Name, calorie, protein);
        fishList.add(fishProduct);
    }

    public Fish GetFishProductByName(String fishName) {
        int size = 0;
        if (size < fishList.size()) {
            for (int i = 0; i < fishList.size(); i++) {
                Fish fishProduct = fishList.get(i);
                if (fishProduct.getName() == fishName) {
                    fishList.remove(i);
                    return fishProduct;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }
}
