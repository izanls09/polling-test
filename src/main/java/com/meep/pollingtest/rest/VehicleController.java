package com.meep.pollingtest.rest;

import com.meep.pollingtest.bean.Vehicle;
import com.meep.pollingtest.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Scheduled(fixedRate = 5)
    @RequestMapping(value = "/vehicles/available/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Vehicle> getAvailableVehicles() {
        return this.vehicleService.updateAvailableVehicles();
    }
}
