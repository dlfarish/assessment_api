package model;

import lombok.Data;

@Data
public class OrderDTO {

    private boolean isOrderComplete = false;

    private int orderID;

    private double lat;

    private double lon;

    public OrderDTO(boolean isOrderComplete, int orderID, double lat, double lon) {
        this.isOrderComplete = isOrderComplete;
        this.orderID = orderID;
        this.lat = lat;
        this.lon = lon;
    }

    public boolean getIsOrderComplete() {
        return isOrderComplete;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void setIsOrderComplete(boolean isOrderComplete) {
        this.isOrderComplete = isOrderComplete;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

}
