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
public class TParamsPing implements org.apache.thrift.TBase<TParamsPing, TParamsPing._Fields>, java.io.Serializable,
		Cloneable, Comparable<TParamsPing> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"TParamsPing");

	private static final org.apache.thrift.protocol.TField S_FIELD_DESC = new org.apache.thrift.protocol.TField("s",
			org.apache.thrift.protocol.TType.STRING, (short) 1);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new TParamsPingStandardSchemeFactory());
		schemes.put(TupleScheme.class, new TParamsPingTupleSchemeFactory());
	}

	public String s; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		S((short) 1, "s");

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
			case 1: // S
				return S;
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
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.S,
				new org.apache.thrift.meta_data.FieldMetaData("s", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TParamsPing.class, metaDataMap);
	}

	public TParamsPing() {
	}

	public TParamsPing(String s) {
		this();
		this.s = s;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public TParamsPing(TParamsPing other) {
		if (other.isSetS()) {
			this.s = other.s;
		}
	}

	public TParamsPing deepCopy() {
		return new TParamsPing(this);
	}

	@Override
	public void clear() {
		this.s = null;
	}

	public String getS() {
		return this.s;
	}

	public TParamsPing setS(String s) {
		this.s = s;
		return this;
	}

	public void unsetS() {
		this.s = null;
	}

	/**
	 * Returns true if field s is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetS() {
		return this.s != null;
	}

	public void setSIsSet(boolean value) {
		if (!value) {
			this.s = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case S:
			if (value == null) {
				unsetS();
			} else {
				setS((String) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case S:
			return getS();

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
		case S:
			return isSetS();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof TParamsPing)
			return this.equals((TParamsPing) that);
		return false;
	}

	public boolean equals(TParamsPing that) {
		if (that == null)
			return false;

		boolean this_present_s = true && this.isSetS();
		boolean that_present_s = true && that.isSetS();
		if (this_present_s || that_present_s) {
			if (!(this_present_s && that_present_s))
				return false;
			if (!this.s.equals(that.s))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_s = true && (isSetS());
		list.add(present_s);
		if (present_s)
			list.add(s);

		return list.hashCode();
	}

	@Override
	public int compareTo(TParamsPing other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetS()).compareTo(other.isSetS());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetS()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.s, other.s);
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
		StringBuilder sb = new StringBuilder("TParamsPing(");
		boolean first = true;

		sb.append("s:");
		if (this.s == null) {
			sb.append("null");
		} else {
			sb.append(this.s);
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
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class TParamsPingStandardSchemeFactory implements SchemeFactory {
		public TParamsPingStandardScheme getScheme() {
			return new TParamsPingStandardScheme();
		}
	}

	private static class TParamsPingStandardScheme extends StandardScheme<TParamsPing> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, TParamsPing struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // S
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.s = iprot.readString();
						struct.setSIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, TParamsPing struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.s != null) {
				oprot.writeFieldBegin(S_FIELD_DESC);
				oprot.writeString(struct.s);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class TParamsPingTupleSchemeFactory implements SchemeFactory {
		public TParamsPingTupleScheme getScheme() {
			return new TParamsPingTupleScheme();
		}
	}

	private static class TParamsPingTupleScheme extends TupleScheme<TParamsPing> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, TParamsPing struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetS()) {
				optionals.set(0);
			}
			oprot.writeBitSet(optionals, 1);
			if (struct.isSetS()) {
				oprot.writeString(struct.s);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, TParamsPing struct)
				throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(1);
			if (incoming.get(0)) {
				struct.s = iprot.readString();
				struct.setSIsSet(true);
			}
		}
	}

}
