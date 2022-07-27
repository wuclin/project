package com.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * java中默认实现了这些方法，可以使用ctrl+O来实现这些方法
 * 1.preHandle使用较多，在执行方法前拦截，并判断是否进行往下执行
 * 2.postHandle
 * 3.afterCompletion
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String msg = (String) session.getAttribute("msg");
        if (msg == null)
        {
            request.getRequestDispatcher("/WEB-INF/jsp/Inter2.jsp").forward(request,response);
            System.out.println("unlogin");
            session.setAttribute("msg","xxx");
            return true;
        }
        System.out.println("logined");
        request.getRequestDispatcher("/WEB-INF/jsp/Inter1.jsp").forward(request,response);

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
