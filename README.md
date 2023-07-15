# Project01-2020ICT91
Upload the answer in the GitHub repository. Submit only the GitHub link as a text file.
You have been assigned to develop a Library Management System for a public library. Design and
implement the necessary classes to support the system using the concepts of class, objects, abstraction, inheritance, encapsulation, and polymorphism. Your implementation should include the following
classes:
1.	LibraryItem (abstract class)
* Properties:
* title (String): the title of the library item.
* itemID (String): a unique identifier for the library item.
* Methods:
* checkOut(): marks the library item as checked out.
* checkIn(): marks the library item as checked in.
* displayItemDetails(): displays the details of the library item.
2.	Book (subclass of LibraryItem)
* Additional Properties:
* author (String): the author of the book.
* numPages (int): the number of pages in the book.
3.	Magazine (subclass of LibraryItem)
* Additional Properties:
* issueDate (String): the issue date of the magazine.
* publisher (String): the publisher of the magazine.
4.	LibraryMember
* Properties:
* memberID (String): a unique identifier for the library member.
* name (String): the name of the library member.
* Methods:
* displayMemberDetails(): displays the details of the library member.

 
Implement the above classes and write the necessary code to demonstrate the following functionality:
1.	Create 5 objects of the Book class, each representing a different book in the library.
2.	Create 5 objects of the Magazine class, each representing a different magazine in the library.
3.	Create 5 objects of the LibraryMember class, each representing a different member of the library.
4.	Set the properties of the objects using appropriate setter methods.
5.	Call the checkOut() and checkIn() methods on one of the library items.
6.	Display the details of all the library items and library members.


Books:

| Title | Item ID    | Author   |Number of Pages|
| :---:   | :---: | :---: |:---: |
| The Catcher in the Rye | B001   | J.D. Salinger	|240 |
| To Kill a Mockingbird | B002   | Harper Lee   | 281 |
| 1984 | B003   | George Orwell   | 328 |
| Pride and Prejudice | B004   | Jane Austen   |432 |
| The Hobbit | B005   | J.R.R. Tolkien   | 320 |

Magazines:
Title	|Item ID |	Issue Date |	Publisher|
| :---:  | :---: | :---: |:---: |
|National Geographic| M001|	August 2023|	National Geographic Society|
|Time|	M002|	September 2023	|Time USA, LLC|
|Forbes|	M003|	June 2023|	Forbes Media|
|Vogue|	M004|	July 2023	|Condé Nast|
|Sports Illustrated|	M005	|July 2023|	Maven Coalition|
 
Library Members:

|Member ID|	Name|
| :---: |:---: |
|L001	|John Doe|
|L002	|Jane Smith|
|L003	|David Johnson|
|L004|	Sarah Williams|
|L005	|Michael Brown|

# Output
```

Microsoft Windows [Version 10.0.22621.1848]
(c) Microsoft Corporation. All rights reserved.

C:\Users\samad\Desktop\2020ICT091>javac LibraryManagementSystem.java

C:\Users\samad\Desktop\2020ICT091>java LibraryManagementSystem

Books:
Title : The Catcher in the Rye
Item ID : B001
Author : J.D. Salinger
Number of pages : 240

Title : To Kill a Mockingbird
Item ID : B002
Author : Harper Lee
Number of pages : 281

Title : 1984
Item ID : B003
Author : George Orwell
Number of pages : 328

Title : Pride and Prejudice
Item ID : B004
Author : Jane Austen
Number of pages : 432

Title : The Hobbit
Item ID : B005
Author : J.R.R. Tolkien
Number of pages : 320


Magazines:
Title : National Geographic
Item ID : M001
Date of Issue : August 2023
Publisher : National Geographic Society

Title : Time
Item ID : M002
Date of Issue : September 2023
Publisher : Time USA, LLC

Title : Forbes
Item ID : M003
Date of Issue : June 2023
Publisher : Forbes Media

Title : Vogue
Item ID : M004
Date of Issue : July 2023
Publisher : Condé Nast

Title : Sports Illustrated
Item ID : M005
Date of Issue : July 2023
Publisher : Maven Coalition


Library Members:
Member ID : L001
Name of the memeber : John Doe

Member ID : L002
Name of the memeber : Jane Smith

Member ID : L003
Name of the memeber : David Johnson

Member ID : L004
Name of the memeber : Sarah Williams

Member ID : L005
Name of the memeber : Michael Brown


