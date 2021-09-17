package com.sinosoft.service.impl;

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
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: platform-project
 * @Date: 2021/9/16 17:21
 * @Author: Mr.SU
 * @Description:
 */
@Service
public class PlanInfoServiceImpl implements PlanInfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlanInfoRepository planInfoRepository;

    @Autowired
    private OpBusPlanInfoMapper opBusPlanInfoMapper;

    /**
    * @Description: 查询全部的计划信息
    * @Params: "[]"
    * @Return: com.sinosoft.util.ResultBean
    * @Author: supenghui
    * @Date: 2021/9/16 17:23
    */
    public ResultBean findAllPlan() {
        List<OpBusPlanInfo> opBusPlanInfos = null;
        try {
            opBusPlanInfos = planInfoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.error(Constant_ErrCode.QUERY_FAIL_CODE, Constant_ErrMsg.QUERY_FAIL);
        }
        return ResultBean.success("查询成功", opBusPlanInfos);
    }

    /**
     * @Description:  保存单个计划信息
     * @Params: "[opBusPlanInfo]"
     * @Return: com.sinosoft.util.ResultBean
     * @Author: supenghui
     * @Date: 2021/9/17 9:46
     */
    public ResultBean savePlanInfo(OpBusPlanInfo opBusPlanInfo) {

        OpBusPlanInfo busPlanInfo = null;
        try {
            busPlanInfo = planInfoRepository.save(opBusPlanInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.error(Constant_ErrCode.SAVE_FAIL_CODE, Constant_ErrMsg.SAVE_FAIL);
        }

        return ResultBean.success("保存成功", busPlanInfo);
    }

    /**
     * @Description: 根据计划名称查询计划信息
     * @Params: "[planName]"
     * @Return: com.sinosoft.util.ResultBean
     * @Author: supenghui
     * @Date: 2021/9/17 10:16
     */
    public ResultBean getPlanByName(String planName) {
        List<OpBusPlanInfo> list = null;
        try {
            list = opBusPlanInfoMapper.getPlanInfos(planName);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.error(Constant_ErrCode.QUERY_FAIL_CODE, Constant_ErrMsg.QUERY_FAIL);
        }
        return ResultBean.success("查询成功", list);
    }
}
