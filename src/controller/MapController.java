package controller;

import model.flyweight.Star;
import view.PanoramicView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MapController {
    private PanoramicView view; // Haz que el controlador tenga una referencia a tu vista
    public List<Star> stars; // Lista de estrellas a mostrar

    public MapController(PanoramicView view) {
        this.view = view;
        this.stars = new ArrayList<>(); // Inicializa la lista de estrellas
    }

    public void addStar(Star star) {
        // Agregar la estrella a la lista
        stars.add(star);

        // Obtener el panel negro de la vista
        JPanel blackPanel = view.getBlackPanel();

        // Obtener el JLabel de la estrella
        JLabel starLabel = star.getLabel();

        // Establecer la ubicación del JLabel en el panel negro
        starLabel.setBounds(star.getLongitude(), star.getLatitude(), starLabel.getPreferredSize().width, starLabel.getPreferredSize().height);

        // Agregar el JLabel al panel negro
        blackPanel.add(starLabel);

        // Repintar el panel negro para que se muestre la estrella
        blackPanel.repaint();
    }
    public void paintStars() {
        // Obtener el panel negro de la vista
        JPanel blackPanel = view.getBlackPanel();

        // Limpiar el panel negro antes de volver a pintar las estrellas
        blackPanel.removeAll();

        // Recorrer la lista de estrellas y agregarlas nuevamente al panel negro
        for (Star star : stars) {
            JLabel starLabel = star.getLabel();
            // Establecer la ubicación del JLabel en el panel negro
            starLabel.setBounds(star.getLongitude(), star.getLatitude(), starLabel.getPreferredSize().width, starLabel.getPreferredSize().height);
            // Agregar el JLabel al panel negro
            blackPanel.add(starLabel);
        }

        // Repintar el panel negro para mostrar las estrellas
        blackPanel.repaint();
    }
}
