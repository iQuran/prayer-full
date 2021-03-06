package net.fajarachmad.prayer.prayertime.wrapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prayer {
	private Date today = new Date();
	private Location location = new Location();
	private PrayerTime currentPrayer;
	private PrayerTime nextPrayer;
	private List<PrayerTime> prayerTimes = new ArrayList<PrayerTime>();
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<PrayerTime> getPrayerTimes() {
		return prayerTimes;
	}

	public void setPrayerTimes(List<PrayerTime> prayerTimes) {
		this.prayerTimes = prayerTimes;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public PrayerTime getCurrentPrayer() {
		return currentPrayer;
	}

	public void setCurrentPrayer(PrayerTime currentPrayer) {
		this.currentPrayer = currentPrayer;
	}

	public PrayerTime getNextPrayer() {
		return nextPrayer;
	}

	public void setNextPrayer(PrayerTime nextPrayer) {
		this.nextPrayer = nextPrayer;
	}

}
