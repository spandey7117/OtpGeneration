package com.OtpGeneratiom.Controller;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OtpGeneratiom.OTP.OtpDetails;
import com.OtpGeneratiom.SendSMS.SendSms;

@RestController
public class Controller {
	 SendSms sm= new SendSms();
    
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/otpGenerate")
    public OtpDetails otpDetails(@RequestParam(value="phoneNumber", defaultValue="000000000") String phoneNumber) {
    	int otp=(int)(Math.random()*10000);
    //	String response=sm.sendSms("Hi Your OTP for registration is "+String.valueOf(otp), phoneNumber);
    //	String[] res1= response.split(":");
    //	String responseFinal=res1[14].substring(1,res1[14].length()-2);
    //	System.out.println(responseFinal);
    //	return new OtpDetails(counter.incrementAndGet(),otp, phoneNumber,"Hi Your OTP for registration is "+otp,responseFinal);
    	return new OtpDetails(counter.incrementAndGet(),otp, phoneNumber,"Hi Your OTP for registration is "+otp,"responseFinal");
        
       
    }
    
	@RequestMapping("/check")
	public String check() {
	String hello="hello";
		try {

			
			
			return hello;
		}
		catch (Exception e) {
			System.out.println("Error In controller");
			e.printStackTrace();
			
			return hello;
		}
		
}
}
