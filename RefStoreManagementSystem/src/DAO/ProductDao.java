package DAO;

import java.util.List;

import Model.ProductPojo;

public interface ProductDao {

	ProductPojo addProduct(ProductPojo productPojo);//create
	ProductPojo updateProduct(ProductPojo productPojo);//updae 
	void deleteProduct(int roductId);//delete
	List<ProductPojo>getAllProducts();//view all(read)
	ProductPojo getAProduct(int productId);//view 1 product(read)
}
