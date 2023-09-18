import controller.MapController;
import model.flyweight.Star;
import model.flyweight.StarFlyweight;
import view.PanoramicView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Launcher {
    public static void main(String[] args) {
        // Crear la vista
        PanoramicView view = new PanoramicView();

        // Crear el controlador y pasar la vista
        MapController controller = new MapController(view);

        // Crear una lista de StarFlyweights con diferentes imágenes
        List<StarFlyweight> starFlyweights = new ArrayList<>();
        starFlyweights.add(new StarFlyweight("pictures/starw.png"));
        starFlyweights.add(new StarFlyweight("pictures/star2.png"));
        starFlyweights.add(new StarFlyweight("pictures/fugaz.png"));

        // Definir los límites para latitude y longitude
        int minLatitude = 0;
        int maxLatitude = 1024;
        int minLongitude = 0;
        int maxLongitude = 1024;

        // Controlar la cantidad de estrellas generadas
        int numStarsToGenerate = 100;

        // Crear algunas estrellas con flyweights aleatorios y coordenadas dentro del rango
        Random random = new Random();
        for (int i = 0; i < numStarsToGenerate; i++) {
            int randomIndex = random.nextInt(starFlyweights.size());
            StarFlyweight selectedFlyweight = starFlyweights.get(randomIndex);

            // Generar coordenadas dentro del rango
            int latitude = random.nextInt(maxLatitude - minLatitude + 1) + minLatitude;
            int longitude = random.nextInt(maxLongitude - minLongitude + 1) + minLongitude;

            Star star = new Star(selectedFlyweight, latitude, longitude);
            System.out.println(star.getStarFlyweight());
            controller.addStar(star);
        }

        // Crear el StarFlyweight
        /*StarFlyweight starFlyweight1 = new StarFlyweight("pictures/star2.png");
        StarFlyweight starFlyweight2 = new StarFlyweight("pictures/starw.png");
        StarFlyweight starFlyweight3 = new StarFlyweight("pictures/fugaz.png");

        // Crear algunas estrellas y agregarlas al controlador
        Star star1 = new Star(starFlyweight, 0, 0);
        Star star2 = new Star(starFlyweight, 20, 20);
        Star star3 = new Star(starFlyweight, 30, 30);

        controller.addStar(star1);
        controller.addStar(star2);
        controller.addStar(star3);
        */
        // Pintar las estrellas en la vista
        controller.paintStars();

        // Mostrar la vista
        view.setVisible(true);
    }
}