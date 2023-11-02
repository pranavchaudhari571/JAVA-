package Pen;

import java.time.LocalDate;
import java.util.Objects;

import Enum.Brand;
import Enum.Material;

public class Pen {
	
	private static int penId=100;
	private int id;
	private Brand brand;
	private String color;
	private String ink_color;
	private Material material;
	private int stock;
	private LocalDate update_date;
	private LocalDate listing_date;
	private double price;
	private double discount;
	public Pen(Brand brand, String color, String ink_color, Material material, int stock,
 double price, double discount,LocalDate date) {
		super();
		this.id=++penId;
		this.brand = brand;
		this.color = color;
		this.ink_color = ink_color;
		this.material = material;
		this.stock = stock;
		this.update_date = LocalDate.now();
		this.listing_date =date;
		this.price = price;
		this.discount = discount;
	}
	public Pen(int id) {
		this.id=id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		Pen other = (Pen) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", ink_color=" + ink_color + ", material="
				+ material + ", stock=" + stock + ", update_date=" + update_date + ", listing_date=" + listing_date
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInk_color() {
		return ink_color;
	}
	public void setInk_color(String ink_color) {
		this.ink_color = ink_color;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(LocalDate update_date) {
		this.update_date = update_date;
	}
	public LocalDate getListing_date() {
		return listing_date;
	}
	public void setListing_date(LocalDate listing_date) {
		this.listing_date = listing_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public boolean issoldfrom3monts() {
		LocalDate threem= LocalDate.now().minusMonths(3);
		return update_date.isAfter(threem);
	
		
	}
	
	
	

}
