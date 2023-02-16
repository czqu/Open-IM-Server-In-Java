/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";

export const protobufPackage = "im.turms.proto";

export interface QueryGroupsRequest {
  groupIds: string[];
  lastUpdatedDate?: string | undefined;
}

function createBaseQueryGroupsRequest(): QueryGroupsRequest {
  return { groupIds: [], lastUpdatedDate: undefined };
}

export const QueryGroupsRequest = {
  encode(message: QueryGroupsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    writer.uint32(10).fork();
    for (const v of message.groupIds) {
      writer.int64(v);
    }
    writer.ldelim();
    if (message.lastUpdatedDate !== undefined) {
      writer.uint32(16).int64(message.lastUpdatedDate);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): QueryGroupsRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseQueryGroupsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.groupIds.push(longToString(reader.int64() as Long));
            }
          } else {
            message.groupIds.push(longToString(reader.int64() as Long));
          }
          break;
        case 2:
          message.lastUpdatedDate = longToString(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },
};

function longToString(long: Long) {
  return long.toString();
}

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}
