package com.meep.pollingtest.rest;

import com.meep.pollingtest.bean.Resource;
import com.meep.pollingtest.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @GetMapping(value = "/vehicles/available/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Resource> getAvailableVehicles() {
        return resourceService.updateAvailableVehicles();
    }
}
