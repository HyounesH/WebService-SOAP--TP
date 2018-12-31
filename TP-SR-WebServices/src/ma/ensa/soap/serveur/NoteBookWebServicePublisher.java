package ma.ensa.soap.serveur;

import javax.xml.ws.Endpoint;

import ma.ensa.soap.service.NoteBookServiceImpl;

public class NoteBookWebServicePublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/NoteBookService", new NoteBookServiceImpl());
	}

}
