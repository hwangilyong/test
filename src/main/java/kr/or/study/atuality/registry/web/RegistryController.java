package kr.or.study.atuality.registry.web;

import kr.or.study.atuality.registry.service.RegistryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/login")
public class RegistryController {
    @Resource(name = "registrySerivce")
    RegistryService registryService;

    @PostMapping("/registry")
    public String registry(){

        return "join";
    }
}
