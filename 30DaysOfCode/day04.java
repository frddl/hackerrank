public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else 
            this.age = initialAge;
	}

	public void amIOld() {
        String status = "";
        if (this.age >= 0 && this.age < 13) status += "You are young.";
        if (this.age >= 13 && this.age < 18) status += "You are a teenager.";
        if (this.age >= 18) status += "You are old.";
        System.out.println(status);
	}

	public void yearPasses() {
        this.age++;
	}
