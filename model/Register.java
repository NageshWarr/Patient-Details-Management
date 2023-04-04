package com.hosp.model;

public class Register {
  private int Pid;
  private String Pname;
  private String Pmembership;
  private String Pdisease;
  private int Pbill;
  private String PDoctor;
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public String getPmembership() {
	return Pmembership;
}
public void setPmembership(String pmembership) {
	Pmembership = pmembership;
}
public String getPdisease() {
	return Pdisease;
}
public void setPdisease(String pdisease) {
	Pdisease = pdisease;
}
public int getPbill() {
	return Pbill;
}
public void setPbill(int pfees) {
	Pbill = pfees;
}
public String getPDoctor() {
	return PDoctor;
}
public void setPDoctor(String pDoctor) {
	PDoctor = pDoctor;
}
public Register(int pid, String pname, String pmembership, String pdisease, int pbill, String pDoctor) {
	super();
	Pid = pid;
	Pname = pname;
	Pmembership = pmembership;
	Pdisease = pdisease;
	Pbill = pbill;
	PDoctor = pDoctor;
}
public Register() {
	// TODO Auto-generated constructor stub
}
  
}
