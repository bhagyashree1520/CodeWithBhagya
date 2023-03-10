package com.capgemini.di;

/*
 * by ref attribute we can refer to the another object
 */
public class Student {

	private int id;
	private Marks marks;

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("ID:"+id+"\nFail or Pass");
       marks.marks();
	}

}
