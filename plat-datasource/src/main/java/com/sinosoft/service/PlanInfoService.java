package com.sinosoft.service;

import com.sinosoft.constant.Constant_ErrCode;
import com.sinosoft.constant.Constant_ErrMsg;
import com.sinosoft.domain.OpBusPlanInfo;
import com.sinosoft.repository.PlanInfoRepository;
import com.sinosoft.service.impl.PlanInfoServiceImpl;
import com.sinosoft.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: platform-project
 * @Date: 2021/9/16 17:20
 * @Author: Mr.SU
 * @Description:
 */
@Service
public interface PlanInfoService {

    /**
     * @Description: 查询全部的计划信息
     * @Params: "[]"
     * @Return: com.sinosoft.util.ResultBean
     * @Author: supenghui
     * @Date: 2021/9/16 17:23
     */
    ResultBean findAllPlan();

    /**
     * @Description:  保存单个计划信息
     * @Params: "[opBusPlanInfo]"
     * @Return: com.sinosoft.util.ResultBean
     * @Author: supenghui
     * @Date: 2021/9/17 9:46
     */
    ResultBean savePlanInfo(OpBusPlanInfo opBusPlanInfo);

    /**
     * @Description: 根据计划名称查询计划信息
     * @Params: "[planName]"
     * @Return: com.sinosoft.util.ResultBean
     * @Author: supenghui
     * @Date: 2021/9/17 10:16
     */
    ResultBean getPlanByName(String planName);

}
