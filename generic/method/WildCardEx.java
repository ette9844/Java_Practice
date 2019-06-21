package generic.method;

// p667: ���ϵ� ī��
public class WildCardEx {
	
	public static void regCourse(Course<?> course) {
		
	}
	
	// student�� �ֻ��� Ŭ������ �� -> student�� high student�� �� �� ����
	public static void regCourseStudent(Course<? extends Student> course) {
		// T�� ����: Student, High Student
	}
	
	public static void regCourseWorker(Course<? super Worker> course) {
		// T�� ����: Worker Person
	}

	public static void main(String[] args) {
		regCourse(new Course<Person>());
		regCourse(new Course<Student>());
		regCourse(new Course<HighStudent>());
		regCourse(new Course<Worker>());
		
		regCourseStudent(new Course<Student>());
		regCourseStudent(new Course<HighStudent>());
//		regCourseStudent(new Course<Person>());		// ���� ������ error
//		regCourseStudent(new Course<Worker>());		//
		
		regCourseWorker(new Course<Person>());
		regCourseWorker(new Course<Worker>());
//		regCourseWorker(new Course<Student>()));	//
//		regCourseWorker(new Course<HighStudent>()); //
		
	}

}

class Course<T> {
	
}

class Person {}
class Worker extends Person {}
class Student extends Person {}
class HighStudent extends Student {}