package it.univpm.objProject.model;

/**
 * @author Lorenzo
 *
 */
public class Stats {
	private String name;
	private int rev_prev_day;
	private int rev_prev_week;
	private long av_time_prev_day;
	private long av_time_prev_week;

	public Stats() {
		super();
		this.name = null;
		this.rev_prev_day = 0;
		this.rev_prev_week = 0;
		this.av_time_prev_day = 0;
		this.av_time_prev_week = 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rev_per_day
	 */
	public int getRev_prev_day() {
		return rev_prev_day;
	}

	/**
	 * @param rev_per_day the rev_per_day to set
	 */
	public void setRev_prev_day(int rev_per_day) {
		this.rev_prev_day += rev_per_day;
	}

	/**
	 * @return the rev_per_week
	 */
	public int getRev_prev_week() {
		return rev_prev_week;
	}

	/**
	 * @param rev_per_week the rev_per_week to set
	 */
	public void setRev_prev_week(int rev_per_week) {
		this.rev_prev_week += rev_per_week;
	}

	/**
	 * @return the av_time_per_day
	 */
	public long getAv_time_prev_day() {
		return av_time_prev_day;
	}

	/**
	 * @param av_time_per_day the av_time_per_day to set
	 */
	/**
	 * @param av_time_per_day
	 */
	public void setAv_time_prev_day(long av_time_per_day) {
		this.av_time_prev_day = av_time_per_day;
	}

	/**
	 * @return the av_time_per_week
	 */
	public long getAv_time_prev_week() {
		return av_time_prev_week;
	}

	/**
	 * @param av_time_per_week the av_time_per_week to set
	 */
	public void setAv_time_prev_week(long av_time_per_week) {
		this.av_time_prev_week = av_time_per_week;
	}
}
