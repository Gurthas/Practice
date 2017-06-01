/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mia.Coupon;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-08-18")
public class TResultBindCouponByCode implements org.apache.thrift.TBase<TResultBindCouponByCode, TResultBindCouponByCode._Fields>, java.io.Serializable, Cloneable, Comparable<TResultBindCouponByCode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResultBindCouponByCode");

  private static final org.apache.thrift.protocol.TField RESULT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("resultInfo", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("errorInfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResultBindCouponByCodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResultBindCouponByCodeTupleSchemeFactory());
  }

  public int resultInfo; // required
  public com.mia.Coupon.TErrorInfo errorInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT_INFO((short)1, "resultInfo"),
    ERROR_INFO((short)2, "errorInfo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESULT_INFO
          return RESULT_INFO;
        case 2: // ERROR_INFO
          return ERROR_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RESULTINFO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT_INFO, new org.apache.thrift.meta_data.FieldMetaData("resultInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERROR_INFO, new org.apache.thrift.meta_data.FieldMetaData("errorInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.mia.Coupon.TErrorInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResultBindCouponByCode.class, metaDataMap);
  }

  public TResultBindCouponByCode() {
  }

  public TResultBindCouponByCode(
    int resultInfo,
    com.mia.Coupon.TErrorInfo errorInfo)
  {
    this();
    this.resultInfo = resultInfo;
    setResultInfoIsSet(true);
    this.errorInfo = errorInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResultBindCouponByCode(TResultBindCouponByCode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.resultInfo = other.resultInfo;
    if (other.isSetErrorInfo()) {
      this.errorInfo = new com.mia.Coupon.TErrorInfo(other.errorInfo);
    }
  }

  public TResultBindCouponByCode deepCopy() {
    return new TResultBindCouponByCode(this);
  }

  @Override
  public void clear() {
    setResultInfoIsSet(false);
    this.resultInfo = 0;
    this.errorInfo = null;
  }

  public int getResultInfo() {
    return this.resultInfo;
  }

  public TResultBindCouponByCode setResultInfo(int resultInfo) {
    this.resultInfo = resultInfo;
    setResultInfoIsSet(true);
    return this;
  }

  public void unsetResultInfo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESULTINFO_ISSET_ID);
  }

  /** Returns true if field resultInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetResultInfo() {
    return EncodingUtils.testBit(__isset_bitfield, __RESULTINFO_ISSET_ID);
  }

  public void setResultInfoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESULTINFO_ISSET_ID, value);
  }

  public com.mia.Coupon.TErrorInfo getErrorInfo() {
    return this.errorInfo;
  }

  public TResultBindCouponByCode setErrorInfo(com.mia.Coupon.TErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

  public void unsetErrorInfo() {
    this.errorInfo = null;
  }

  /** Returns true if field errorInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorInfo() {
    return this.errorInfo != null;
  }

  public void setErrorInfoIsSet(boolean value) {
    if (!value) {
      this.errorInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT_INFO:
      if (value == null) {
        unsetResultInfo();
      } else {
        setResultInfo((Integer)value);
      }
      break;

    case ERROR_INFO:
      if (value == null) {
        unsetErrorInfo();
      } else {
        setErrorInfo((com.mia.Coupon.TErrorInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_INFO:
      return getResultInfo();

    case ERROR_INFO:
      return getErrorInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT_INFO:
      return isSetResultInfo();
    case ERROR_INFO:
      return isSetErrorInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResultBindCouponByCode)
      return this.equals((TResultBindCouponByCode)that);
    return false;
  }

  public boolean equals(TResultBindCouponByCode that) {
    if (that == null)
      return false;

    boolean this_present_resultInfo = true;
    boolean that_present_resultInfo = true;
    if (this_present_resultInfo || that_present_resultInfo) {
      if (!(this_present_resultInfo && that_present_resultInfo))
        return false;
      if (this.resultInfo != that.resultInfo)
        return false;
    }

    boolean this_present_errorInfo = true && this.isSetErrorInfo();
    boolean that_present_errorInfo = true && that.isSetErrorInfo();
    if (this_present_errorInfo || that_present_errorInfo) {
      if (!(this_present_errorInfo && that_present_errorInfo))
        return false;
      if (!this.errorInfo.equals(that.errorInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resultInfo = true;
    list.add(present_resultInfo);
    if (present_resultInfo)
      list.add(resultInfo);

    boolean present_errorInfo = true && (isSetErrorInfo());
    list.add(present_errorInfo);
    if (present_errorInfo)
      list.add(errorInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(TResultBindCouponByCode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResultInfo()).compareTo(other.isSetResultInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultInfo, other.resultInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorInfo()).compareTo(other.isSetErrorInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorInfo, other.errorInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TResultBindCouponByCode(");
    boolean first = true;

    sb.append("resultInfo:");
    sb.append(this.resultInfo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorInfo:");
    if (this.errorInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.errorInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (errorInfo != null) {
      errorInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResultBindCouponByCodeStandardSchemeFactory implements SchemeFactory {
    public TResultBindCouponByCodeStandardScheme getScheme() {
      return new TResultBindCouponByCodeStandardScheme();
    }
  }

  private static class TResultBindCouponByCodeStandardScheme extends StandardScheme<TResultBindCouponByCode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResultBindCouponByCode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resultInfo = iprot.readI32();
              struct.setResultInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.errorInfo = new com.mia.Coupon.TErrorInfo();
              struct.errorInfo.read(iprot);
              struct.setErrorInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResultBindCouponByCode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESULT_INFO_FIELD_DESC);
      oprot.writeI32(struct.resultInfo);
      oprot.writeFieldEnd();
      if (struct.errorInfo != null) {
        oprot.writeFieldBegin(ERROR_INFO_FIELD_DESC);
        struct.errorInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResultBindCouponByCodeTupleSchemeFactory implements SchemeFactory {
    public TResultBindCouponByCodeTupleScheme getScheme() {
      return new TResultBindCouponByCodeTupleScheme();
    }
  }

  private static class TResultBindCouponByCodeTupleScheme extends TupleScheme<TResultBindCouponByCode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResultBindCouponByCode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResultInfo()) {
        optionals.set(0);
      }
      if (struct.isSetErrorInfo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetResultInfo()) {
        oprot.writeI32(struct.resultInfo);
      }
      if (struct.isSetErrorInfo()) {
        struct.errorInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResultBindCouponByCode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.resultInfo = iprot.readI32();
        struct.setResultInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errorInfo = new com.mia.Coupon.TErrorInfo();
        struct.errorInfo.read(iprot);
        struct.setErrorInfoIsSet(true);
      }
    }
  }

}

