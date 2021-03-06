/*
 *
 *  * Copyright (c) 2017 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 *
 */

package com.wen.ioc.metdata;

/**
 * @author awlwen
 * @since 2018/7/8
 */
public class Dog implements Animale {
    private int x;

    public Dog(int x) {
        this.x = x;
    }

    @Override
    public void spark() {
        System.out.println("one!");
        System.out.println(x);
    }
}
