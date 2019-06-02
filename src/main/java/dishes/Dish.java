package dishes;
import product.Product;
import java.util.ArrayList;

public abstract class Dish {

    private String category;
    private String dishName;
    private ArrayList<Product> productList;
    private double sumCalorie;
    private double sumProtein;

    protected Dish() {};

    public Dish(String category, String dishName, ArrayList<Product> productList) {
        this.category = category;
        this.dishName = dishName;
        this.productList = productList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public double getSumCalorie() {
        return sumCalorie;
    }

    public double setSumCalorie(ArrayList<Product> productList) {
        double sumCalorie = 0;

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            sumCalorie += product.getCalorie();

        }

        return sumCalorie;
    }

    public double setSumProtein(ArrayList<Product> productList) {

        double sumProtein = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);

            sumProtein += product.getProtein();
        }

        return sumProtein;
    }

    public double getSumProtein() {
        return sumProtein;
    }

    public String ToString()
    {
        String products = "Использованные продукты: \n";
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            products += product.ToString();
        }
        String dishCalorie = String.format("%.2f", setSumCalorie(productList));
        String dishProtein = String.format("%.2f", setSumProtein(productList));
        return "Категория блюда: " + getCategory() + ", название: " + getDishName() + "\n" + products +
                "калорийность: " + dishCalorie + ", содержание белка: " + dishProtein + "\n";
    }
}
