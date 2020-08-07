package kr.or.study.atuality.registry.service.impl;

import kr.or.study.atuality.registry.entity.AuthInfo;
import kr.or.study.atuality.registry.entity.MemberVO;
import kr.or.study.atuality.registry.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("registryService")
public class RegistrySerivceImpl implements RegistryService {
    @Autowired
    RegistryMapper registryMapper;

    @Override
    public AuthInfo loginSession(MemberVO memberVO) throws Exception{
        return registryMapper.loginSession(memberVO);
    }

    @Override
    public void registryMember(MemberVO memberVO) throws Exception{
        registryMapper.registryMember(memberVO);
    }
}
