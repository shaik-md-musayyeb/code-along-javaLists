package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import model.Student;
import service.ListOperations;
public class Main {
	static List<Student> list = new ArrayList<Student>();
	static Map<Integer, Student> map = new HashMap<Integer, Student>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String dept;
		int id;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
		name=br.readLine();
		dept = br.readLine();
		id=Integer.parseInt(br.readLine());
		int value =0;
		Student student = new Student();
		ListOperations listO = new ListOperations();
		student.setName(name);
		student.setDept(dept);
		student.setId(id);
		list=listO.addStudent(student);
		map= listO.addMap(value,student);
		}while(id != 0);
		System.out.println("Before display");
		
		for( Student std : list) {
			System.out.println(std.getId());
			System.out.println(std.getDept());
			System.out.println(std.getName());
		}
		
		for( Map.Entry<Integer, Student> maplist : map.entrySet()) {
			System.out.println(maplist.getKey());
			System.out.println(maplist.getValue().getName());
			System.out.println(maplist.getValue().getDept());
		}
	}

}
