///
//  Generated code. Do not modify.
//  source: model/user/user_session.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use userSessionDescriptor instead')
const UserSession$json = {
  '1': 'UserSession',
  '2': [
    {'1': 'session_id', '3': 1, '4': 1, '5': 9, '10': 'sessionId'},
    {'1': 'server_id', '3': 2, '4': 1, '5': 9, '10': 'serverId'},
  ],
};

/// Descriptor for `UserSession`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List userSessionDescriptor = $convert.base64Decode(
    'CgtVc2VyU2Vzc2lvbhIdCgpzZXNzaW9uX2lkGAEgASgJUglzZXNzaW9uSWQSGwoJc2VydmVyX2lkGAIgASgJUghzZXJ2ZXJJZA==');
