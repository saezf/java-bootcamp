package t0e102;

public class Author {
private String name;
private String email;
private char gender;
public Author(String name, String email, char gender) {
	this.name = name;
	this.email = email;
	this.gender = gender;
}
//public void setName(String name) {this.name = name;}
public String getName() {return this.name;}
public void setEmail(String email) {this.email = email;}
public String getEmail() {return this.email;}
//public void setGender(char gender) {this.gender = gender;}
public char getGender() {return this.gender;}

public String toString() {
	   return ""+ name +  " ("+gender+") at " + email;
	}
}
