package DAO;

import java.util.ArrayList;
import java.util.List;

import Model.ProductPojo;

public class ProductDaoCollectionImpl implements ProductDao {

	List<ProductPojo> allProducts=new ArrayList<ProductPojo>();
	
	public ProductDaoCollectionImpl() {
		ProductPojo product1= new ProductPojo(1003,800,"Laptop","HP","");
		ProductPojo product2= new ProductPojo(1005,1500,"MacBook","Apple","");
		ProductPojo product3= new ProductPojo(2001,500,"IWatch","Apple Watch series7","");
		allProducts.add(product1);
		allProducts.add(product2);
		allProducts.add(product3);
	}

	@Override
	public ProductPojo addProduct(ProductPojo productPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductPojo updateProduct(ProductPojo productPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int roductId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductPojo> getAllProducts() {
		
		return allProducts;
	}

	@Override
	public ProductPojo getAProduct(int productId) {
		ProductPojo foundProduct=null;
		for(int i=0;i<allProducts.size();i++) {
			if(allProducts.get(i).getProductId()==productId) {
				foundProduct=allProducts.get(i);
				break;
			}
			
		}
	
	return foundProduct;
	}
}