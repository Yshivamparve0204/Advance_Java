package com.demo.model;

import java.time.LocalDate;


public class Employee {
		
	private int EMPNO;
	private String ENAME;
	private String GENDER;
	private String JOB;
	private int MGR;
	private LocalDate HIREDATE;
	private double SAL;
	private double COMM;
	private int DEPTNO;
	private int BONUSID;
	private String  USERNAME;
	private String PWD;
	private String PHONE;
	private String isActive;
	public int getEMPNO() {
		return EMPNO;
	}
	public Employee() {
		super();
	}
	public Employee(int eMPNO, String eNAME, String gENDER, String jOB, int mGR, LocalDate hIREDATE, double sAL, double cOMM,
			int dEPTNO, int bONUSID, String uSERNAME, String pWD,String PHONE, String isActive) {
		super();
		this.EMPNO = eMPNO;
		this.ENAME = eNAME;
		this.GENDER = gENDER;
		this.JOB = jOB;
		this.MGR = mGR;
		this.HIREDATE = hIREDATE;
		this.SAL = sAL;
		this.COMM = cOMM;
		this.DEPTNO = dEPTNO;
		this.BONUSID = bONUSID;
		this.USERNAME = uSERNAME;
		this.PWD = pWD;
		this.PHONE=PHONE;
		this.isActive = isActive;
	}
	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public int getMGR() {
		return MGR;
	}
	public void setMGR(int mGR) {
		MGR = mGR;
	}
	public LocalDate getHIREDATE() {
		return HIREDATE;
	}
	public void setHIREDATE(LocalDate hIREDATE) {
		HIREDATE = hIREDATE;
	}
	public double getSAL() {
		return SAL;
	}
	public void setSAL(double sAL) {
		SAL = sAL;
	}
	public double getCOMM() {
		return COMM;
	}
	public void setCOMM(double cOMM) {
		COMM = cOMM;
	}
	public int getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public int getBONUSID() {
		return BONUSID;
	}
	public void setBONUSID(int bONUSID) {
		BONUSID = bONUSID;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	
	@Override
	public String toString() {
		return "Employee [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", GENDER=" + GENDER + ", JOB=" + JOB + ", MGR=" + MGR
				+ ", HIREDATE=" + HIREDATE + ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + ", BONUSID="
				+ BONUSID + ", USERNAME=" + USERNAME + ", PWD=" + PWD + ", PHONE=" + PHONE + ", isActive=" + isActive
				+ "]";
	}
}

 