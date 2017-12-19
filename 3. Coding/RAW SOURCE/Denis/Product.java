import java.util.*;

public class Product {

	Collection<InputtedOffer> inputtedOffersProduct;
	private int productID;
	private string name;
	private string description;
	private string preview;

	public int getProductID() {
		return this.productID;
	}

	/**
	 * 
	 * @param productID
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	public string getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	public string getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(string description) {
		this.description = description;
	}

	public string getPreview() {
		return this.preview;
	}

	/**
	 * 
	 * @param preview
	 */
	public void setPreview(string preview) {
		this.preview = preview;
	}

}