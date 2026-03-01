package com.exam.omr.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.exam.omr.entity.JournalEntity;

@Repository
public interface JournalEntryRepo extends MongoRepository<JournalEntity,String> {

}
