package cn.lcdiao.translate.service.impl;

import cn.com.webxml.EnglishChineseSoap;
import cn.lcdiao.translate.service.TranslateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TranslateServiceImpl implements TranslateService {

    @Resource
    private EnglishChineseSoap translate;

    @Override
    public String translate(String source) {
        List<String> list = translate.translatorString(source).getString();
        return list.get(list.size()-2);
    }
}
