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
public class TParamsBindCouponByBatchCode implements org.apache.thrift.TBase<TParamsBindCouponByBatchCode, TParamsBindCouponByBatchCode._Fields>, java.io.Serializable, Cloneable, Comparable<TParamsBindCouponByBatchCode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TParamsBindCouponByBatchCode");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField T_COUPON_BINDS_FIELD_DESC = new org.apache.thrift.protocol.TField("tCouponBinds", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField OP_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("opUser", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TParamsBindCouponByBatchCodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TParamsBindCouponByBatchCodeTupleSchemeFactory());
  }

  public int uid; // required
  public List<TCouponBind> tCouponBinds; // required
  public String opUser; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    T_COUPON_BINDS((short)2, "tCouponBinds"),
    OP_USER((short)3, "opUser");

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
        case 2: // T_COUPON_BINDS
          return T_COUPON_BINDS;
        case 3: // OP_USER
          return OP_USER;
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
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.T_COUPON_BINDS, new org.apache.thrift.meta_data.FieldMetaData("tCouponBinds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCouponBind.class))));
    tmpMap.put(_Fields.OP_USER, new org.apache.thrift.meta_data.FieldMetaData("opUser", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TParamsBindCouponByBatchCode.class, metaDataMap);
  }

  public TParamsBindCouponByBatchCode() {
  }

  public TParamsBindCouponByBatchCode(
    int uid,
    List<TCouponBind> tCouponBinds,
    String opUser)
  {
    this();
    this.uid = uid;
    setUidIsSet(true);
    this.tCouponBinds = tCouponBinds;
    this.opUser = opUser;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TParamsBindCouponByBatchCode(TParamsBindCouponByBatchCode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.uid = other.uid;
    if (other.isSetTCouponBinds()) {
      List<TCouponBind> __this__tCouponBinds = new ArrayList<TCouponBind>(other.tCouponBinds.size());
      for (TCouponBind other_element : other.tCouponBinds) {
        __this__tCouponBinds.add(new TCouponBind(other_element));
      }
      this.tCouponBinds = __this__tCouponBinds;
    }
    if (other.isSetOpUser()) {
      this.opUser = other.opUser;
    }
  }

  public TParamsBindCouponByBatchCode deepCopy() {
    return new TParamsBindCouponByBatchCode(this);
  }

  @Override
  public void clear() {
    setUidIsSet(false);
    this.uid = 0;
    this.tCouponBinds = null;
    this.opUser = null;
  }

  public int getUid() {
    return this.uid;
  }

  public TParamsBindCouponByBatchCode setUid(int uid) {
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

  public int getTCouponBindsSize() {
    return (this.tCouponBinds == null) ? 0 : this.tCouponBinds.size();
  }

  public java.util.Iterator<TCouponBind> getTCouponBindsIterator() {
    return (this.tCouponBinds == null) ? null : this.tCouponBinds.iterator();
  }

  public void addToTCouponBinds(TCouponBind elem) {
    if (this.tCouponBinds == null) {
      this.tCouponBinds = new ArrayList<TCouponBind>();
    }
    this.tCouponBinds.add(elem);
  }

  public List<TCouponBind> getTCouponBinds() {
    return this.tCouponBinds;
  }

  public TParamsBindCouponByBatchCode setTCouponBinds(List<TCouponBind> tCouponBinds) {
    this.tCouponBinds = tCouponBinds;
    return this;
  }

  public void unsetTCouponBinds() {
    this.tCouponBinds = null;
  }

  /** Returns true if field tCouponBinds is set (has been assigned a value) and false otherwise */
  public boolean isSetTCouponBinds() {
    return this.tCouponBinds != null;
  }

  public void setTCouponBindsIsSet(boolean value) {
    if (!value) {
      this.tCouponBinds = null;
    }
  }

  public String getOpUser() {
    return this.opUser;
  }

  public TParamsBindCouponByBatchCode setOpUser(String opUser) {
    this.opUser = opUser;
    return this;
  }

  public void unsetOpUser() {
    this.opUser = null;
  }

  /** Returns true if field opUser is set (has been assigned a value) and false otherwise */
  public boolean isSetOpUser() {
    return this.opUser != null;
  }

  public void setOpUserIsSet(boolean value) {
    if (!value) {
      this.opUser = null;
    }
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

    case T_COUPON_BINDS:
      if (value == null) {
        unsetTCouponBinds();
      } else {
        setTCouponBinds((List<TCouponBind>)value);
      }
      break;

    case OP_USER:
      if (value == null) {
        unsetOpUser();
      } else {
        setOpUser((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case T_COUPON_BINDS:
      return getTCouponBinds();

    case OP_USER:
      return getOpUser();

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
    case T_COUPON_BINDS:
      return isSetTCouponBinds();
    case OP_USER:
      return isSetOpUser();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TParamsBindCouponByBatchCode)
      return this.equals((TParamsBindCouponByBatchCode)that);
    return false;
  }

  public boolean equals(TParamsBindCouponByBatchCode that) {
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

    boolean this_present_tCouponBinds = true && this.isSetTCouponBinds();
    boolean that_present_tCouponBinds = true && that.isSetTCouponBinds();
    if (this_present_tCouponBinds || that_present_tCouponBinds) {
      if (!(this_present_tCouponBinds && that_present_tCouponBinds))
        return false;
      if (!this.tCouponBinds.equals(that.tCouponBinds))
        return false;
    }

    boolean this_present_opUser = true && this.isSetOpUser();
    boolean that_present_opUser = true && that.isSetOpUser();
    if (this_present_opUser || that_present_opUser) {
      if (!(this_present_opUser && that_present_opUser))
        return false;
      if (!this.opUser.equals(that.opUser))
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

    boolean present_tCouponBinds = true && (isSetTCouponBinds());
    list.add(present_tCouponBinds);
    if (present_tCouponBinds)
      list.add(tCouponBinds);

    boolean present_opUser = true && (isSetOpUser());
    list.add(present_opUser);
    if (present_opUser)
      list.add(opUser);

    return list.hashCode();
  }

  @Override
  public int compareTo(TParamsBindCouponByBatchCode other) {
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
    lastComparison = Boolean.valueOf(isSetTCouponBinds()).compareTo(other.isSetTCouponBinds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTCouponBinds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tCouponBinds, other.tCouponBinds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpUser()).compareTo(other.isSetOpUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opUser, other.opUser);
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
    StringBuilder sb = new StringBuilder("TParamsBindCouponByBatchCode(");
    boolean first = true;

    sb.append("uid:");
    sb.append(this.uid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tCouponBinds:");
    if (this.tCouponBinds == null) {
      sb.append("null");
    } else {
      sb.append(this.tCouponBinds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("opUser:");
    if (this.opUser == null) {
      sb.append("null");
    } else {
      sb.append(this.opUser);
    }
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

  private static class TParamsBindCouponByBatchCodeStandardSchemeFactory implements SchemeFactory {
    public TParamsBindCouponByBatchCodeStandardScheme getScheme() {
      return new TParamsBindCouponByBatchCodeStandardScheme();
    }
  }

  private static class TParamsBindCouponByBatchCodeStandardScheme extends StandardScheme<TParamsBindCouponByBatchCode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TParamsBindCouponByBatchCode struct) throws org.apache.thrift.TException {
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
          case 2: // T_COUPON_BINDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.tCouponBinds = new ArrayList<TCouponBind>(_list8.size);
                TCouponBind _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new TCouponBind();
                  _elem9.read(iprot);
                  struct.tCouponBinds.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setTCouponBindsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OP_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.opUser = iprot.readString();
              struct.setOpUserIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TParamsBindCouponByBatchCode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(UID_FIELD_DESC);
      oprot.writeI32(struct.uid);
      oprot.writeFieldEnd();
      if (struct.tCouponBinds != null) {
        oprot.writeFieldBegin(T_COUPON_BINDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tCouponBinds.size()));
          for (TCouponBind _iter11 : struct.tCouponBinds)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.opUser != null) {
        oprot.writeFieldBegin(OP_USER_FIELD_DESC);
        oprot.writeString(struct.opUser);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TParamsBindCouponByBatchCodeTupleSchemeFactory implements SchemeFactory {
    public TParamsBindCouponByBatchCodeTupleScheme getScheme() {
      return new TParamsBindCouponByBatchCodeTupleScheme();
    }
  }

  private static class TParamsBindCouponByBatchCodeTupleScheme extends TupleScheme<TParamsBindCouponByBatchCode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TParamsBindCouponByBatchCode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetTCouponBinds()) {
        optionals.set(1);
      }
      if (struct.isSetOpUser()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUid()) {
        oprot.writeI32(struct.uid);
      }
      if (struct.isSetTCouponBinds()) {
        {
          oprot.writeI32(struct.tCouponBinds.size());
          for (TCouponBind _iter12 : struct.tCouponBinds)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetOpUser()) {
        oprot.writeString(struct.opUser);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TParamsBindCouponByBatchCode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.uid = iprot.readI32();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tCouponBinds = new ArrayList<TCouponBind>(_list13.size);
          TCouponBind _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new TCouponBind();
            _elem14.read(iprot);
            struct.tCouponBinds.add(_elem14);
          }
        }
        struct.setTCouponBindsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.opUser = iprot.readString();
        struct.setOpUserIsSet(true);
      }
    }
  }

}

