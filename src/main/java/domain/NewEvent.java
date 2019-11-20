/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

/**
 * @author Billy Bissic
 *
 */

/* This is not an Entity Class */
/* 
 * This is simply a data structure 
 * to allow for a less formatted 
 * data object to be submitted to 
 * the controller. 
 */
public class NewEvent {
	private String start;
	private String end;
	private String title;
	private boolean allDay;
	private boolean beforeStart;
	private boolean afterEnd;
	private boolean draggable;
	private String primary_color;
	private String secondary_color;
	private String description;
	private String host;
	private String location;
	private Integer event_type_id;
	private Integer event_status_id;
	private Integer event_frequency_id;
	private Integer event_image_id;
	
	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(String start) {
		this.start = start;
	}
	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the allDay
	 */
	public boolean isAllDay() {
		return allDay;
	}
	/**
	 * @param allDay the allDay to set
	 */
	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
	/**
	 * @return the beforeStart
	 */
	public boolean isBeforeStart() {
		return beforeStart;
	}
	/**
	 * @param beforeStart the beforeStart to set
	 */
	public void setBeforeStart(boolean beforeStart) {
		this.beforeStart = beforeStart;
	}
	/**
	 * @return the afterEnd
	 */
	public boolean isAfterEnd() {
		return afterEnd;
	}
	/**
	 * @param afterEnd the afterEnd to set
	 */
	public void setAfterEnd(boolean afterEnd) {
		this.afterEnd = afterEnd;
	}
	/**
	 * @return the draggable
	 */
	public boolean isDraggable() {
		return draggable;
	}
	/**
	 * @param draggable the draggable to set
	 */
	public void setDraggable(boolean draggable) {
		this.draggable = draggable;
	}
	/**
	 * @return the primary_color
	 */
	public String getPrimary_color() {
		return primary_color;
	}
	/**
	 * @param primary_color the primary_color to set
	 */
	public void setPrimary_color(String primary_color) {
		this.primary_color = primary_color;
	}
	/**
	 * @return the secondary_color
	 */
	public String getSecondary_color() {
		return secondary_color;
	}
	/**
	 * @param secondary_color the secondary_color to set
	 */
	public void setSecondary_color(String secondary_color) {
		this.secondary_color = secondary_color;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the event_type_id
	 */
	public Integer getEvent_type_id() {
		return event_type_id;
	}
	/**
	 * @param event_type_id the event_type_id to set
	 */
	public void setEvent_type_id(Integer event_type_id) {
		this.event_type_id = event_type_id;
	}
	/**
	 * @return the event_status_id
	 */
	public Integer getEvent_status_id() {
		return event_status_id;
	}
	/**
	 * @param event_status_id the event_status_id to set
	 */
	public void setEvent_status_id(Integer event_status_id) {
		this.event_status_id = event_status_id;
	}
	/**
	 * @return the event_frequency_id
	 */
	public Integer getEvent_frequency_id() {
		return event_frequency_id;
	}
	/**
	 * @param event_frequency_id the event_frequency_id to set
	 */
	public void setEvent_frequency_id(Integer event_frequency_id) {
		this.event_frequency_id = event_frequency_id;
	}
	/**
	 * @return the event_image_id
	 */
	public Integer getEvent_image_id() {
		return event_image_id;
	}
	/**
	 * @param event_image_id the event_image_id to set
	 */
	public void setEvent_image_id(Integer event_image_id) {
		this.event_image_id = event_image_id;
	}
}
