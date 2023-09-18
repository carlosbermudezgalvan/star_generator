import stargenerator.noflyweight.MapControllerNoFlyweight;
import stargenerator.noflyweight.StarNoFlyweight;
import stargenerator.noflyweight.PanoramicViewNoFlyweight;

import java.util.Random;

public class LauncherNoFlyweight {
    public static void main(String[] args) {
        // Crear la vista
        PanoramicViewNoFlyweight view = new PanoramicViewNoFlyweight();

        // Crear el controlador y pasar la vista
        MapControllerNoFlyweight controller = new MapControllerNoFlyweight(view);
        // Definir límites para latitud y longitud
        int minLatitude = 10;
        int maxLatitude = 400;
        int minLongitude = 10;
        int maxLongitude = 400;

        // Definir la cantidad de estrellas que deseas crear
        int numberOfStars = 20;

        // Definir las rutas de imágenes de estrellas disponibles
        String[] starRoutes = {"pictures/starw.png", "pictures/star2.png", "pictures/fugaz.png"};

        // Crear estrellas aleatoriamente
        Random random = new Random();
        for (int i = 0; i < numberOfStars; i++) {
            // Generar coordenadas aleatorias dentro de los límites
            int latitude = random.nextInt(maxLatitude - minLatitude + 1) + minLatitude;
            int longitude = random.nextInt(maxLongitude - minLongitude + 1) + minLongitude;

            // Elegir aleatoriamente una ruta de estrella
            String randomStarRoute = starRoutes[random.nextInt(starRoutes.length)];

            // Crear la estrella con las coordenadas y la ruta de imagen
            StarNoFlyweight star = new StarNoFlyweight(randomStarRoute, latitude, longitude);

            // Agregar la estrella al controlador
            controller.addStar(star);
        }

        // Pintar las estrellas en la vista
        controller.paintStars();

        // Mostrar la vista
        view.setVisible(true);
    }
}
