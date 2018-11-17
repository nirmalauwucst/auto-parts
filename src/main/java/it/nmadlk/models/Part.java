/**
 * 
 */
package it.nmadlk.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Navo
 *
 */

@Entity
public class Part {
	
	@Id
	private String partId;
	private String partName;
	private String partCategory;
	private double unitCost;
	private String description;
	
	
	public Part() {
		
	}


	public Part(String partId, String partName, String partCategory, double unitCost, String description) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.partCategory = partCategory;
		this.unitCost = unitCost;
		this.description = description;
	}



	public String getPartId() {
		return partId;
	}


	public void setPartId(String partId) {
		this.partId = partId;
	}


	public String getPartName() {
		return partName;
	}


	public void setPartName(String partName) {
		this.partName = partName;
	}


	public String getPartCategory() {
		return partCategory;
	}


	public void setPartCategory(String partCategory) {
		this.partCategory = partCategory;
	}


	public double getUnitCost() {
		return unitCost;
	}


	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
