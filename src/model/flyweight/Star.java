package model.flyweight;
import javax.swing.*;

public class Star {
    private StarFlyweight starFlyweight;  // Características intrínsecas compartidas
    private int latitude;  // Características extrínsecas únicas
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
        return starFlyweight.getLabel();
    }

}
