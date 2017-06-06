/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package com.almasb.fxgl.app

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class MockServiceProvider : MockService {
    override fun test(): String {
        return "Test"
    }
}