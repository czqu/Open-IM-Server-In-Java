// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: request/user/create_session_request.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
private struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
    struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
    typealias Version = _2
}

public struct CreateSessionRequest {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    public var version: Int32 = 0

    public var userID: Int64 = 0

    public var password: String {
        get { return _password ?? String() }
        set { _password = newValue }
    }

    /// Returns true if `password` has been explicitly set.
    public var hasPassword: Bool { return _password != nil }
    /// Clears the value of `password`. Subsequent reads from it will return its default value.
    public mutating func clearPassword() { _password = nil }

    public var userStatus: UserStatus {
        get { return _userStatus ?? .available }
        set { _userStatus = newValue }
    }

    /// Returns true if `userStatus` has been explicitly set.
    public var hasUserStatus: Bool { return _userStatus != nil }
    /// Clears the value of `userStatus`. Subsequent reads from it will return its default value.
    public mutating func clearUserStatus() { _userStatus = nil }

    public var deviceType: DeviceType = .desktop

    public var deviceDetails: [String: String] = [:]

    public var location: UserLocation {
        get { return _location ?? UserLocation() }
        set { _location = newValue }
    }

    /// Returns true if `location` has been explicitly set.
    public var hasLocation: Bool { return _location != nil }
    /// Clears the value of `location`. Subsequent reads from it will return its default value.
    public mutating func clearLocation() { _location = nil }

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}

    fileprivate var _password: String?
    fileprivate var _userStatus: UserStatus?
    fileprivate var _location: UserLocation?
}

#if swift(>=5.5) && canImport(_Concurrency)
    extension CreateSessionRequest: @unchecked Sendable {}
#endif // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

private let _protobuf_package = "im.turms.proto"

extension CreateSessionRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
    public static let protoMessageName: String = _protobuf_package + ".CreateSessionRequest"
    public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
        1: .same(proto: "version"),
        2: .standard(proto: "user_id"),
        3: .same(proto: "password"),
        4: .standard(proto: "user_status"),
        5: .standard(proto: "device_type"),
        6: .standard(proto: "device_details"),
        7: .same(proto: "location"),
    ]

    public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
        while let fieldNumber = try decoder.nextFieldNumber() {
            // The use of inline closures is to circumvent an issue where the compiler
            // allocates stack space for every case branch when no optimizations are
            // enabled. https://github.com/apple/swift-protobuf/issues/1034
            switch fieldNumber {
            case 1: try try decoder.decodeSingularInt32Field(value: &version)
            case 2: try try decoder.decodeSingularInt64Field(value: &userID)
            case 3: try try decoder.decodeSingularStringField(value: &_password)
            case 4: try try decoder.decodeSingularEnumField(value: &_userStatus)
            case 5: try try decoder.decodeSingularEnumField(value: &deviceType)
            case 6: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString, SwiftProtobuf.ProtobufString>.self, value: &self.deviceDetails) }()
            case 7: try try decoder.decodeSingularMessageField(value: &_location)
            default: break
            }
        }
    }

    public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every if/case branch local when no optimizations
        // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
        // https://github.com/apple/swift-protobuf/issues/1182
        if version != 0 {
            try visitor.visitSingularInt32Field(value: version, fieldNumber: 1)
        }
        if userID != 0 {
            try visitor.visitSingularInt64Field(value: userID, fieldNumber: 2)
        }
        try { if let v = self._password {
            try visitor.visitSingularStringField(value: v, fieldNumber: 3)
        } }()
        try { if let v = self._userStatus {
            try visitor.visitSingularEnumField(value: v, fieldNumber: 4)
        } }()
        if deviceType != .desktop {
            try visitor.visitSingularEnumField(value: deviceType, fieldNumber: 5)
        }
        if !deviceDetails.isEmpty {
            try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString, SwiftProtobuf.ProtobufString>.self, value: deviceDetails, fieldNumber: 6)
        }
        try { if let v = self._location {
            try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
        } }()
        try unknownFields.traverse(visitor: &visitor)
    }

    public static func == (lhs: CreateSessionRequest, rhs: CreateSessionRequest) -> Bool {
        if lhs.version != rhs.version { return false }
        if lhs.userID != rhs.userID { return false }
        if lhs._password != rhs._password { return false }
        if lhs._userStatus != rhs._userStatus { return false }
        if lhs.deviceType != rhs.deviceType { return false }
        if lhs.deviceDetails != rhs.deviceDetails { return false }
        if lhs._location != rhs._location { return false }
        if lhs.unknownFields != rhs.unknownFields { return false }
        return true
    }
}
