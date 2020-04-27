import { Component, OnInit } from "@angular/core";
import { Product } from "../core/models/product";
import { ShoppingList } from "../core/models/shoppingList";
import { DataService } from "../core/services/data.service";

@Component({
  selector: "app-shopping-list",
  templateUrl: "./shopping-list.component.html",
  styleUrls: ["./shopping-list.component.css"],
})
export class ShoppingListComponent implements OnInit {
  products: Product[];
  shoppingList: ShoppingList[];

  constructor(private dataService: DataService) {}

  ngOnInit() {
    this.dataService.getProducts().subscribe((products) => {
      this.products = products;
    });

    this.dataService.getShoppingList().subscribe((shoppingList) => {
      this.shoppingList = shoppingList;
      console.log(this.products);
      console.log(this.shoppingList);
    });
  }

  updateShoppingItem(shoppingList: ShoppingList) {
    this.dataService.updateShoppingItem(shoppingList);
  }

  removeShoppingItem(shoppingList: ShoppingList) {
    this.dataService.removeShoppingItem(shoppingList);
  }
}
