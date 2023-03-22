package state;

public class Main {
    public static void main(String[] args) {
        VpnManager vpnManager=new VpnManager();
        vpnManager.setState(StatType.CONNECT);

        vpnManager.setState(StatType.DISCONNECT);

    }
}
