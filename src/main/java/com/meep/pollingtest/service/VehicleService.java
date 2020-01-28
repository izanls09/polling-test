package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {
    List<Vehicle> updateAvailableVehicles();
}
