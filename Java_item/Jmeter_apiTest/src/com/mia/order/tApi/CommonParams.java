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
public class CommonParams implements org.apache.thrift.TBase<CommonParams, CommonParams._Fields>, java.io.Serializable,
		Cloneable, Comparable<CommonParams> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"CommonParams");

	private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"requestId", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField CLIENT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"clientVersion", org.apache.thrift.protocol.TType.STRING, (short) 2);
	private static final org.apache.thrift.protocol.TField SERVICE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"serviceVersion", org.apache.thrift.protocol.TType.STRING, (short) 3);
	private static final org.apache.thrift.protocol.TField APP_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"appVersion", org.apache.thrift.protocol.TType.STRING, (short) 4);
	private static final org.apache.thrift.protocol.TField REQUEST_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"requestTimestamp", org.apache.thrift.protocol.TType.DOUBLE, (short) 5);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new CommonParamsStandardSchemeFactory());
		schemes.put(TupleScheme.class, new CommonParamsTupleSchemeFactory());
	}

	public String requestId; // required
	public String clientVersion; // required
	public String serviceVersion; // required
	public String appVersion; // required
	public double requestTimestamp; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		REQUEST_ID((short) 1, "requestId"), CLIENT_VERSION((short) 2, "clientVersion"), SERVICE_VERSION((short) 3,
				"serviceVersion"), APP_VERSION((short) 4,
						"appVersion"), REQUEST_TIMESTAMP((short) 5, "requestTimestamp");

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
			case 1: // REQUEST_ID
				return REQUEST_ID;
			case 2: // CLIENT_VERSION
				return CLIENT_VERSION;
			case 3: // SERVICE_VERSION
				return SERVICE_VERSION;
			case 4: // APP_VERSION
				return APP_VERSION;
			case 5: // REQUEST_TIMESTAMP
				return REQUEST_TIMESTAMP;
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
	private static final int __REQUESTTIMESTAMP_ISSET_ID = 0;
	private byte __isset_bitfield = 0;
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.REQUEST_ID,
				new org.apache.thrift.meta_data.FieldMetaData("requestId",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.CLIENT_VERSION,
				new org.apache.thrift.meta_data.FieldMetaData("clientVersion",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.SERVICE_VERSION,
				new org.apache.thrift.meta_data.FieldMetaData("serviceVersion",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.APP_VERSION,
				new org.apache.thrift.meta_data.FieldMetaData("appVersion",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.REQUEST_TIMESTAMP,
				new org.apache.thrift.meta_data.FieldMetaData("requestTimestamp",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommonParams.class, metaDataMap);
	}

	public CommonParams() {
	}

	public CommonParams(String requestId, String clientVersion, String serviceVersion, String appVersion,
			double requestTimestamp) {
		this();
		this.requestId = requestId;
		this.clientVersion = clientVersion;
		this.serviceVersion = serviceVersion;
		this.appVersion = appVersion;
		this.requestTimestamp = requestTimestamp;
		setRequestTimestampIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public CommonParams(CommonParams other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetRequestId()) {
			this.requestId = other.requestId;
		}
		if (other.isSetClientVersion()) {
			this.clientVersion = other.clientVersion;
		}
		if (other.isSetServiceVersion()) {
			this.serviceVersion = other.serviceVersion;
		}
		if (other.isSetAppVersion()) {
			this.appVersion = other.appVersion;
		}
		this.requestTimestamp = other.requestTimestamp;
	}

	public CommonParams deepCopy() {
		return new CommonParams(this);
	}

	@Override
	public void clear() {
		this.requestId = null;
		this.clientVersion = null;
		this.serviceVersion = null;
		this.appVersion = null;
		setRequestTimestampIsSet(false);
		this.requestTimestamp = 0.0;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public CommonParams setRequestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	public void unsetRequestId() {
		this.requestId = null;
	}

	/**
	 * Returns true if field requestId is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetRequestId() {
		return this.requestId != null;
	}

	public void setRequestIdIsSet(boolean value) {
		if (!value) {
			this.requestId = null;
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public CommonParams setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		return this;
	}

	public void unsetClientVersion() {
		this.clientVersion = null;
	}

	/**
	 * Returns true if field clientVersion is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean isSetClientVersion() {
		return this.clientVersion != null;
	}

	public void setClientVersionIsSet(boolean value) {
		if (!value) {
			this.clientVersion = null;
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public CommonParams setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		return this;
	}

	public void unsetServiceVersion() {
		this.serviceVersion = null;
	}

	/**
	 * Returns true if field serviceVersion is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean isSetServiceVersion() {
		return this.serviceVersion != null;
	}

	public void setServiceVersionIsSet(boolean value) {
		if (!value) {
			this.serviceVersion = null;
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public CommonParams setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		return this;
	}

	public void unsetAppVersion() {
		this.appVersion = null;
	}

	/**
	 * Returns true if field appVersion is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetAppVersion() {
		return this.appVersion != null;
	}

	public void setAppVersionIsSet(boolean value) {
		if (!value) {
			this.appVersion = null;
		}
	}

	public double getRequestTimestamp() {
		return this.requestTimestamp;
	}

	public CommonParams setRequestTimestamp(double requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
		setRequestTimestampIsSet(true);
		return this;
	}

	public void unsetRequestTimestamp() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTTIMESTAMP_ISSET_ID);
	}

	/**
	 * Returns true if field requestTimestamp is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean isSetRequestTimestamp() {
		return EncodingUtils.testBit(__isset_bitfield, __REQUESTTIMESTAMP_ISSET_ID);
	}

	public void setRequestTimestampIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTTIMESTAMP_ISSET_ID, value);
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case REQUEST_ID:
			if (value == null) {
				unsetRequestId();
			} else {
				setRequestId((String) value);
			}
			break;

		case CLIENT_VERSION:
			if (value == null) {
				unsetClientVersion();
			} else {
				setClientVersion((String) value);
			}
			break;

		case SERVICE_VERSION:
			if (value == null) {
				unsetServiceVersion();
			} else {
				setServiceVersion((String) value);
			}
			break;

		case APP_VERSION:
			if (value == null) {
				unsetAppVersion();
			} else {
				setAppVersion((String) value);
			}
			break;

		case REQUEST_TIMESTAMP:
			if (value == null) {
				unsetRequestTimestamp();
			} else {
				setRequestTimestamp((Double) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case REQUEST_ID:
			return getRequestId();

		case CLIENT_VERSION:
			return getClientVersion();

		case SERVICE_VERSION:
			return getServiceVersion();

		case APP_VERSION:
			return getAppVersion();

		case REQUEST_TIMESTAMP:
			return getRequestTimestamp();

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
		case REQUEST_ID:
			return isSetRequestId();
		case CLIENT_VERSION:
			return isSetClientVersion();
		case SERVICE_VERSION:
			return isSetServiceVersion();
		case APP_VERSION:
			return isSetAppVersion();
		case REQUEST_TIMESTAMP:
			return isSetRequestTimestamp();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof CommonParams)
			return this.equals((CommonParams) that);
		return false;
	}

	public boolean equals(CommonParams that) {
		if (that == null)
			return false;

		boolean this_present_requestId = true && this.isSetRequestId();
		boolean that_present_requestId = true && that.isSetRequestId();
		if (this_present_requestId || that_present_requestId) {
			if (!(this_present_requestId && that_present_requestId))
				return false;
			if (!this.requestId.equals(that.requestId))
				return false;
		}

		boolean this_present_clientVersion = true && this.isSetClientVersion();
		boolean that_present_clientVersion = true && that.isSetClientVersion();
		if (this_present_clientVersion || that_present_clientVersion) {
			if (!(this_present_clientVersion && that_present_clientVersion))
				return false;
			if (!this.clientVersion.equals(that.clientVersion))
				return false;
		}

		boolean this_present_serviceVersion = true && this.isSetServiceVersion();
		boolean that_present_serviceVersion = true && that.isSetServiceVersion();
		if (this_present_serviceVersion || that_present_serviceVersion) {
			if (!(this_present_serviceVersion && that_present_serviceVersion))
				return false;
			if (!this.serviceVersion.equals(that.serviceVersion))
				return false;
		}

		boolean this_present_appVersion = true && this.isSetAppVersion();
		boolean that_present_appVersion = true && that.isSetAppVersion();
		if (this_present_appVersion || that_present_appVersion) {
			if (!(this_present_appVersion && that_present_appVersion))
				return false;
			if (!this.appVersion.equals(that.appVersion))
				return false;
		}

		boolean this_present_requestTimestamp = true;
		boolean that_present_requestTimestamp = true;
		if (this_present_requestTimestamp || that_present_requestTimestamp) {
			if (!(this_present_requestTimestamp && that_present_requestTimestamp))
				return false;
			if (this.requestTimestamp != that.requestTimestamp)
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_requestId = true && (isSetRequestId());
		list.add(present_requestId);
		if (present_requestId)
			list.add(requestId);

		boolean present_clientVersion = true && (isSetClientVersion());
		list.add(present_clientVersion);
		if (present_clientVersion)
			list.add(clientVersion);

		boolean present_serviceVersion = true && (isSetServiceVersion());
		list.add(present_serviceVersion);
		if (present_serviceVersion)
			list.add(serviceVersion);

		boolean present_appVersion = true && (isSetAppVersion());
		list.add(present_appVersion);
		if (present_appVersion)
			list.add(appVersion);

		boolean present_requestTimestamp = true;
		list.add(present_requestTimestamp);
		if (present_requestTimestamp)
			list.add(requestTimestamp);

		return list.hashCode();
	}

	@Override
	public int compareTo(CommonParams other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetRequestId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, other.requestId);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetClientVersion()).compareTo(other.isSetClientVersion());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetClientVersion()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientVersion, other.clientVersion);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetServiceVersion()).compareTo(other.isSetServiceVersion());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetServiceVersion()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceVersion, other.serviceVersion);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetAppVersion()).compareTo(other.isSetAppVersion());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAppVersion()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appVersion, other.appVersion);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetRequestTimestamp()).compareTo(other.isSetRequestTimestamp());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetRequestTimestamp()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestTimestamp, other.requestTimestamp);
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
		StringBuilder sb = new StringBuilder("CommonParams(");
		boolean first = true;

		sb.append("requestId:");
		if (this.requestId == null) {
			sb.append("null");
		} else {
			sb.append(this.requestId);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("clientVersion:");
		if (this.clientVersion == null) {
			sb.append("null");
		} else {
			sb.append(this.clientVersion);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("serviceVersion:");
		if (this.serviceVersion == null) {
			sb.append("null");
		} else {
			sb.append(this.serviceVersion);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("appVersion:");
		if (this.appVersion == null) {
			sb.append("null");
		} else {
			sb.append(this.appVersion);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("requestTimestamp:");
		sb.append(this.requestTimestamp);
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

	private static class CommonParamsStandardSchemeFactory implements SchemeFactory {
		public CommonParamsStandardScheme getScheme() {
			return new CommonParamsStandardScheme();
		}
	}

	private static class CommonParamsStandardScheme extends StandardScheme<CommonParams> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, CommonParams struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // REQUEST_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.requestId = iprot.readString();
						struct.setRequestIdIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // CLIENT_VERSION
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.clientVersion = iprot.readString();
						struct.setClientVersionIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // SERVICE_VERSION
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.serviceVersion = iprot.readString();
						struct.setServiceVersionIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // APP_VERSION
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.appVersion = iprot.readString();
						struct.setAppVersionIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // REQUEST_TIMESTAMP
					if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
						struct.requestTimestamp = iprot.readDouble();
						struct.setRequestTimestampIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, CommonParams struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.requestId != null) {
				oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
				oprot.writeString(struct.requestId);
				oprot.writeFieldEnd();
			}
			if (struct.clientVersion != null) {
				oprot.writeFieldBegin(CLIENT_VERSION_FIELD_DESC);
				oprot.writeString(struct.clientVersion);
				oprot.writeFieldEnd();
			}
			if (struct.serviceVersion != null) {
				oprot.writeFieldBegin(SERVICE_VERSION_FIELD_DESC);
				oprot.writeString(struct.serviceVersion);
				oprot.writeFieldEnd();
			}
			if (struct.appVersion != null) {
				oprot.writeFieldBegin(APP_VERSION_FIELD_DESC);
				oprot.writeString(struct.appVersion);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(REQUEST_TIMESTAMP_FIELD_DESC);
			oprot.writeDouble(struct.requestTimestamp);
			oprot.writeFieldEnd();
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class CommonParamsTupleSchemeFactory implements SchemeFactory {
		public CommonParamsTupleScheme getScheme() {
			return new CommonParamsTupleScheme();
		}
	}

	private static class CommonParamsTupleScheme extends TupleScheme<CommonParams> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, CommonParams struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetRequestId()) {
				optionals.set(0);
			}
			if (struct.isSetClientVersion()) {
				optionals.set(1);
			}
			if (struct.isSetServiceVersion()) {
				optionals.set(2);
			}
			if (struct.isSetAppVersion()) {
				optionals.set(3);
			}
			if (struct.isSetRequestTimestamp()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetRequestId()) {
				oprot.writeString(struct.requestId);
			}
			if (struct.isSetClientVersion()) {
				oprot.writeString(struct.clientVersion);
			}
			if (struct.isSetServiceVersion()) {
				oprot.writeString(struct.serviceVersion);
			}
			if (struct.isSetAppVersion()) {
				oprot.writeString(struct.appVersion);
			}
			if (struct.isSetRequestTimestamp()) {
				oprot.writeDouble(struct.requestTimestamp);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, CommonParams struct)
				throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.requestId = iprot.readString();
				struct.setRequestIdIsSet(true);
			}
			if (incoming.get(1)) {
				struct.clientVersion = iprot.readString();
				struct.setClientVersionIsSet(true);
			}
			if (incoming.get(2)) {
				struct.serviceVersion = iprot.readString();
				struct.setServiceVersionIsSet(true);
			}
			if (incoming.get(3)) {
				struct.appVersion = iprot.readString();
				struct.setAppVersionIsSet(true);
			}
			if (incoming.get(4)) {
				struct.requestTimestamp = iprot.readDouble();
				struct.setRequestTimestampIsSet(true);
			}
		}
	}

}
