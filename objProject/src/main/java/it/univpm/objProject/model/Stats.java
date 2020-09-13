package it.univpm.objProject.model;

import java.util.Date;

public class Stats {
	private int rev_per_day;
	private int rev_per_week;
	private Date av_time_per_day;
	private Date av_time_per_week;
	/**
	 * @return the rev_per_day
	 */
	public int getRev_per_day() {
		return rev_per_day;
	}
	/**
	 * @param rev_per_day the rev_per_day to set
	 */
	public void setRev_per_day(int rev_per_day) {
		this.rev_per_day += rev_per_day;
	}
	/**
	 * @return the rev_per_week
	 */
	public int getRev_per_week() {
		return rev_per_week;
	}
	/**
	 * @param rev_per_week the rev_per_week to set
	 */
	public void setRev_per_week(int rev_per_week) {
		this.rev_per_week = rev_per_week;
	}
	/**
	 * @return the av_time_per_day
	 */
	public Date getAv_time_per_day() {
		return av_time_per_day;
	}
	/**
	 * @param av_time_per_day the av_time_per_day to set
	 */
	public void setAv_time_per_day(Date av_time_per_day) {
		this.av_time_per_day = av_time_per_day;
	}
	/**
	 * @return the av_time_per_week
	 */
	public Date getAv_time_per_week() {
		return av_time_per_week;
	}
	/**
	 * @param av_time_per_week the av_time_per_week to set
	 */
	public void setAv_time_per_week(Date av_time_per_week) {
		this.av_time_per_week = av_time_per_week;
	}

}
