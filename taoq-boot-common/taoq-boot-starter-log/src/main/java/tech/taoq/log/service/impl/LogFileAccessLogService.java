package tech.taoq.log.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import tech.taoq.common.util.JsonUtil;
import tech.taoq.log.domain.bo.AccessLog;
import tech.taoq.log.service.AccessLogService;

/**
 * 记录访问日志到日志文件中
 *
 * @author keqi
 */
@Slf4j
@Component
@ConditionalOnProperty(prefix = "taoq.log.operate-log", value = "log-file")
public class LogFileAccessLogService implements AccessLogService {

    @Override
    public void writeAccessLog(AccessLog accessLog) {
        log.info("access log {}", JsonUtil.writeValueAsString(accessLog));
    }
}
