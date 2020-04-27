import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Product } from "../models/product";
import { Observable } from "rxjs";
import { ShoppingList } from "../models/shoppingList";

@Injectable({
  providedIn: "root",
})
export class DataService {
  apiUrl = "http://localhost:8080/fuetRest/";

  constructor(private http: HttpClient) {}

  public getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.apiUrl + "products");
  }

  public getShoppingList(): Observable<ShoppingList[]> {
    return this.http.get<ShoppingList[]>(this.apiUrl + "shoppingList");
  }

  public addToDatabase(productIDFK: number, amount: number) {
    const shoppingList: ShoppingList = {
      shoppingListID: 0,
      productIDFK,
      amount,
    };
    this.http.post(this.apiUrl + "addToShoppingList", shoppingList);
  }

  public removeShoppingItem(shoppingList: ShoppingList) {
    this.http.post(this.apiUrl + "removeFromShoppingList", shoppingList);
  }

  public updateShoppingItem(shoppingList: ShoppingList) {
    this.http.post(this.apiUrl + "updateShoppingList", shoppingList);
  }
}
