package com.example.inversion_control;
import org.springframework.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class mobilesconfig
{
	@Bean
	public mobiles getrealmeobject() 
	{
		return new realme();
	}
	@Bean
	public mobiles getiqooobject() 
	{
		return new iqoo();
	}
   
}
