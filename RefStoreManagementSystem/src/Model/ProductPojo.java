package Model;

public class ProductPojo {
	private int productId;
	private int productCost;
	private String productName;
	private String productDescription;
	private String productImgUrl;
	
	public ProductPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductPojo(int productId, int productCost, String productName, String productDescription,
			String productImgUrl) {
		super();
		this.productId = productId;
		this.productCost = productCost;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImgUrl = productImgUrl;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImgUrl() {
		return productImgUrl;
	}

	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}

	@Override
	public String toString() {
		return "ProductPojo [productId=" + productId + ", productCost=" + productCost + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", productImgUrl=" + productImgUrl + "]";
	}
	
}
