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
public class TContent implements org.apache.thrift.TBase<TContent, TContent._Fields>, java.io.Serializable, Cloneable, Comparable<TContent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TContent");

  private static final org.apache.thrift.protocol.TField ORDERS_FIELD_DESC = new org.apache.thrift.protocol.TField("orders", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ORDER_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("orderItems", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField COUPONS_FIELD_DESC = new org.apache.thrift.protocol.TField("coupons", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TContentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TContentTupleSchemeFactory());
  }

  public TOrders orders; // required
  public List<TOrderItem> orderItems; // required
  public List<TCoupon> coupons; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDERS((short)1, "orders"),
    ORDER_ITEMS((short)2, "orderItems"),
    COUPONS((short)3, "coupons");

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
        case 1: // ORDERS
          return ORDERS;
        case 2: // ORDER_ITEMS
          return ORDER_ITEMS;
        case 3: // COUPONS
          return COUPONS;
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
    tmpMap.put(_Fields.ORDERS, new org.apache.thrift.meta_data.FieldMetaData("orders", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TOrders")));
    tmpMap.put(_Fields.ORDER_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("orderItems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "TOrderItem"))));
    tmpMap.put(_Fields.COUPONS, new org.apache.thrift.meta_data.FieldMetaData("coupons", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "TCoupon"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TContent.class, metaDataMap);
  }

  public TContent() {
  }

  public TContent(
    TOrders orders,
    List<TOrderItem> orderItems,
    List<TCoupon> coupons)
  {
    this();
    this.orders = orders;
    this.orderItems = orderItems;
    this.coupons = coupons;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TContent(TContent other) {
    if (other.isSetOrders()) {
      this.orders = other.orders;
    }
    if (other.isSetOrderItems()) {
      List<TOrderItem> __this__orderItems = new ArrayList<TOrderItem>(other.orderItems.size());
      for (TOrderItem other_element : other.orderItems) {
        __this__orderItems.add(other_element);
      }
      this.orderItems = __this__orderItems;
    }
    if (other.isSetCoupons()) {
      List<TCoupon> __this__coupons = new ArrayList<TCoupon>(other.coupons.size());
      for (TCoupon other_element : other.coupons) {
        __this__coupons.add(other_element);
      }
      this.coupons = __this__coupons;
    }
  }

  public TContent deepCopy() {
    return new TContent(this);
  }

  @Override
  public void clear() {
    this.orders = null;
    this.orderItems = null;
    this.coupons = null;
  }

  public TOrders getOrders() {
    return this.orders;
  }

  public TContent setOrders(TOrders orders) {
    this.orders = orders;
    return this;
  }

  public void unsetOrders() {
    this.orders = null;
  }

  /** Returns true if field orders is set (has been assigned a value) and false otherwise */
  public boolean isSetOrders() {
    return this.orders != null;
  }

  public void setOrdersIsSet(boolean value) {
    if (!value) {
      this.orders = null;
    }
  }

  public int getOrderItemsSize() {
    return (this.orderItems == null) ? 0 : this.orderItems.size();
  }

  public java.util.Iterator<TOrderItem> getOrderItemsIterator() {
    return (this.orderItems == null) ? null : this.orderItems.iterator();
  }

  public void addToOrderItems(TOrderItem elem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<TOrderItem>();
    }
    this.orderItems.add(elem);
  }

  public List<TOrderItem> getOrderItems() {
    return this.orderItems;
  }

  public TContent setOrderItems(List<TOrderItem> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public void unsetOrderItems() {
    this.orderItems = null;
  }

  /** Returns true if field orderItems is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderItems() {
    return this.orderItems != null;
  }

  public void setOrderItemsIsSet(boolean value) {
    if (!value) {
      this.orderItems = null;
    }
  }

  public int getCouponsSize() {
    return (this.coupons == null) ? 0 : this.coupons.size();
  }

  public java.util.Iterator<TCoupon> getCouponsIterator() {
    return (this.coupons == null) ? null : this.coupons.iterator();
  }

  public void addToCoupons(TCoupon elem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<TCoupon>();
    }
    this.coupons.add(elem);
  }

  public List<TCoupon> getCoupons() {
    return this.coupons;
  }

  public TContent setCoupons(List<TCoupon> coupons) {
    this.coupons = coupons;
    return this;
  }

  public void unsetCoupons() {
    this.coupons = null;
  }

  /** Returns true if field coupons is set (has been assigned a value) and false otherwise */
  public boolean isSetCoupons() {
    return this.coupons != null;
  }

  public void setCouponsIsSet(boolean value) {
    if (!value) {
      this.coupons = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORDERS:
      if (value == null) {
        unsetOrders();
      } else {
        setOrders((TOrders)value);
      }
      break;

    case ORDER_ITEMS:
      if (value == null) {
        unsetOrderItems();
      } else {
        setOrderItems((List<TOrderItem>)value);
      }
      break;

    case COUPONS:
      if (value == null) {
        unsetCoupons();
      } else {
        setCoupons((List<TCoupon>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDERS:
      return getOrders();

    case ORDER_ITEMS:
      return getOrderItems();

    case COUPONS:
      return getCoupons();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORDERS:
      return isSetOrders();
    case ORDER_ITEMS:
      return isSetOrderItems();
    case COUPONS:
      return isSetCoupons();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TContent)
      return this.equals((TContent)that);
    return false;
  }

  public boolean equals(TContent that) {
    if (that == null)
      return false;

    boolean this_present_orders = true && this.isSetOrders();
    boolean that_present_orders = true && that.isSetOrders();
    if (this_present_orders || that_present_orders) {
      if (!(this_present_orders && that_present_orders))
        return false;
      if (!this.orders.equals(that.orders))
        return false;
    }

    boolean this_present_orderItems = true && this.isSetOrderItems();
    boolean that_present_orderItems = true && that.isSetOrderItems();
    if (this_present_orderItems || that_present_orderItems) {
      if (!(this_present_orderItems && that_present_orderItems))
        return false;
      if (!this.orderItems.equals(that.orderItems))
        return false;
    }

    boolean this_present_coupons = true && this.isSetCoupons();
    boolean that_present_coupons = true && that.isSetCoupons();
    if (this_present_coupons || that_present_coupons) {
      if (!(this_present_coupons && that_present_coupons))
        return false;
      if (!this.coupons.equals(that.coupons))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_orders = true && (isSetOrders());
    list.add(present_orders);
    if (present_orders)
      list.add(orders);

    boolean present_orderItems = true && (isSetOrderItems());
    list.add(present_orderItems);
    if (present_orderItems)
      list.add(orderItems);

    boolean present_coupons = true && (isSetCoupons());
    list.add(present_coupons);
    if (present_coupons)
      list.add(coupons);

    return list.hashCode();
  }

  @Override
  public int compareTo(TContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrders()).compareTo(other.isSetOrders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orders, other.orders);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderItems()).compareTo(other.isSetOrderItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderItems, other.orderItems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoupons()).compareTo(other.isSetCoupons());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoupons()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coupons, other.coupons);
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
    StringBuilder sb = new StringBuilder("TContent(");
    boolean first = true;

    sb.append("orders:");
    if (this.orders == null) {
      sb.append("null");
    } else {
      sb.append(this.orders);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderItems:");
    if (this.orderItems == null) {
      sb.append("null");
    } else {
      sb.append(this.orderItems);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("coupons:");
    if (this.coupons == null) {
      sb.append("null");
    } else {
      sb.append(this.coupons);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TContentStandardSchemeFactory implements SchemeFactory {
    public TContentStandardScheme getScheme() {
      return new TContentStandardScheme();
    }
  }

  private static class TContentStandardScheme extends StandardScheme<TContent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TContent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.orders = new TOrders();
              struct.orders.read(iprot);
              struct.setOrdersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORDER_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.orderItems = new ArrayList<TOrderItem>(_list32.size);
                TOrderItem _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new TOrderItem();
                  _elem33.read(iprot);
                  struct.orderItems.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setOrderItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUPONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list35 = iprot.readListBegin();
                struct.coupons = new ArrayList<TCoupon>(_list35.size);
                TCoupon _elem36;
                for (int _i37 = 0; _i37 < _list35.size; ++_i37)
                {
                  _elem36 = new TCoupon();
                  _elem36.read(iprot);
                  struct.coupons.add(_elem36);
                }
                iprot.readListEnd();
              }
              struct.setCouponsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TContent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orders != null) {
        oprot.writeFieldBegin(ORDERS_FIELD_DESC);
        struct.orders.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.orderItems != null) {
        oprot.writeFieldBegin(ORDER_ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.orderItems.size()));
          for (TOrderItem _iter38 : struct.orderItems)
          {
            _iter38.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.coupons != null) {
        oprot.writeFieldBegin(COUPONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.coupons.size()));
          for (TCoupon _iter39 : struct.coupons)
          {
            _iter39.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TContentTupleSchemeFactory implements SchemeFactory {
    public TContentTupleScheme getScheme() {
      return new TContentTupleScheme();
    }
  }

  private static class TContentTupleScheme extends TupleScheme<TContent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TContent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOrders()) {
        optionals.set(0);
      }
      if (struct.isSetOrderItems()) {
        optionals.set(1);
      }
      if (struct.isSetCoupons()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOrders()) {
        struct.orders.write(oprot);
      }
      if (struct.isSetOrderItems()) {
        {
          oprot.writeI32(struct.orderItems.size());
          for (TOrderItem _iter40 : struct.orderItems)
          {
            _iter40.write(oprot);
          }
        }
      }
      if (struct.isSetCoupons()) {
        {
          oprot.writeI32(struct.coupons.size());
          for (TCoupon _iter41 : struct.coupons)
          {
            _iter41.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TContent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.orders = new TOrders();
        struct.orders.read(iprot);
        struct.setOrdersIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list42 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.orderItems = new ArrayList<TOrderItem>(_list42.size);
          TOrderItem _elem43;
          for (int _i44 = 0; _i44 < _list42.size; ++_i44)
          {
            _elem43 = new TOrderItem();
            _elem43.read(iprot);
            struct.orderItems.add(_elem43);
          }
        }
        struct.setOrderItemsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.coupons = new ArrayList<TCoupon>(_list45.size);
          TCoupon _elem46;
          for (int _i47 = 0; _i47 < _list45.size; ++_i47)
          {
            _elem46 = new TCoupon();
            _elem46.read(iprot);
            struct.coupons.add(_elem46);
          }
        }
        struct.setCouponsIsSet(true);
      }
    }
  }

}

