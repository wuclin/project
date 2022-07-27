package com.sofclient.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IUserController {

    @GetMapping
    @RequestMapping("/getIUser")
    @ResponseBody
    public String getIUser() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/webservice/api?wsdl");
        String detail = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            Object[] objects = client.invoke("getIUser", 99L);
            detail = mapper.writeValueAsString(objects[0]);

        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return detail;
    }


}
