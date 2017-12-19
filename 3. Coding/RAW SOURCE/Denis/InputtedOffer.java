public class InputtedOffer extends Offer {

	Product product1;
	Shop shop1;
	private int offerID;
	private double price;
	private string offerURL;
	private Shop shop;
	private Product product;

	public int getOfferID() {
		return this.offerID;
	}

	/**
	 * 
	 * @param offerID
	 */
	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public string getOfferURL() {
		return this.offerURL;
	}

	/**
	 * 
	 * @param offerURL
	 */
	public void setOfferURL(string offerURL) {
		this.offerURL = offerURL;
	}

	public Shop getShop() {
		return this.shop;
	}

	/**
	 * 
	 * @param shop
	 */
	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Product getProduct() {
		return this.product;
	}

	/**
	 * 
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

}