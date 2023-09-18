package stargenerator.noflyweight;

public class MapControllerNoFlyweight {
    private PanoramicViewNoFlyweight view;
    private StarPanelNoFlyweight starPanel; // Utilizamos el nuevo panel personalizado

    public MapControllerNoFlyweight(PanoramicViewNoFlyweight view) {
        this.view = view;
        this.starPanel = view.getStarPanel();
    }

    public void addStar(StarNoFlyweight star) {
        starPanel.addStar(star); // Agregar la estrella al panel personalizado
    }

    public void paintStars() {
        // No es necesario limpiar ni repintar el panel personalizado
    }
}
