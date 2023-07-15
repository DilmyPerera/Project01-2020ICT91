class LibraryManagementSystem{
	public static void main(String args[]){
		Book book1 = new Book("The Catcher in the Rye","B001","J.D. Salinger",240);
		Book book2 = new Book("To Kill a Mockingbird ","B002","Harper Lee",281);
		Book book3 = new Book("1984","B003","George Orwell",328);
		Book book4 = new Book("Pride and Prejudice","B004","Jane Austen ",432);
		Book book5 = new Book("The Hobbit","B005","J.R.R. Tolkien",320);
		
		
		System.out.println("\nBooks: ");
			book1.displayItemDetails();
			book2.displayItemDetails();
			book3.displayItemDetails();
			book4.displayItemDetails();
			book5.displayItemDetails();
		
		
		Magazine mag1 = new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine mag2 = new Magazine("Time","M002","September 2023","Time USA, LLC");
		Magazine mag3 = new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine mag4 = new Magazine("Vogue","M004","July 2023","Condé Nast");
		Magazine mag5 = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		System.out.println("\nMagazines: ");
			mag1.displayItemDetails();
			mag2.displayItemDetails();
			mag3.displayItemDetails();
			mag4.displayItemDetails();
			mag5.displayItemDetails();
			
		LibraryMember lm1 = new LibraryMember("L001","John Doe");
		LibraryMember lm2 = new LibraryMember("L002","Jane Smith");
		LibraryMember lm3 = new LibraryMember("L003","David Johnson");
		LibraryMember lm4 = new LibraryMember("L004","Sarah Williams");
		LibraryMember lm5 = new LibraryMember("L005","Michael Brown");
		
		System.out.println("\nLibrary Members: ");
			lm1.displayMemberDetails();
			lm2.displayMemberDetails();
			lm3.displayMemberDetails();
			lm4.displayMemberDetails();
			lm5.displayMemberDetails();
			
	}
}