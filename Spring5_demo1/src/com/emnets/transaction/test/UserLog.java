package com.emnets.transaction.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lannisite
 * @program UserLog
 * @description 描述
 * @date 2023/2/17 15:39
 */

public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2!");
        log.warn("hello log4j2");
        log.debug("hello log4j2");
    }


}
