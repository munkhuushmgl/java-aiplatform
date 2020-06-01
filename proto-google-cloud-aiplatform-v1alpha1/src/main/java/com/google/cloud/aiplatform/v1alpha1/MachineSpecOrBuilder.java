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
// source: google/cloud/aiplatform/v1alpha1/machine_resources.proto

package com.google.cloud.aiplatform.v1alpha1;

public interface MachineSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.MachineSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The type of the machine.
   * Following machine types are supported:
   * * `n1-standard-2`
   * * `n1-standard-4`
   * * `n1-standard-8`
   * * `n1-standard-16`
   * * `n1-standard-32`
   * * `n1-highmem-2`
   * * `n1-highmem-4`
   * * `n1-highmem-8`
   * * `n1-highmem-16`
   * * `n1-highmem-32`
   * * `n1-highcpu-2`
   * * `n1-highcpu-4`
   * * `n1-highcpu-8`
   * * `n1-highcpu-16`
   * * `n1-highcpu-32`
   * When used for [DeployedMode][] this field is optional and the default value
   * is `n1-standard-2`. If used for [BatchPredictionJob][google.cloud.aiplatform.v1alpha1.BatchPredictionJob] or as part of
   * [WorkerPoolSpec][google.cloud.aiplatform.v1alpha1.WorkerPoolSpec] this field is required.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Immutable. The type of the machine.
   * Following machine types are supported:
   * * `n1-standard-2`
   * * `n1-standard-4`
   * * `n1-standard-8`
   * * `n1-standard-16`
   * * `n1-standard-32`
   * * `n1-highmem-2`
   * * `n1-highmem-4`
   * * `n1-highmem-8`
   * * `n1-highmem-16`
   * * `n1-highmem-32`
   * * `n1-highcpu-2`
   * * `n1-highcpu-4`
   * * `n1-highcpu-8`
   * * `n1-highcpu-16`
   * * `n1-highcpu-32`
   * When used for [DeployedMode][] this field is optional and the default value
   * is `n1-standard-2`. If used for [BatchPredictionJob][google.cloud.aiplatform.v1alpha1.BatchPredictionJob] or as part of
   * [WorkerPoolSpec][google.cloud.aiplatform.v1alpha1.WorkerPoolSpec] this field is required.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * [accelerator_count][google.cloud.aiplatform.v1alpha1.MachineSpec.accelerator_count].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for acceleratorType.
   */
  int getAcceleratorTypeValue();
  /**
   *
   *
   * <pre>
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * [accelerator_count][google.cloud.aiplatform.v1alpha1.MachineSpec.accelerator_count].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The acceleratorType.
   */
  com.google.cloud.aiplatform.v1alpha1.AcceleratorType getAcceleratorType();

  /**
   *
   *
   * <pre>
   * The number of accelerators to attach to the machine.
   * </pre>
   *
   * <code>int32 accelerator_count = 3;</code>
   *
   * @return The acceleratorCount.
   */
  int getAcceleratorCount();
}