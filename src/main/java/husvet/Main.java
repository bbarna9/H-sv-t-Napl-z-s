package husvet;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final Marker kerdes = MarkerManager.getMarker("Felkialtas");
    private static final Marker kijelentes = MarkerManager.getMarker("Kijelentes");

    public static void main(String[] args) {
        if (args.length > 0) {
            int iteraciokSzama = Integer.parseInt(args[0]);
            for (int i = 0; i < iteraciokSzama; i++) {
                ThreadContext.put("Iterációk száma", String.valueOf(i + 1));
                logger.info(kijelentes, "Jó reggelt, jó reggelt,");
                logger.error(kijelentes, "Kedves liliomszál,");
                logger.fatal("Megöntözlek rózsavízzel,");
                logger.warn(kerdes, "Hogy ne hervadozzál.");
                System.out.println('\n');
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        else {
            ThreadContext.put("Iterációk száma", String.valueOf(1));
            logger.info(kijelentes, "Jó reggelt, jó reggelt,");
            logger.error(kijelentes, "Kedves liliomszál,");
            logger.fatal("Megöntözlek rózsavízzel,");
            logger.warn(kerdes, "Hogy ne hervadozzál.");
            System.out.println('\n');
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
