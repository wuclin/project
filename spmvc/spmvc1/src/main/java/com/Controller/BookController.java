package com.Controller;


import com.Bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @SesionnAttritubes注解把下面@ModelAttritube加入到Model的stu加入到session中
 */
@SessionAttributes("stu")
@Controller
public class BookController {

    /**
     * @ModelAttritube,@SesionnAttritubes
     */

    /**
     * 注解在方法上，该方法会在控制器前执行，并把返回值s以隐藏的model.addAttribute("stu", s);加入model
     * 如果没有指明stu，则会以返回类型类名的首字母小写形式加入到model，即model.addAttribute("student",s)
     *
     */
    @ModelAttribute("stu")
    public Student search1(){
        Student s = new Student();
        s.setUsername("qjm");s.setPwd("qwe");
        return s;
    }

    /**
     * 注解在参数上，此时的student就是存放在model里面的值，注解属性的名字要和在model注入的一样
     *
     */
    @RequestMapping("/ma")
    public String getStudent(@ModelAttribute("stu") Student student){
        System.out.println(student.toString());
        return "MA";
    }

    /**
     * 注解在方法上且和RequestMapping注解一起使用，正常来说会返回试图hi.jsp，不过此时的访问路径变成
     * RequestMapping的属性值，即hello.jsp，且由于ModelAttribute注解会把方法的返回值作为value，
     * stu作为key，如果没有指定stu则以string作为key
     */
    @RequestMapping("/hello")
    @ModelAttribute("stu")
    public String gethello(){
        return "hi";
    }



}
