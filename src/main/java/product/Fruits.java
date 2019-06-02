package product;

public class Fruits extends Product {

    public Fruits(String Name, double calorie, double protein) {
        setCategory("Фрукт");
        setName(Name);
        setCalorie(calorie);
        setProtein(protein);
    }

}