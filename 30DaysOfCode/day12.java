class Student extends Person{
	private int[] testScores;
	
    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    public String calculate(){
        int avg = 0;
        for (int i = 0; i < testScores.length; i++)
            avg += testScores[i];
        
        avg /= testScores.length;
        
        String gradeLetter = "";
        
        if (avg >= 90 && avg <= 100)
            gradeLetter = "O";
        else if (avg >= 80 && avg < 90)
            gradeLetter = "E";
        else if (avg >= 70 && avg < 80)
            gradeLetter = "A";        
        else if (avg >= 55 && avg < 70)
            gradeLetter = "P";        
        else if (avg >= 40 && avg < 55)
            gradeLetter = "D";        
        else if (avg < 40)
            gradeLetter = "T";
            
        return gradeLetter;
    }
   
}
