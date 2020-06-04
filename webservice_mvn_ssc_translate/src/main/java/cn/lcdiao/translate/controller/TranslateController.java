package cn.lcdiao.translate.controller;

import cn.lcdiao.translate.service.TranslateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TranslateController {

    @Resource
    private TranslateService translateService;

    @RequestMapping("translate")
    @ResponseBody
    public String translate(String source) {
        return translateService.translate(source);
    }
}
