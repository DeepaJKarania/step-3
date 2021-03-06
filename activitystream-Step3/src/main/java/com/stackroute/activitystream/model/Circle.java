package com.stackroute.activitystream.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/*
 * The class "Circle" will be acting as the data model for the circle Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
@Component
@Entity
@Table
public class Circle {

	/*
	 * This class should have three fields
	 * (circleName,creatorId,createdDate). Out of these three fields, the
	 * field circleName should be the primary key. This class should also contain
	 * the getters and setters for the fields. The value of createdDate should
	 * not be accepted from the user but should be always initialized with the
	 * system date
	 */
	
	@Id
	String circleName;
	String creatorId;
	Date createdDate;
	
	public Circle(String circleName, String creatorId, Date createdDate) {
		this.circleName=circleName;
		this.creatorId = creatorId;
		this.createdDate = createdDate;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public void setCreatedDate() {
		this.createdDate = new java.util.Date();
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCircleName() {
		return circleName;
	}
	public String getCreatorId() {
		return creatorId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}



	
}
