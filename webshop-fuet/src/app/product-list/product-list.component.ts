import { Component, OnInit } from "@angular/core";
import { DataService } from "../core/services/data.service";
import { Product } from "../core/models/product";

@Component({
  selector: "app-product-list",
  templateUrl: "./product-list.component.html",
  styleUrls: ["./product-list.component.css"],
})
export class ProductListComponent implements OnInit {
  products: Product[];

  amount: number;

  constructor(private dataService: DataService) {}

  ngOnInit() {
    this.dataService.getProducts().subscribe((products) => {
      this.products = products;
    });
  }

  addToDatabase(produktIDFK: number): void {
    this.dataService.addToDatabase(produktIDFK, this.amount);
  }
}
