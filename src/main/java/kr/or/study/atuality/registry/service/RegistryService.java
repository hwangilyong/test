package kr.or.study.atuality.registry.service;

import kr.or.study.atuality.registry.entity.AuthInfo;
import kr.or.study.atuality.registry.entity.MemberVO;

public interface RegistryService {
    AuthInfo loginSession(MemberVO memberVO) throws Exception;
    void registryMember(MemberVO memberVO) throws Exception;
}
