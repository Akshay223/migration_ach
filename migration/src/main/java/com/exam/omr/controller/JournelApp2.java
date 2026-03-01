package com.exam.omr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@PostMapping
	public String addJounal(@RequestBody JournalEntity jp)
	{
		entryService.saveEntry(jp);
		return "journal added";
	}
	
//	@GetMapping("id/{id}")
//	public JournalEntity getId(@PathVariable Long id)
//	{
//		return null;
//				
//	}
//	
//	
//	
//	@DeleteMapping("id/{id}")
//	public String deleteId(@PathVariable Long id)
//	{
//		return null;
//				
//	}
//	
//	@PutMapping("id/{id}")
//	public String updateId(@RequestBody JournalEntity jb , @PathVariable Long id)
//	{
//		return null;
//				
//	}
	
	

}
