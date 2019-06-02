package product;

public class Vegetables extends Product {

    public Vegetables(String Name, double calorie, double protein) {
        setCategory("Овощ");
        setName(Name);
        setCalorie(calorie);
        setProtein(protein);
    }

}