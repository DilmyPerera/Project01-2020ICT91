abstract class LibraryItem{
	
	protected String title;
	protected String itemID;
	
	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
	}
	
	public abstract void checkOut();
	public abstract void checkIn();
	public abstract void displayItemDetails();
	
	
	
}