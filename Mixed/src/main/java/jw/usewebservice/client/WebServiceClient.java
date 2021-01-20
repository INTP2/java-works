package jw.usewebservice.client;

import jw.usewebservice.server.MobileCodeWS;
import jw.usewebservice.server.MobileCodeWSSoap;

public class WebServiceClient {


    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
        String tel=mobileCodeWSSoap.getMobileCodeInfo("13722222222",null);  //修改为有效号码
        System.out.println(tel);
    }
}
