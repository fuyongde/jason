package com.jason.commons.date;

import com.jason.commons.mapper.JaxbMapper;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormaterEmun Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 17, 2016</pre>
 */
public class DateFormaterEmunTest {

    private static Logger logger = LoggerFactory.getLogger(DateFormaterEmun.class);

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

    /**
     * Method: format(Date date)
     */
    @Test
    public void testFormat() throws Exception {
        Date date = new Date(1460882999061l);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(DateFormaterEmun.pattern1.getPattern());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(DateFormaterEmun.pattern2.getPattern());
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(DateFormaterEmun.pattern3.getPattern());
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(DateFormaterEmun.pattern4.getPattern());
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(DateFormaterEmun.pattern5.getPattern());
        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat(DateFormaterEmun.pattern6.getPattern());
        SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat(DateFormaterEmun.pattern7.getPattern());
        SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat(DateFormaterEmun.pattern8.getPattern());
        SimpleDateFormat simpleDateFormat9 = new SimpleDateFormat(DateFormaterEmun.pattern9.getPattern());
        assertEquals("Faild", "2016-04-17 16:49:59", simpleDateFormat1.format(date));
        assertEquals("Faild", "2016/04/17 16:49:59", simpleDateFormat2.format(date));
        assertEquals("Faild", "2016年04月17日 16:49:59", simpleDateFormat3.format(date));
        assertEquals("Faild", "20160417164959", simpleDateFormat4.format(date));
        assertEquals("Faild", "2016-04-17 16:49", simpleDateFormat5.format(date));
        assertEquals("Faild", "2016/04/17 16:49", simpleDateFormat6.format(date));
        assertEquals("Faild", "2016-04-17", simpleDateFormat7.format(date));
        assertEquals("Faild", "2016/04/17", simpleDateFormat8.format(date));
        assertEquals("Faild", "20160417", simpleDateFormat9.format(date));
    }


} 
