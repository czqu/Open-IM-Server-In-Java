///
//  Generated code. Do not modify.
//  source: request/group/member/create_group_members_request.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use createGroupMembersRequestDescriptor instead')
const CreateGroupMembersRequest$json = {
  '1': 'CreateGroupMembersRequest',
  '2': [
    {'1': 'group_id', '3': 1, '4': 1, '5': 3, '10': 'groupId'},
    {'1': 'user_ids', '3': 2, '4': 3, '5': 3, '10': 'userIds'},
    {'1': 'name', '3': 3, '4': 1, '5': 9, '9': 0, '10': 'name', '17': true},
    {
      '1': 'role',
      '3': 4,
      '4': 1,
      '5': 14,
      '6': '.im.turms.proto.GroupMemberRole',
      '10': 'role'
    },
    {
      '1': 'mute_end_date',
      '3': 5,
      '4': 1,
      '5': 3,
      '9': 1,
      '10': 'muteEndDate',
      '17': true
    },
  ],
  '8': [
    {'1': '_name'},
    {'1': '_mute_end_date'},
  ],
};

/// Descriptor for `CreateGroupMembersRequest`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List createGroupMembersRequestDescriptor =
    $convert.base64Decode(
        'ChlDcmVhdGVHcm91cE1lbWJlcnNSZXF1ZXN0EhkKCGdyb3VwX2lkGAEgASgDUgdncm91cElkEhkKCHVzZXJfaWRzGAIgAygDUgd1c2VySWRzEhcKBG5hbWUYAyABKAlIAFIEbmFtZYgBARIzCgRyb2xlGAQgASgOMh8uaW0udHVybXMucHJvdG8uR3JvdXBNZW1iZXJSb2xlUgRyb2xlEicKDW11dGVfZW5kX2RhdGUYBSABKANIAVILbXV0ZUVuZERhdGWIAQFCBwoFX25hbWVCEAoOX211dGVfZW5kX2RhdGU=');
