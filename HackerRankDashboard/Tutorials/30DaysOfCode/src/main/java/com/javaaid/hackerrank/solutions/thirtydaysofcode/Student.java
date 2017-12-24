/**
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Student extends Person{
	private int[] testScores;
    Student(String firstName, String lastName, int id,int[] testScores){
        super(firstName,lastName,id);
     
        this.testScores=testScores;
    }
    
    public char calculate(){
        int sum=0;
        for(int i=0;i<testScores.length;i++){
            sum+=testScores[i];
        }
        int avg=(sum)/testScores.length;
       
        if(90<=avg &&avg<=100){
            return 'O';
        }else if(80<=avg &&avg<90){
            return 'E';
        }else if(70<=avg &&avg<80){
            return 'A';
        }else if(55<=avg &&avg<70){
            return 'P';
        }else if(40<=avg &&avg<55){
            return 'D';
        }else{
            return 'T';
        }
        
    }
    
}
class Person{

	/**
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public Person(String firstName, String lastName, int id) {
		// TODO Auto-generated constructor stub
	}
	
}