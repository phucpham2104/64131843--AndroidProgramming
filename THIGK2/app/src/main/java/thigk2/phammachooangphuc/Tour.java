package thigk2.phammachooangphuc;

public class Tour {
    private int image;
    private String name;
    private String address;

    public Tour(int image, String name, String address) {
        this.image = image;
        this.name = name;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}