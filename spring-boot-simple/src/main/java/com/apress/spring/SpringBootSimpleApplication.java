package com.apress.spring;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//public class SpringBootSimpleApplication {

//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
//		app.run(args);
//
//		new SpringApplicationBuilder(SpringBootSimpleApplication.class).run(args);
//	}

//	@Component
//	class MyComponent {
//		private final Logger log = LoggerFactory.getLogger(MyComponent.class);
//
//		@Autowired
//		public MyComponent(ApplicationArguments args) {
//			boolean enable = args.containsOption("enable");
//			if (enable)
//				log.info("## > You are enabled!");
//			List<String> _args = args.getNonOptionArgs();
//			log.info("## > extra args ...");
//			if (!_args.isEmpty())
//				_args.forEach(file -> log.info(file));
//		}
//	}
//}

@SpringBootApplication
public class SpringBootSimpleApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBootSimpleApplication.class);

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootSimpleApplication.class, args);

	}
//
//	@Bean
//	String info() {
//		log.info("bean");
//		return "Just a simple String bean";
//	}
//
//	@Autowired
//	String info;
//
//	@Bean
//	CommandLineRunner myMethod() {
//		return args -> {
//			log.info("## > CommandLineRunner Implementation...");
//			log.info("Accessing the Info bean: " + info);
//			for (String arg : args)
//				log.info(arg);
//		};
//	}

	@Value("${server.ip}")
	String serverIp;

	@Bean
	CommandLineRunner values() {
		return args -> {
			log.info(" > The Server IP is: " + serverIp);
		};
	}
}
