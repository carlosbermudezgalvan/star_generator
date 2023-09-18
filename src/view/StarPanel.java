package view;
import model.flyweight.Star;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StarPanel extends JPanel {
    private List<Star> stars; // Lista de estrellas a mostrar

    public StarPanel() {
        this.stars = new ArrayList<>();
    }

    public void addStar(Star star) {
        stars.add(star);
        repaint(); // Repintar el panel cuando se agrega una estrella
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen en el panel en función de la latitud y longitud
        for (Star star : stars) {
            int x = star.getLongitude();
            int y = star.getLatitude();
            ImageIcon icon = star.getStarFlyweight().getIcon();
            icon.paintIcon(this, g, x, y);
        }
    }
}