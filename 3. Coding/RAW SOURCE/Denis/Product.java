import java.util.*;

public class Product {

	//Collection<InputtedOffer> inputtedOffersProduct;
	private int productID;
	private string name;
	private string description;
	private string preview;

	public Product(){
		
	}
	
	public Product(int productID, String name, String description, String preview){
		super();
		this.productID=productID;
		this.name=name;
		this.description=description;
		this.preview=preview;
	}

	public int getProductID() {
		return this.productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public string getName() {
		return this.name;
	}

	public void setName(string name) {
		this.name = name;
	}

	public string getDescription() {
		return this.description;
	}

	public void setDescription(string description) {
		this.description = description;
	}

	public string getPreview() {
		return this.preview;
	}

	public void setPreview(string preview) {
		this.preview = preview;
	}

}