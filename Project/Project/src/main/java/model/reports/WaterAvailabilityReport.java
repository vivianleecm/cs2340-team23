package model.reports;

import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.service.geocoding.GeocoderStatus;
import com.lynden.gmapsfx.service.geocoding.GeocodingService;

import java.time.LocalDateTime;

public class WaterAvailabilityReport {
    private LocalDateTime time;
    private int number;
    private String name;
    private String address;
    private LatLong coordinates;
    private WaterType type;
    private WaterCondition condition;

    /**
     * Generates a new WaterAvailabilityReport
     * @param number            the number of the report
     * @param name              the name of the reporter
     * @param address           the formatted address of the water source
     * @param coordinates       the coordinates of the water source
     * @param type              the type of water source
     * @param condition         the condition of the water source
     */
    public WaterAvailabilityReport(int number,
                                   String name,
                                   String address,
                                   LatLong coordinates,
                                   WaterType type,
                                   WaterCondition condition) {
        time = LocalDateTime.now();
        this.number = number;
        this.name = name;
        this.address = address;
        this.coordinates = coordinates;
        this.type = type;
        this.condition = condition;
    }

    /**
     * Retrieves the date and time of the report
     * @return      date and time of report
     */
    public String getDateAndTime() { return time.getMonth().getValue() +
            "/" + time.getDayOfMonth() +
            "/" + time.getYear() +
            ", " + time.getHour() +
            ":" + String.format("%02d", time.getMinute()); }

    /**
     * Retrieves the report number
     * @return      number of report
     */
    public int getReportNumber() { return number; }

    /**
     * Retrieves the name of the person who made the report
     * @return      name of report creator
     */
    public String getNameOfReporter() { return name; }

    /**
     * Retrieves the location of the report
     * @return      location of report, in address form
     */
    public String getLocationOfReport() { return address; }

    /**
     * Retrieves the location of the report, in coordinates
     * @return      location of report, in coordinates
     */
    public LatLong getCoordinates() { return coordinates; }

    /**
     * Retrieves the water source type
     * @return      type of water source
     */
    public String getWaterType() { return type.toString(); }

    /**
     * Retrieves the condition of the water
     * @return      condition of the water
     */
    public String getWaterCondition() { return condition.toString(); }
}