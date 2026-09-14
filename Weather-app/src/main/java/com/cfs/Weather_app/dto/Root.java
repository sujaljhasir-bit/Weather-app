package com.cfs.Weather_app.dto;

public class Root {
    public Location location;
    public Current current;

    public Root(Current current, Location location) {
        this.current = current;
        this.location = location;
    }

    public Root() {
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
