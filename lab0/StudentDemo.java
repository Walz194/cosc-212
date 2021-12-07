package lab0;
import java.util.*;
import java.io.*;
public class StudentDemo{
	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(new File("C:\\Users\\Akin-odanye Olawale\\Desktop\\Student.txt"));/* our text file is not in the class folder so we must
		put in the full file directory otherwise we will get a  java.io.FileNotFoundException: error but if it was in the
		folder we could simply put in Student.txt*/
		StringTokenizer tokenizer;
		double average;
		double sum = 0.000;
		double percent;
		int n = Integer.parseInt(input.nextLine());

		Student[] wale = new Student[n];/*Student was used instead of int or String because wale is an Object type
		and not a primitive type*/
		int x = 0;
		while(input.hasNext()){
			tokenizer = new StringTokenizer(input.nextLine());/*if the ID and GPA were separated by lets say a -
			then it will be ....(input.nextLine(),"-") to show that - separates the tokens */
			int ID = Integer.parseInt(tokenizer.nextToken());
			double GPA = Double.parseDouble(tokenizer.nextToken());
			wale[x] = new Student(ID, GPA);
			x++;
		}
		for(int i=0; i<n; i++){
			sum+= wale[i].getGPA();
			System.out.println(wale[i]);
		}
		average = sum/n;

		x=0;
		for(int i=0; i<n; i++){
			if(wale[i].getGPA()>average)
				x++;
		}
		double X = x;
		percent = (X/n)*100;
		System.out.printf("Average GPA: %.2f\n", average);
		System.out.println("The number of students above average are: "+ X);
		System.out.printf("The average GP is %.2f and the percentage above the average is %.2f%%",average, percent);
	}
}