package com.meep.pollingtest.rest;

import com.meep.pollingtest.bean.ResourceCollection;
import com.meep.pollingtest.service.ResourceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @Autowired
    private ResourceServiceImpl resourceServiceImpl;

    @RequestMapping(value = "/vehicles/available/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResourceCollection> getAvailableVehicles() {
        return resourceServiceImpl.updateAvailableVehicles();
    }
}
