package jw.usewebservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "mobileCode",
        "userID"
})
@XmlRootElement(name = "getMobileCodeInfo")
public class GetMobileCodeInfo {

    protected String mobileCode;
    protected String userID;


    public String getMobileCode() {
        return mobileCode;
    }


    public void setMobileCode(String value) {
        this.mobileCode = value;
    }


    public String getUserID() {
        return userID;
    }


    public void setUserID(String value) {
        this.userID = value;
    }

}
