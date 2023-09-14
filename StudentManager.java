package com.javachobo.program1;

import java.util.*;

public class StudentManager {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			String name = st.nextToken();
			String department = st.nextToken() ;
			String id = st.nextToken();
			double grade = Double.parseDouble(st.nextToken());
			
			Student s = new Student(name, department, id, grade);	//�޾ƿ� ������ Student ����
			dept.add(s);	// ArrayList�� ����
		}
	}
	
	private void printAll() { // �Ϻη� Iterator�� �ۼ��� ������
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("---------------------------------");
			System.out.println("�̸�:"+s.getName());
			System.out.println("�а�:"+s.getDepartment());
			System.out.println("�й�:"+s.getId());
			System.out.println("�������:"+s.getGrade());
			System.out.println("---------------------------------");
			//�л� ���� ���
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			
			for(int i=0; i<dept.size(); i++) { // dept�� �ִ� ��� �л� �˻�
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
