package org.apache.log4j;

/**
 * A RollingFileAppender class with check for existing log files.
 * @since 30/7/18
 */

import java.io.File;
import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.spi.LoggingEvent;


public class ModifiedRollingFileAppender extends RollingFileAppender {

    @Override
    public void append(LoggingEvent event) {
        checkLogFileExist();
        super.append(event);
    }

    private void checkLogFileExist(){
        File logFile = new File(super.fileName);
        if (!logFile.exists()) {
            this.activateOptions();
        }
    }
}
