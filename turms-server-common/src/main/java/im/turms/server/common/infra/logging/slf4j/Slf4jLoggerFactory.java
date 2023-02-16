/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.infra.logging.slf4j;

import im.turms.server.common.infra.logging.core.logger.Logger;
import im.turms.server.common.infra.logging.core.logger.LoggerFactory;
import org.slf4j.ILoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author James Chen
 */
public final class Slf4jLoggerFactory implements ILoggerFactory {

    private final ConcurrentHashMap<String, Slf4jLogger> nameToLogger = new ConcurrentHashMap<>(128);

    @Override
    public org.slf4j.Logger getLogger(String name) {
        return nameToLogger.computeIfAbsent(name, loggerName -> {
            Logger logger = LoggerFactory.getLogger(loggerName);
            return new Slf4jLogger(loggerName, logger);
        });
    }

}
