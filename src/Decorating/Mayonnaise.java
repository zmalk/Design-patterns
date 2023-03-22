package Decorating;
// محمد سعيد مزيد 20190796
public class Mayonnaise extends ChipesDecorating {
    public Mayonnaise(ChipesFactory shipesFactory) {
        super(shipesFactory);
    }
    public String getDescrption() {
        return shipesFactory.getDescrption()+" "+" Mayonnaise";
    }

    public float getPrice() {
        return shipesFactory.getPrice()+5;
    }
}
