package dishes;
import product.Product;
import java.util.ArrayList;

public class Salad extends Dish {

    public Salad(ArrayList<Product> productList) {
        setCategory("Второе блюдо");
        setDishName("Салат");
        setProductList(productList);
    }
}