class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book (String title,String itemID,String author,int numPages){
		super(title,itemID);
		this.author=author;
		this.numPages=numPages;
	}
	
	public void checkOut(){
		System.out.println("Book "+itemID + " checked out");
	}
	public void checkIn(){
		System.out.println("Book "+itemID + " checked in");
	}
	public void displayItemDetails(){
		System.out.println("Title : "+title);
		System.out.println("Item ID : "+itemID);
		System.out.println("Author : "+author);
		System.out.println("Number of pages : "+numPages);
		System.out.println();
	}
}