package service;

import model.Food;

public class ShoppingCart {

    private final Food[] items;
    public ShoppingCart(Food[] items){
        this.items = items;
    }
    public double getTotalWithoutDiscount(){
        double sum = 0.0;
        for(Food item: items){
            sum+=item.getPrice()*item.getAmount();
        }
        return sum;
    }

    public double getTotalWithDiscount(){
        double sum = 0.0;
        for(Food item: items){
            double baseCost = item.getPrice()*item.getAmount();
            double discounted = baseCost*(1-item.getDiscount()/100.0);
            sum+=discounted;
        }
        return sum;
    }

    public double getTotalVegaterianWithoutDiscount(){
        double sum = 0.0;
        for(Food item: items){
            if(!item.isVegetarian()){
                continue;
            }
            else{
                sum+=item.getPrice()*item.getAmount();
            }
        }
        return sum;
    }
}
