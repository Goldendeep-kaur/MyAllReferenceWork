package Service;

import java.util.List;

import DAO.ProductDao;
import DAO.ProductDaoCollectionImpl;
import Model.ProductPojo;

public class ProductServiceImpl implements ProductService {
	
	ProductDao productDao;
	

	public ProductServiceImpl() {

		productDao= new ProductDaoCollectionImpl();
	}

	@Override
	public ProductPojo addProduct(ProductPojo productPojo) {
		return productDao.addProduct(productPojo);
	}

	@Override
	public ProductPojo updateProduct(ProductPojo productPojo) {
		return productDao.updateProduct(productPojo);
	}

	@Override
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
		
	}

	@Override
	public List<ProductPojo> getAllProducts() {
		return productDao.getAllProducts();
		}

	@Override
	public ProductPojo getAProduct(int productId) {

		return productDao.getAProduct(productId);
	}

}
