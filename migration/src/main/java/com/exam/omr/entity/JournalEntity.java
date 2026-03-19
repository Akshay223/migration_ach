package com.exam.omr.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "journel_entries")
//@Data
public class JournalEntity {
	
	@Id
	private ObjectId id;
	private String name;
	private String topic;
	private LocalDateTime date;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public JournalEntity(ObjectId id, String name, String topic, LocalDateTime date) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.date = date;
	}
	
	
	
}
