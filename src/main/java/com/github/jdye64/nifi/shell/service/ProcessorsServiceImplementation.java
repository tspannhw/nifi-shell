/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jdye64.nifi.shell.service;

import org.apache.nifi.web.api.dto.ProcessorDTO;

import com.github.jdye64.nifi.shell.client.NiFiAPIClient;
import com.github.jdye64.nifi.shell.configuration.Environment;

/**
 * Created by jdyer on 4/8/16.
 */
public class ProcessorsServiceImplementation
    extends AbstractBaseService
    implements ProcessorsService {

    public ProcessorsServiceImplementation(Environment environment) {
        client = new NiFiAPIClient(environment.getHostname(), environment.getPort());
    }

    public ProcessorDTO getProcessors(String clientId, String processorGroupId) {
//        String response = client.get("/controller/process-groups/" + processorGroupId + "/processors");
//        System.out.println("Response: " + response);
//        ObjectMapper mapper = new ObjectMapper();
//
//        ProcessorDTO resource = null;
//        try {
//            JSONObject root = new JSONObject(response);
//            resource = mapper.readValue(response, ProcessorDTO.class);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        return null;
    }
}
