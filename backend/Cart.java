import java.util.*;

public class Cart {
    List<FoodItem> items = new ArrayList<>();

    void addItem(FoodItem item){
        items.add(item);
    }

    double getTotal(){
        double total = 0;
        for(FoodItem f : items){
            total += f.price;
        }
        return total;
    }
}
