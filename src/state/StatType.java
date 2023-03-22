package state;

public enum StatType {
    CONNECT,
    DISCONNECT;


}
class VpnManager{
    private  StatType state;
    void setState(StatType state){
        this.state=state;
    }
}

