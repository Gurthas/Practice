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
public class TParamsQueryUserCoupon implements org.apache.thrift.TBase<TParamsQueryUserCoupon, TParamsQueryUserCoupon._Fields>, java.io.Serializable, Cloneable, Comparable<TParamsQueryUserCoupon> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TParamsQueryUserCoupon");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PAGE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNo", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("pageSize", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField IS_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("isOrder", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TParamsQueryUserCouponStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TParamsQueryUserCouponTupleSchemeFactory());
  }

  public int uid; // required
  /**
   * 
   * @see TUserCouponStatus
   */
  public TUserCouponStatus status; // required
  public int pageNo; // required
  public int pageSize; // required
  public boolean isOrder; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    /**
     * 
     * @see TUserCouponStatus
     */
    STATUS((short)2, "status"),
    PAGE_NO((short)3, "pageNo"),
    PAGE_SIZE((short)4, "pageSize"),
    IS_ORDER((short)5, "isOrder");

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
        case 1: // UID
          return UID;
        case 2: // STATUS
          return STATUS;
        case 3: // PAGE_NO
          return PAGE_NO;
        case 4: // PAGE_SIZE
          return PAGE_SIZE;
        case 5: // IS_ORDER
          return IS_ORDER;
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
  private static final int __UID_ISSET_ID = 0;
  private static final int __PAGENO_ISSET_ID = 1;
  private static final int __PAGESIZE_ISSET_ID = 2;
  private static final int __ISORDER_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TUserCouponStatus.class)));
    tmpMap.put(_Fields.PAGE_NO, new org.apache.thrift.meta_data.FieldMetaData("pageNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("pageSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_ORDER, new org.apache.thrift.meta_data.FieldMetaData("isOrder", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TParamsQueryUserCoupon.class, metaDataMap);
  }

  public TParamsQueryUserCoupon() {
  }

  public TParamsQueryUserCoupon(
    int uid,
    TUserCouponStatus status,
    int pageNo,
    int pageSize,
    boolean isOrder)
  {
    this();
    this.uid = uid;
    setUidIsSet(true);
    this.status = status;
    this.pageNo = pageNo;
    setPageNoIsSet(true);
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    this.isOrder = isOrder;
    setIsOrderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TParamsQueryUserCoupon(TParamsQueryUserCoupon other) {
    __isset_bitfield = other.__isset_bitfield;
    this.uid = other.uid;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.pageNo = other.pageNo;
    this.pageSize = other.pageSize;
    this.isOrder = other.isOrder;
  }

  public TParamsQueryUserCoupon deepCopy() {
    return new TParamsQueryUserCoupon(this);
  }

  @Override
  public void clear() {
    setUidIsSet(false);
    this.uid = 0;
    this.status = null;
    setPageNoIsSet(false);
    this.pageNo = 0;
    setPageSizeIsSet(false);
    this.pageSize = 0;
    setIsOrderIsSet(false);
    this.isOrder = false;
  }

  public int getUid() {
    return this.uid;
  }

  public TParamsQueryUserCoupon setUid(int uid) {
    this.uid = uid;
    setUidIsSet(true);
    return this;
  }

  public void unsetUid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UID_ISSET_ID);
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return EncodingUtils.testBit(__isset_bitfield, __UID_ISSET_ID);
  }

  public void setUidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UID_ISSET_ID, value);
  }

  /**
   * 
   * @see TUserCouponStatus
   */
  public TUserCouponStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TUserCouponStatus
   */
  public TParamsQueryUserCoupon setStatus(TUserCouponStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getPageNo() {
    return this.pageNo;
  }

  public TParamsQueryUserCoupon setPageNo(int pageNo) {
    this.pageNo = pageNo;
    setPageNoIsSet(true);
    return this;
  }

  public void unsetPageNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGENO_ISSET_ID);
  }

  /** Returns true if field pageNo is set (has been assigned a value) and false otherwise */
  public boolean isSetPageNo() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGENO_ISSET_ID);
  }

  public void setPageNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGENO_ISSET_ID, value);
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public TParamsQueryUserCoupon setPageSize(int pageSize) {
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    return this;
  }

  public void unsetPageSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  /** Returns true if field pageSize is set (has been assigned a value) and false otherwise */
  public boolean isSetPageSize() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  public void setPageSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGESIZE_ISSET_ID, value);
  }

  public boolean isIsOrder() {
    return this.isOrder;
  }

  public TParamsQueryUserCoupon setIsOrder(boolean isOrder) {
    this.isOrder = isOrder;
    setIsOrderIsSet(true);
    return this;
  }

  public void unsetIsOrder() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISORDER_ISSET_ID);
  }

  /** Returns true if field isOrder is set (has been assigned a value) and false otherwise */
  public boolean isSetIsOrder() {
    return EncodingUtils.testBit(__isset_bitfield, __ISORDER_ISSET_ID);
  }

  public void setIsOrderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISORDER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TUserCouponStatus)value);
      }
      break;

    case PAGE_NO:
      if (value == null) {
        unsetPageNo();
      } else {
        setPageNo((Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPageSize();
      } else {
        setPageSize((Integer)value);
      }
      break;

    case IS_ORDER:
      if (value == null) {
        unsetIsOrder();
      } else {
        setIsOrder((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case STATUS:
      return getStatus();

    case PAGE_NO:
      return getPageNo();

    case PAGE_SIZE:
      return getPageSize();

    case IS_ORDER:
      return isIsOrder();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case STATUS:
      return isSetStatus();
    case PAGE_NO:
      return isSetPageNo();
    case PAGE_SIZE:
      return isSetPageSize();
    case IS_ORDER:
      return isSetIsOrder();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TParamsQueryUserCoupon)
      return this.equals((TParamsQueryUserCoupon)that);
    return false;
  }

  public boolean equals(TParamsQueryUserCoupon that) {
    if (that == null)
      return false;

    boolean this_present_uid = true;
    boolean that_present_uid = true;
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (this.uid != that.uid)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_pageNo = true;
    boolean that_present_pageNo = true;
    if (this_present_pageNo || that_present_pageNo) {
      if (!(this_present_pageNo && that_present_pageNo))
        return false;
      if (this.pageNo != that.pageNo)
        return false;
    }

    boolean this_present_pageSize = true;
    boolean that_present_pageSize = true;
    if (this_present_pageSize || that_present_pageSize) {
      if (!(this_present_pageSize && that_present_pageSize))
        return false;
      if (this.pageSize != that.pageSize)
        return false;
    }

    boolean this_present_isOrder = true;
    boolean that_present_isOrder = true;
    if (this_present_isOrder || that_present_isOrder) {
      if (!(this_present_isOrder && that_present_isOrder))
        return false;
      if (this.isOrder != that.isOrder)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uid = true;
    list.add(present_uid);
    if (present_uid)
      list.add(uid);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_pageNo = true;
    list.add(present_pageNo);
    if (present_pageNo)
      list.add(pageNo);

    boolean present_pageSize = true;
    list.add(present_pageSize);
    if (present_pageSize)
      list.add(pageSize);

    boolean present_isOrder = true;
    list.add(present_isOrder);
    if (present_isOrder)
      list.add(isOrder);

    return list.hashCode();
  }

  @Override
  public int compareTo(TParamsQueryUserCoupon other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPageNo()).compareTo(other.isSetPageNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNo, other.pageNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPageSize()).compareTo(other.isSetPageSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageSize, other.pageSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsOrder()).compareTo(other.isSetIsOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsOrder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isOrder, other.isOrder);
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
    StringBuilder sb = new StringBuilder("TParamsQueryUserCoupon(");
    boolean first = true;

    sb.append("uid:");
    sb.append(this.uid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageNo:");
    sb.append(this.pageNo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageSize:");
    sb.append(this.pageSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isOrder:");
    sb.append(this.isOrder);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TParamsQueryUserCouponStandardSchemeFactory implements SchemeFactory {
    public TParamsQueryUserCouponStandardScheme getScheme() {
      return new TParamsQueryUserCouponStandardScheme();
    }
  }

  private static class TParamsQueryUserCouponStandardScheme extends StandardScheme<TParamsQueryUserCoupon> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TParamsQueryUserCoupon struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uid = iprot.readI32();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.mia.Coupon.TUserCouponStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAGE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageNo = iprot.readI32();
              struct.setPageNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageSize = iprot.readI32();
              struct.setPageSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isOrder = iprot.readBool();
              struct.setIsOrderIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TParamsQueryUserCoupon struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(UID_FIELD_DESC);
      oprot.writeI32(struct.uid);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PAGE_NO_FIELD_DESC);
      oprot.writeI32(struct.pageNo);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.pageSize);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_ORDER_FIELD_DESC);
      oprot.writeBool(struct.isOrder);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TParamsQueryUserCouponTupleSchemeFactory implements SchemeFactory {
    public TParamsQueryUserCouponTupleScheme getScheme() {
      return new TParamsQueryUserCouponTupleScheme();
    }
  }

  private static class TParamsQueryUserCouponTupleScheme extends TupleScheme<TParamsQueryUserCoupon> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TParamsQueryUserCoupon struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetPageNo()) {
        optionals.set(2);
      }
      if (struct.isSetPageSize()) {
        optionals.set(3);
      }
      if (struct.isSetIsOrder()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetUid()) {
        oprot.writeI32(struct.uid);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetPageNo()) {
        oprot.writeI32(struct.pageNo);
      }
      if (struct.isSetPageSize()) {
        oprot.writeI32(struct.pageSize);
      }
      if (struct.isSetIsOrder()) {
        oprot.writeBool(struct.isOrder);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TParamsQueryUserCoupon struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.uid = iprot.readI32();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = com.mia.Coupon.TUserCouponStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pageNo = iprot.readI32();
        struct.setPageNoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pageSize = iprot.readI32();
        struct.setPageSizeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isOrder = iprot.readBool();
        struct.setIsOrderIsSet(true);
      }
    }
  }

}

