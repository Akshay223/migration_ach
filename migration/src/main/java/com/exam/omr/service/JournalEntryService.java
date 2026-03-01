package com.exam.omr.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.exam.omr.entity.JournalEntity;
import com.exam.omr.repo.JournalEntryRepo;

@Service
public class JournalEntryService {
	
	@Autowired
	private JournalEntryRepo journalEntryRepo;
	
	public void saveEntry(JournalEntity journalEntity)
	{
		journalEntryRepo.save(journalEntity);
	}
	
	public  List<JournalEntity> getAll()
	{
		return journalEntryRepo.findAll();
	}
	
	public Optional<JournalEntity> getId(ObjectId id)
	{
		return journalEntryRepo.findById(id);
	}
	
	public void deleteId(ObjectId id)
	{
		journalEntryRepo.deleteById(id);
		
	}
	
	public void deleteAll()
	{
		journalEntryRepo.deleteAll();
	}

}
