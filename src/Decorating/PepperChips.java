package Decorating;
// محمد سعيد مزيد 20190796
public class PepperChips implements ChipesFactory{
    @Override
    public String getDescrption() {
        return "that is PepperChips";
    }

    @Override
    public float getPrice() {
        return 10;
    }
}
