package oopsdemo3;

public class StudentDetails implements CollegeData,HostelData {
	College c1=new College("Pavan",100,"Hindustan university","C.S.E");
	Hostel h1=new Hostel("Dhanalakshmi","Padur");

	@Override
	public void hostelDetail() {
		 System.out.println("********** Hostel Details *********");
	        System.out.println("Hostel Name :"+h1.getName());
	        System.out.println("Location    :"+h1.getLocation());
		
	}

	@Override
	public void studentRecord() {
		
		System.out.println("Students Selected based on Percentage & Financial Situation");
	}

	@Override
	public void collegeDetail() {
		System.out.println("********** Colege Details *********");
        System.out.println("College Name : "+c1.getName());
        System.out.println("College Id   : "+c1.getId());
      System.out.println("Course       : "+c1.getCourse());
        System.out.println("University   : "+c1.getUniversty());
		
	}

	@Override
	public void studentData() {
		
		System.out.println("Students can Join courses : MCA, MTech, BCA,BTech");
	}

}
