package pojo;

public class Area {
    private String government;
    private String address;

    public Area(String government, String address) {
        this.government = government;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getGovernment() {
        return government;
    }
}
