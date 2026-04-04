package phuc.edu.recyclerview;

public class Landscape {
    private String landscapeImageName;
    private String landscapeCaption;

    public Landscape(String landscapeImageName, String landscapeCaption) {
        this.landscapeImageName = landscapeImageName;
        this.landscapeCaption = landscapeCaption;
    }

    public String getLandscapeImageName() {
        return landscapeImageName;
    }

    public void setLandscapeImageName(String landscapeImageName) {
        this.landscapeImageName = landscapeImageName;
    }

    public String getLandscapeCaption() {
        return landscapeCaption;
    }

    public void setLandscapeCaption(String landscapeCaption) {
        this.landscapeCaption = landscapeCaption;
    }
}