public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 21;
        boolean currentlyRaining = false;

        if (temperature > 20 && !currentlyRaining){
            System.out.println("wear shorts and sunscreen");
        } else if (temperature > 20 && currentlyRaining ) {
            System.out.println("Wear a light rain coat");
        } else if (temperature < 20 && !currentlyRaining) {
            System.out.println("wear a jumper/coat it may be cold");
        }else {
            System.out.println("you should stay indoors, unless you like the cold and rain");
        }


    }
}
