///
//  Generated code. Do not modify.
//  source: request/conversation/update_typing_status_request.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use updateTypingStatusRequestDescriptor instead')
const UpdateTypingStatusRequest$json = {
  '1': 'UpdateTypingStatusRequest',
  '2': [
    {'1': 'is_group_message', '3': 1, '4': 1, '5': 8, '10': 'isGroupMessage'},
    {'1': 'to_id', '3': 2, '4': 1, '5': 3, '10': 'toId'},
  ],
};

/// Descriptor for `UpdateTypingStatusRequest`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List updateTypingStatusRequestDescriptor =
    $convert.base64Decode(
        'ChlVcGRhdGVUeXBpbmdTdGF0dXNSZXF1ZXN0EigKEGlzX2dyb3VwX21lc3NhZ2UYASABKAhSDmlzR3JvdXBNZXNzYWdlEhMKBXRvX2lkGAIgASgDUgR0b0lk');
