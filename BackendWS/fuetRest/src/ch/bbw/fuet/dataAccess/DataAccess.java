package ch.bbw.fuet.dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ch.bbw.fuet.model.Product;
import ch.bbw.fuet.model.ShoppingList;

public class DataAccess {
	private Connection conn;
	
	public DataAccess() {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/fuet", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		
		try {
			Statement stmt = conn.createStatement();
		    stmt.executeQuery("SELECT * FROM fuet.product");
		    
		    ResultSet rs = stmt.getResultSet();

		    while (rs.next()) {
		        products.add(new Product(rs.getInt("productID"), rs.getString("name"), rs.getInt("cost"), rs.getString("imageURL")));
		    }
        } catch (Exception e) {
            e.printStackTrace();
        } 
		
		return products;
	}
	
	public List<ShoppingList> getShoppingList() {
		List<ShoppingList> shoppingList = new ArrayList<ShoppingList>();
		
		try {
			Statement stmt = conn.createStatement();
		    stmt.executeQuery("SELECT * FROM fuet.shoppingList");
		    
		    ResultSet rs = stmt.getResultSet();

		    while (rs.next()) {
		        shoppingList.add(new ShoppingList(rs.getInt("shoppingListID"), rs.getInt("productIDFK"), rs.getInt("amount")));
		    }
        } catch (Exception e) {
            e.printStackTrace();
        } 
		
		return shoppingList;
	}
	
	public void addProductToShoppingList(ShoppingList shoppingList) {
		try {
			Statement stmt = conn.createStatement();
		    stmt.executeUpdate("INSERT INTO fuet.shoppingList(productIDFK, amount) VALUES(" + shoppingList.getProductIDFK() + ", " + shoppingList.getAmount() + ")");
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
	
	public void removeProductFromShoppingList(ShoppingList shoppingList) {
		try {
			Statement stmt = conn.createStatement();
		    stmt.executeUpdate("DELETE FROM fuet.shoppingList WHERE shoppingListID = " + shoppingList.getShoppingListID());
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
	
	public void upateShoppingListProductAmount(ShoppingList shoppingList) {
		try {
			Statement stmt = conn.createStatement();
		    stmt.executeUpdate("UPDATE fuet.shoppingList SET amount = " + shoppingList.getAmount() + " WHERE shoppingListID = " + shoppingList.getShoppingListID());
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
}
