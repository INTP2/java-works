package jw.usewebservice.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://WebXml.com.cn/", "string");
    private final static QName _ArrayOfString_QNAME = new QName("http://WebXml.com.cn/", "ArrayOfString");


    public ObjectFactory() {
    }


    public GetDatabaseInfoResponse createGetDatabaseInfoResponse() {
        return new GetDatabaseInfoResponse();
    }


    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }


    public GetMobileCodeInfo createGetMobileCodeInfo() {
        return new GetMobileCodeInfo();
    }


    public GetDatabaseInfo createGetDatabaseInfo() {
        return new GetDatabaseInfo();
    }


    public GetMobileCodeInfoResponse createGetMobileCodeInfoResponse() {
        return new GetMobileCodeInfoResponse();
    }


    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

}