package ma.ensa.soap.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import ma.ensa.soap.metier.Personne;

@WebService(endpointInterface = "ma.ensa.soap.service.NoteBookService", serviceName = "NoteBookService", portName = "NoteBookPort")
public class NoteBookServiceImpl implements NoteBookService {
	private List<Personne> persons = new ArrayList<Personne>();

	@Override
	public boolean addPerson(@WebParam(name="personne") Personne p) {
		// TODO Auto-generated method stub

		System.out.println("addPerson method has been invoked:" + p);

		if (p == null)
			throw new NullPointerException("Person is null");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return persons.add(p);

	}

	@Override
	public List<Personne> getPersons() {
		// TODO Auto-generated method stub
		System.out.println("getPersons method has been invoked.");
		return persons;

	}

	@Override
	public Personne getPersonAt(@WebParam(name="name") String name) {
		// TODO Auto-generated method stub
				System.out.println("getPersonAt method has been invoked: " + name);

		        if (name == null || name.isEmpty()) throw new NullPointerException("Name is null.");

		        for (Personne person : persons) {
		            if (name.equals(person.getName())) return person;
		        }
		        return null;
			}


}
