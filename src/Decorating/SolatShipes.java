package Decorating;
// محمد سعيد مزيد 20190796
public class SolatShipes implements ChipesFactory{
    @Override
    public String getDescrption() {
        return "that is SolatShipes";
    }

    @Override
    public float getPrice() {
        return 5;
    }
}
