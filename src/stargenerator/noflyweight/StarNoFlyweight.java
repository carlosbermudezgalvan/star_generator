package stargenerator.noflyweight;

import javax.swing.*;

public class StarNoFlyweight {
    private ImageIcon icon;
    private int latitude;
    private int longitude;

    public StarNoFlyweight(String iconPath, int latitude, int longitude) {
        this.icon = new ImageIcon(iconPath);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setCoordinates(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public ImageIcon getIcon() {
        return icon;
    }
}
