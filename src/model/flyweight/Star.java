package model.flyweight;
import javax.swing.*;

public class Star {
    private StarFlyweight starFlyweight;  // Características intrínsecas compartidas
    private double latitude;  // Características extrínsecas únicas
    private double longitude;

    public Star(StarFlyweight starFlyweight, double latitude, double longitude) {
        this.starFlyweight = starFlyweight;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public StarFlyweight getStarFlyweight() {
        return starFlyweight;
    }

    public void setCoordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public JLabel getLabel() {
        return starFlyweight.getLabel();
    }

}
