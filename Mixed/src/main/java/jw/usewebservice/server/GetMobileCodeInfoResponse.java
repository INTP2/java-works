package jw.usewebservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMobileCodeInfoResult"
})
@XmlRootElement(name = "getMobileCodeInfoResponse")
public class GetMobileCodeInfoResponse {

    protected String getMobileCodeInfoResult;


    public String getGetMobileCodeInfoResult() {
        return getMobileCodeInfoResult;
    }


    public void setGetMobileCodeInfoResult(String value) {
        this.getMobileCodeInfoResult = value;
    }

}