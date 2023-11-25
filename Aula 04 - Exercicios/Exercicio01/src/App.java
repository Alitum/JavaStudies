public class App {
    public static void main(String[] args) throws Exception {
        Store<Food> foodStore = new Store<Food>();
        Store<Clothing> clothingStore = new Store<Clothing>();
        Store<Electronic> electronicStore = new Store<Electronic>();

        Food cheese = new Food("Cheese");
        Food bread = new Food("Bread");
        Food milk = new Food("Milk");

        Clothing tshirt = new Clothing("T-Shirt");
        Clothing jacket = new Clothing("Jacket");
        Clothing pants = new Clothing("Pants");

        Electronic phone = new Electronic("Phone");
        Electronic laptop = new Electronic("Laptop");
        Electronic tv = new Electronic("TV");

        foodStore.addItems(cheese);
        foodStore.addItems(bread);
        foodStore.addItems(milk);

        clothingStore.addItems(tshirt);
        clothingStore.addItems(jacket);
        clothingStore.addItems(pants);

        electronicStore.addItems(phone);
        electronicStore.addItems(laptop);
        electronicStore.addItems(tv);

        foodStore.showItems();
        clothingStore.showItems();
        electronicStore.showItems();
    }
}
