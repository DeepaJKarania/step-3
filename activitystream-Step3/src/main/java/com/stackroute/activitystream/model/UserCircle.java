package com.stackroute.activitystream.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


/*
 * The class "UserCircle" will be acting as the data model for the user_circle Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
@Entity
@Component
public class UserCircle {

	/*
	 * This class should have three fields
	 * (userCircleId,username,circleName). Out of these three fields, the
	 * field userCircleId should be the primary key and should be generated. This class 
	 * should also contain the getters and setters for the fields. 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userCircleId;
	String userName;
	String circleName;
	
	
	public UserCircle(String userName, String circleName) {
		this.userName=userName;
		this.circleName=circleName;
	}


	public UserCircle() {}


	public int getUserCircleId() {
		return userCircleId;
	}


	public void setUserCircleId(int userCircleId) {
		this.userCircleId = userCircleId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCircleName() {
		return circleName;
	}


	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	
}
