/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.datasource.xds.util;

import junit.framework.TestCase;

/**
 * @author lwj
 * @since 2.0.0
 */
public class MD5UtilTest extends TestCase {

    public void testGetMd5() {
        assertEquals("a2521d671b6c82a3581d6bb4d6cfb384", MD5Util.getMd5("faefeafea"));
        assertEquals("900150983cd24fb0d6963f7d28e17f72", MD5Util.getMd5("abc"));
    }
}