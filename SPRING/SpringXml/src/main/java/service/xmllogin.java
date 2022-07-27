package service;

import org.aspectj.lang.JoinPoint;


public class xmllogin {
    public void logBefore(JoinPoint joinPoint){System.out.println("before");
    }

    public void logAfter(JoinPoint joinPoint){
        System.out.println("after");
    }


}

