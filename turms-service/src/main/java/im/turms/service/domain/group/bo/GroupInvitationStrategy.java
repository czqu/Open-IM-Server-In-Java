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

package im.turms.service.domain.group.bo;

/**
 * @author James Chen
 */
public enum GroupInvitationStrategy {
    ALL_REQUIRING_APPROVAL,
    OWNER_MANAGER_MEMBER_REQUIRING_APPROVAL,
    OWNER_MANAGER_REQUIRING_APPROVAL,
    OWNER_REQUIRING_APPROVAL,
    ALL,
    OWNER_MANAGER_MEMBER,
    OWNER_MANAGER,
    OWNER;

    public boolean requiresApproval() {
        return this == GroupInvitationStrategy.ALL_REQUIRING_APPROVAL
                || this == GroupInvitationStrategy.OWNER_REQUIRING_APPROVAL
                || this == GroupInvitationStrategy.OWNER_MANAGER_REQUIRING_APPROVAL
                || this == GroupInvitationStrategy.OWNER_MANAGER_MEMBER_REQUIRING_APPROVAL;
    }

}