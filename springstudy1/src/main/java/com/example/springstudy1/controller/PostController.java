package com.example.springstudy1.controller;

import com.example.springstudy1.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class PostController {
    // HTML <form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain

    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }


}
