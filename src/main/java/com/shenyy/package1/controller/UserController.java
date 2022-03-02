package com.shenyy.package1.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户数据接口")
public class UserController {
    @ApiOperation(value = "查询用户", notes = "根据id查询用户")
    @ApiImplicitParam(paramType = "path", name = "id", value = "用户id", required = true)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Integer id) {
        return "/user/" + id;
    }

//    @ApiResponses({
//            @ApiResponse(code = 200, message = "删除成功！"),
//            @ApiResponse(code = 500, message = "删除失败！")
//    })
//    @ApiOperation(value="查询用户",notes="通过id查询用户")

    @ApiOperation(value = "添加用户", notes = "添加用户")
    @ApiImplicitParam(paramType = "query", name = "username", value = "用户名", required = true)
    @PostMapping("/user")
    public String addUser(@RequestParam String username){
        return username;
    }

}

//@ApiModel(value = "用户实体类", description = "用户信息描述类")
//public class User {
//    @ApiModelProperty(value = "用户名")
//    private String username;
//    @ApiModelProperty(value = "用户地址")
//    private String address;
//
//}
