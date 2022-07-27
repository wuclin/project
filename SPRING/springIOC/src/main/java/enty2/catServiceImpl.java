package enty2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ss")
public class catServiceImpl implements catService{
    @Resource
    private catDao catDao;

    private int money;

    //这里的money被初始化为零，只有@Service时
    public void getCat() {
        System.out.println("123"+catDao+"money:"+money);
    }

    public void useCat() {
        catDao.getMoney();
    }
}
