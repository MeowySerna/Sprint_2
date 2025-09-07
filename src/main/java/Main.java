import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100.0);
        Food redApples = new Apple(10,50.0,"red");
        Food greenApples = new Apple(8,60.0,"green");

        Food[] items = new Food[] {meat,redApples,greenApples};
        ShoppingCart cart = new ShoppingCart(items);

        double totalNoDiscount = cart.getTotalWithoutDiscount();
        double totalWithDiscount = cart.getTotalVegaterianWithoutDiscount();
        double vegetarianNoDiscount = cart.getTotalVegaterianWithoutDiscount();

        System.out.println("Общая сумма товаров без скидки: " + totalNoDiscount);
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        System.out.println("Сумма вегетарианских продуктов без скидки: " + vegetarianNoDiscount);
    }
}