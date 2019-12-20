import java.util.Scanner;
/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mykeyboard = new Scanner(System.in);
		int size = 0;
		int option = 0;
		String pswrd = null;
		final String Passwrd = "DitProg123";
		int wrong = 0;
		int i = 0;
		int j = 0;
		int attempt = 0;
		boolean A;
		boolean B;
		int count = 0;
		
		System.out.println("Welcome to Ports Labs Store!!!!");
		
		System.out.println("Enter the max number of item the store can contain:");
		size = mykeyboard.nextInt();
		
		Item[]itemDatabase = new Item[size];
		
		while (true){
			for(count = 0; count>= 0; count++) {
				System.out.println("What do you want to do? ");
				System.out.println("Press 1 to enter a new item in the inventory(password required): ");
				System.out.println("Press 2 to change information of an existing item(password required): ");
				System.out.println("Press 3 to display all the items with the specified category: ");
				System.out.println("Press 4 to display all the items to be re-ordered: ");
				System.out.println("Press 5 to know the number of items currently in store: ");
				System.out.println("Press 6 to quit: ");
				System.out.println("Enter your choice: ");
				option = mykeyboard.nextInt();
				
				if (option == 1) {
					for (attempt = 0; attempt <= 3; attempt++) {

						System.out.println("Enter your password: ");
						pswrd = mykeyboard.next();
						
						if (pswrd.equals(Passwrd)) {
							System.out.println("Enter the name of the items from the list and its features");
							
							for(i = 0; i < size; i++) {
								System.out.println("Enter item ID: ");
							    int itemId = mykeyboard.nextInt();
							    
							    System.out.println("Enter item name: ");
							    String name = mykeyboard.next();
							    
							    System.out.println("Enter item description: ");
							    String description = mykeyboard.next();
							    
							    System.out.println("Enter item category: ");
							    String category = mykeyboard.next();
							    
							    System.out.println("Enter supplier name: ");
							    String supplierName = mykeyboard.next();
							    
							    System.out.println("Enter supplier contact: ");
							    String supplierContact = mykeyboard.next();
							    
							    System.out.println("Enter item price: ");
							    double price = mykeyboard.nextDouble();
							    
							    System.out.println("Enter quantity available of item: ");
							    int availableQty = mykeyboard.nextInt();
							    
							    itemDatabase[i] = new Item(itemId, name, description, category, supplierName, supplierContact, price, availableQty);
							    
							    itemDatabase[i].setItemId(itemId);
							    itemDatabase[i].setName(name);
							    itemDatabase[i].setDescription(description);
							    itemDatabase[i].setCategory(category);
							    itemDatabase[i].setSupplierName(supplierName);
							    itemDatabase[i].setSupplierContact(supplierContact);
							    itemDatabase[i].setPrice(price);
							    itemDatabase[i].setAvailableQty(availableQty);
							    
							}
							System.out.println("Item Id" + "Item Name" + "Description" + "category" + "supplier name" + "supplier contact" + "price" + "available quantity" );
							
							for (j = 0; j<size; j++) {
								System.out.println(itemDatabase[j]);
							}
						
							break;
						}
						else if(pswrd.equals(Passwrd)) {
							System.out.println("You've entered the wrong Password, Only " +(3-(count))+ "attempts left");
							
							if (count == 2) {
								continue;
							}
							else if (count==3) {
								System.out.println("Program detected suspicious acativity and is terminating");
								
								break;
							}
							
						}
					}
			
				}
				
				else if (option == 2) {
					
					for (attempt = 1; attempt<=3; attempt++) {
						System.out.println("Enter your password: ");
						pswrd= mykeyboard.next();
						
						if (pswrd.equals(Passwrd)) {
							System.out.println("Enter the item you want to update: ");
							String itemId = mykeyboard.next();
							
							for (i=0; i<size; i++) {
								int abc = itemDatabase[i].getItemId();
								
								if(itemId.equalsIgnoreCase( "abc")) {
									System.out.println("Enter the item you want to enter: ");
									
									System.out.println(itemDatabase[i]);
									System.out.println("Item's Id"+itemDatabase[i].getItemId());
									System.out.println("Item's Name: "+itemDatabase[i].getName());
									System.out.println("Item's description" +itemDatabase[i].getDescription() );
									System.out.println("Item's category"+itemDatabase[i].getCategory());
									System.out.println("Supplier's name" + itemDatabase[i].getSupplierName());
									System.out.println("Supplier's contact"+itemDatabase[i].getSupplierContact());
									System.out.println("Item's price"+itemDatabase[i].getPrice());
									System.out.println("Availability of items"+itemDatabase[i].getAvailableQty());
									System.out.println("Your choice: ");
									
									while(B = true) {
										System.out.println("Please enter what do you want to change");
										System.out.println("1.ItemId \n"+ "2.Name\n"+"3.Description\n"+"4.Category\n"+"5.supplierName\n"+"6.supplierContacts\n"+ "7.Price"+"8.AvailableQuantity");

									
									int choice = mykeyboard.nextInt();
									
									if(choice == 1) {

									System.out.println("Enter the item name: ");
									        String Name  = mykeyboard.next();
									        itemDatabase[i].setName(Name);
									        System.out.println(itemDatabase[i]);
									        
									}
									
									else if (choice == 2) {
										
									System.out.println("Enter the item description: ");
									        String Description  = mykeyboard.next();
									        itemDatabase[i].setDescription(Description);
									        System.out.println(itemDatabase[i]);
									}
									else if (choice == 3) {

										System.out.println("Enter the category of the item: ");
									        String Category  = mykeyboard.next();
									        itemDatabase[i].setCategory(Category);
									        System.out.println(itemDatabase[i]);
									        
									}
									else if (choice == 4) {
										
										System.out.println("Enter the Supplier's name: ");
										        String supplierName  = mykeyboard.next();
										        itemDatabase[i].setSupplierName(supplierName);
										        System.out.println(itemDatabase[i]);

									}
									else if (choice == 5) {
										
										System.out.println("Enter the Supplier's contact: ");
									        String supplierContacts  = mykeyboard.next();
									        itemDatabase[i].setSupplierContact(supplierContacts);
									        System.out.println(itemDatabase[i]);

									}
									else if (choice == 6) {
										
										System.out.println("Enter the item's price ");
									        double Price  = mykeyboard.nextDouble();
									        itemDatabase[i].setPrice(Price);
									        System.out.println(itemDatabase[i]);
									        
									}
									else if (choice == 7) {
										
										System.out.println("Enter the quantity available of the item ");
									        int availableQty = mykeyboard.nextInt();
									        itemDatabase[i].setAvailableQty(availableQty);
									        System.out.println(itemDatabase[i]);
									}
									else if(choice == 8) {
										A = false;
									
									break;
									}
									else {
										
										System.out.println("You can choose only between option 1-7");

									}
								}
							}
						}
					}
				
				}
			}
				
		
				
				else if (!pswrd.equals(Passwrd)) {
					System.out.println("You have entered incorrect password. Only "+(3-(attempt))+ "attempts are left"); 
					}
					else if (option == 3) {
					System.out.println("Enter category for an Item"); 
					}
					else if (option == 4) {
					System.out.println("We should re order the the products ");
					
					
						if (itemDatabase[0].getAvailableQty() < 5) {
							System.out.println("Item Id : " + itemDatabase[0].getItemId()+ "\nItem Name : " + itemDatabase[0].getName()+ "\nAvailable Quantity : " + itemDatabase[0].getAvailableQty()); 
							System.out.println(" Item ran out of the stock. Please re-order. ");	
						}
					
						else {
							System.out.println("Item Id : " + itemDatabase[0].getItemId() + "\nItem Name : " + itemDatabase[0].getName()+ "\nAvailable Quantity: " + itemDatabase[0].getAvailableQty());
							System.out.println("There are enough item in the stock.");
						}
					
						if (itemDatabase[1].getAvailableQty() < 10) {
							System.out.println("The item Id : " + itemDatabase[1].getItemId() + "\n Item Name : " + itemDatabase[1].getName() + "\nAvailableQuantity : " + itemDatabase[1].getAvailableQty());
							System.out.println("There is not enough stock in Inventory. Re- Order.");
						}
					
						else {
							System.out.println("Item Id : " + itemDatabase[1].getItemId() + "\nItem Name : " + itemDatabase[1].getName()+ "\nAvailable: " + itemDatabase[1].getAvailableQty());
							System.out.println("There are sufficient item in the stock.");
						}
					
					}
				
					else if(option == 5) {
						System.out.println("Number of items created so far: ");
						Item.getTotalItem();
					
					}
				}
			
			}
		

	}
}