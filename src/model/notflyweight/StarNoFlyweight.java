package model.notflyweight;

import javax.swing.*;

public class StarNoFlyweight {
    private JLabel label;  // Características intrínsecas individuales
    private ImageIcon icon;
    private double latitude;  // Características extrínsecas únicas
    private double longitude;

    public StarNoFlyweight(String iconPath, double latitude, double longitude) {
        // Crear instancias individuales de JLabel e ImageIcon para cada estrella
        this.label = new JLabel();
        this.icon = new ImageIcon(iconPath);
        // Configurar el JLabel con el ImageIcon
        this.label.setIcon(this.icon);

        this.latitude = latitude;
        this.longitude = longitude;
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
        return label;
    }

}
