import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppComponent } from "./app.component";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import {
  MatToolbarModule,
  MatIconModule,
  MatGridListModule,
  MatInputModule,
  MatButtonModule,
} from "@angular/material";
import { AppRoutingModule } from "./app-routing.module";
import { ProductListComponent } from "./product-list/product-list.component";
import { ShoppingListComponent } from "./shopping-list/shopping-list.component";
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [AppComponent, ProductListComponent, ShoppingListComponent],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    AppRoutingModule,
    HttpClientModule,
    MatGridListModule,
    MatInputModule,
    FormsModule,
    MatButtonModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
