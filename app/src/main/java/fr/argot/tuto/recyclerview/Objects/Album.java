package fr.argot.tuto.recyclerview.Objects;

/**
 * Created by Julien on 11/11/2016.
 */

public class Album {
    private String title;
    private String departureDate;
    private String duration;

    public Album(String title, String departureDate, String duration) {
        this.title = title;
        this.departureDate = departureDate;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
