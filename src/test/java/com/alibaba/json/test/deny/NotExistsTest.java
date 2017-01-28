package com.alibaba.json.test.deny;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

/**
 * Created by wenshao on 28/01/2017.
 */
public class NotExistsTest extends TestCase {
    public void test_0() throws Exception {
//         ParserConfig.global.setAutoTypeSupport(true);
        for (int i = 0; i < 10; ++i) {
            long start = System.currentTimeMillis();
            perf();
            long millis = System.currentTimeMillis() - start;
            System.out.println("millis : " + millis);
        }
    }

    private void perf() {
        for (int i = 0; i < 1000 * 10; ++i) {
            String text = "[{\"@type\":\"x0\"},{\"@type\":\"x1\"},{\"@type\":\"x2\"},{\"@type\":\"x3\"},{\"@type\":\"x4\"}]";
            try {
                JSON.parseObject(text);
            } catch (Exception ex) {
                // skip
            }
        }
    }
}
