/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mia.api.promotion;

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
/**
 * 阶梯信息结构体
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-23")
public class LadderInfo implements org.apache.thrift.TBase<LadderInfo, LadderInfo._Fields>, java.io.Serializable,
		Cloneable, Comparable<LadderInfo> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"LadderInfo");

	private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id",
			org.apache.thrift.protocol.TType.I32, (short) 1);
	private static final org.apache.thrift.protocol.TField PROMOTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"promotion_id", org.apache.thrift.protocol.TType.I32, (short) 2);
	private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"type", org.apache.thrift.protocol.TType.STRING, (short) 3);
	private static final org.apache.thrift.protocol.TField FULL_MONEY_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"full_money", org.apache.thrift.protocol.TType.I32, (short) 4);
	private static final org.apache.thrift.protocol.TField REDUCE_MONEY_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"reduce_money", org.apache.thrift.protocol.TType.I32, (short) 5);
	private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"update_time", org.apache.thrift.protocol.TType.STRING, (short) 6);
	private static final org.apache.thrift.protocol.TField M_ITEM_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"m_item", org.apache.thrift.protocol.TType.I32, (short) 7);
	private static final org.apache.thrift.protocol.TField N_ITEM_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"n_item", org.apache.thrift.protocol.TType.I32, (short) 8);
	private static final org.apache.thrift.protocol.TField DISCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"discount", org.apache.thrift.protocol.TType.I32, (short) 9);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new LadderInfoStandardSchemeFactory());
		schemes.put(TupleScheme.class, new LadderInfoTupleSchemeFactory());
	}

	public int id; // required
	public int promotion_id; // required
	public String type; // required
	public int full_money; // required
	public int reduce_money; // required
	public String update_time; // required
	public int m_item; // required
	public int n_item; // required
	public int discount; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		ID((short) 1, "id"), PROMOTION_ID((short) 2, "promotion_id"), TYPE((short) 3, "type"), FULL_MONEY((short) 4,
				"full_money"), REDUCE_MONEY((short) 5, "reduce_money"), UPDATE_TIME((short) 6, "update_time"), M_ITEM(
						(short) 7, "m_item"), N_ITEM((short) 8, "n_item"), DISCOUNT((short) 9, "discount");

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
			case 1: // ID
				return ID;
			case 2: // PROMOTION_ID
				return PROMOTION_ID;
			case 3: // TYPE
				return TYPE;
			case 4: // FULL_MONEY
				return FULL_MONEY;
			case 5: // REDUCE_MONEY
				return REDUCE_MONEY;
			case 6: // UPDATE_TIME
				return UPDATE_TIME;
			case 7: // M_ITEM
				return M_ITEM;
			case 8: // N_ITEM
				return N_ITEM;
			case 9: // DISCOUNT
				return DISCOUNT;
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
	private static final int __ID_ISSET_ID = 0;
	private static final int __PROMOTION_ID_ISSET_ID = 1;
	private static final int __FULL_MONEY_ISSET_ID = 2;
	private static final int __REDUCE_MONEY_ISSET_ID = 3;
	private static final int __M_ITEM_ISSET_ID = 4;
	private static final int __N_ITEM_ISSET_ID = 5;
	private static final int __DISCOUNT_ISSET_ID = 6;
	private byte __isset_bitfield = 0;
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.ID,
				new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.PROMOTION_ID,
				new org.apache.thrift.meta_data.FieldMetaData("promotion_id",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.TYPE,
				new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.FULL_MONEY,
				new org.apache.thrift.meta_data.FieldMetaData("full_money",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.REDUCE_MONEY,
				new org.apache.thrift.meta_data.FieldMetaData("reduce_money",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.UPDATE_TIME,
				new org.apache.thrift.meta_data.FieldMetaData("update_time",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.M_ITEM,
				new org.apache.thrift.meta_data.FieldMetaData("m_item", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.N_ITEM,
				new org.apache.thrift.meta_data.FieldMetaData("n_item", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.DISCOUNT,
				new org.apache.thrift.meta_data.FieldMetaData("discount",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LadderInfo.class, metaDataMap);
	}

	public LadderInfo() {
	}

	public LadderInfo(int id, int promotion_id, String type, int full_money, int reduce_money, String update_time,
			int m_item, int n_item, int discount) {
		this();
		this.id = id;
		setIdIsSet(true);
		this.promotion_id = promotion_id;
		setPromotion_idIsSet(true);
		this.type = type;
		this.full_money = full_money;
		setFull_moneyIsSet(true);
		this.reduce_money = reduce_money;
		setReduce_moneyIsSet(true);
		this.update_time = update_time;
		this.m_item = m_item;
		setM_itemIsSet(true);
		this.n_item = n_item;
		setN_itemIsSet(true);
		this.discount = discount;
		setDiscountIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public LadderInfo(LadderInfo other) {
		__isset_bitfield = other.__isset_bitfield;
		this.id = other.id;
		this.promotion_id = other.promotion_id;
		if (other.isSetType()) {
			this.type = other.type;
		}
		this.full_money = other.full_money;
		this.reduce_money = other.reduce_money;
		if (other.isSetUpdate_time()) {
			this.update_time = other.update_time;
		}
		this.m_item = other.m_item;
		this.n_item = other.n_item;
		this.discount = other.discount;
	}

	public LadderInfo deepCopy() {
		return new LadderInfo(this);
	}

	@Override
	public void clear() {
		setIdIsSet(false);
		this.id = 0;
		setPromotion_idIsSet(false);
		this.promotion_id = 0;
		this.type = null;
		setFull_moneyIsSet(false);
		this.full_money = 0;
		setReduce_moneyIsSet(false);
		this.reduce_money = 0;
		this.update_time = null;
		setM_itemIsSet(false);
		this.m_item = 0;
		setN_itemIsSet(false);
		this.n_item = 0;
		setDiscountIsSet(false);
		this.discount = 0;
	}

	public int getId() {
		return this.id;
	}

	public LadderInfo setId(int id) {
		this.id = id;
		setIdIsSet(true);
		return this;
	}

	public void unsetId() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
	}

	/**
	 * Returns true if field id is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetId() {
		return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
	}

	public void setIdIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
	}

	public int getPromotion_id() {
		return this.promotion_id;
	}

	public LadderInfo setPromotion_id(int promotion_id) {
		this.promotion_id = promotion_id;
		setPromotion_idIsSet(true);
		return this;
	}

	public void unsetPromotion_id() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROMOTION_ID_ISSET_ID);
	}

	/**
	 * Returns true if field promotion_id is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetPromotion_id() {
		return EncodingUtils.testBit(__isset_bitfield, __PROMOTION_ID_ISSET_ID);
	}

	public void setPromotion_idIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROMOTION_ID_ISSET_ID, value);
	}

	public String getType() {
		return this.type;
	}

	public LadderInfo setType(String type) {
		this.type = type;
		return this;
	}

	public void unsetType() {
		this.type = null;
	}

	/**
	 * Returns true if field type is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetType() {
		return this.type != null;
	}

	public void setTypeIsSet(boolean value) {
		if (!value) {
			this.type = null;
		}
	}

	public int getFull_money() {
		return this.full_money;
	}

	public LadderInfo setFull_money(int full_money) {
		this.full_money = full_money;
		setFull_moneyIsSet(true);
		return this;
	}

	public void unsetFull_money() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FULL_MONEY_ISSET_ID);
	}

	/**
	 * Returns true if field full_money is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetFull_money() {
		return EncodingUtils.testBit(__isset_bitfield, __FULL_MONEY_ISSET_ID);
	}

	public void setFull_moneyIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FULL_MONEY_ISSET_ID, value);
	}

	public int getReduce_money() {
		return this.reduce_money;
	}

	public LadderInfo setReduce_money(int reduce_money) {
		this.reduce_money = reduce_money;
		setReduce_moneyIsSet(true);
		return this;
	}

	public void unsetReduce_money() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REDUCE_MONEY_ISSET_ID);
	}

	/**
	 * Returns true if field reduce_money is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetReduce_money() {
		return EncodingUtils.testBit(__isset_bitfield, __REDUCE_MONEY_ISSET_ID);
	}

	public void setReduce_moneyIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REDUCE_MONEY_ISSET_ID, value);
	}

	public String getUpdate_time() {
		return this.update_time;
	}

	public LadderInfo setUpdate_time(String update_time) {
		this.update_time = update_time;
		return this;
	}

	public void unsetUpdate_time() {
		this.update_time = null;
	}

	/**
	 * Returns true if field update_time is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetUpdate_time() {
		return this.update_time != null;
	}

	public void setUpdate_timeIsSet(boolean value) {
		if (!value) {
			this.update_time = null;
		}
	}

	public int getM_item() {
		return this.m_item;
	}

	public LadderInfo setM_item(int m_item) {
		this.m_item = m_item;
		setM_itemIsSet(true);
		return this;
	}

	public void unsetM_item() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __M_ITEM_ISSET_ID);
	}

	/**
	 * Returns true if field m_item is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetM_item() {
		return EncodingUtils.testBit(__isset_bitfield, __M_ITEM_ISSET_ID);
	}

	public void setM_itemIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __M_ITEM_ISSET_ID, value);
	}

	public int getN_item() {
		return this.n_item;
	}

	public LadderInfo setN_item(int n_item) {
		this.n_item = n_item;
		setN_itemIsSet(true);
		return this;
	}

	public void unsetN_item() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __N_ITEM_ISSET_ID);
	}

	/**
	 * Returns true if field n_item is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetN_item() {
		return EncodingUtils.testBit(__isset_bitfield, __N_ITEM_ISSET_ID);
	}

	public void setN_itemIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __N_ITEM_ISSET_ID, value);
	}

	public int getDiscount() {
		return this.discount;
	}

	public LadderInfo setDiscount(int discount) {
		this.discount = discount;
		setDiscountIsSet(true);
		return this;
	}

	public void unsetDiscount() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISCOUNT_ISSET_ID);
	}

	/**
	 * Returns true if field discount is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetDiscount() {
		return EncodingUtils.testBit(__isset_bitfield, __DISCOUNT_ISSET_ID);
	}

	public void setDiscountIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISCOUNT_ISSET_ID, value);
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case ID:
			if (value == null) {
				unsetId();
			} else {
				setId((Integer) value);
			}
			break;

		case PROMOTION_ID:
			if (value == null) {
				unsetPromotion_id();
			} else {
				setPromotion_id((Integer) value);
			}
			break;

		case TYPE:
			if (value == null) {
				unsetType();
			} else {
				setType((String) value);
			}
			break;

		case FULL_MONEY:
			if (value == null) {
				unsetFull_money();
			} else {
				setFull_money((Integer) value);
			}
			break;

		case REDUCE_MONEY:
			if (value == null) {
				unsetReduce_money();
			} else {
				setReduce_money((Integer) value);
			}
			break;

		case UPDATE_TIME:
			if (value == null) {
				unsetUpdate_time();
			} else {
				setUpdate_time((String) value);
			}
			break;

		case M_ITEM:
			if (value == null) {
				unsetM_item();
			} else {
				setM_item((Integer) value);
			}
			break;

		case N_ITEM:
			if (value == null) {
				unsetN_item();
			} else {
				setN_item((Integer) value);
			}
			break;

		case DISCOUNT:
			if (value == null) {
				unsetDiscount();
			} else {
				setDiscount((Integer) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case ID:
			return getId();

		case PROMOTION_ID:
			return getPromotion_id();

		case TYPE:
			return getType();

		case FULL_MONEY:
			return getFull_money();

		case REDUCE_MONEY:
			return getReduce_money();

		case UPDATE_TIME:
			return getUpdate_time();

		case M_ITEM:
			return getM_item();

		case N_ITEM:
			return getN_item();

		case DISCOUNT:
			return getDiscount();

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
		case ID:
			return isSetId();
		case PROMOTION_ID:
			return isSetPromotion_id();
		case TYPE:
			return isSetType();
		case FULL_MONEY:
			return isSetFull_money();
		case REDUCE_MONEY:
			return isSetReduce_money();
		case UPDATE_TIME:
			return isSetUpdate_time();
		case M_ITEM:
			return isSetM_item();
		case N_ITEM:
			return isSetN_item();
		case DISCOUNT:
			return isSetDiscount();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof LadderInfo)
			return this.equals((LadderInfo) that);
		return false;
	}

	public boolean equals(LadderInfo that) {
		if (that == null)
			return false;

		boolean this_present_id = true;
		boolean that_present_id = true;
		if (this_present_id || that_present_id) {
			if (!(this_present_id && that_present_id))
				return false;
			if (this.id != that.id)
				return false;
		}

		boolean this_present_promotion_id = true;
		boolean that_present_promotion_id = true;
		if (this_present_promotion_id || that_present_promotion_id) {
			if (!(this_present_promotion_id && that_present_promotion_id))
				return false;
			if (this.promotion_id != that.promotion_id)
				return false;
		}

		boolean this_present_type = true && this.isSetType();
		boolean that_present_type = true && that.isSetType();
		if (this_present_type || that_present_type) {
			if (!(this_present_type && that_present_type))
				return false;
			if (!this.type.equals(that.type))
				return false;
		}

		boolean this_present_full_money = true;
		boolean that_present_full_money = true;
		if (this_present_full_money || that_present_full_money) {
			if (!(this_present_full_money && that_present_full_money))
				return false;
			if (this.full_money != that.full_money)
				return false;
		}

		boolean this_present_reduce_money = true;
		boolean that_present_reduce_money = true;
		if (this_present_reduce_money || that_present_reduce_money) {
			if (!(this_present_reduce_money && that_present_reduce_money))
				return false;
			if (this.reduce_money != that.reduce_money)
				return false;
		}

		boolean this_present_update_time = true && this.isSetUpdate_time();
		boolean that_present_update_time = true && that.isSetUpdate_time();
		if (this_present_update_time || that_present_update_time) {
			if (!(this_present_update_time && that_present_update_time))
				return false;
			if (!this.update_time.equals(that.update_time))
				return false;
		}

		boolean this_present_m_item = true;
		boolean that_present_m_item = true;
		if (this_present_m_item || that_present_m_item) {
			if (!(this_present_m_item && that_present_m_item))
				return false;
			if (this.m_item != that.m_item)
				return false;
		}

		boolean this_present_n_item = true;
		boolean that_present_n_item = true;
		if (this_present_n_item || that_present_n_item) {
			if (!(this_present_n_item && that_present_n_item))
				return false;
			if (this.n_item != that.n_item)
				return false;
		}

		boolean this_present_discount = true;
		boolean that_present_discount = true;
		if (this_present_discount || that_present_discount) {
			if (!(this_present_discount && that_present_discount))
				return false;
			if (this.discount != that.discount)
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_id = true;
		list.add(present_id);
		if (present_id)
			list.add(id);

		boolean present_promotion_id = true;
		list.add(present_promotion_id);
		if (present_promotion_id)
			list.add(promotion_id);

		boolean present_type = true && (isSetType());
		list.add(present_type);
		if (present_type)
			list.add(type);

		boolean present_full_money = true;
		list.add(present_full_money);
		if (present_full_money)
			list.add(full_money);

		boolean present_reduce_money = true;
		list.add(present_reduce_money);
		if (present_reduce_money)
			list.add(reduce_money);

		boolean present_update_time = true && (isSetUpdate_time());
		list.add(present_update_time);
		if (present_update_time)
			list.add(update_time);

		boolean present_m_item = true;
		list.add(present_m_item);
		if (present_m_item)
			list.add(m_item);

		boolean present_n_item = true;
		list.add(present_n_item);
		if (present_n_item)
			list.add(n_item);

		boolean present_discount = true;
		list.add(present_discount);
		if (present_discount)
			list.add(discount);

		return list.hashCode();
	}

	@Override
	public int compareTo(LadderInfo other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetPromotion_id()).compareTo(other.isSetPromotion_id());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPromotion_id()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.promotion_id, other.promotion_id);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetType()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetFull_money()).compareTo(other.isSetFull_money());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetFull_money()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.full_money, other.full_money);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetReduce_money()).compareTo(other.isSetReduce_money());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetReduce_money()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reduce_money, other.reduce_money);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetUpdate_time()).compareTo(other.isSetUpdate_time());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUpdate_time()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update_time, other.update_time);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetM_item()).compareTo(other.isSetM_item());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetM_item()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.m_item, other.m_item);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetN_item()).compareTo(other.isSetN_item());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetN_item()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.n_item, other.n_item);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetDiscount()).compareTo(other.isSetDiscount());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetDiscount()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.discount, other.discount);
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
		StringBuilder sb = new StringBuilder("LadderInfo(");
		boolean first = true;

		sb.append("id:");
		sb.append(this.id);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("promotion_id:");
		sb.append(this.promotion_id);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("type:");
		if (this.type == null) {
			sb.append("null");
		} else {
			sb.append(this.type);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("full_money:");
		sb.append(this.full_money);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("reduce_money:");
		sb.append(this.reduce_money);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("update_time:");
		if (this.update_time == null) {
			sb.append("null");
		} else {
			sb.append(this.update_time);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("m_item:");
		sb.append(this.m_item);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("n_item:");
		sb.append(this.n_item);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("discount:");
		sb.append(this.discount);
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

	private static class LadderInfoStandardSchemeFactory implements SchemeFactory {
		public LadderInfoStandardScheme getScheme() {
			return new LadderInfoStandardScheme();
		}
	}

	private static class LadderInfoStandardScheme extends StandardScheme<LadderInfo> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, LadderInfo struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // ID
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.id = iprot.readI32();
						struct.setIdIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // PROMOTION_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.promotion_id = iprot.readI32();
						struct.setPromotion_idIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // TYPE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.type = iprot.readString();
						struct.setTypeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // FULL_MONEY
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.full_money = iprot.readI32();
						struct.setFull_moneyIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // REDUCE_MONEY
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.reduce_money = iprot.readI32();
						struct.setReduce_moneyIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 6: // UPDATE_TIME
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.update_time = iprot.readString();
						struct.setUpdate_timeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 7: // M_ITEM
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.m_item = iprot.readI32();
						struct.setM_itemIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 8: // N_ITEM
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.n_item = iprot.readI32();
						struct.setN_itemIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 9: // DISCOUNT
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.discount = iprot.readI32();
						struct.setDiscountIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, LadderInfo struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(ID_FIELD_DESC);
			oprot.writeI32(struct.id);
			oprot.writeFieldEnd();
			oprot.writeFieldBegin(PROMOTION_ID_FIELD_DESC);
			oprot.writeI32(struct.promotion_id);
			oprot.writeFieldEnd();
			if (struct.type != null) {
				oprot.writeFieldBegin(TYPE_FIELD_DESC);
				oprot.writeString(struct.type);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(FULL_MONEY_FIELD_DESC);
			oprot.writeI32(struct.full_money);
			oprot.writeFieldEnd();
			oprot.writeFieldBegin(REDUCE_MONEY_FIELD_DESC);
			oprot.writeI32(struct.reduce_money);
			oprot.writeFieldEnd();
			if (struct.update_time != null) {
				oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
				oprot.writeString(struct.update_time);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldBegin(M_ITEM_FIELD_DESC);
			oprot.writeI32(struct.m_item);
			oprot.writeFieldEnd();
			oprot.writeFieldBegin(N_ITEM_FIELD_DESC);
			oprot.writeI32(struct.n_item);
			oprot.writeFieldEnd();
			oprot.writeFieldBegin(DISCOUNT_FIELD_DESC);
			oprot.writeI32(struct.discount);
			oprot.writeFieldEnd();
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class LadderInfoTupleSchemeFactory implements SchemeFactory {
		public LadderInfoTupleScheme getScheme() {
			return new LadderInfoTupleScheme();
		}
	}

	private static class LadderInfoTupleScheme extends TupleScheme<LadderInfo> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, LadderInfo struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetId()) {
				optionals.set(0);
			}
			if (struct.isSetPromotion_id()) {
				optionals.set(1);
			}
			if (struct.isSetType()) {
				optionals.set(2);
			}
			if (struct.isSetFull_money()) {
				optionals.set(3);
			}
			if (struct.isSetReduce_money()) {
				optionals.set(4);
			}
			if (struct.isSetUpdate_time()) {
				optionals.set(5);
			}
			if (struct.isSetM_item()) {
				optionals.set(6);
			}
			if (struct.isSetN_item()) {
				optionals.set(7);
			}
			if (struct.isSetDiscount()) {
				optionals.set(8);
			}
			oprot.writeBitSet(optionals, 9);
			if (struct.isSetId()) {
				oprot.writeI32(struct.id);
			}
			if (struct.isSetPromotion_id()) {
				oprot.writeI32(struct.promotion_id);
			}
			if (struct.isSetType()) {
				oprot.writeString(struct.type);
			}
			if (struct.isSetFull_money()) {
				oprot.writeI32(struct.full_money);
			}
			if (struct.isSetReduce_money()) {
				oprot.writeI32(struct.reduce_money);
			}
			if (struct.isSetUpdate_time()) {
				oprot.writeString(struct.update_time);
			}
			if (struct.isSetM_item()) {
				oprot.writeI32(struct.m_item);
			}
			if (struct.isSetN_item()) {
				oprot.writeI32(struct.n_item);
			}
			if (struct.isSetDiscount()) {
				oprot.writeI32(struct.discount);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, LadderInfo struct)
				throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(9);
			if (incoming.get(0)) {
				struct.id = iprot.readI32();
				struct.setIdIsSet(true);
			}
			if (incoming.get(1)) {
				struct.promotion_id = iprot.readI32();
				struct.setPromotion_idIsSet(true);
			}
			if (incoming.get(2)) {
				struct.type = iprot.readString();
				struct.setTypeIsSet(true);
			}
			if (incoming.get(3)) {
				struct.full_money = iprot.readI32();
				struct.setFull_moneyIsSet(true);
			}
			if (incoming.get(4)) {
				struct.reduce_money = iprot.readI32();
				struct.setReduce_moneyIsSet(true);
			}
			if (incoming.get(5)) {
				struct.update_time = iprot.readString();
				struct.setUpdate_timeIsSet(true);
			}
			if (incoming.get(6)) {
				struct.m_item = iprot.readI32();
				struct.setM_itemIsSet(true);
			}
			if (incoming.get(7)) {
				struct.n_item = iprot.readI32();
				struct.setN_itemIsSet(true);
			}
			if (incoming.get(8)) {
				struct.discount = iprot.readI32();
				struct.setDiscountIsSet(true);
			}
		}
	}

}
