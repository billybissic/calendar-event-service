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
public class Colors {
	
	private String primary_color;
	private String secondary_color;
	
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
}
