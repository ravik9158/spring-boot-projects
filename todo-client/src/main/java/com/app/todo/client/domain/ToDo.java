package com.app.todo.client.domain;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class ToDo {

	private String id;
	private String description;
	private Date created;
	private Date modified;
	private boolean completed;

	public ToDo() {
		Date date = new Date();
		this.id = UUID.randomUUID().toString();
		this.created = date;
		this.modified = date;
	}

	public ToDo(String description) {
		this();
		this.description = description;
	}
}
