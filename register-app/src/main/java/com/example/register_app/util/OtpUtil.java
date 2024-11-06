package com.example.register_app.util;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class OtpUtil {
	
	public String generateOtp() {
		Random random = new Random();
		int randomNumber = random.nextInt(999999);
		String output = Integer.toString(randomNumber);
		while(output.length() < 6) {
//			output = random.nextInt(9) + output;
			output = "0" + output;
		}
		return output;
	}

}
