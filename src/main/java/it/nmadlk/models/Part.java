/**
 * 
 */
package it.nmadlk.models;

/**
 * @author Navo
 *
 */
public class Part {
	
	private String partId;
	private String partName;
	private String vehicleModel;
	private String vehicleYear;
	private String description;
	
	
	public Part() {
		
	}
	
	
	public Part(String partId, String partName, String vehicleModel, String vehicleYear, String description) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.vehicleModel = vehicleModel;
		this.vehicleYear = vehicleYear;
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
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleYear() {
		return vehicleYear;
	}
	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
