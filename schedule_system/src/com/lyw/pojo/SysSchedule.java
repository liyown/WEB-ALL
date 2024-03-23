package com.lyw.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 14:51
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysSchedule implements Serializable {
    private int sid;
    private int uid;
    private String title;
    private int completed;

}
