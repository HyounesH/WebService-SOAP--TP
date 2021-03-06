
package ma.ensa.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.ensa.soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPersons_QNAME = new QName("http://service.soap.ensa.ma/", "getPersons");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://service.soap.ensa.ma/", "getPersonsResponse");
    private final static QName _Personne_QNAME = new QName("http://service.soap.ensa.ma/", "personne");
    private final static QName _AddPersonResponse_QNAME = new QName("http://service.soap.ensa.ma/", "addPersonResponse");
    private final static QName _GetPersonAtResponse_QNAME = new QName("http://service.soap.ensa.ma/", "getPersonAtResponse");
    private final static QName _AddPerson_QNAME = new QName("http://service.soap.ensa.ma/", "addPerson");
    private final static QName _GetPersonAt_QNAME = new QName("http://service.soap.ensa.ma/", "getPersonAt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.ensa.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonAtResponse }
     * 
     */
    public GetPersonAtResponse createGetPersonAtResponse() {
        return new GetPersonAtResponse();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link GetPersonAt }
     * 
     */
    public GetPersonAt createGetPersonAt() {
        return new GetPersonAt();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "getPersons")
    public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
        return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsResponse> createGetPersonsResponse(GetPersonsResponse value) {
        return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME, GetPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "personne")
    public JAXBElement<Personne> createPersonne(Personne value) {
        return new JAXBElement<Personne>(_Personne_QNAME, Personne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonAtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "getPersonAtResponse")
    public JAXBElement<GetPersonAtResponse> createGetPersonAtResponse(GetPersonAtResponse value) {
        return new JAXBElement<GetPersonAtResponse>(_GetPersonAtResponse_QNAME, GetPersonAtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonAt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.ensa.ma/", name = "getPersonAt")
    public JAXBElement<GetPersonAt> createGetPersonAt(GetPersonAt value) {
        return new JAXBElement<GetPersonAt>(_GetPersonAt_QNAME, GetPersonAt.class, null, value);
    }

}
