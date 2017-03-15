package pkgLibrary;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.math3.analysis.function.Add;

public class Book {

	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	private Date publish_date;
	private String description;
	private double Cost;
public Book(){
	
}
	public Book(String id, Catalog cat)throws BookException {
		boolean value= false; 
		for(Book b:cat.getBooks()){
			if(b.getId()==id){
				value= true;
				this.id= b.getId();
				this.author= b.getAuthor();
				this.title= b.getTitle();
				this.genre= b.getGenre();
				this.price= b.getPrice();
				this.publish_date= b.getPublish_date();
				this.description= b.getDescription();
				this.Cost= b.getCost();				
		
			}
		}
		if (value== false){
			throw new BookException();
		}
		
	}
	

	public Book(String id, String author, String title, String genre, double price, Date publish_date, String description, double Cost)
	{
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.genre = genre;		
		this.price = price;
		this.publish_date = publish_date;
		this.description = description;
		this.Cost= price *.8;
	}
	
	public Book(String id){
	 this(id, "","","",0,new Date(),"",0);
	}

	public String getId() {
		return id;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	@XmlElement
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	@XmlElement
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	@XmlElement
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return Cost;
	}

	@XmlAttribute
	public void setCost(double Cost) {
		this.Cost = Cost;
	}
	
	

}
