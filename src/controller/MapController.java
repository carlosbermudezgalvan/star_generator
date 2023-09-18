package controller;

import model.flyweight.Star;
import view.PanoramicView;
import view.StarPanel;



public class MapController {
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
}