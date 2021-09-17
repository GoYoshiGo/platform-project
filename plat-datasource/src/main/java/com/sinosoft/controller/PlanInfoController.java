package com.sinosoft.controller;

import com.sinosoft.constant.Constant_ErrCode;
import com.sinosoft.constant.Constant_ErrMsg;
import com.sinosoft.domain.OpBusPlanInfo;
import com.sinosoft.mapper.OpBusPlanInfoMapper;
import com.sinosoft.repository.PlanInfoRepository;
import com.sinosoft.service.PlanInfoService;
import com.sinosoft.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: platform-project
 * @Date: 2021/9/16 16:20
 * @Author: Mr.SU
 * @Description: 计划信息控制器
 */
@RestController
@RequestMapping("/plan")
public class PlanInfoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlanInfoService planInfoService;



    /**
     * @Description: 查询全部的计划信息
     * @Params: "[]"
     * @Return: com.sinosoft.util.ResultBean
     * @Author: supenghui
     * @Date: 2021/9/16 17:23
     */
    @GetMapping("/plans")
    public ResultBean findAllPlan() {
        return planInfoService.findAllPlan();
    }

    /**
    * @Description:  保存单个计划信息
    * @Params: "[opBusPlanInfo]"
    * @Return: com.sinosoft.util.ResultBean
    * @Author: supenghui
    * @Date: 2021/9/17 9:46
    */
    @PostMapping("/savePlanInfo")
    public ResultBean savePlanInfo(OpBusPlanInfo opBusPlanInfo) {

        return planInfoService.savePlanInfo(opBusPlanInfo);
    }

    /**
    * @Description: 根据计划名称查询计划信息
    * @Params: "[planName]"
    * @Return: com.sinosoft.util.ResultBean
    * @Author: supenghui
    * @Date: 2021/9/17 10:16
    */
    @GetMapping("/planName")
    public ResultBean getPlanInfoByName(String planName) {
        return planInfoService.getPlanByName(planName);
    }

}
