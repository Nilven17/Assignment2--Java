/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Item {
	
	/*static attributes*/
	private static int totalItem =0;
	
	/*attributes*/
	private int itemId;
	private String name;
	private String description;
	private String category;
	private String supplierName;
	private String supplierContact;
	private double price;
	private int availableQty;
	
	
	/*Constructors*/
	
	
	/**
	 * Default Constructors
	 */

	public Item() {
		this.itemId = 0;
		this.name =	null;
		this.description = null;
		this.category = null;
		this.supplierName = null;
		this.supplierContact = null;
		this.price = 0.0;
		this.availableQty = 0;
		setTotalItem(getTotalItem() + 1);
		
				
	}
	
	/**
	 * overloaded constructor with 3 parameters
	 * @param itemID of item
	 * @param description of item
	 * @param supplierContact of item
	 */
	public Item(int itemId, String description, String supplierContact) {
		this.itemId = itemId;
		this.description = description;
		this.supplierContact = supplierContact;
		setTotalItem(getTotalItem() + 1);
		
	}
	
	/**
	 * overloaded constructors with 8 parameters
	 * @param itemId of item
	 * @param name of item
	 * @param description of item
	 * @param category of item
	 * @param supplierName of item
	 * @param supplierContact of item
	 * @param price of item
	 * @param availableQty of item
	 */
	public Item(int itemId, String name, String description, String category, String supplierName, String supplierContact, double price, int availableQty) {
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplierName = supplierName;
		this.supplierContact = supplierContact;
		this.price = price;
		this.availableQty = availableQty;
		setTotalItem(getTotalItem() + 1);
		
	}
	
	/**
	 * Behaviors
	 */
	
	/**
	 * getters
	 */

	/**
	 * @return the itemId of the item
	 */
	public int getItemId() {
		return this.itemId;
	}

	/**
	 * @return the name of the item
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the description of the item
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the category of the item
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * @return the supplierName of the item
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @return the supplierContact of the item
	 */
	public String getSupplierContact() {
		return this.supplierContact;
	}

	/**
	 * @return the price of the item
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * @return the availableQty of the item
	 */
	public int getAvailableQty() {
		return this.availableQty;
	}

	/**
	 * setters
	 */
	
	/**
	 * @param itemId the itemId to set of the item
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @param name the name to set of the item
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set of the item
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param category the category to set of the item
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param supplierName the supplierName to set of the item
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @param supplierContact the supplierContact to set of the item
	 */
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}

	/**
	 * @param price the price to set of the item
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param availableQty the availableQty to set of the item
	 */
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierName=" + supplierName + ", supplierContact=" + supplierContact + ", price=" + price
				+ ", availableQty=" + availableQty + "]";
	}

	/**
	 * @return the totalItem
	 */
	public static int getTotalItem() {
		return totalItem;
	}

	/**
	 * @param totalItem the totalItem to set
	 */
	public static void setTotalItem(int totalItem) {
		Item.totalItem = totalItem;
	}


 
	
	

}
