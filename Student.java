import lombok.Getter;
import lombok.Setter;

// lombok 적용
@Getter
@Setter

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	// 생성자 추가
	public Student(String name, String department, String id, double grade) {
		super();
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}

	// getter/setter 추가
}