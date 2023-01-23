package com.velocity.demo;

public class stud {
	int rno;
	String name;
	@Override
	public String toString() {
		return "stud [rno=" + rno + ", name=" + name + "]";
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public stud(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	public stud() {
		super();
	}
	

}
