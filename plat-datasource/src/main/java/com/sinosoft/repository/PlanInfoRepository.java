package com.sinosoft.repository;

import com.sinosoft.domain.OpBusPlanInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @program: platform-project
 * @Date: 2021/9/16 16:25
 * @Author: Mr.SU
 * @Description: 计划信息JPA接口
 */
public interface PlanInfoRepository extends JpaRepository<OpBusPlanInfo, String>, JpaSpecificationExecutor<OpBusPlanInfo> {

    /**
    * @Description:
    * @Params: "[]"
    * @Return: java.util.List<com.sinosoft.domain.OpBusPlanInfo>
    * @Author: supenghui
    * @Date: 2021/9/16 16:29
    */
    List<OpBusPlanInfo> findAll();


}
