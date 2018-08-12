package net.uatocz.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * @date 17/07/2018
 *
 * @author Vadym Dorosheyvch
 */

@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * @name дата та час відправлення
     */
    @NotNull
    private String dateAndTimeOfDeparture;

    /**
     * @name дата та час прибуття
     */
    @NotNull
    private String dateAndTimeOfArrival;

    /**
     * @name місце відправлення
     */
    @NotNull
    private String placeOfDeparture;

    /**
     * @name місце прибуття
     */
    @NotNull
    private String placeOfArrival;

    /**
     * @name маршрут
     */
    @NotNull
    private String route;

    /**
     * @name марка автомобіля
     */
    @NotNull
    private String car;

    /**
     * @name кількість вільних місць
     */
    @NotNull
    private int freeSeats;

    /**
     * @name ціна за поїздку
     */
    @NotNull
    private String price;

    /**
     * @name Ім'я водія
     */
    @NotNull
    private String driver;

    public Schedule() {
    }

    public Schedule(String dateAndTimeOfDeparture, String dateAndTimeOfArrival, String placeOfDeparture, String placeOfArrival, String route, String car, int freeSeats, String price, String driver) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
        this.placeOfDeparture = placeOfDeparture;
        this.placeOfArrival = placeOfArrival;
        this.route = route;
        this.car = car;
        this.freeSeats = freeSeats;
        this.price = price;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }

    public String getDateAndTimeOfArrival() {
        return dateAndTimeOfArrival;
    }

    public void setDateAndTimeOfArrival(String dateAndTimeOfArrival) {
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    public void setPlaceOfArrival(String placeOfArrival) {
        this.placeOfArrival = placeOfArrival;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "ScheduleService{" +
                "id=" + id +
                ", dateAndTimeOfDeparture='" + dateAndTimeOfDeparture + '\'' +
                ", dateAndTimeOfArrival='" + dateAndTimeOfArrival + '\'' +
                ", placeOfDeparture='" + placeOfDeparture + '\'' +
                ", placeOfArrival='" + placeOfArrival + '\'' +
                ", route='" + route + '\'' +
                ", car='" + car + '\'' +
                ", freeSeats=" + freeSeats +
                ", price='" + price + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }
}
