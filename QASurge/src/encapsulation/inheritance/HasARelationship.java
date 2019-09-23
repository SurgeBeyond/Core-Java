package encapsulation.inheritance;

// It is a usage of other classes but this is not an Inheritance.
public class HasARelationship {
	public static void main(String[] args) {
		ClassTeacher classTeacher = new ClassTeacher();
		classTeacher.teacher();
	}
}

class ClassTeacher {

	AttendanceRegister attendanceRegister;

	public void teacher() {
		attendanceRegister = new AttendanceRegister();
		attendanceRegister.register();
	}
}

class AttendanceRegister {

	public void register() {
		System.out.println("Attendance Register");
	}
}
