///
//  Generated code. Do not modify.
//  source: request/group/enrollment/create_group_invitation_request.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use createGroupInvitationRequestDescriptor instead')
const CreateGroupInvitationRequest$json = {
  '1': 'CreateGroupInvitationRequest',
  '2': [
    {'1': 'group_id', '3': 1, '4': 1, '5': 3, '10': 'groupId'},
    {'1': 'invitee_id', '3': 2, '4': 1, '5': 3, '10': 'inviteeId'},
    {'1': 'content', '3': 3, '4': 1, '5': 9, '10': 'content'},
  ],
};

/// Descriptor for `CreateGroupInvitationRequest`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List createGroupInvitationRequestDescriptor =
    $convert.base64Decode(
        'ChxDcmVhdGVHcm91cEludml0YXRpb25SZXF1ZXN0EhkKCGdyb3VwX2lkGAEgASgDUgdncm91cElkEh0KCmludml0ZWVfaWQYAiABKANSCWludml0ZWVJZBIYCgdjb250ZW50GAMgASgJUgdjb250ZW50');
