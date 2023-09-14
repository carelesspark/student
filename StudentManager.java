package com.javachobo.program1;

import java.util.*;

public class StudentManager {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			String name = st.nextToken();
			String department = st.nextToken() ;
			String id = st.nextToken();
			double grade = Double.parseDouble(st.nextToken());
			
			Student s = new Student(name, department, id, grade);	//받아온 값으로 Student 생성
			dept.add(s);	// ArrayList에 저장
		}
	}
	
	private void printAll() { // 일부러 Iterator로 작성해 보았음
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("---------------------------------");
			System.out.println("이름:"+s.getName());
			System.out.println("학과:"+s.getDepartment());
			System.out.println("학번:"+s.getId());
			System.out.println("학점평균:"+s.getGrade());
			System.out.println("---------------------------------");
			//학생 정보 출력
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			
			for(int i=0; i<dept.size(); i++) { // dept에 있는 모든 학생 검색
				Student s = dept.get(i);
				if(name.equals(s.getName())) {
					System.out.println(s.getName()+", "+ s.getDepartment() + ", " + 
							s.getId() + ", " + s.getGrade());
					break;
				}				
			} // end of while
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
}
