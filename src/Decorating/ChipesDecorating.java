package Decorating;
// محمد سعيد مزيد 20190796
public class ChipesDecorating implements ChipesFactory{
    ChipesFactory shipesFactory;
    public ChipesDecorating(ChipesFactory shipesFactory){

        this.shipesFactory=shipesFactory;
    }
    public String getDescrption() {

        return shipesFactory.getDescrption();
    }

    public float getPrice() {
        return 0;
    }
}
