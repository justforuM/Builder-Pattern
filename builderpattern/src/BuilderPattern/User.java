package BuilderPattern;

public class User {
	    private final String firstName;
	    private final String lastName;
	    private final String email;
	    private final int age;
	    private final String phone;

	    private User(Builder builder) {
	        this.firstName = builder.firstName;
	        this.lastName = builder.lastName;
	        this.email = builder.email;
	        this.age = builder.age;
	        this.phone = builder.phone;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public static class Builder {
	        private final String firstName;
	        private final String lastName;
	        private final String email;
	        private int age = 0;
	        private String phone = "";

	        public Builder(String firstName, String lastName, String email) {
	            this.firstName = firstName;
	            this.lastName = lastName;
	            this.email = email;
	        }

	        public Builder age(int age) {
	            this.age = age;
	            return this;
	        }

	        public Builder phone(String phone) {
	            this.phone = phone;
	            return this;
	        }

	        public User build() {
	            return new User(this);
	        }
	    }
	}
