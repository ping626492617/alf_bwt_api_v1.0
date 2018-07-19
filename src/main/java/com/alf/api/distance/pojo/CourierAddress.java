package com.alf.api.distance.pojo;
/**
 * 返回快递员实体  页面列表实体
 * @author Administrator
 *
 */
public class CourierAddress {
	private Integer addressid;
	private String describes;
	private String accurate;
	private String price;
	private Integer personalid;
	private String personallogo;
	private String personalname;
	private String sitename;
	private String distance;
	public Integer getAddressid() {
		return addressid;
	}
	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}
	public String getDescribes() {
		return describes;
	}
	public void setDescribes(String describes) {
		this.describes = describes;
	}
	public String getAccurate() {
		return accurate;
	}
	public void setAccurate(String accurate) {
		this.accurate = accurate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getPersonalid() {
		return personalid;
	}
	public void setPersonalid(Integer personalid) {
		this.personalid = personalid;
	}
	public String getPersonallogo() {
		return personallogo;
	}
	public void setPersonallogo(String personallogo) {
		this.personallogo = personallogo;
	}
	public String getPersonalname() {
		return personalname;
	}
	public void setPersonalname(String personalname) {
		this.personalname = personalname;
	}
	public String getSitename() {
		return sitename;
	}
	public void setSitename(String sitename) {
		this.sitename = sitename;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
}
