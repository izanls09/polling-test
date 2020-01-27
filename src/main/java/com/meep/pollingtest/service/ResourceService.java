package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.Resource;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface ResourceService {
    Collection<Resource> updateAvailableVehicles();
}
