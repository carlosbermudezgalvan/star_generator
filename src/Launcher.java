import model.flyweight.Star;
import model.flyweight.StarFlyweight;
import model.notflyweight.StarNoFlyweight;

public class Launcher {
    public static void main(String[] args) {
        String examplePath = "star1";
        StarFlyweight sf = new StarFlyweight(examplePath);

        Star star = new Star(sf,1,0);
        Star star2 = new Star(sf,2,0);
        Star star3 = new Star(sf,3,0);

        System.out.println(star.getLatitude());
        System.out.println(star2.getLatitude());
        System.out.println(star3.getLatitude());
        // comprobando que se está usando el mismo objeto/recurso (star flyweight)
        System.out.println("HashCode de StarFlyweight: " + sf.hashCode());
        System.out.println("HashCode de star: " + star.getLabel().hashCode());
        System.out.println("HashCode de star2: " + star2.getLabel().hashCode());
        System.out.println("HashCode de star3: " + star3.getLabel().hashCode());

        // NO USANDO FLYWEIGHT
        StarNoFlyweight starn1 = new StarNoFlyweight("uno",1,0);
        StarNoFlyweight starn2 = new StarNoFlyweight("uno",2,0);
        StarNoFlyweight starn3 = new StarNoFlyweight("tres",3,0);
        System.out.println("NO FLYWEIGHT");
        System.out.println("HashCode de star: " + starn1.getLabel().hashCode());
        System.out.println("HashCode de star2: " + starn2.getLabel().hashCode());
        System.out.println("HashCode de star3: " + starn3.getLabel().hashCode());

        // Parece que se cumple el objetivo, con flyweight se usa el mismo label
        // mientras que sin flyweight aunque sea el mismo iconPath , crea siempre distintos labels


    }
}