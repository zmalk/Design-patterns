package state;

public class DISCONNECT implements State{
    private VpnManager v;
    @Override
    public void perform(VpnManager v) {
        v.setState(StatType.DISCONNECT);
        System.out.println("DissConnect");
    }
}
