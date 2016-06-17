package com.jason.commons.mapper;

import com.jason.commons.date.DateUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Qinjianf on 2016/6/17.
 */
public class JsonMapperTest {

    private static Logger logger = LoggerFactory.getLogger(JaxbMapper.class);

    User user = new User("傅永德", 26);

    Long start = null;
    Long end = null;

    @Before
    public void before() throws Exception {
        start = DateUtils.now();
    }

    @After
    public void after() throws Exception {
        end = DateUtils.now();
        logger.info("耗时：{}毫秒", end - start);
    }

    @Test
    public void testToJson() {
        JsonMapper jsonMapper = JsonMapper.nonDefaultMapper();
        String userStr = jsonMapper.toJson(user);
        logger.info(userStr);
    }
}
