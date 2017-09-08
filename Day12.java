class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        int sum = 0;
        for(int k=0;k<testScores.length;k++)
            sum += testScores[k];
        int avg = sum/testScores.length;
        char result = 'T';
            if(90 <= avg && avg <= 100)
                result = 'O';
                
            if(80 <= avg && avg < 90)
                result =  'E';
               
            if(70 <= avg && avg < 80)
                result =  'A';
                
            if(55 <= avg && avg < 70)
                result =  'P';
                
            if(40 <= avg && avg < 55)
                result =  'D';
                
            if(40 > avg)
                result =  'T'; 
        
        return result;
       
    }
}