package cn.lcdiao;

import javax.jws.WebService;

@WebService
public class DreamServiceImpl implements IDreamService {
    @Override
    public String query(String name) {
        System.out.println(name + "的梦想是:有钱");
        return "有钱";
    }
}
