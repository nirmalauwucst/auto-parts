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

import it.nmadlk.models.Part;
import it.nmadlk.services.PartService;

/**
 * @author Navo
 *
 */
@RestController
public class PartController {
	//@Autowired, which marks that,need of dependency injection for member variable from a service
	@Autowired
	private PartService partService;
	
	@RequestMapping("/parts")
	public List<Part> getAllParts() {
		return partService.getAllParts();
	}
	
	@RequestMapping("/parts/{id}")
	public Optional<Part> getPart(@PathVariable String id) {
		return partService.getPart(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/parts")
	public void addPart(@RequestBody Part part) {
		partService.addPart(part);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/parts/{id}")
	public void updatePart(@PathVariable String id, @RequestBody Part part) {
		partService.updatePart(id, part);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/parts/{id}")
	public void deletePart(@PathVariable String id) {
		partService.deletePart(id);
	}
	
	
	
}
