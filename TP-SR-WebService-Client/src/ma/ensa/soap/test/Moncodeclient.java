package ma.ensa.soap.test;

import ma.ensa.soap.service.NoteBookService;
import ma.ensa.soap.service.NoteBookService_Service;
import ma.ensa.soap.service.Personne;

public class Moncodeclient {
	 public static void main(String[] args) {
			// 1. instanciation du service (généré par wsimport)
		NoteBookService_Service monService = new NoteBookService_Service();
					
		          // 2. récupération du client (généré par wsimport)
		NoteBookService stub = monService.getNoteBookPort();
			Personne p=new Personne();
			p.setAddress("Kénitra");
			p.setName("Younes");
			Personne p2=new Personne();
			p2.setAddress("Casablanca");
			p2.setName("Mehdi");
		     System.out.println(stub.addPerson(p));
		     stub.addPerson(p2);
		     System.out.println(stub.getPersonAt("Younes"));
		     System.out.println("------ all Personne -----");
		     for (Personne per : stub.getPersons()) {
				System.out.println(per.getName()+" : "+per.getAddress());
			}


		}

}
