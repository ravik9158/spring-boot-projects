package com.app.todo.domain;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ToDo {

	@NotNull
	private String id;

	@NotNull
	@NotBlank
	private String description;

	private Date created;
	private Date modified;
	private boolean completed;

	public ToDo() {
		Date date = new Date();
		//Date date = Date.now();
		this.id = UUID.randomUUID().toString();
		this.created = date;
		this.modified = date;
	}

	public ToDo(String description) {
		this();
		this.description = description;
	}
}
