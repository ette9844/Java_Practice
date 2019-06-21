package generic.method;

// p667: 와일드 카드
public class WildCardEx {
	
	public static void regCourse(Course<?> course) {
		
	}
	
	// student가 최상위 클래스가 됨 -> student와 high student가 들어갈 수 있음
	public static void regCourseStudent(Course<? extends Student> course) {
		// T값 가능: Student, High Student
	}
	
	public static void regCourseWorker(Course<? super Worker> course) {
		// T값 가능: Worker Person
	}

	public static void main(String[] args) {
		regCourse(new Course<Person>());
		regCourse(new Course<Student>());
		regCourse(new Course<HighStudent>());
		regCourse(new Course<Worker>());
		
		regCourseStudent(new Course<Student>());
		regCourseStudent(new Course<HighStudent>());
//		regCourseStudent(new Course<Person>());		// 제약 때문에 error
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