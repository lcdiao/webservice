package cn.lcdiao;

import javax.jws.WebService;

@WebService
public interface IDreamService {
    String query(String name);
}
