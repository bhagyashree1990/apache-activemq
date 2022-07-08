package com.morningstar.indexes.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomMessage implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String source;
    private String message;

}
