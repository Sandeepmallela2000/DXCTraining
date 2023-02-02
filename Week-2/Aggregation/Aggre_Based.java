package dxc_Next;

 class Author {
	
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQtyInStock() {
		return qtyInStock;
	}


	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}


	public void displayAuthorDetails() {
        System.out.println("Author name: " + author.getName());
        System.out.println("Author email: " + author.getEmail());
        System.out.println("Author gender: " + author.getGender());
    }

  
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }
}


public class Aggre_Based {
	public static void main(String[] args)
    {
        Author author1 = new Author("John Doe", "johndoe@email.com", 'M');
        Book book1 = new Book("Java for Dummies", author1, 19.99, 10);
        System.out.println(book1);
        book1.displayAuthorDetails();
    }

}
