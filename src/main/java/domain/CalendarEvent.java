/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */

@Document(collection = "calendar-events")
public class CalendarEvent {

	@Id private String _id;
	private String start;
	private String end;
	private String title;
	private Colors colors;
	private boolean allDay;
	private Resizable resizable;
	private boolean draggable;
	private Details details;
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}
	/**
	 * @param date the start to set
	 */
	public void setStart(String date) {
		this.start = date;
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
	 * @return the color
	 */
	public Colors getColors() {
		return colors;
	}
	/**
	 * @param color the color to set
	 */
	public void setColors(Colors colors) {
		this.colors = colors;
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
	 * @return the resizable
	 */
	public Resizable getResizable() {
		return resizable;
	}
	/**
	 * @param resizable the resizable to set
	 */
	public void setResizable(Resizable resizable) {
		this.resizable = resizable;
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
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}
	
}
