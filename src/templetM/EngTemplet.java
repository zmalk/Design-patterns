package templetM;

public class EngTemplet extends CvTemplet{
    user u1;
    public EngTemplet(user u1){
        this.u1=u1;
    }

    @Override
    public void personalInformation() {
        System.out.println(u1.personal);
    }

    @Override
    public void Goals() {
        System.out.println(u1.goals);
    }

    @Override
    public void edu() {
        System.out.println(u1.edu);
    }

    @Override
    public void expe() {
        System.out.println(u1.exp);
    }

    @Override
    public void skills() {
        System.out.println(u1.skills);
    }

}
