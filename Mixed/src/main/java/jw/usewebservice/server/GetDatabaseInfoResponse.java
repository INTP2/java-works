package jw.usewebservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getDatabaseInfoResult"
})
@XmlRootElement(name = "getDatabaseInfoResponse")
public class GetDatabaseInfoResponse {

    protected ArrayOfString getDatabaseInfoResult;


    public ArrayOfString getGetDatabaseInfoResult() {
        return getDatabaseInfoResult;
    }


    public void setGetDatabaseInfoResult(ArrayOfString value) {
        this.getDatabaseInfoResult = value;
    }

}
