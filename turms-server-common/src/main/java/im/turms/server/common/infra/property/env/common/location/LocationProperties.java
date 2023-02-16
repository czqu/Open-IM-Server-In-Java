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

package im.turms.server.common.infra.property.env.common.location;


import im.turms.server.common.infra.property.metadata.Description;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class LocationProperties {

    @Description("Whether to handle users' locations")
    private boolean enabled = true;

    @Description("Whether to treat the pair of user ID and device type as a unique user when querying users nearby. " +
            "If false, only the user ID is used to identify a unique user")
    private boolean treatUserIdAndDeviceTypeAsUniqueUser;

    @NestedConfigurationProperty
    private NearbyUserRequestProperties nearbyUserRequest = new NearbyUserRequestProperties();

}