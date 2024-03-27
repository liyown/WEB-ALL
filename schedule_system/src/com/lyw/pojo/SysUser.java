package com.lyw.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 14:51
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser {
    private Integer uid;

    @JsonProperty("username")
    private String userName;
    @JsonProperty("password")
    private String userPwd;


}
