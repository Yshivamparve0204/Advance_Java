package com.demo.model;

import java.time.LocalDate;

public class Manufacture {
		private int id;
		private String product_name;
		private int quantity;
		private LocalDate production_date;
		private String factory_location;
		private String status;
		private float price;
		public Manufacture() {
			super();
		}
		public Manufacture(int id, String product_name, int quantity, LocalDate production_date, String factory_location,
				String status, float price) {
			super();
			this.id = id;
			this.product_name = product_name;
			this.quantity = quantity;
			this.production_date = production_date;
			this.factory_location = factory_location;
			this.status = status;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public LocalDate getProduction_date() {
			return production_date;
		}
		public void setProduction_date(LocalDate production_date) {
			this.production_date = production_date;
		}
		public String getFactory_location() {
			return factory_location;
		}
		public void setFactory_location(String factory_location) {
			this.factory_location = factory_location;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Manufacture [id=" + id + ", product_name=" + product_name + ", quantity=" + quantity
					+ ", production_date=" + production_date + ", factory_location=" + factory_location + ", status="
					+ status + ", price=" + price + "]";
		}
		
		
}
