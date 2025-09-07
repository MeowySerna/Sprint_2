package model;
import static model.constants.Colour.RED;
import static model.constants.Discount.RED_APPLE;

public class Apple extends Food{
    private final String colour;

    public Apple(int amount, double price, String colour){
        super(amount,price,true);
        this.colour=colour;
    }

    @Override
    public double
    getDiscount(){
        if(colour.equals(RED)) {
            return RED_APPLE;
        }
        return 0;
    }

    public String getColour(){
        return colour;
    }
}
