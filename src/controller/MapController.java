package controller;

import model.flyweight.Star;
import view.PanoramicView;
import view.StarPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MapController implements ActionListener {
    private PanoramicView view;
    private StarPanel starPanel; // Utilizamos el nuevo panel personalizado

    public MapController(PanoramicView view) {
        this.view = view;
        this.starPanel = view.getStarPanel();
    }

    public void addStar(Star star) {
        starPanel.addStar(star); // Agregar la estrella al panel personalizado
    }

    public void paintStars() {
        // No es necesario limpiar ni repintar el panel personalizado
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Arriba")) {
            // Realizar la acción correspondiente (mover estrellas hacia arriba)
            moveStars(0, -10); // Ejemplo: Mover las estrellas 10 píxeles hacia arriba
        } else if (e.getActionCommand().equals("Abajo")) {
            // Realizar la acción correspondiente (mover estrellas hacia abajo)
            moveStars(0, 10); // Ejemplo: Mover las estrellas 10 píxeles hacia abajo
        } else if (e.getActionCommand().equals("Izquierda")) {
            // Realizar la acción correspondiente (mover estrellas hacia la izquierda)
            moveStars(+10, 0); // Ejemplo: Mover las estrellas 10 píxeles hacia la izquierda
        } else if (e.getActionCommand().equals("Derecha")) {
            // Realizar la acción correspondiente (mover estrellas hacia la derecha)
            moveStars(-10, 0); // Ejemplo: Mover las estrellas 10 píxeles hacia la derecha
        }
    }
    private void moveStars(int deltaX, int deltaY) {
        // Mover todas las estrellas por la cantidad especificada
        for (Star star : starPanel.stars) {
            int newLatitude = star.getLatitude() + deltaY;
            int newLongitude = star.getLongitude() + deltaX;
            star.setCoordinates(newLatitude, newLongitude);
        }

        // Repintar el panel para mostrar las estrellas en sus nuevas posiciones
        starPanel.repaint();
    }
}