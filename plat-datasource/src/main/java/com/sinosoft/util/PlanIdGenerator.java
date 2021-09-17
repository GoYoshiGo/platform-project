package com.sinosoft.util;

import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @program: driving-agent
 * @Date: 2021/9/16 16:02
 * @Author: Mr.SU
 * @Description: 主键计划编号生成规则
 */
public class PlanIdGenerator extends IdentityGenerator {
    private Logger logger = LoggerFactory.getLogger(PlanIdGenerator.class);

    protected static final String PRE = "Plan"; //前缀

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws MappingException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        synchronized (PlanIdGenerator.class) {
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            Random random = new Random();
            int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
            logger.info("计划编号Id:" + PRE + str + rannum);
            return PRE + str + String.valueOf(rannum);// 当前时间
        }
    }
}
