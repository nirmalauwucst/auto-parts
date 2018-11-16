/**
 * 
 */
package it.nmadlk.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.nmadlk.models.Part;

/**
 * @author Navo
 *
 */
@RestController
public class PartController {
	
	@RequestMapping("/parts")
	public List<Part> getAllParts() {
		return Arrays.asList(
				new Part("SUS01", "Front Outer Bumper", "Suzuki WagonR FZ", "2015", "Suzuki WagonR FZ 2015/2016 Front Outer Bumper "),
				new Part("SUS02", "R Side Fender", "Suzuki WagonR FZ", "2015", "Suzuki WagonR FZ 2015/2016 Right Side Fender "),
				new Part("SUS03", "R Side Headlamp", "Suzuki WagonR FZ", "2015", "Suzuki WagonR FZ 2015/2016 Right Side Headlamp")
				);
	}
}
