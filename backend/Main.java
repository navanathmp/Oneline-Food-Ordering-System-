public class Main {
    public static void main(String[] args) {

        DataStore.addFood(new FoodItem(1,"Burger",100));
        DataStore.addFood(new FoodItem(2,"Pizza",200));
        DataStore.addFood(new FoodItem(3,"Sandwich",80));

        System.out.println("Available Food Items:");
        for(FoodItem f : DataStore.foodList){
            System.out.println(f.name + " - " + f.price);
        }
    }
}
