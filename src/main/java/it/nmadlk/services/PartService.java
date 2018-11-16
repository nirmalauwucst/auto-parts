/**
 * 
 */
package it.nmadlk.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import it.nmadlk.models.Part;

/**
 * @author Navo
 * Business Service for parts 
 */

@Service
public class PartService {
	private List<Part> parts = new ArrayList<>(Arrays.asList(
			new Part("SUS01", "Front Outer Bumper", "Body", 22000, "Suzuki WagonR FZ 2015/2016 Front Outer Bumper "),
			new Part("SUS02", "R Side Fender", "Body", 18200, "Suzuki WagonR FZ 2015/2016 Right Side Fender "),
			new Part("SUS03", "R Side Headlamp", "Body", 42000, "Suzuki WagonR FZ 2015/2016 Right Side Headlamp")
			)); 
	  
	/**
	 * Arrays.asList creates a non mutable array(cannot add or remove things from the list), 
	 * So in order to be edit the list pass to the constructor and make a copy of arrayList to make it mutable
	 */
	public List<Part> getAllParts(){
		return parts;
	}
	
	public Part getPart(String id) {
		return parts.stream().filter(t -> t.getPartId().equals(id)).findFirst().get();
	}

	public void addPart(Part part) {
		parts.add(part);
	}

	public void updatePart(String id, Part part) {
		for(int i=0; i<parts.size(); i++) {
			Part p = parts.get(i);
			if(p.getPartId().equals(id)) {
				parts.set(i, part);
				return;
			}
		}
	}

	public void deletePart(String id) {
		parts.removeIf(t -> t.getPartId().equals(id));
	}
}
