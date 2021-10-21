package com.practica.microclientereto.actuators;

import java.security.SecureRandom;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoActuator implements InfoContributor {
	
	@Override
	public void contribute(Builder builder) {
		builder.withDetail("ejemplo", new SecureRandom().nextLong());
	}

}
