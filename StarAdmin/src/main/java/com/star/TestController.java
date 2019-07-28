package com.star;

import com.star.controller.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName TestController
 * @Author Star.Wu
 * 测试
 * @Date 2019/5/24 22:11
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    @RequestMapping("/testTable")
    @ResponseBody
    public Map<String,Object> testTables(){
        return null;
    }
}
