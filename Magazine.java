class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	public Magazine(String title,String itemID,String issueDate,String publisher){
		super(title,itemID);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	
	public void checkOut(){
		System.out.println("Magazine "+itemID + " checked out");
	}
	public void checkIn(){
		System.out.println("Magazine "+itemID + " checked in");
	}
	public void displayItemDetails(){
		System.out.println("Title : "+title);
		System.out.println("Item ID : "+itemID);
		System.out.println("Date of Issue : "+issueDate);
		System.out.println("Publisher : "+publisher);
		System.out.println();
		
	}
}