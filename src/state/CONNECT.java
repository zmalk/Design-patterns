package state;

public class CONNECT implements  State{
    private VpnManager v;
    @Override
    public void perform(VpnManager v) {
        v.setState(StatType.CONNECT);
        System.out.println("Connect");
    }
}
