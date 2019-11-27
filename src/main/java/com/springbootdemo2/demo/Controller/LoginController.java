package com.springbootdemo2.demo.Controller;

import com.springbootdemo2.demo.dao.BlogDaoImlp;
import com.springbootdemo2.demo.domain.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Map;

@Controller
public class LoginController {


    @ResponseBody
    @GetMapping("/login")
    public String LoginController(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "pwd") String password,
                                  Map<String, String> map, HttpServletRequest request, Model model) {
//        if (!StringUtils.isEmpty(name) && password.equals("1111")){
            HttpSession session = request.getSession();
            session.setAttribute("loginUser",name);
            Collection<Blog> Blogs = new BlogDaoImlp().FindAll();
            for (Blog blog : Blogs){
                System.out.println(blog);
            }
            model.addAttribute("Blogs",Blogs);
        return "forward:/main.html";
        //return "index";
//        }else {
//            map.put("msg","登陆失败");
//            return "login";  //怎么知道是返回的视图不是URL？
//        }
//    }
    }
}
