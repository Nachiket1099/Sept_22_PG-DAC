/*import java.util.*;

abstract class Publication
{
	int NoOfPages;
	int Price;
	String PublisherName;
	
	Publication()
	{
		
	}
	Publication(int NoOfPages,int Price,String PublisherName)
	{
		this.NoOfPages=NoOfPages;
		this.Price=Price;
		this.PublisherName=PublisherName;
	}
    abstract void printDetails();
		
}



class Book extends  Publication
{
	
	
	Book()
	{
		
	}
	Book(int NoOfPages,int Price,String PublisherName)
	{
		this.NoOfPages=NoOfPages;
		this.Price=Price;
		this.PublisherName=PublisherName;
	}
	
	public void printDetails()
	{
		System.out.println("No of pages in book are :"+NoOfPages);
		System.out.println("Price of book is : "+Price);
		System.out.println("Name of publisher : "+PublisherName);
	}
	
}

class Journal
{
	
	Journal()
	{
		
	}
	Journal(int NoOfPages,int Price,String PublisherName)
	{
		this.NoOfPages=NoOfPages;
		this.Price=Price;
		this.PublisherName=PublisherName;
	}

	public void printJournalDetails()
	{
		System.out.println("No of pages in book are :"+NoOfPages);
		System.out.println("Price of book is : "+Price);
		System.out.println("Name of publisher : "+PublisherName);
	}
}


class Library 
{
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of book : ");
		
			int no_of_books = sc.nextInt();
		
		System.out.println("Enter the no of journal : ");
		int no_of_journal = sc.nextInt();
		
		String library[][] = new String[2][0];
		
		library[0] = new String[no_of_books];
		library[1] = new String[no_of_journal];
		
		int i = 0;
		int j = 0;
		
		for(i = 0; i < no_of_books; i++){
			System.out.println("Enter the name of books : ");
				if(i == 0){
					sc.nextLine();	
				}
			   
				library[0][i] = sc.nextLine();
		}
		
		for(i = 0; i < no_of_journal; i++){
			System.out.println("Enter the name of journal : ");
			
				library[1][i] = sc.nextLine();
	
		}
		System.out.println("Books and Journal in the library are : ");
			
		for(i = 0; i < 2; i++){
			if(i == 0){
				System.out.print("Books :");
			}
			else{
				System.out.print("Journals :");
			}
			for( j = 0; j < library[i].length; j++){
				
					System.out.print(" "+library[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Enter the book / journal name you want to know details");
		String s1 = sc.nextLine();

		if(s1.equals(library[0][0])){
			
			Book b1 = new Book(100, 200.0, "A1B1C1");
			b1.printDetails();
				
		}
		else if(s1.equals(library[0][1])){
				
			Book b1 = new Book(200, 300.0, "A2B2C2");
			b1.printDetails();
				
		}

		else if(s1.equals(library[0][2])){
				
			Book b1 = new Book(300, 400.0, "A3B3C3");
			b1.printDetails();
				
		}
		
		else if(s1.equals(library[1][0])){
				
			Journal j1 = new Journal(400, 500.0, "A4B4C4");
			j1.printDetails();
				
		}
		else{
				
			Journal j1 = new Journal(600, 700.0, "A5B5C5");
			j1.printDetails();
				
		}
		
	}
}*/












import java.lang.*;
import java.util.*;

abstract class Publication{
	
	int no0fPages;
	double price;
	String publisherName;
	
	Publication(){
	
	}
	
	Publication(int no0fPages, double price, String publisherName){
		
		this.no0fPages = no0fPages;
		this.price = price;
		this.publisherName = publisherName;
		
	}
	
	abstract void printDetails();
}

class Book extends Publication{
	
	Book(){
	
	}
	
	Book(int no0fPages, double price, String publisherName){
		
		this.no0fPages = no0fPages;
		this.price = price;
		this.publisherName = publisherName;
		
	}
	
	public void printDetails(){
		
		System.out.println("Number of pages in the book are : "+no0fPages);
		System.out.println("Price of the book is : "+price);
		System.out.println("Name of the publisher name : "+publisherName);
		
	}
}

class Journal extends Publication{
	
	Journal(){
	
	}
	
	Journal(int no0fPages, double price, String publisherName){
		
		this.no0fPages = no0fPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
	public void printDetails(){
	
		
		System.out.println("Number of pages in the book are : "+no0fPages);
		System.out.println("Price of the book is : "+price);
		System.out.println("Name of the publisher name : "+publisherName);
	}
}

class Library{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of book : ");
		int no_of_books = sc.nextInt();
		
		System.out.println("Enter the no of journal : ");
		int no_of_journal = sc.nextInt();
		
		String library[][] = new String[2][0];
		
		library[0] = new String[no_of_books];
		library[1] = new String[no_of_journal];
		
		int i = 0;
		int j = 0;
		
		for(i = 0; i < no_of_books; i++){
			System.out.println("Enter the name of books : ");
				if(i == 0){
					sc.nextLine();	
				}
			   
				library[0][i] = sc.nextLine();
		}
		
		for(i = 0; i < no_of_journal; i++){
			System.out.println("Enter the name of journal : ");
			
				library[1][i] = sc.nextLine();
	
		}
		System.out.println("Books and Journal in the library are : ");
			
		for(i = 0; i < 2; i++){
			if(i == 0){
				System.out.print("Books :");
			}
			else{
				System.out.print("Journals :");
			}
			for( j = 0; j < library[i].length; j++){
				
					System.out.print(" "+library[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Enter the book / journal name you want to know details");
		String s1 = sc.nextLine();

		if(s1.equals(library[0][0])){
			
			Book b1 = new Book(100, 200.0, "A1B1C1");
			b1.printDetails();
				
		}
		else if(s1.equals(library[0][1])){
				
			Book b1 = new Book(200, 300.0, "A2B2C2");
			b1.printDetails();
				
		}

		else if(s1.equals(library[0][2])){
				
			Book b1 = new Book(300, 400.0, "A3B3C3");
			b1.printDetails();
				
		}
		
		else if(s1.equals(library[1][0])){
				
			Journal j1 = new Journal(400, 500.0, "A4B4C4");
			j1.printDetails();
				
		}
		else{
				
			Journal j1 = new Journal(600, 700.0, "A5B5C5");
			j1.printDetails();
				
		}
		
	}
}
	
