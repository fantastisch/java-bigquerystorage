/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/bigquery/storage/v1beta2/protobuf.proto

package com.google.cloud.bigquery.storage.v1beta2;

public interface ProtoRowsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1beta2.ProtoRows)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A sequence of rows serialized as a Protocol Buffer.
   *
   * See https://developers.google.com/protocol-buffers/docs/overview for more
   * information on deserializing this field.
   * </pre>
   *
   * <code>repeated bytes serialized_rows = 1;</code>
   *
   * @return A list containing the serializedRows.
   */
  java.util.List<com.google.protobuf.ByteString> getSerializedRowsList();
  /**
   *
   *
   * <pre>
   * A sequence of rows serialized as a Protocol Buffer.
   *
   * See https://developers.google.com/protocol-buffers/docs/overview for more
   * information on deserializing this field.
   * </pre>
   *
   * <code>repeated bytes serialized_rows = 1;</code>
   *
   * @return The count of serializedRows.
   */
  int getSerializedRowsCount();
  /**
   *
   *
   * <pre>
   * A sequence of rows serialized as a Protocol Buffer.
   *
   * See https://developers.google.com/protocol-buffers/docs/overview for more
   * information on deserializing this field.
   * </pre>
   *
   * <code>repeated bytes serialized_rows = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The serializedRows at the given index.
   */
  com.google.protobuf.ByteString getSerializedRows(int index);
}
