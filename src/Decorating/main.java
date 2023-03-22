package Decorating;
// محمد سعيد مزيد 20190796
public class main {
    public static void main(String[] args) {
        ChipesFactory chipes1=new SolatShipes();
        System.out.println(chipes1.getDescrption()+" "+chipes1.getPrice());
        ChipesDecorating s;
        s=new Ketchup(chipes1);
        s=new Ketchup(s);
        s=new Ketchup(s);
        s=new Ketchup(s);
        s=new Ketchup(s);
        System.out.println(s.getDescrption()+" "+s.getPrice());
    }
}
