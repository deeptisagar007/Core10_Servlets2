package com.marlabs.servlets;

public class EmployeeValueObjectModel {

	private String eName;
	private int eId;
	private int eSal;
	private int deptNo;

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @return the eId
	 */
	public int geteId() {
		return eId;
	}

	/**
	 * @return the eSal
	 */
	public int geteSal() {
		return eSal;
	}

	/**
	 * @return the deptNo
	 */
	public int getDeptNo() {
		return deptNo;
	}

	/**
	 * @param eName
	 *            the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}

	/**
	 * @param eId
	 *            the eId to set
	 */
	public void seteId(int eId) {
		this.eId = eId;
	}

	/**
	 * @param eSal
	 *            the eSal to set
	 */
	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

	/**
	 * @param deptNo
	 *            the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeValueObjectModel [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + ", deptNo=" + deptNo
				+ "]";
	}

}
