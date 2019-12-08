package com.week2.lumengjun.entity;

import java.util.Date;

public class GongCheng {

	private Integer gid;
	
	private String gname;
	
	private String gender;
	
	private String city;
	
	private String company;
	
	private String major1;
	
	private String major2;
	
	private String major3;
	
	private String register;
	
	private String perform;
	
	private Date dt;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMajor1() {
		return major1;
	}

	public void setMajor1(String major1) {
		this.major1 = major1;
	}

	public String getMajor2() {
		return major2;
	}

	public void setMajor2(String major2) {
		this.major2 = major2;
	}

	public String getMajor3() {
		return major3;
	}

	public void setMajor3(String major3) {
		this.major3 = major3;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getPerform() {
		return perform;
	}

	public void setPerform(String perform) {
		this.perform = perform;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "GongCheng [gid=" + gid + ", gname=" + gname + ", gender="
				+ gender + ", city=" + city + ", company=" + company
				+ ", major1=" + major1 + ", major2=" + major2 + ", major3="
				+ major3 + ", register=" + register + ", perform=" + perform
				+ ", dt=" + dt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((dt == null) ? 0 : dt.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((gid == null) ? 0 : gid.hashCode());
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result + ((major1 == null) ? 0 : major1.hashCode());
		result = prime * result + ((major2 == null) ? 0 : major2.hashCode());
		result = prime * result + ((major3 == null) ? 0 : major3.hashCode());
		result = prime * result + ((perform == null) ? 0 : perform.hashCode());
		result = prime * result
				+ ((register == null) ? 0 : register.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GongCheng other = (GongCheng) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (dt == null) {
			if (other.dt != null)
				return false;
		} else if (!dt.equals(other.dt))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (gid == null) {
			if (other.gid != null)
				return false;
		} else if (!gid.equals(other.gid))
			return false;
		if (gname == null) {
			if (other.gname != null)
				return false;
		} else if (!gname.equals(other.gname))
			return false;
		if (major1 == null) {
			if (other.major1 != null)
				return false;
		} else if (!major1.equals(other.major1))
			return false;
		if (major2 == null) {
			if (other.major2 != null)
				return false;
		} else if (!major2.equals(other.major2))
			return false;
		if (major3 == null) {
			if (other.major3 != null)
				return false;
		} else if (!major3.equals(other.major3))
			return false;
		if (perform == null) {
			if (other.perform != null)
				return false;
		} else if (!perform.equals(other.perform))
			return false;
		if (register == null) {
			if (other.register != null)
				return false;
		} else if (!register.equals(other.register))
			return false;
		return true;
	}
	
	
	
	
	
	
}
