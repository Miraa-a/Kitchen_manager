package dishes;
import product.Product;
import java.util.ArrayList;

public class Borscht extends Dish {

    public Borscht(ArrayList<Product> productList) {
        setCategory("Первое блюдо");
        setDishName("Борщ");
        setProductList(productList);
    }
}