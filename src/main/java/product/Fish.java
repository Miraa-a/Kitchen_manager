package product;

public class Fish extends Product {

    public Fish(String Name, double calorie, double protein) {
        setCategory("Рыба");
        setName(Name);
        setCalorie(calorie);
        setProtein(protein);
    }
}