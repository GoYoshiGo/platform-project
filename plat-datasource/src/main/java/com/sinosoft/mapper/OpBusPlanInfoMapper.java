package com.sinosoft.mapper;

import com.sinosoft.domain.OpBusPlanInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: platform-project
 * @Date: 2021/9/17 10:05
 * @Author: Mr.SU
 * @Description: mapper接口
 */
@Repository
public interface OpBusPlanInfoMapper {

    List<OpBusPlanInfo> getPlanInfos(String planName);
}
