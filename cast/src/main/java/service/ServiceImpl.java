package service;


import org.springframework.stereotype.Service;

@Service("serviceImpl")
public class ServiceImpl implements UserService{


    public void user() {
        System.out.println("嘤嘤嘤");
    }
}
