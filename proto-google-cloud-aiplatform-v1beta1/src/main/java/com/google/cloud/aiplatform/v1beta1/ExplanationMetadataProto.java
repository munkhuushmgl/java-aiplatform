/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation_metadata.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationMetadataProto {
  private ExplanationMetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/explan"
          + "ation_metadata.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\037google/api/field_behavior"
          + ".proto\032\034google/protobuf/struct.proto\032\034go"
          + "ogle/api/annotations.proto\"\245\005\n\023Explanati"
          + "onMetadata\022U\n\006inputs\030\001 \003(\0132@.google.clou"
          + "d.aiplatform.v1beta1.ExplanationMetadata"
          + ".InputsEntryB\003\340A\002\022W\n\007outputs\030\002 \003(\0132A.goo"
          + "gle.cloud.aiplatform.v1beta1.Explanation"
          + "Metadata.OutputsEntryB\003\340A\002\022\'\n\037feature_at"
          + "tributions_schema_uri\030\003 \001(\t\032@\n\rInputMeta"
          + "data\022/\n\017input_baselines\030\001 \003(\0132\026.google.p"
          + "rotobuf.Value\032\212\001\n\016OutputMetadata\022<\n\032inde"
          + "x_display_name_mapping\030\001 \001(\0132\026.google.pr"
          + "otobuf.ValueH\000\022\"\n\030display_name_mapping_k"
          + "ey\030\002 \001(\tH\000B\026\n\024display_name_mapping\032q\n\013In"
          + "putsEntry\022\013\n\003key\030\001 \001(\t\022Q\n\005value\030\002 \001(\0132B."
          + "google.cloud.aiplatform.v1beta1.Explanat"
          + "ionMetadata.InputMetadata:\0028\001\032s\n\014Outputs"
          + "Entry\022\013\n\003key\030\001 \001(\t\022R\n\005value\030\002 \001(\0132C.goog"
          + "le.cloud.aiplatform.v1beta1.ExplanationM"
          + "etadata.OutputMetadata:\0028\001B\214\001\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\030ExplanationM"
          + "etadataProtoP\001ZIgoogle.golang.org/genpro"
          + "to/googleapis/cloud/aiplatform/v1beta1;a"
          + "iplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor,
            new java.lang.String[] {
              "Inputs", "Outputs", "FeatureAttributionsSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor,
            new java.lang.String[] {
              "InputBaselines",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_descriptor,
            new java.lang.String[] {
              "IndexDisplayNameMapping", "DisplayNameMappingKey", "DisplayNameMapping",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}