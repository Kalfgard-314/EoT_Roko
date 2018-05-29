package com.godard.killian.roko_discordbot.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Plannification {
	private Map<String, Boolean> mapPlannedPeoples;
	
	private List<Date> dates;

	public Map<String, Boolean> getMapPlannedPeoples() {
		return mapPlannedPeoples;
	}

	public void setMapPlannedPeoples(Map<String, Boolean> mapPlannedPeoples) {
		this.mapPlannedPeoples = mapPlannedPeoples;
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
}
