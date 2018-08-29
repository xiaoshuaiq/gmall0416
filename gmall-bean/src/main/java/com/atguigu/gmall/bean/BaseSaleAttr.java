package com.atguigu.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author xiaos
 * @create 2018-08-27 12:52
 */
public class BaseSaleAttr implements Serializable {

    @Id
    @Column
    String  id  ;

    @Column
    String  name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
