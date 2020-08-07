package kr.or.study.atuality.registry.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class MemberVO {
    public String userConno;        //사용자 일련번호
    public String userRole;         //사용자 권한 코드
    public String userId;           //사용자 아이디
    public String userPassword;     //사용자 비밀번호
    public String userName;         //사용자 이름
    public String userEmail;        //사용자 이메일
    public String userTell;         //사용자 전화번호
    public String userZipcode;      //사용자 우편번호
    public String userAddress;      //사용자 주소
    public String userSubAddress;   //사용자 상세 주소
    public Date regDate;            //사용자 등록 일시
    public Date updateDate;         //사용자 최종 수정 일시
}
