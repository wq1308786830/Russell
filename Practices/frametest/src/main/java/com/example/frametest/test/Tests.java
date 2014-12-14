package com.example.frametest.test;

import android.test.AndroidTestCase;

/**
 * @Test android测试文件
 * Created by 启 on 2014/9/17.
 */
public class Tests extends AndroidTestCase {

    public int add(int x, int y) {
        int rest = x+y;
        return rest;
    }
    public void testAdd() {
        int re = add(10, 3);
        assertEquals(13, re);
    }
}
