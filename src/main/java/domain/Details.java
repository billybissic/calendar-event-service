/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import java.util.List;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author Billy Bissic
 *
 */
public class Details {
	private String description;
	private String host;
	private String location;
	@Indexed(name = "event_type_index", direction = IndexDirection.DESCENDING)
	private Integer event_type_id;
	private Integer event_status_id;
	private Integer event_frequency_id;
	private String image_names;
	
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
	 * @return the image_names
	 */
	public String getImage_names() {
		return image_names;
	}
	/**
	 * @param image_names the image_names to set
	 */
	public void setImage_names(String image_names) {
		this.image_names = image_names;
	}
}
