package com.meep.pollingtest.service;

import com.meep.pollingtest.bean.Vehicle;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.meep.pollingtest.resources.Constants.LISBOA_FILTERED;

@Service
public class VehicleServiceImpl implements VehicleService {

    public List<Vehicle> updateAvailableVehicles () {

        RestTemplate restTemplate = new RestTemplate();
        Stream<Vehicle> response = Arrays.stream(Objects.requireNonNull(restTemplate.getForEntity(LISBOA_FILTERED, Vehicle[].class).getBody()));

        return response.collect(Collectors.toList());
    }
}
