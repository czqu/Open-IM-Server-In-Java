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

package im.turms.service.domain.group.access.admin.dto.response;

import im.turms.service.domain.group.po.GroupInvitation;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

/**
 * @author James Chen
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GroupInvitationDTO extends GroupInvitation {

    @Getter
    private final Date expirationDate;

    public GroupInvitationDTO(GroupInvitation invitation, Date expirationDate) {
        super(invitation.getGroupId(),
                invitation.getGroupId(),
                invitation.getInviterId(),
                invitation.getInviteeId(),
                invitation.getContent(),
                invitation.getStatus(),
                invitation.getCreationDate(),
                invitation.getResponseDate());
        this.expirationDate = expirationDate;
    }

}