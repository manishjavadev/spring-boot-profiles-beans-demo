package com.manish.javadev.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdProfileImpl implements SetupProfilesService {
	public ProdProfileImpl() {
		System.out.println("Prod Profile ProdProfileImpl Active Now");
	}

	@Override
	public void activateProfile() {
		System.out.println("Prod Profile is Active Now");

	}

}
