/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import config.UploadProperties;
import domain.CalendarEvent;
import repository.CalendarEventRepository;

import org.apache.commons.io.FilenameUtils;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/CalendarEvents")
public class CalendarEventController {

	private UploadProperties properties;
	
	@Autowired
	public void setApp(UploadProperties properties) {
		this.properties = properties;
		System.out.println(properties.getSaveDirectory());
	}
	
	@Autowired
	private  CalendarEventRepository calendarEventRepository;
	
	@CrossOrigin(origins = "http://someURLsGoHere")
	@GetMapping(path="/getCalendarEvents")
	public @ResponseBody Iterable<CalendarEvent> getCalendarEvents() {
		return calendarEventRepository.findAll();
	}
	
	@GetMapping(path="/getCalendarEventsByMonth")
	public @ResponseBody Iterable<CalendarEvent> getCalendarEventsByMonth(@RequestParam String start) {
		return calendarEventRepository.findByStart(start);
	}
	
	@RequestMapping(value="/addCalendarEvent", method = RequestMethod.POST)
	public ResponseEntity<?> createCalendarEvent(@RequestBody CalendarEvent calendarEvent) 
	{	
		/* Save the Entity to Database */
		calendarEventRepository.save(calendarEvent);
		return new ResponseEntity<CalendarEvent>(calendarEvent, HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/deleteCalendarEvent/{_id}", method = RequestMethod.GET)
	public ResponseEntity<HttpStatus> deleteCalendarEvent(@PathVariable String _id)
	{
		calendarEventRepository.delete(calendarEventRepository.findOne(_id));
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://someURLsGoHere")
	@RequestMapping(value="/uploadFlyer")
	public ResponseEntity<?> uploadFlyer(@RequestParam("files") MultipartFile[] files) {
		
		String uploadDirectory = this.properties.getSaveDirectory();
		System.out.println(uploadDirectory);
		
		StringBuilder fileNames = new StringBuilder();
		
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			System.out.println(fileNameAndPath);
			
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://someURLsGoHere")
	@RequestMapping(value = "/getEventFlyerJpeg", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getEventFlyerJpeg(@RequestParam String imageName) throws IOException {
		
		String uploadDirectory = this.properties.getSaveDirectory();
		System.out.println(uploadDirectory);
		
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		byte[] bytes = Files.readAllBytes(fileNameAndPath);
		
		String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
		
		return ResponseEntity
				.ok()
				.contentType(MediaType.IMAGE_JPEG)
				.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someURLsGoHere")
	@RequestMapping(value = "/getEventFlyerGif", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
	public ResponseEntity<byte[]> getEventFlyerGif(@RequestParam String imageName) throws IOException {
	
	String uploadDirectory = this.properties.getSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_GIF)
		.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someURLsGoHere")
	@RequestMapping(value = "/getEventFlyerPng", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> getEventFlyerPng(@RequestParam String imageName) throws IOException {
	
	String uploadDirectory = this.properties.getSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_PNG)
		.body(bytes);
	}
	
	@RequestMapping(value = "/removeEventFlyer", method = RequestMethod.POST)
	public ResponseEntity<?> removeFlyer(@RequestParam String imageName) throws IOException {
		String uploadDirectory = this.properties.getSaveDirectory();
		System.out.println(uploadDirectory);
		
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		Files.deleteIfExists(fileNameAndPath);
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
