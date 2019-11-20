/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import domain.CalendarEvent;

/**
 * @author Billy Bissic
 *
 */
@Repository
public interface CalendarEventRepository extends MongoRepository<CalendarEvent, String>{

	/**
	 * @param date
	 * @return
	 */
	Iterable<CalendarEvent> findByStart(String start);

	/**
	 * @param _id
	 * @return
	 */
	CalendarEvent findOne(String _id);

}
