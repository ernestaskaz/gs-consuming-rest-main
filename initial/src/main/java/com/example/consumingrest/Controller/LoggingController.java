package com.example.consumingrest.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

 //   Logger logger = LoggerFactory.getLogger(LoggingController.class);

    Logger logger = LogManager.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        logger.fatal("A Fatal message");

        return "Howdy! Check out the Logs to see the output...";
    }
}