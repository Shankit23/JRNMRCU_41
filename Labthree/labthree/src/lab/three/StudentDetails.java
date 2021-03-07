package lab.three;

import java.util.Arrays;

public class StudentDetails {
	private int id;
	private String name;
	private int subjectOne;
	private int subjectTwo;
	private int subjectThree;
	private int subjectFour;
	private int subjectFive;
	private int subjectSix;
	static int i=0;
	int [] arrayTotalMarks= new int[3];
	public StudentDetails() {}
	public StudentDetails(int id, String name,int subjectOne,int subjectTwo,int subjectThree,int subjectFour,int subjectFive,int subjectSix) {
		this.id=id;
		this.name=name;
		this.subjectOne=subjectOne;
		this.subjectTwo=subjectTwo;
		this.subjectThree=subjectThree;
        this.subjectFour=subjectFour;
		this.subjectFive=subjectFive;
		this.subjectSix=subjectSix;
	}
	public void getTotalMarks() {
		int totalMarks=subjectOne+subjectTwo+subjectThree+subjectFour+subjectFive+subjectSix;
		System.out.println("Total marks of "+name+"having ID"+id+"is"+totalMarks);
		int j=i;
		arrayTotalMarks[j]= totalMarks;
		}
	public void getAverage() {
		float Average=(subjectOne+subjectTwo+subjectThree+subjectFour+subjectFive+subjectSix)/6.0f;
		System.out.println("Average marks of "+name+"having ID"+id+"is"+Average);
	}
	public void highestMarks() {
		Arrays.sort(arrayTotalMarks);
		System.out.println("highest Marks is taken by"+arrayTotalMarks[0]);
		}
		
	

	public static void main(String[] args) {
		StudentDetails student[]= {
				new StudentDetails(1,"Shankit",5,9,7,6,9,3),
				new StudentDetails(2,"Arun",4,9,8,6,9,8),
				new StudentDetails(3,"Tarun",4,9,8,2,1,8),
		};
		StudentDetails sd = new StudentDetails();
        student[0].getTotalMarks();
        student[0].getAverage();
        student[1].getTotalMarks();
        student[1].getAverage();
        student[2].getTotalMarks();
        student[2].getAverage();
        sd.highestMarks();
        
	}

}
