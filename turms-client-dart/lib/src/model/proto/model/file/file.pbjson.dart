///
//  Generated code. Do not modify.
//  source: model/file/file.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use fileDescriptor instead')
const File$json = {
  '1': 'File',
  '2': [
    {
      '1': 'description',
      '3': 1,
      '4': 1,
      '5': 11,
      '6': '.im.turms.proto.File.Description',
      '9': 0,
      '10': 'description',
      '17': true
    },
    {'1': 'data', '3': 2, '4': 1, '5': 12, '9': 1, '10': 'data', '17': true},
  ],
  '3': [File_Description$json],
  '8': [
    {'1': '_description'},
    {'1': '_data'},
  ],
};

@$core.Deprecated('Use fileDescriptor instead')
const File_Description$json = {
  '1': 'Description',
  '2': [
    {'1': 'url', '3': 1, '4': 1, '5': 9, '10': 'url'},
    {'1': 'size', '3': 2, '4': 1, '5': 5, '9': 0, '10': 'size', '17': true},
    {'1': 'format', '3': 3, '4': 1, '5': 9, '9': 1, '10': 'format', '17': true},
  ],
  '8': [
    {'1': '_size'},
    {'1': '_format'},
  ],
};

/// Descriptor for `File`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List fileDescriptor = $convert.base64Decode(
    'CgRGaWxlEkcKC2Rlc2NyaXB0aW9uGAEgASgLMiAuaW0udHVybXMucHJvdG8uRmlsZS5EZXNjcmlwdGlvbkgAUgtkZXNjcmlwdGlvbogBARIXCgRkYXRhGAIgASgMSAFSBGRhdGGIAQEaaQoLRGVzY3JpcHRpb24SEAoDdXJsGAEgASgJUgN1cmwSFwoEc2l6ZRgCIAEoBUgAUgRzaXpliAEBEhsKBmZvcm1hdBgDIAEoCUgBUgZmb3JtYXSIAQFCBwoFX3NpemVCCQoHX2Zvcm1hdEIOCgxfZGVzY3JpcHRpb25CBwoFX2RhdGE=');
