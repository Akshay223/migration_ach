package com.exam.omr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.omr.entity.JournalEntity;

@RestController
@RequestMapping("/journal")
public class JournelApp {
	
	private Map<Long, JournalEntity> jounal = new HashMap<>();
	
	@GetMapping
	public List<JournalEntity> getAll()
	{
		return new ArrayList<>(jounal.values());
				
	}
	
	@GetMapping("id/{id}")
	public JournalEntity getId(@PathVariable Long id)
	{
		return jounal.get(id);
				
	}
	
	@PostMapping
	public String addJounal(@RequestBody JournalEntity jp)
	{
		jounal.put(jp.getId(), jp);
		return "added";
	}
	
	@DeleteMapping("id/{id}")
	public String deleteId(@PathVariable Long id)
	{
		jounal.remove(id);
		return "deleted";
				
	}
	
	@PutMapping("id/{id}")
	public String updateId(@RequestBody JournalEntity jb , @PathVariable Long id)
	{
		jounal.put(id, jb);
		return "updated";
				
	}
	
	

}
