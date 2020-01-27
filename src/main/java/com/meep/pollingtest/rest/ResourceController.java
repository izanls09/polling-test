package com.meep.pollingtest.rest;

import com.meep.pollingtest.bean.Resource;
import com.meep.pollingtest.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @RequestMapping(value = "/vehicles/available/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Resource> getAvailableVehicles() {
        return resourceService.updateAvailableVehicles();
    }
}
