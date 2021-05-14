package cn.spring.basic.common.model;

import lombok.Data;

@Data
public class UserDO {

    private Long id;

    private String name;

    private Integer deleted;
}
