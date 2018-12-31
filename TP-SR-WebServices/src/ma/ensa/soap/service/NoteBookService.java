package ma.ensa.soap.service;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import ma.ensa.soap.metier.Personne;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface NoteBookService {
	public boolean addPerson(Personne p);

	public List<Personne> getPersons();

	public Personne getPersonAt(String name);

}
