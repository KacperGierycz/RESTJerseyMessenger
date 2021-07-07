package rest.jersey.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private long id;
	private String prifilename;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile() {
		
	}

	public Profile(long id, String prifilename, String firstName, String lastName) {
		this.id = id;
		this.prifilename = prifilename;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrifilename() {
		return prifilename;
	}

	public void setPrifilename(String prifilename) {
		this.prifilename = prifilename;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
	
}
