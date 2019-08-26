package com.example.uprak.uprakservice.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Service {

	private final EntityManagerFactory emf;

	public Service() {
		// TODO Auto-generated constructor stub
		emf = Persistence.createEntityManagerFactory("com.example.uprak.uprakservice.controller");

	}

	public static Service getInstance() {
		return ServiceHolder.INSTANCE;
	}

	public static class ServiceHolder {
		private static final Service INSTANCE = new Service();
	}

	public EntityManagerFactory getEntityManager() {
		return emf;
	}

}
