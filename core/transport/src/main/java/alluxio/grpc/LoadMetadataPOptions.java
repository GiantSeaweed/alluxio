// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.file.LoadMetadataPOptions}
 */
public  final class LoadMetadataPOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.file.LoadMetadataPOptions)
    LoadMetadataPOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadMetadataPOptions.newBuilder() to construct.
  private LoadMetadataPOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadMetadataPOptions() {
    recursive_ = false;
    createAncestors_ = false;
    loadDescendantType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoadMetadataPOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            recursive_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            createAncestors_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            alluxio.grpc.LoadDescendantPType value = alluxio.grpc.LoadDescendantPType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              bitField0_ |= 0x00000004;
              loadDescendantType_ = rawValue;
            }
            break;
          }
          case 34: {
            alluxio.grpc.FileSystemMasterCommonPOptions.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = commonOptions_.toBuilder();
            }
            commonOptions_ = input.readMessage(alluxio.grpc.FileSystemMasterCommonPOptions.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commonOptions_);
              commonOptions_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_LoadMetadataPOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_LoadMetadataPOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.LoadMetadataPOptions.class, alluxio.grpc.LoadMetadataPOptions.Builder.class);
  }

  private int bitField0_;
  public static final int RECURSIVE_FIELD_NUMBER = 1;
  private boolean recursive_;
  /**
   * <pre>
   ** whether to load metadata recursively 
   * </pre>
   *
   * <code>optional bool recursive = 1;</code>
   */
  public boolean hasRecursive() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   ** whether to load metadata recursively 
   * </pre>
   *
   * <code>optional bool recursive = 1;</code>
   */
  public boolean getRecursive() {
    return recursive_;
  }

  public static final int CREATEANCESTORS_FIELD_NUMBER = 2;
  private boolean createAncestors_;
  /**
   * <code>optional bool createAncestors = 2;</code>
   */
  public boolean hasCreateAncestors() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional bool createAncestors = 2;</code>
   */
  public boolean getCreateAncestors() {
    return createAncestors_;
  }

  public static final int LOADDESCENDANTTYPE_FIELD_NUMBER = 3;
  private int loadDescendantType_;
  /**
   * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
   */
  public boolean hasLoadDescendantType() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
   */
  public alluxio.grpc.LoadDescendantPType getLoadDescendantType() {
    alluxio.grpc.LoadDescendantPType result = alluxio.grpc.LoadDescendantPType.valueOf(loadDescendantType_);
    return result == null ? alluxio.grpc.LoadDescendantPType.NONE : result;
  }

  public static final int COMMONOPTIONS_FIELD_NUMBER = 4;
  private alluxio.grpc.FileSystemMasterCommonPOptions commonOptions_;
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  public boolean hasCommonOptions() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  public alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions() {
    return commonOptions_ == null ? alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance() : commonOptions_;
  }
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  public alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder() {
    return commonOptions_ == null ? alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance() : commonOptions_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(1, recursive_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(2, createAncestors_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeEnum(3, loadDescendantType_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, getCommonOptions());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, recursive_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, createAncestors_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, loadDescendantType_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCommonOptions());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.LoadMetadataPOptions)) {
      return super.equals(obj);
    }
    alluxio.grpc.LoadMetadataPOptions other = (alluxio.grpc.LoadMetadataPOptions) obj;

    boolean result = true;
    result = result && (hasRecursive() == other.hasRecursive());
    if (hasRecursive()) {
      result = result && (getRecursive()
          == other.getRecursive());
    }
    result = result && (hasCreateAncestors() == other.hasCreateAncestors());
    if (hasCreateAncestors()) {
      result = result && (getCreateAncestors()
          == other.getCreateAncestors());
    }
    result = result && (hasLoadDescendantType() == other.hasLoadDescendantType());
    if (hasLoadDescendantType()) {
      result = result && loadDescendantType_ == other.loadDescendantType_;
    }
    result = result && (hasCommonOptions() == other.hasCommonOptions());
    if (hasCommonOptions()) {
      result = result && getCommonOptions()
          .equals(other.getCommonOptions());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRecursive()) {
      hash = (37 * hash) + RECURSIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRecursive());
    }
    if (hasCreateAncestors()) {
      hash = (37 * hash) + CREATEANCESTORS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCreateAncestors());
    }
    if (hasLoadDescendantType()) {
      hash = (37 * hash) + LOADDESCENDANTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + loadDescendantType_;
    }
    if (hasCommonOptions()) {
      hash = (37 * hash) + COMMONOPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.LoadMetadataPOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.LoadMetadataPOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.file.LoadMetadataPOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.file.LoadMetadataPOptions)
      alluxio.grpc.LoadMetadataPOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_LoadMetadataPOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_LoadMetadataPOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.LoadMetadataPOptions.class, alluxio.grpc.LoadMetadataPOptions.Builder.class);
    }

    // Construct using alluxio.grpc.LoadMetadataPOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCommonOptionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recursive_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      createAncestors_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      loadDescendantType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      if (commonOptionsBuilder_ == null) {
        commonOptions_ = null;
      } else {
        commonOptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_LoadMetadataPOptions_descriptor;
    }

    public alluxio.grpc.LoadMetadataPOptions getDefaultInstanceForType() {
      return alluxio.grpc.LoadMetadataPOptions.getDefaultInstance();
    }

    public alluxio.grpc.LoadMetadataPOptions build() {
      alluxio.grpc.LoadMetadataPOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.LoadMetadataPOptions buildPartial() {
      alluxio.grpc.LoadMetadataPOptions result = new alluxio.grpc.LoadMetadataPOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.recursive_ = recursive_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.createAncestors_ = createAncestors_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.loadDescendantType_ = loadDescendantType_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      if (commonOptionsBuilder_ == null) {
        result.commonOptions_ = commonOptions_;
      } else {
        result.commonOptions_ = commonOptionsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.LoadMetadataPOptions) {
        return mergeFrom((alluxio.grpc.LoadMetadataPOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.LoadMetadataPOptions other) {
      if (other == alluxio.grpc.LoadMetadataPOptions.getDefaultInstance()) return this;
      if (other.hasRecursive()) {
        setRecursive(other.getRecursive());
      }
      if (other.hasCreateAncestors()) {
        setCreateAncestors(other.getCreateAncestors());
      }
      if (other.hasLoadDescendantType()) {
        setLoadDescendantType(other.getLoadDescendantType());
      }
      if (other.hasCommonOptions()) {
        mergeCommonOptions(other.getCommonOptions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.LoadMetadataPOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.LoadMetadataPOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean recursive_ ;
    /**
     * <pre>
     ** whether to load metadata recursively 
     * </pre>
     *
     * <code>optional bool recursive = 1;</code>
     */
    public boolean hasRecursive() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     ** whether to load metadata recursively 
     * </pre>
     *
     * <code>optional bool recursive = 1;</code>
     */
    public boolean getRecursive() {
      return recursive_;
    }
    /**
     * <pre>
     ** whether to load metadata recursively 
     * </pre>
     *
     * <code>optional bool recursive = 1;</code>
     */
    public Builder setRecursive(boolean value) {
      bitField0_ |= 0x00000001;
      recursive_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** whether to load metadata recursively 
     * </pre>
     *
     * <code>optional bool recursive = 1;</code>
     */
    public Builder clearRecursive() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recursive_ = false;
      onChanged();
      return this;
    }

    private boolean createAncestors_ ;
    /**
     * <code>optional bool createAncestors = 2;</code>
     */
    public boolean hasCreateAncestors() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool createAncestors = 2;</code>
     */
    public boolean getCreateAncestors() {
      return createAncestors_;
    }
    /**
     * <code>optional bool createAncestors = 2;</code>
     */
    public Builder setCreateAncestors(boolean value) {
      bitField0_ |= 0x00000002;
      createAncestors_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool createAncestors = 2;</code>
     */
    public Builder clearCreateAncestors() {
      bitField0_ = (bitField0_ & ~0x00000002);
      createAncestors_ = false;
      onChanged();
      return this;
    }

    private int loadDescendantType_ = 0;
    /**
     * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
     */
    public boolean hasLoadDescendantType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
     */
    public alluxio.grpc.LoadDescendantPType getLoadDescendantType() {
      alluxio.grpc.LoadDescendantPType result = alluxio.grpc.LoadDescendantPType.valueOf(loadDescendantType_);
      return result == null ? alluxio.grpc.LoadDescendantPType.NONE : result;
    }
    /**
     * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
     */
    public Builder setLoadDescendantType(alluxio.grpc.LoadDescendantPType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      loadDescendantType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
     */
    public Builder clearLoadDescendantType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      loadDescendantType_ = 0;
      onChanged();
      return this;
    }

    private alluxio.grpc.FileSystemMasterCommonPOptions commonOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.FileSystemMasterCommonPOptions, alluxio.grpc.FileSystemMasterCommonPOptions.Builder, alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder> commonOptionsBuilder_;
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public boolean hasCommonOptions() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions() {
      if (commonOptionsBuilder_ == null) {
        return commonOptions_ == null ? alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance() : commonOptions_;
      } else {
        return commonOptionsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public Builder setCommonOptions(alluxio.grpc.FileSystemMasterCommonPOptions value) {
      if (commonOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonOptions_ = value;
        onChanged();
      } else {
        commonOptionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public Builder setCommonOptions(
        alluxio.grpc.FileSystemMasterCommonPOptions.Builder builderForValue) {
      if (commonOptionsBuilder_ == null) {
        commonOptions_ = builderForValue.build();
        onChanged();
      } else {
        commonOptionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public Builder mergeCommonOptions(alluxio.grpc.FileSystemMasterCommonPOptions value) {
      if (commonOptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008) &&
            commonOptions_ != null &&
            commonOptions_ != alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance()) {
          commonOptions_ =
            alluxio.grpc.FileSystemMasterCommonPOptions.newBuilder(commonOptions_).mergeFrom(value).buildPartial();
        } else {
          commonOptions_ = value;
        }
        onChanged();
      } else {
        commonOptionsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public Builder clearCommonOptions() {
      if (commonOptionsBuilder_ == null) {
        commonOptions_ = null;
        onChanged();
      } else {
        commonOptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public alluxio.grpc.FileSystemMasterCommonPOptions.Builder getCommonOptionsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getCommonOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    public alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder() {
      if (commonOptionsBuilder_ != null) {
        return commonOptionsBuilder_.getMessageOrBuilder();
      } else {
        return commonOptions_ == null ?
            alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance() : commonOptions_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.FileSystemMasterCommonPOptions, alluxio.grpc.FileSystemMasterCommonPOptions.Builder, alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder> 
        getCommonOptionsFieldBuilder() {
      if (commonOptionsBuilder_ == null) {
        commonOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.FileSystemMasterCommonPOptions, alluxio.grpc.FileSystemMasterCommonPOptions.Builder, alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder>(
                getCommonOptions(),
                getParentForChildren(),
                isClean());
        commonOptions_ = null;
      }
      return commonOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.file.LoadMetadataPOptions)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.file.LoadMetadataPOptions)
  private static final alluxio.grpc.LoadMetadataPOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.LoadMetadataPOptions();
  }

  public static alluxio.grpc.LoadMetadataPOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LoadMetadataPOptions>
      PARSER = new com.google.protobuf.AbstractParser<LoadMetadataPOptions>() {
    public LoadMetadataPOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoadMetadataPOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoadMetadataPOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadMetadataPOptions> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.LoadMetadataPOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

