package jw.usewebservice.server;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "MobileCodeWS", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL")
public class MobileCodeWS
        extends Service
{

    private final static URL MOBILECODEWS_WSDL_LOCATION;
    private final static WebServiceException MOBILECODEWS_EXCEPTION;
    private final static QName MOBILECODEWS_QNAME = new QName("http://WebXml.com.cn/", "MobileCodeWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOBILECODEWS_WSDL_LOCATION = url;
        MOBILECODEWS_EXCEPTION = e;
    }

    public MobileCodeWS() {
        super(__getWsdlLocation(), MOBILECODEWS_QNAME);
    }

    public MobileCodeWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOBILECODEWS_QNAME, features);
    }

    public MobileCodeWS(URL wsdlLocation) {
        super(wsdlLocation, MOBILECODEWS_QNAME);
    }

    public MobileCodeWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOBILECODEWS_QNAME, features);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class);
    }


    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOBILECODEWS_EXCEPTION!= null) {
            throw MOBILECODEWS_EXCEPTION;
        }
        return MOBILECODEWS_WSDL_LOCATION;
    }

}
