package net.fajarachmad.prayer.prayertime.wrapper;

import java.util.Date;

public class PrayerTime {
	
	private String prayId;
	private String prayName;
	private String prayTime;
	private Date prayDate;
	
	public PrayerTime() {}

	public PrayerTime(String prayName, String prayTime) {
		this.prayName = prayName;
		this.prayTime = prayTime;
	}
	
	public PrayerTime(String prayId, String prayName, String prayTime, Date prayDate) {
		this.prayName = prayName;
		this.prayTime = prayTime;
		this.prayDate = prayDate;
		this.prayId = prayId;
	}
	
	public String getPrayName() {
		return prayName;
	}
	public void setPrayName(String prayName) {
		this.prayName = prayName;
	}
	public String getPrayTime() {
		return prayTime;
	}
	public void setPrayTime(String prayTime) {
		this.prayTime = prayTime;
	}
	public Date getPrayDate() {
		return prayDate;
	}
	public void setPrayDate(Date prayDate) {
		this.prayDate = prayDate;
	}

	public String getPrayId() {
		return prayId;
	}

	public void setPrayId(String prayId) {
		this.prayId = prayId;
	}
	
	
	

}
