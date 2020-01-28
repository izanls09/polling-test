package com.meep.pollingtest;

import com.meep.pollingtest.rest.VehicleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

@SpringBootApplication
public class VehicleMain implements CommandLineRunner {

	@Autowired
	private VehicleController vehicleController;

	private final ScheduledExecutorService scheduler =
			Executors.newScheduledThreadPool(1);

	public static void main(String[] args) {
		SpringApplication.run(VehicleMain.class, args);
	}

	@Override
	public void run(String... args) {
			final Runnable vehiclePrinter = () -> {
				System.out.println("----- Updating vehicle list... -----");
				vehicleController.getAvailableVehicles().forEach(System.out::println);
				System.out.println("----- End of list -----");
			};
			final ScheduledFuture<?> vehicleHandler =
					scheduler.scheduleAtFixedRate(vehiclePrinter, 5, 10, SECONDS);
			scheduler.schedule(() -> {
				vehicleHandler.cancel(true);
			}, 60 * 60, SECONDS);
		}
}