package counter;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Run {
    private static final TreeMap<String, HashMap<String, Long>> urlCountMap = new TreeMap<>();

    public static void main(String[] args) {
        Collections.synchronizedNavigableMap(urlCountMap);
        String fileName;

        if (args != null && args.length != 0) {
            fileName = args[0];
            try {
                if (extractInfoFromFile(fileName)) {
                    // urlHitCounter();
                }
            } catch (Exception e) {
                System.out.println("Exception occured while reading file : " + e.getClass().getName());
            }
        }
    }

    private static boolean extractInfoFromFile(String fileName){

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(str-> urlHitCounter(str));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        for (Map.Entry<String, HashMap<String, Long>> entry : urlCountMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Map.Entry<String, Long> mapEntry : entry.getValue().entrySet()) {
                System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
            }
        }
        return true;
    }

    private static void urlHitCounter(String urlData) {

        String dateInEpoch = urlData.substring(0, urlData.indexOf("|"));
        String url = urlData.substring(urlData.indexOf("|")+1);

        //convert epoch to date in GMT
        ZoneId zoneId = ZoneId.of("GMT");
        Instant instant = Instant.ofEpochMilli(Long.parseLong(dateInEpoch)*1000);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy zzz");
        String date = dateTimeFormatter.format(zonedDateTime);

        HashMap<String, Long>tmap = urlCountMap.getOrDefault(date, new HashMap<>());
        Long hitCount = tmap.getOrDefault(url, (long) 0)+1;
        tmap.put(url, hitCount);

        urlCountMap.put(date, tmap);
    }
}
