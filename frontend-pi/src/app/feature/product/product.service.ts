import { Injectable } from '@angular/core';
import { Product } from './product';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private httpOptions = {
    headers : new HttpHeaders({"Content-Type":"application/json"})
  }

  private url = "http://localhost:8080/api/product"

  constructor(
    private http: HttpClient
  ) { }

  public save(product: Product): Observable <Product> {
    return this.http.post<Product>(this.url+"/save",product,this.httpOptions);
  }

  public findById(id: number): Observable <Product> {
    return this.http.get<Product>(this.url+"/"+id, this.httpOptions);
  }

}
