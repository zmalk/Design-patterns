package templetM;

public abstract class CvTemplet {

    public abstract void personalInformation();
    public abstract void Goals();
    public abstract void edu();
    public  abstract void expe();
    public  abstract  void skills();

    public final void createCv(){
        personalInformation();
        Goals();
        edu();
        expe();
        skills();
    }


}
