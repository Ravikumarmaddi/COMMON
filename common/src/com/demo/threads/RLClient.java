package com.demo.threads;

import java.util.Arrays;
import java.util.List;

import com.google.common.util.concurrent.RateLimiter;

public class RLClient {
	RLClient() {

		// initialize a RateLimiter that will limit your requests rate to 2
		// requests per second
		RateLimiter rateLimiter = RateLimiter.create(2);
		List<String> destinations = Arrays.asList("EMAIL_ADDRESS_1",
				"EMAIL_ADDRESS_2", "EMAIL_ADDRESS_3"); // replace with your TO
														// email addresses
		for (String destination : destinations) {
			int maxRetries = 10;
			while (maxRetries-- > 0) {
				try {

					// wait for a permit to become available
					rateLimiter.acquire();

					// call Amazon SES to send the message
					System.out.println("sent " + "do something");
					break;
				} catch (Exception e) {
					System.out.println("Unable to send email to: "
							+ destination + ". " + e.toString());
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		RLClient client = new RLClient();
		
	}
}
