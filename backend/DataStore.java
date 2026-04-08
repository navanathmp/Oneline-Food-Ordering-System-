import java.util.*;

public class DataStore {
    static List<FoodItem> foodList = new ArrayList<>();

    public static void addFood(FoodItem food){
        foodList.add(food);
    }
}
