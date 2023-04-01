package BuilderPattern;

public class Main {
	    public static void main(String[] args) {
	        User user1 = new User.Builder("Shehab", "Montaser", "shehabmontasermohamedaliabas@gmail.com")
	                .age(20)
	                .phone("01067997143")
	                .build();
	        System.out.println("User Name: " + user1.getFirstName() + " " + user1.getLastName());
	        System.out.println("E-mail: " + user1.getEmail());
	        System.out.println("Age: " + user1.getAge());
	        System.out.println("Phone Number: " + user1.getPhone());

	        System.out.println("------------------------------"
	        		+ "");

	        User user2 = new User.Builder("Basel", "Nabil", "Baselnabil@gmail.com")
	        		    .age(20)
		                .phone("0110996666")
		                .build();
	        System.out.println("User Name: " +  user2.getFirstName() + " " + user2.getLastName());
	        System.out.println("E-mail: " + user2.getEmail());
	        System.out.println("Age: " + user2.getAge());
	        System.out.println("Phone Numer: " + user2.getPhone());
	    }
	}