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

public class Resizable {

	private boolean beforeStart;
	private boolean afterEnd;
	
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
}
