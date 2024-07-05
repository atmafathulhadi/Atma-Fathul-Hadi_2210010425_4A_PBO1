package pbo;

public class Skateboard {
    private String brand;
    private String model;
    
    public Skateboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String displayInfo() {
        return "Brand: " + getBrand() + "\nModel: " + getModel();
    }

    public String displayInfo(String additionalInfo) {
        return displayInfo() + "\nAdditional Info: " + additionalInfo;
    }
}
