package com.test.wf.TestWF

import com.collibra.dgc.core.api.component.logger.LoggerApi

class LogScriptTask {

    LoggerApi loggerApi

    void log() {
        loggerApi.info("Hello, World!")
    }
}
