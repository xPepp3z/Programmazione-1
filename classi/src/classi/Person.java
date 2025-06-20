package classi;

public class Person {			//classe o campi
	    public String name;
	    public String surname;
	    public int age;
	    private String password;

	    public Person(String name, String surname, int age, String password) {		//costruttore
	        this.name = name;	
	        this.surname = surname;
	        this.age = age;
	        this.password = password;
	    }
	    
	    public String getPassword() {		//uso il get per vedere la passowrd nonostante sia privata
	    	return password;
	    }
}
