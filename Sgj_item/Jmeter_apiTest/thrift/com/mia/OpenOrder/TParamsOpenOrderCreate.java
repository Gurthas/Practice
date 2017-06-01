/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mia.OpenOrder;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-06")
public class TParamsOpenOrderCreate implements org.apache.thrift.TBase<TParamsOpenOrderCreate, TParamsOpenOrderCreate._Fields>, java.io.Serializable, Cloneable, Comparable<TParamsOpenOrderCreate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TParamsOpenOrderCreate");

  private static final org.apache.thrift.protocol.TField OPEN_ORDERS_FIELD_DESC = new org.apache.thrift.protocol.TField("openOrders", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TParamsOpenOrderCreateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TParamsOpenOrderCreateTupleSchemeFactory());
  }

  public TOpenOrders openOrders; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPEN_ORDERS((short)1, "openOrders");

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
        case 1: // OPEN_ORDERS
          return OPEN_ORDERS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPEN_ORDERS, new org.apache.thrift.meta_data.FieldMetaData("openOrders", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TOpenOrders.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TParamsOpenOrderCreate.class, metaDataMap);
  }

  public TParamsOpenOrderCreate() {
  }

  public TParamsOpenOrderCreate(
    TOpenOrders openOrders)
  {
    this();
    this.openOrders = openOrders;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TParamsOpenOrderCreate(TParamsOpenOrderCreate other) {
    if (other.isSetOpenOrders()) {
      this.openOrders = new TOpenOrders(other.openOrders);
    }
  }

  public TParamsOpenOrderCreate deepCopy() {
    return new TParamsOpenOrderCreate(this);
  }

  @Override
  public void clear() {
    this.openOrders = null;
  }

  public TOpenOrders getOpenOrders() {
    return this.openOrders;
  }

  public TParamsOpenOrderCreate setOpenOrders(TOpenOrders openOrders) {
    this.openOrders = openOrders;
    return this;
  }

  public void unsetOpenOrders() {
    this.openOrders = null;
  }

  /** Returns true if field openOrders is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenOrders() {
    return this.openOrders != null;
  }

  public void setOpenOrdersIsSet(boolean value) {
    if (!value) {
      this.openOrders = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPEN_ORDERS:
      if (value == null) {
        unsetOpenOrders();
      } else {
        setOpenOrders((TOpenOrders)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPEN_ORDERS:
      return getOpenOrders();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPEN_ORDERS:
      return isSetOpenOrders();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TParamsOpenOrderCreate)
      return this.equals((TParamsOpenOrderCreate)that);
    return false;
  }

  public boolean equals(TParamsOpenOrderCreate that) {
    if (that == null)
      return false;

    boolean this_present_openOrders = true && this.isSetOpenOrders();
    boolean that_present_openOrders = true && that.isSetOpenOrders();
    if (this_present_openOrders || that_present_openOrders) {
      if (!(this_present_openOrders && that_present_openOrders))
        return false;
      if (!this.openOrders.equals(that.openOrders))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_openOrders = true && (isSetOpenOrders());
    list.add(present_openOrders);
    if (present_openOrders)
      list.add(openOrders);

    return list.hashCode();
  }

  @Override
  public int compareTo(TParamsOpenOrderCreate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOpenOrders()).compareTo(other.isSetOpenOrders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenOrders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openOrders, other.openOrders);
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
    StringBuilder sb = new StringBuilder("TParamsOpenOrderCreate(");
    boolean first = true;

    sb.append("openOrders:");
    if (this.openOrders == null) {
      sb.append("null");
    } else {
      sb.append(this.openOrders);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (openOrders != null) {
      openOrders.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TParamsOpenOrderCreateStandardSchemeFactory implements SchemeFactory {
    public TParamsOpenOrderCreateStandardScheme getScheme() {
      return new TParamsOpenOrderCreateStandardScheme();
    }
  }

  private static class TParamsOpenOrderCreateStandardScheme extends StandardScheme<TParamsOpenOrderCreate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TParamsOpenOrderCreate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPEN_ORDERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.openOrders = new TOpenOrders();
              struct.openOrders.read(iprot);
              struct.setOpenOrdersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TParamsOpenOrderCreate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.openOrders != null) {
        oprot.writeFieldBegin(OPEN_ORDERS_FIELD_DESC);
        struct.openOrders.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TParamsOpenOrderCreateTupleSchemeFactory implements SchemeFactory {
    public TParamsOpenOrderCreateTupleScheme getScheme() {
      return new TParamsOpenOrderCreateTupleScheme();
    }
  }

  private static class TParamsOpenOrderCreateTupleScheme extends TupleScheme<TParamsOpenOrderCreate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TParamsOpenOrderCreate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOpenOrders()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOpenOrders()) {
        struct.openOrders.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TParamsOpenOrderCreate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.openOrders = new TOpenOrders();
        struct.openOrders.read(iprot);
        struct.setOpenOrdersIsSet(true);
      }
    }
  }

}

