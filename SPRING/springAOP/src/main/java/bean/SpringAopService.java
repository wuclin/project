package bean;

import org.springframework.stereotype.Service;

/**
 * 业务对象
 */
@Service("sas")
public class SpringAopService {


    public void talk(String s){
        System.out.println("talk the word "+ s);
    }
}
