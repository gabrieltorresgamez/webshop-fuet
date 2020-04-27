package ch.bbw.fuet.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import ch.bbw.fuet.dataAccess.DataAccess;
import ch.bbw.fuet.model.ShoppingList;

@Path("/")
public class FuetRestService {
	@GET
	@Path("/products")
	@Produces("application/json")
	public Response getProducts() {
		DataAccess dataAccess = new DataAccess();
		
		return Response.status(Status.OK).entity(dataAccess.getProducts()).build();
	}

	@GET
	@Path("/shoppingList")
	@Produces("application/json")
	public Response getShoppingList() {
		DataAccess dataAccess = new DataAccess();
		
		return Response.status(Status.OK).entity(dataAccess.getShoppingList()).build();
	}

	@POST
	@Path("/addToShoppingList")
	public void addToShoppingList(ShoppingList shoppingList) {
		DataAccess dataAccess = new DataAccess();

		dataAccess.addProductToShoppingList(shoppingList);
	}

	@POST
	@Path("/updateShoppingListItem")
	public void updateShoppingListItem(ShoppingList shoppingList) {
		DataAccess dataAccess = new DataAccess();

		dataAccess.upateShoppingListProductAmount(shoppingList);
	}

	@DELETE
	@Path("/removeFromShoppingList")
	public void removeFromShoppingList(ShoppingList shoppingList) {
		DataAccess dataAccess = new DataAccess();

		dataAccess.removeProductFromShoppingList(shoppingList);
	}
}
