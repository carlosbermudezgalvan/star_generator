package stargenerator.noflyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StarPanelNoFlyweight extends JPanel{
    private List<StarNoFlyweight> stars; // Lista de estrellas a mostrar

    public StarPanelNoFlyweight() {
        this.stars = new ArrayList<>();
    }

    public void addStar(StarNoFlyweight star) {
        stars.add(star);
        repaint(); // Repintar el panel cuando se agrega una estrella
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen en el panel en función de la latitud y longitud
        for (StarNoFlyweight star : stars) {
            int x = star.getLongitude();
            int y = star.getLatitude();
            ImageIcon icon = star.getIcon();
            icon.paintIcon(this, g, x, y);
        }
    }
}
