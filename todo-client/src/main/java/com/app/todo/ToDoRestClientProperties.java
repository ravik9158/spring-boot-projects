package com.app.todo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix="todo")
@Data
public class ToDoRestClientProperties {

	private String url;
	private String basePath;
}
