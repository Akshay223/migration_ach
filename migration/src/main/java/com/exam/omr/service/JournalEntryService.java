package com.exam.omr.service;

import java.util.List;

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

}
