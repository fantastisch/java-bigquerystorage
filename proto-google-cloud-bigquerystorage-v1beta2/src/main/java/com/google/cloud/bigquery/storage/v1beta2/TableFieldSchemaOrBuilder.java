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
// source: google/cloud/bigquery/storage/v1beta2/table.proto

package com.google.cloud.bigquery.storage.v1beta2;

public interface TableFieldSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1beta2.TableFieldSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The field name. The name must contain only letters (a-z, A-Z),
   * numbers (0-9), or underscores (_), and must start with a letter or
   * underscore. The maximum length is 128 characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The field name. The name must contain only letters (a-z, A-Z),
   * numbers (0-9), or underscores (_), and must start with a letter or
   * underscore. The maximum length is 128 characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The field data type.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.TableFieldSchema.Type type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The field data type.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.TableFieldSchema.Type type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.bigquery.storage.v1beta2.TableFieldSchema.Type getType();

  /**
   *
   *
   * <pre>
   * Optional. The field mode. The default value is NULLABLE.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.TableFieldSchema.Mode mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The field mode. The default value is NULLABLE.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.TableFieldSchema.Mode mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The mode.
   */
  com.google.cloud.bigquery.storage.v1beta2.TableFieldSchema.Mode getMode();

  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1beta2.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.storage.v1beta2.TableFieldSchema> getFieldsList();
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1beta2.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.storage.v1beta2.TableFieldSchema getFields(int index);
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1beta2.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1beta2.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.storage.v1beta2.TableFieldSchemaOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1beta2.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.storage.v1beta2.TableFieldSchemaOrBuilder getFieldsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The field description. The maximum length is 1,024 characters.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The field description. The maximum length is 1,024 characters.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
