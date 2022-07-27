
package compoent;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class logini {

    @Pointcut("execution(public void service.impl.loginService.login()))")
    public void shareLog(){}

    @Before("shareLog()")
    public void logbefore(){
        System.out.println("before");
    }

    @After("shareLog()")
    public void logafter(){
        System.out.println("after");
    }
}

