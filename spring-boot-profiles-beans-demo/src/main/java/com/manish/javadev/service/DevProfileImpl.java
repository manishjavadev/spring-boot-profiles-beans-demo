package com.manish.javadev.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevProfileImpl implements SetupProfilesService {
	public DevProfileImpl() {
		System.out.println("Dev Profile DevProfileImpl Active Now");
	}

	@Override
	public void activateProfile() {
		System.out.println("Dev Profile is Active Now");

	}

}
