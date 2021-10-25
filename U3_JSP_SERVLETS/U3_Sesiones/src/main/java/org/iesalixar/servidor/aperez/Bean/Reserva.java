package org.iesalixar.servidor.aperez.Bean;

public class Reserva {
	private String initDate;
	private String endDate;
	private String numPeople;
	private String[] services;
	
	public String getInitDate() {
		return initDate;
	}
	public void setInitDate(String initDate) {
		this.initDate = initDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getNumPeople() {
		return numPeople;
	}
	public void setNumPeople(String numPeople) {
		this.numPeople = numPeople;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}
	
}