package Decorating;
// محمد سعيد مزيد 20190796
public class Ketchup extends ChipesDecorating {
    public Ketchup(ChipesFactory shipesFactory){
        super(shipesFactory);
    }
    public String getDescrption() {
        return shipesFactory.getDescrption()+" "+" Ketchup ";
    }

    public float getPrice() {
        return shipesFactory.getPrice()+8;
    }
}
