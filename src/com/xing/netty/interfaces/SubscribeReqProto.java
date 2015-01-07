// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeReq.proto

package com.xing.netty.interfaces;

public final class SubscribeReqProto {
  private SubscribeReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SubscribeReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 subReqID = 1;
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    boolean hasSubReqID();
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    int getSubReqID();

    // required string userName = 2;
    /**
     * <code>required string userName = 2;</code>
     */
    boolean hasUserName();
    /**
     * <code>required string userName = 2;</code>
     */
    java.lang.String getUserName();
    /**
     * <code>required string userName = 2;</code>
     */
    com.google.protobuf.ByteString
        getUserNameBytes();

    // required string produceName = 3;
    /**
     * <code>required string produceName = 3;</code>
     */
    boolean hasProduceName();
    /**
     * <code>required string produceName = 3;</code>
     */
    java.lang.String getProduceName();
    /**
     * <code>required string produceName = 3;</code>
     */
    com.google.protobuf.ByteString
        getProduceNameBytes();

    // required string address = 4;
    /**
     * <code>required string address = 4;</code>
     */
    boolean hasAddress();
    /**
     * <code>required string address = 4;</code>
     */
    java.lang.String getAddress();
    /**
     * <code>required string address = 4;</code>
     */
    com.google.protobuf.ByteString
        getAddressBytes();
  }
  /**
   * Protobuf type {@code netty.SubscribeReq}
   */
  public static final class SubscribeReq extends
      com.google.protobuf.GeneratedMessage
      implements SubscribeReqOrBuilder {
    // Use SubscribeReq.newBuilder() to construct.
    private SubscribeReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SubscribeReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SubscribeReq defaultInstance;
    public static SubscribeReq getDefaultInstance() {
      return defaultInstance;
    }

    public SubscribeReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SubscribeReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              subReqID_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              userName_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              produceName_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              address_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xing.netty.interfaces.SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xing.netty.interfaces.SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.class, com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.Builder.class);
    }

    public static com.google.protobuf.Parser<SubscribeReq> PARSER =
        new com.google.protobuf.AbstractParser<SubscribeReq>() {
      public SubscribeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SubscribeReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 subReqID = 1;
    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqID_;
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    public boolean hasSubReqID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    public int getSubReqID() {
      return subReqID_;
    }

    // required string userName = 2;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private java.lang.Object userName_;
    /**
     * <code>required string userName = 2;</code>
     */
    public boolean hasUserName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string userName = 2;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string userName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string produceName = 3;
    public static final int PRODUCENAME_FIELD_NUMBER = 3;
    private java.lang.Object produceName_;
    /**
     * <code>required string produceName = 3;</code>
     */
    public boolean hasProduceName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string produceName = 3;</code>
     */
    public java.lang.String getProduceName() {
      java.lang.Object ref = produceName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          produceName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string produceName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProduceNameBytes() {
      java.lang.Object ref = produceName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        produceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string address = 4;
    public static final int ADDRESS_FIELD_NUMBER = 4;
    private java.lang.Object address_;
    /**
     * <code>required string address = 4;</code>
     */
    public boolean hasAddress() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string address = 4;</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          address_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string address = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      subReqID_ = 0;
      userName_ = "";
      produceName_ = "";
      address_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSubReqID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProduceName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAddress()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getUserNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getProduceNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getAddressBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getUserNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getProduceNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getAddressBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.SubscribeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xing.netty.interfaces.SubscribeReqProto.SubscribeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xing.netty.interfaces.SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xing.netty.interfaces.SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.class, com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.Builder.class);
      }

      // Construct using com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        subReqID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        userName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        produceName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        address_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xing.netty.interfaces.SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
      }

      public com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq getDefaultInstanceForType() {
        return com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.getDefaultInstance();
      }

      public com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq build() {
        com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq buildPartial() {
        com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq result = new com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.subReqID_ = subReqID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userName_ = userName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.produceName_ = produceName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.address_ = address_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq) {
          return mergeFrom((com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq other) {
        if (other == com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq.getDefaultInstance()) return this;
        if (other.hasSubReqID()) {
          setSubReqID(other.getSubReqID());
        }
        if (other.hasUserName()) {
          bitField0_ |= 0x00000002;
          userName_ = other.userName_;
          onChanged();
        }
        if (other.hasProduceName()) {
          bitField0_ |= 0x00000004;
          produceName_ = other.produceName_;
          onChanged();
        }
        if (other.hasAddress()) {
          bitField0_ |= 0x00000008;
          address_ = other.address_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSubReqID()) {
          
          return false;
        }
        if (!hasUserName()) {
          
          return false;
        }
        if (!hasProduceName()) {
          
          return false;
        }
        if (!hasAddress()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 subReqID = 1;
      private int subReqID_ ;
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public boolean hasSubReqID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public int getSubReqID() {
        return subReqID_;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public Builder setSubReqID(int value) {
        bitField0_ |= 0x00000001;
        subReqID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public Builder clearSubReqID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subReqID_ = 0;
        onChanged();
        return this;
      }

      // required string userName = 2;
      private java.lang.Object userName_ = "";
      /**
       * <code>required string userName = 2;</code>
       */
      public boolean hasUserName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string userName = 2;</code>
       */
      public java.lang.String getUserName() {
        java.lang.Object ref = userName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          userName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string userName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUserNameBytes() {
        java.lang.Object ref = userName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string userName = 2;</code>
       */
      public Builder setUserName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        userName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string userName = 2;</code>
       */
      public Builder clearUserName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userName_ = getDefaultInstance().getUserName();
        onChanged();
        return this;
      }
      /**
       * <code>required string userName = 2;</code>
       */
      public Builder setUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        userName_ = value;
        onChanged();
        return this;
      }

      // required string produceName = 3;
      private java.lang.Object produceName_ = "";
      /**
       * <code>required string produceName = 3;</code>
       */
      public boolean hasProduceName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string produceName = 3;</code>
       */
      public java.lang.String getProduceName() {
        java.lang.Object ref = produceName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          produceName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string produceName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getProduceNameBytes() {
        java.lang.Object ref = produceName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          produceName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string produceName = 3;</code>
       */
      public Builder setProduceName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        produceName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string produceName = 3;</code>
       */
      public Builder clearProduceName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        produceName_ = getDefaultInstance().getProduceName();
        onChanged();
        return this;
      }
      /**
       * <code>required string produceName = 3;</code>
       */
      public Builder setProduceNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        produceName_ = value;
        onChanged();
        return this;
      }

      // required string address = 4;
      private java.lang.Object address_ = "";
      /**
       * <code>required string address = 4;</code>
       */
      public boolean hasAddress() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string address = 4;</code>
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string address = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string address = 4;</code>
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string address = 4;</code>
       */
      public Builder clearAddress() {
        bitField0_ = (bitField0_ & ~0x00000008);
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <code>required string address = 4;</code>
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        address_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:netty.SubscribeReq)
    }

    static {
      defaultInstance = new SubscribeReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:netty.SubscribeReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_SubscribeReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_netty_SubscribeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SubscribeReq.proto\022\005netty\"X\n\014Subscribe" +
      "Req\022\020\n\010subReqID\030\001 \002(\005\022\020\n\010userName\030\002 \002(\t\022" +
      "\023\n\013produceName\030\003 \002(\t\022\017\n\007address\030\004 \002(\tB.\n" +
      "\031com.xing.netty.interfacesB\021SubscribeReq" +
      "Proto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_netty_SubscribeReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_netty_SubscribeReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_netty_SubscribeReq_descriptor,
              new java.lang.String[] { "SubReqID", "UserName", "ProduceName", "Address", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
