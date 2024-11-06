package com.example.register_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterAppApplication {
	@Autowired 
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(RegisterAppApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendMail() {
//		senderService.sendEmail("srimv77@gmail.com", "Urgert pls call me back", "Hi Sujana,\n"
//				+ "\n"
//				+ "I hope this email finds you well. I am writing to express my interest in the Front-end developer position at Reliance. With my experience in front-end development and a strong background in technologies such as HTML, CSS, JavaScript, React, Angular and Java. I am confident in my ability to contribute effectively to your team.\n"
//				+ "\n"
//				+ "Currently, I am working at Infosys as a Front End developer with 2+ years of professional experience. Strong Analytical skills and reverse engineering skills. Involved in end-to-end project life cycle from planning, requirement analysis, design, Development & testing with Angular.\n"
//				+ "\n"
//				+ "I have attached my resume for your review and thank you for considering my application. I look forward to the possibility of discussing how my skills and experiences align with the needs of your team.\n"
//				+ "\n"
//				+ "Name : Seetharaman Manickavasagam \n"
//				+ "Current organization : Infosys ltd \n"
//				+ "Location : Chennai \n"
//				+ "Current CTC : 422000\n"
//				+ "Expected CTC : 800000\n"
//				+ "Total work experience : 2.5 years\n"
//				+ "\n"
//				+ "Thanks,\n"
//				+ "Seetharaman M\n"
//				+ "8778824825");
//	}

}
