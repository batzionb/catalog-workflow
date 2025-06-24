/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kie.kogito.app;

import java.util.concurrent.CompletionStage;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.kie.kogito.addon.quarkus.messaging.common.AbstractQuarkusCloudEventReceiver;
import io.quarkus.runtime.Startup;

@Startup
@ApplicationScoped
public class Kogito_incoming_streamEventReceiver extends AbstractQuarkusCloudEventReceiver<Object> {

    @Incoming("kogito_incoming_stream")
    public CompletionStage<?> onEvent(Message<Object> message) {
        return produce(message);
    }

    @PostConstruct
    void init() {
        super.setCloudEventUnmarshaller(this.unmarshaller);
    }

    @jakarta.inject.Inject()
    org.kie.kogito.event.CloudEventUnmarshallerFactory<Object> unmarshaller;
}
