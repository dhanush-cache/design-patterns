package creational.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from the database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }
}
