package com.exam.omr.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.omr.entity.JournalEntity;
import com.exam.omr.service.JournalEntryService;

@RestController
@RequestMapping("/journal2")
public class JournelApp2 {
	
	@Autowired
	private JournalEntryService entryService;
	
	 
	
	@GetMapping
	public List<JournalEntity> getAll()
	{
		return entryService.getAll();
				
	}
	
	@GetMapping("id/{id}")
	public Optional<JournalEntity> getId(@PathVariable ObjectId id)
	{
		return entryService.getId(id);
				
	}
	
	@PostMapping
	public String addJounal(@RequestBody JournalEntity jp)
	{
		jp.setDate(LocalDateTime.now());
		entryService.saveEntry(jp);
		return "journal added";
	}
	
	@DeleteMapping("id/{id}")
	public String deleteId(@PathVariable ObjectId id)
	{
		entryService.deleteId(id);
		return "deleted";
				
	}
	
	@DeleteMapping
	public String deleteAll()
	{
		entryService.deleteAll();
		return "deleted all";
				
	}
	
	
	
	
	
//	
//	@PutMapping("id/{id}")
//	public String updateId(@RequestBody JournalEntity jb , @PathVariable Long id)
//	{
//		return null;
//				
//	}
	
	

}
