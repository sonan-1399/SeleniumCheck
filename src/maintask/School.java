package maintask;

class School {

	public void studentType() {
		System.out.println("School includes Science and Commerce Students");
	}
	
}

class Science extends School{
	int ScienceNum = 60;
	public void scienceNumber() {
		
		System.out.println("Students belonging to Science Group : "+ScienceNum);
	}
}

class Commerce extends School{
	int CommerceNum=40;
	public void commerceNumber() {
		System.out.println("Students belonging to Commerce Group : " +CommerceNum);
	}
}

