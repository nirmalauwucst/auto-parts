/**
 * 
 */
package it.nmadlk.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.nmadlk.models.Vehicle;
import it.nmadlk.services.VehicleService;

/**
 * @author Navo
 *
 */
@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping("/vehicles")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.getAllVehicles();
	}
	
	@RequestMapping("/vehicles/{id}")
	public Optional<Vehicle> getVehicle(@PathVariable String id) {
		return vehicleService.getVehicle(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/vehicles")
	public void addPart(@RequestBody Vehicle vehicle) {
		vehicleService.addVehicle(vehicle);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/vehicles/{id}")
	public void updatePart(@PathVariable String id, @RequestBody Vehicle vehicle) {
		vehicleService.updateVehicle(id, vehicle);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/vehicles/{id}")
	public void deleteVehicle(@PathVariable String id) {
		vehicleService.deleteVehicle(id);
	}
	
}
