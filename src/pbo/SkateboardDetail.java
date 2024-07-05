package pbo;

public class SkateboardDetail extends Skateboard {
    public SkateboardDetail(String brand, String model) {
        super(brand, model);
    }

    public int getYear() {
        return 2000 + Integer.parseInt(getModel().substring(0, 2));
    }

    public String getType() {
        String typeCode = getModel().substring(2, 3);
        switch (typeCode) {
            case "1":
                return "Freestyle";
            case "2":
                return "Street";
            case "3":
                return "Vert";
            default:
                return "Tipe Tidak diketahui";
        }
    }

    public String getSize() {
        String sizeCode = getModel().substring(3, 4);
        switch (sizeCode) {
            case "1":
                return "Kecil";
            case "2":
                return "Sedang";
            case "3":
                return "Besar";
            default:
                return "Ukuran tidak ada";
        }
    }

    public int getSerialNumber() {
        return Integer.parseInt(getModel().substring(4, 5));
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun: " + getYear() +
                "\nTipe: " + getType() +
                "\nUkuran: " + getSize() +
                "\nSerial Number: " + getSerialNumber();
    }
}
