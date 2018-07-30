
package com.ust.calc.calculadora.datasource.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ust.datasource.api package. 
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

    private final static QName _ReadData_QNAME = new QName("http://service.ws.sample/", "readData");
    private final static QName _Data_QNAME = new QName("http://service.ws.sample/", "data");
    private final static QName _FindByDni_QNAME = new QName("http://service.ws.sample/", "findByDni");
    private final static QName _CreateDataResponse_QNAME = new QName("http://service.ws.sample/", "createDataResponse");
    private final static QName _FindByName_QNAME = new QName("http://service.ws.sample/", "findByName");
    private final static QName _Update_QNAME = new QName("http://service.ws.sample/", "update");
    private final static QName _FindByDniResponse_QNAME = new QName("http://service.ws.sample/", "findByDniResponse");
    private final static QName _Delete_QNAME = new QName("http://service.ws.sample/", "delete");
    private final static QName _FindAll_QNAME = new QName("http://service.ws.sample/", "findAll");
    private final static QName _CreateData_QNAME = new QName("http://service.ws.sample/", "createData");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.ws.sample/", "deleteResponse");
    private final static QName _FindByNameResponse_QNAME = new QName("http://service.ws.sample/", "findByNameResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://service.ws.sample/", "findAllResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.ws.sample/", "updateResponse");
    private final static QName _ReadDataResponse_QNAME = new QName("http://service.ws.sample/", "readDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ust.datasource.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadData }
     * 
     */
    public ReadData createReadData() {
        return new ReadData();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link FindByDni }
     * 
     */
    public FindByDni createFindByDni() {
        return new FindByDni();
    }

    /**
     * Create an instance of {@link CreateDataResponse }
     * 
     */
    public CreateDataResponse createCreateDataResponse() {
        return new CreateDataResponse();
    }

    /**
     * Create an instance of {@link FindByName }
     * 
     */
    public FindByName createFindByName() {
        return new FindByName();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FindByDniResponse }
     * 
     */
    public FindByDniResponse createFindByDniResponse() {
        return new FindByDniResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link CreateData }
     * 
     */
    public CreateData createCreateData() {
        return new CreateData();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindByNameResponse }
     * 
     */
    public FindByNameResponse createFindByNameResponse() {
        return new FindByNameResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link ReadDataResponse }
     * 
     */
    public ReadDataResponse createReadDataResponse() {
        return new ReadDataResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "readData")
    public JAXBElement<ReadData> createReadData(ReadData value) {
        return new JAXBElement<ReadData>(_ReadData_QNAME, ReadData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Data }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "data")
    public JAXBElement<Data> createData(Data value) {
        return new JAXBElement<Data>(_Data_QNAME, Data.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByDni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "findByDni")
    public JAXBElement<FindByDni> createFindByDni(FindByDni value) {
        return new JAXBElement<FindByDni>(_FindByDni_QNAME, FindByDni.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "createDataResponse")
    public JAXBElement<CreateDataResponse> createCreateDataResponse(CreateDataResponse value) {
        return new JAXBElement<CreateDataResponse>(_CreateDataResponse_QNAME, CreateDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "findByName")
    public JAXBElement<FindByName> createFindByName(FindByName value) {
        return new JAXBElement<FindByName>(_FindByName_QNAME, FindByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByDniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "findByDniResponse")
    public JAXBElement<FindByDniResponse> createFindByDniResponse(FindByDniResponse value) {
        return new JAXBElement<FindByDniResponse>(_FindByDniResponse_QNAME, FindByDniResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "createData")
    public JAXBElement<CreateData> createCreateData(CreateData value) {
        return new JAXBElement<CreateData>(_CreateData_QNAME, CreateData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "findByNameResponse")
    public JAXBElement<FindByNameResponse> createFindByNameResponse(FindByNameResponse value) {
        return new JAXBElement<FindByNameResponse>(_FindByNameResponse_QNAME, FindByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.sample/", name = "readDataResponse")
    public JAXBElement<ReadDataResponse> createReadDataResponse(ReadDataResponse value) {
        return new JAXBElement<ReadDataResponse>(_ReadDataResponse_QNAME, ReadDataResponse.class, null, value);
    }

}
