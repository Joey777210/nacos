/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nacos_grpc_service.proto

package com.alibaba.nacos.api.grpc;

public final class NacosGrpcService {
  
  private NacosGrpcService() {
  }
  
  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
  }
  
  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }
  
  static final com.google.protobuf.Descriptors.Descriptor internal_static_GrpcMetadata_descriptor;
  
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_GrpcMetadata_fieldAccessorTable;
  
  static final com.google.protobuf.Descriptors.Descriptor internal_static_GrpcMetadata_LabelsEntry_descriptor;
  
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_GrpcMetadata_LabelsEntry_fieldAccessorTable;
  
  static final com.google.protobuf.Descriptors.Descriptor internal_static_GrpcRequest_descriptor;
  
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_GrpcRequest_fieldAccessorTable;
  
  static final com.google.protobuf.Descriptors.Descriptor internal_static_GrpcResponse_descriptor;
  
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_GrpcResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }
  
  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  
  static {
    String[] descriptorData = {
            "\n\030nacos_grpc_service.proto\032\031google/proto" + "buf/any.proto\032\037google/protobuf/timestamp"
                    + ".proto\"\342\001\n\014GrpcMetadata\022\014\n\004name\030\001 \001(\t\022\021\n"
                    + "\tclient_ip\030\002 \001(\t\022\025\n\rconnection_id\030\003 \001(\t\022"
                    + "/\n\013create_time\030\004 \001(\0132\032.google.protobuf.T"
                    + "imestamp\022\017\n\007version\030\005 \001(\t\022)\n\006labels\030\006 \003("
                    + "\0132\031.GrpcMetadata.LabelsEntry\032-\n\013LabelsEn"
                    + "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"`\n\013G"
                    + "rpcRequest\022\014\n\004type\030\002 \001(\t\022\037\n\010metadata\030\001 \001"
                    + "(\0132\r.GrpcMetadata\022\"\n\004body\030\003 \001(\0132\024.google",
            ".protobuf.Any\"[\n\014GrpcResponse\022\014\n\004code\030\001 "
                    + "\001(\005\022\"\n\004body\030\002 \001(\0132\024.google.protobuf.Any\022"
                    + "\013\n\003ack\030\004 \001(\t\022\014\n\004type\030\003 \001(\t2A\n\rRequestStr"
                    + "eam\0220\n\rrequestStream\022\014.GrpcRequest\032\r.Grp"
                    + "cResponse\"\0000\00123\n\007Request\022(\n\007request\022\014.Gr"
                    + "pcRequest\032\r.GrpcResponse\"\000B\036\n\032com.alibab" + "a.nacos.api.grpcP\001b\006proto3"};
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        return null;
      }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {com.google.protobuf.AnyProto.getDescriptor(),
                    com.google.protobuf.TimestampProto.getDescriptor(),}, assigner);
    internal_static_GrpcMetadata_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_GrpcMetadata_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_GrpcMetadata_descriptor,
            new String[] {"Name", "ClientIp", "ConnectionId", "CreateTime", "Version", "Labels",});
    internal_static_GrpcMetadata_LabelsEntry_descriptor = internal_static_GrpcMetadata_descriptor.getNestedTypes()
            .get(0);
    internal_static_GrpcMetadata_LabelsEntry_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_GrpcMetadata_LabelsEntry_descriptor, new String[] {"Key", "Value",});
    internal_static_GrpcRequest_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_GrpcRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_GrpcRequest_descriptor, new String[] {"Type", "Metadata", "Body",});
    internal_static_GrpcResponse_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_GrpcResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_GrpcResponse_descriptor, new String[] {"Code", "Body", "Ack", "Type",});
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
