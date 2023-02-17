package com.prowings;

public class CopyConstrutor {

	int id;
	String name;
	CopyAddress address;
	public CopyConstrutor(int id, String name,CopyAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}
	
	public CopyConstrutor(CopyConstrutor cc) {
		this.id=cc.id;
		this.name=cc.name;
		CopyAddress cd=new CopyAddress(cc.getAddress().getPin(),cc.getAddress().getCity());
		this.address=cd;
	}
	
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CopyAddress getAddress() {
		return address;
	}
 
	@Override
	public String toString() {
		return "CopyConstrutor [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		CopyAddress cd=new CopyAddress(123456, "Pune");
		CopyConstrutor c1=new CopyConstrutor(10, "Shree",cd);
		CopyConstrutor c2=new CopyConstrutor(c1);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.getAddress().setCity("ABC"); 
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
}
