package com.meep.pollingtest.bean;

import java.util.Objects;

public class Resource {
            private String id;
            private String name;
            private float x;
            private float y;
            private String licensePlate;
            private int range;
            private int batteryLevel;
            private int seats;
            private String model;
            private String resourceImageId;
            private float pricePerMinuteParking;
            private float pricePerMinuteDriving;
            private boolean realTimeData;
            private String engineType;
            private String resourceType;
            private int companyZoneId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResourceImageId() {
        return resourceImageId;
    }

    public void setResourceImageId(String resourceImageId) {
        this.resourceImageId = resourceImageId;
    }

    public float getPricePerMinuteParking() {
        return pricePerMinuteParking;
    }

    public void setPricePerMinuteParking(float pricePerMinuteParking) {
        this.pricePerMinuteParking = pricePerMinuteParking;
    }

    public float getPricePerMinuteDriving() {
        return pricePerMinuteDriving;
    }

    public void setPricePerMinuteDriving(float pricePerMinuteDriving) {
        this.pricePerMinuteDriving = pricePerMinuteDriving;
    }

    public boolean isRealTimeData() {
        return realTimeData;
    }

    public void setRealTimeData(boolean realTimeData) {
        this.realTimeData = realTimeData;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getCompanyZoneId() {
        return companyZoneId;
    }

    public void setCompanyZoneId(int companyZoneId) {
        this.companyZoneId = companyZoneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Float.compare(resource.x, x) == 0 &&
                Float.compare(resource.y, y) == 0 &&
                range == resource.range &&
                batteryLevel == resource.batteryLevel &&
                seats == resource.seats &&
                Float.compare(resource.pricePerMinuteParking, pricePerMinuteParking) == 0 &&
                Float.compare(resource.pricePerMinuteDriving, pricePerMinuteDriving) == 0 &&
                realTimeData == resource.realTimeData &&
                companyZoneId == resource.companyZoneId &&
                id.equals(resource.id) &&
                Objects.equals(name, resource.name) &&
                Objects.equals(licensePlate, resource.licensePlate) &&
                Objects.equals(model, resource.model) &&
                Objects.equals(resourceImageId, resource.resourceImageId) &&
                Objects.equals(engineType, resource.engineType) &&
                Objects.equals(resourceType, resource.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, x, y, licensePlate, range, batteryLevel, seats, model, resourceImageId, pricePerMinuteParking, pricePerMinuteDriving, realTimeData, engineType, resourceType, companyZoneId);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", licensePlate='" + licensePlate + '\'' +
                ", range=" + range +
                ", batteryLevel=" + batteryLevel +
                ", seats=" + seats +
                ", model='" + model + '\'' +
                ", resourceImageId='" + resourceImageId + '\'' +
                ", pricePerMinuteParking=" + pricePerMinuteParking +
                ", pricePerMinuteDriving=" + pricePerMinuteDriving +
                ", realTimeData=" + realTimeData +
                ", engineType='" + engineType + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", companyZoneId=" + companyZoneId +
                '}';
    }
}
