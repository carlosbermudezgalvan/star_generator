package model.flyweight;
import javax.swing.*;

public class Star {
    private StarFlyweight starFlyweight;
    private int latitude;
    private int longitude;

    public Star(StarFlyweight starFlyweight, int latitude, int longitude) {
        this.starFlyweight = starFlyweight;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public StarFlyweight getStarFlyweight() {
        return starFlyweight;
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

    public JLabel getLabel() {
        JLabel label = new JLabel(starFlyweight.getIcon()); // Crea un nuevo JLabel con el icono
        label.setBounds(longitude, latitude, starFlyweight.getIcon().getIconWidth(), starFlyweight.getIcon().getIconHeight());
        return label;
    }
}