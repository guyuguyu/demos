package com.example.demo.controller;

import com.example.demo.dao.gen.TpBannerMapper;
import com.example.demo.entity.gen.Abum;
import com.example.demo.entity.gen.TpBanner;
import com.example.demo.entity.gen.TpBannerExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/test")
public class TestController {


//    @RequestMapping(value = "/exception", method = GET)
//    public String hello() {
//        throw new NullPointerException("这是错误信息");
////        return "hello world";
//    }
    @Resource
    private testService s;

    @Resource
    private TpBannerMapper tpm;

    @RequestMapping(value = "/index")
    @ResponseBody
    public Object index() {
        Abum abum = s.getAbum();
        return abum;
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public Object hello() {
        TpBannerExample banner=new TpBannerExample();
        banner.createCriteria().andBannerTypeEqualTo("2");
        List<TpBanner> tpBanners = tpm.selectByExample(banner);
        return tpBanners;
    }

    @RequestMapping(value = "/page")
    public String page() {
        return "hello";
    }

    @RequestMapping(value = "/a")
    @ResponseBody
    public Object a() {
        return "哎呦我去";
    }

}
