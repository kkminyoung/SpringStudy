package com.example.springstudy1.controller;

import com.example.springstudy1.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {
    @RequestMapping(method= RequestMethod.GET, path="/getMethod") // localhost:8080/api/getMethod
    public String getReuest(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam String password){
        // 만약 password를 직접 지정하고 싶다면!
        // getParameter(@RequestParam String id, @RequestParam(name="password") String pwd){
        // String password = "bbbb";

        System.out.println("id: "+id);
        System.out.println("password : "+ password);

        return id+password;
    }

    // localhost:8080/api/multiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public String getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // json 형태로 하려면?!
        // {"account" : "", "email" : "", "page":0}
        // return searchParam;

        return "OK"; // 웹페이지에 출력
    }
}
