import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";
import { ProductListComponent } from "./product-list/product-list.component";
import { ShoppingListComponent } from "./shopping-list/shopping-list.component";

const routes: Routes = [
  { path: "products", component: ProductListComponent },
  { path: "shoppingCart", component: ShoppingListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
