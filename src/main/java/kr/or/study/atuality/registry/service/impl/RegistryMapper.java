package kr.or.study.atuality.registry.service.impl;

import kr.or.study.atuality.registry.entity.AuthInfo;
import kr.or.study.atuality.registry.entity.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("regisgtryMapper")
public interface RegistryMapper {
    //회원 가입
    AuthInfo loginSession(MemberVO memberVO) throws Exception;
    void registryMember(MemberVO memberVO) throws Exception;
}
