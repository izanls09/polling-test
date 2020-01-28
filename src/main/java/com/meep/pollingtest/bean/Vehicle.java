package com.meep.pollingtest.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vehicle {
            private String id;
            private String name;
            private float x;
            private float y;
            private String licencePlate;
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
}
