/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mia.order.tApi;

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

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-16")
public class TParamsGetRedisValue
		implements org.apache.thrift.TBase<TParamsGetRedisValue, TParamsGetRedisValue._Fields>, java.io.Serializable,
		Cloneable, Comparable<TParamsGetRedisValue> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"TParamsGetRedisValue");

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key",
			org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField HASH_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"hashCode", org.apache.thrift.protocol.TType.I32, (short) 2);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new TParamsGetRedisValueStandardSchemeFactory());
		schemes.put(TupleScheme.class, new TParamsGetRedisValueTupleSchemeFactory());
	}

	public String key; // required
	public int hashCode; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		KEY((short) 1, "key"), HASH_CODE((short) 2, "hashCode");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // KEY
				return KEY;
			case 2: // HASH_CODE
				return HASH_CODE;
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
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
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
	private static final int __HASHCODE_ISSET_ID = 0;
	private byte __isset_bitfield = 0;
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.KEY,
				new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.HASH_CODE,
				new org.apache.thrift.meta_data.FieldMetaData("hashCode",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TParamsGetRedisValue.class, metaDataMap);
	}

	public TParamsGetRedisValue() {
	}

	public TParamsGetRedisValue(String key, int hashCode) {
		this();
		this.key = key;
		this.hashCode = hashCode;
		setHashCodeIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public TParamsGetRedisValue(TParamsGetRedisValue other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetKey()) {
			this.key = other.key;
		}
		this.hashCode = other.hashCode;
	}

	public TParamsGetRedisValue deepCopy() {
		return new TParamsGetRedisValue(this);
	}

	@Override
	public void clear() {
		this.key = null;
		setHashCodeIsSet(false);
		this.hashCode = 0;
	}

	public String getKey() {
		return this.key;
	}

	public TParamsGetRedisValue setKey(String key) {
		this.key = key;
		return this;
	}

	public void unsetKey() {
		this.key = null;
	}

	/**
	 * Returns true if field key is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetKey() {
		return this.key != null;
	}

	public void setKeyIsSet(boolean value) {
		if (!value) {
			this.key = null;
		}
	}

	public int getHashCode() {
		return this.hashCode;
	}

	public TParamsGetRedisValue setHashCode(int hashCode) {
		this.hashCode = hashCode;
		setHashCodeIsSet(true);
		return this;
	}

	public void unsetHashCode() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASHCODE_ISSET_ID);
	}

	/**
	 * Returns true if field hashCode is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetHashCode() {
		return EncodingUtils.testBit(__isset_bitfield, __HASHCODE_ISSET_ID);
	}

	public void setHashCodeIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASHCODE_ISSET_ID, value);
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case KEY:
			if (value == null) {
				unsetKey();
			} else {
				setKey((String) value);
			}
			break;

		case HASH_CODE:
			if (value == null) {
				unsetHashCode();
			} else {
				setHashCode((Integer) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case KEY:
			return getKey();

		case HASH_CODE:
			return getHashCode();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case KEY:
			return isSetKey();
		case HASH_CODE:
			return isSetHashCode();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof TParamsGetRedisValue)
			return this.equals((TParamsGetRedisValue) that);
		return false;
	}

	public boolean equals(TParamsGetRedisValue that) {
		if (that == null)
			return false;

		boolean this_present_key = true && this.isSetKey();
		boolean that_present_key = true && that.isSetKey();
		if (this_present_key || that_present_key) {
			if (!(this_present_key && that_present_key))
				return false;
			if (!this.key.equals(that.key))
				return false;
		}

		boolean this_present_hashCode = true;
		boolean that_present_hashCode = true;
		if (this_present_hashCode || that_present_hashCode) {
			if (!(this_present_hashCode && that_present_hashCode))
				return false;
			if (this.hashCode != that.hashCode)
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_key = true && (isSetKey());
		list.add(present_key);
		if (present_key)
			list.add(key);

		boolean present_hashCode = true;
		list.add(present_hashCode);
		if (present_hashCode)
			list.add(hashCode);

		return list.hashCode();
	}

	@Override
	public int compareTo(TParamsGetRedisValue other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetKey()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetHashCode()).compareTo(other.isSetHashCode());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetHashCode()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hashCode, other.hashCode);
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
		StringBuilder sb = new StringBuilder("TParamsGetRedisValue(");
		boolean first = true;

		sb.append("key:");
		if (this.key == null) {
			sb.append("null");
		} else {
			sb.append(this.key);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("hashCode:");
		sb.append(this.hashCode);
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
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java
			// serialization is wacky, and doesn't call the default constructor.
			__isset_bitfield = 0;
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class TParamsGetRedisValueStandardSchemeFactory implements SchemeFactory {
		public TParamsGetRedisValueStandardScheme getScheme() {
			return new TParamsGetRedisValueStandardScheme();
		}
	}

	private static class TParamsGetRedisValueStandardScheme extends StandardScheme<TParamsGetRedisValue> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, TParamsGetRedisValue struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.key = iprot.readString();
						struct.setKeyIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // HASH_CODE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.hashCode = iprot.readI32();
						struct.setHashCodeIsSet(true);
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

			// check for required fields of primitive type, which can't be
			// checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, TParamsGetRedisValue struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.key != null) {
				oprot.writeFieldBegin(KEY_FIELD_DESC);
				oprot.writeString(struct.key);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(HASH_CODE_FIELD_DESC);
			oprot.writeI32(struct.hashCode);
			oprot.writeFieldEnd();
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class TParamsGetRedisValueTupleSchemeFactory implements SchemeFactory {
		public TParamsGetRedisValueTupleScheme getScheme() {
			return new TParamsGetRedisValueTupleScheme();
		}
	}

	private static class TParamsGetRedisValueTupleScheme extends TupleScheme<TParamsGetRedisValue> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, TParamsGetRedisValue struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetKey()) {
				optionals.set(0);
			}
			if (struct.isSetHashCode()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetHashCode()) {
				oprot.writeI32(struct.hashCode);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, TParamsGetRedisValue struct)
				throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				struct.key = iprot.readString();
				struct.setKeyIsSet(true);
			}
			if (incoming.get(1)) {
				struct.hashCode = iprot.readI32();
				struct.setHashCodeIsSet(true);
			}
		}
	}

}