///
//  Generated code. Do not modify.
//  source: constant/device_type.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use deviceTypeDescriptor instead')
const DeviceType$json = {
  '1': 'DeviceType',
  '2': [
    {'1': 'DESKTOP', '2': 0},
    {'1': 'BROWSER', '2': 1},
    {'1': 'IOS', '2': 2},
    {'1': 'ANDROID', '2': 3},
    {'1': 'OTHERS', '2': 4},
    {'1': 'UNKNOWN', '2': 5},
  ],
};

/// Descriptor for `DeviceType`. Decode as a `google.protobuf.EnumDescriptorProto`.
final $typed_data.Uint8List deviceTypeDescriptor = $convert.base64Decode(
    'CgpEZXZpY2VUeXBlEgsKB0RFU0tUT1AQABILCgdCUk9XU0VSEAESBwoDSU9TEAISCwoHQU5EUk9JRBADEgoKBk9USEVSUxAEEgsKB1VOS05PV04QBQ==');
