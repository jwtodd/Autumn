/*
 * Copyright 2016 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intuit.data.autumn.crypto;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

public class NoopEncryptorTest {

    private NoopEncryptor noopEncryptor;
    private String testMessage = "test";

    @Before
    public void initialize() {
        noopEncryptor = new NoopEncryptor();
    }

    @Test
    public void testEncrypt() {
        assertThat(noopEncryptor.encrypt(testMessage), is(testMessage));
    }

    @Test
    public void testEncryptNull() {
        assertThat(noopEncryptor.encrypt(null), is(nullValue()));
    }

    @Test
    public void testDecrypt() {
        assertThat(noopEncryptor.decrypt(testMessage), is(testMessage));
    }

    @Test
    public void testDecryptNull() {
        assertThat(noopEncryptor.decrypt(null), is(nullValue()));
    }
}
