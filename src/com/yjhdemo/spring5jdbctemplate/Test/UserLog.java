package com.yjhdemo.spring5jdbctemplate.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLog {
    private static  final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello loginfo");
        log.warn("hello logwarn");
    }
}
