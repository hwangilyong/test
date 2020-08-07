package kr.or.study.atuality.registry.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AuthInfo implements Serializable {//implements Serializable
    private static  final long serialVersionUID = 1L;

    private String userId;
    private String userClssCd;

    public AuthInfo(String userId, String userClssCd){
        this.userId = userId;
        this.userClssCd = userClssCd;
    }
}
