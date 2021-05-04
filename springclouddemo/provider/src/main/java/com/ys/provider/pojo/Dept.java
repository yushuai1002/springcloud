package com.ys.provider.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * dept
 * @author 
 */
@Data
public class Dept implements Serializable {
    private Long id;

    private String dname;

    private String dbSource;

    private static final long serialVersionUID = 1L;
}