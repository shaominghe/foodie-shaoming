package com.imooc.pojo.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@ApiModel(value = "用户对象BO", description="从客户端，由用户传入的数据封装在此entity中")
@Data
public class UserBO {
    @ApiModelProperty(value = "密码", name = "password", example = "12345", required = true)
    private String password;
    @ApiModelProperty(value = "确认密码", name = "confirepassword", example = "imooc", required = true)
    private String confirepassword;
    @ApiModelProperty(value = "用户名", name = "username", example = "12345", required = false)
    private String username;



}
