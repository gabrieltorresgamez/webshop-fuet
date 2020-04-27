package ch.bbw.fuet.model;

public class ShoppingList {
	private int shoppingListID;
	private int productIDFK;
	private int amount;
	
	public ShoppingList() {}
	
	public ShoppingList(int shoppingListID, int productIDFK, int amount) {
		this.shoppingListID = shoppingListID;
		this.productIDFK = productIDFK;
		this.amount = amount;
	}
	
	public int getShoppingListID() {
		return shoppingListID;
	}
	public void setShoppingListID(int shoppingListID) {
		this.shoppingListID = shoppingListID;
	}
	public int getProductIDFK() {
		return productIDFK;
	}
	public void setProductIDFK(int productIDFK) {
		this.productIDFK = productIDFK;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
