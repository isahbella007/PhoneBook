package assignment3;

public class phoneBookEntry {
	private String name; 
	private String homePhone; 
	private String officePhone; 
	
	public phoneBookEntry(String name) {
		if(name.length()<0) {
			this.name = "No Name"; 
		}else {
			this.name = name;
		}
		
		this.homePhone = null;
		this.setOfficePhone(null);
	}
	
	public phoneBookEntry(String name, String home) {
		
		if(name.length()<0) {
			this.name = "No Name"; 
		}else {
			this.name = name;
		}
		
		if(home.length() < 10) {
			this.homePhone = null;
		}else {
			this.homePhone = home;
		}
		
		this.setOfficePhone(null);
	}
	
	public phoneBookEntry(String name, String home, String office) {
		
		if(name.length()<0) {
			this.name = "No Name"; 
		}else {
			this.name = name;
		}
		
		if(home.length() < 10) {
			this.homePhone = null;
		}else {
			this.homePhone = home;
		}
		
		if(office.length() < 10) {
			this.setOfficePhone(null);
		}else {
			this.setOfficePhone(office);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	
	
}
