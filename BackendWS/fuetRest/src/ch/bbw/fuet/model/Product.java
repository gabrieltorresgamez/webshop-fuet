package ch.bbw.fuet.model;

public class Product {
	private int productID;
	private String name;
	private int cost;
	private String imageURL;
	
	public Product() {}
	
	public Product(int productID, String name, int cost, String imageURL) {
		this.productID = productID;
		this.name = name;
		this.cost = cost;
		this.imageURL = imageURL;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
}
