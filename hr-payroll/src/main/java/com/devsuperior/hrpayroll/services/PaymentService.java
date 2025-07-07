package com.devsuperior.hrpayroll.services;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	@Value("${hr-worker.host}")
	private String workedHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workedId, int days) {
		
		String workedIdStr = String.valueOf(workedId);
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("id",workedIdStr);		
		Worker worker = restTemplate.getForObject(workedHost +"/workers/{id}", Worker.class, uriVariable);		
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
