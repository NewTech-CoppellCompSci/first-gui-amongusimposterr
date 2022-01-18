package myfirstguipackage;
public class House {
	private int bedrooms;
	private double bathrooms;
	private int cost;
	private String address;
	private String imagelocation;
	public House(int bedrooms,double bathrooms,int cost,String address, String imagelocation) {
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.cost = cost;
		this.address = address;
		this.imagelocation = imagelocation;
	}
	
	public int getbedrooms() {
		return bedrooms;
	}
	public double getbathrooms() {
		return bathrooms;
	}
	public String getaddress() {
		return address;
	}
	public int getcost() {
		return cost;
	}
	public String getimagelocation() {
		return imagelocation;
	}

}
