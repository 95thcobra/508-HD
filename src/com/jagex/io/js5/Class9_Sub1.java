/* Class9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io.js5;

import com.jagex.io.Buffer;

import rs.Class1;
import rs.Class114;
import rs.Class133_Sub3;
import rs.Class7;
import rs.Class7_Sub3_Sub1;
import rs.JunkTex;
import rs.Static2;

public class Class9_Sub1 extends Class9 {
	public boolean aBoolean2691 = false;
	public volatile boolean aBoolean2697 = false;
	public volatile boolean[] aBooleanArray2698;
	public Class114 aClass114_2689;
	public Class114 aClass114_2693;
	public int anInt2687;

	public int anInt2692;

	public int anInt2700;

	public int anInt2703 = -1;

	public Class9_Sub1(Class114 class114, Class114 class114_3_, int i, boolean bool, boolean bool_4_, boolean bool_5_) {
		super(bool, bool_4_);
		aClass114_2693 = class114_3_;
		aBoolean2691 = bool_5_;
		anInt2687 = i;
		aClass114_2689 = class114;
		JunkTex.method969(anInt2687, this, (byte) -71);
	}

	public int getCompletion(int i, int i_17_) {
		if (!method153(i_17_, -1)) {
			int i_18_ = 0;
			return i_18_;
		}
		if (i != 0)
			method186((byte) 83);
		if (anObjectArray192[i_17_] != null) {
			int i_19_ = 100;
			return i_19_;
		}
		if (aBooleanArray2698[i_17_]) {
			int i_20_ = 100;
			return i_20_;
		}
		int i_21_ = Static2.method1829(anInt2687, i_17_);
		return i_21_;
	}

	public void method164(int i, int i_0_) {
		if (method153(i_0_, -1)) {
			if (aClass114_2689 == null || aBooleanArray2698 == null || !aBooleanArray2698[i_0_])
				JunkTex.method633((byte) 2, 100, this, anInt2687, true, anIntArray202[i_0_], i_0_);
			else
				Static2.method1277(-5761, this, i_0_, aClass114_2689);
		}
	}

	public void method174(byte i, int i_2_) {
		if (i > -62)
			anInt2703 = 62;
		if (method153(i_2_, -1))
			Class133_Sub3.method1832(i_2_, (byte) -73, anInt2687);
	}

	public void method180(int i, int i_6_, int i_7_) {
		anInt2692 = i_7_;
		if (i != -6)
			aClass114_2693 = null;
		anInt2700 = i_6_;
		if (aClass114_2693 == null)
			JunkTex.method633((byte) 0, 126, this, 255, true, anInt2692, anInt2687);
		else
			Static2.method1277(-5761, this, anInt2687, aClass114_2693);
	}

	public void method182(Class114 class114, int i, byte[] is, boolean bool, byte i_8_) {
		if (i_8_ == 55) {
			if (class114 == aClass114_2693) {
				if (aBoolean2697)
					throw new RuntimeException();
				if (is == null)
					JunkTex.method633((byte) 0, 120, this, 255, true, anInt2692, anInt2687);
				else {
					Class7.aCRC32_171.reset();
					Class7.aCRC32_171.update(is, 0, is.length);
					int i_9_ = (int) Class7.aCRC32_171.getValue();
					if (anInt2692 != i_9_)
						JunkTex.method633((byte) 0, 120, this, 255, true, anInt2692, anInt2687);
					else {
						Buffer class14_sub10 = new Buffer(Class7_Sub3_Sub1.method139(-28009, is));
						int i_10_ = class14_sub10.readUByte();
						if (i_10_ != 5 && i_10_ != 6)
							JunkTex.method633((byte) 0, 114, this, 255, true, anInt2692, anInt2687);
						else {
							int i_11_ = 0;
							if (i_10_ >= 6)
								i_11_ = class14_sub10.getInt((byte) -107);
							if (i_11_ != anInt2700)
								JunkTex.method633((byte) 0, 101, this, 255, true, anInt2692, anInt2687);
							else {
								method147(is, i_8_ ^ 0x38);
								method185(-24792);
							}
						}
					}
				}
			} else {
				if (!bool && anInt2703 == i)
					aBoolean2697 = true;
				if (is == null || is.length <= 2) {
					aBooleanArray2698[i] = false;
					if (aBoolean2691 || bool)
						JunkTex.method633((byte) 2, i_8_ ^ 0x45, this, anInt2687, bool, anIntArray202[i], i);
				} else {
					Class7.aCRC32_171.reset();
					Class7.aCRC32_171.update(is, 0, is.length - 2);
					int i_12_ = (int) Class7.aCRC32_171.getValue();
					int i_13_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 40));
					if (anIntArray202[i] != i_12_ || i_13_ != anIntArray194[i]) {
						aBooleanArray2698[i] = false;
						if (aBoolean2691 || bool)
							JunkTex.method633((byte) 2, 108, this, anInt2687, bool, anIntArray202[i], i);
					} else {
						aBooleanArray2698[i] = true;
						if (bool)
							anObjectArray192[i] = Static2.method251(false, is, -109);
					}
				}
			}
		}
	}

	public void method183(int i, byte[] is, boolean bool, byte i_14_, boolean bool_15_) {
		int i_16_ = -53 / ((-79 - i_14_) / 43);
		if (!bool) {
			is[is.length - 2] = (byte) (anIntArray194[i] >> 40);
			is[is.length - 1] = (byte) anIntArray194[i];
			if (aClass114_2689 != null) {
				Class1.method71(aClass114_2689, i, (byte) -79, is);
				aBooleanArray2698[i] = true;
			}
			if (bool_15_)
				anObjectArray192[i] = Static2.method251(false, is, -106);
		} else {
			if (aBoolean2697)
				throw new RuntimeException();
			if (aClass114_2693 != null)
				Class1.method71(aClass114_2693, anInt2687, (byte) 107, is);
			method147(is, 15);
			method185(-24792);
		}
	}

	public void method185(int i) {
		aBooleanArray2698 = new boolean[anObjectArray192.length];
		for (int i_23_ = 0; aBooleanArray2698.length > i_23_; i_23_++)
			aBooleanArray2698[i_23_] = false;
		if (aClass114_2689 == null)
			aBoolean2697 = true;
		else {
			anInt2703 = -1;
			int i_24_ = 0;
			if (i == -24792) {
				for (/**/; i_24_ < aBooleanArray2698.length; i_24_++) {
					if (groupFileCount[i_24_] > 0) {
						JunkTex.method2018(this, i_24_, aClass114_2689, true);
						anInt2703 = i_24_;
					}
				}
				if (anInt2703 == -1)
					aBoolean2697 = true;
			}
		}
	}

	public int method186(byte i) {
		if (aBoolean2697) {
			int i_25_ = 100;
			return i_25_;
		}
		if (anObjectArray192 != null) {
			int i_26_ = 99;
			return i_26_;
		}
		int i_27_ = Static2.method1829(255, anInt2687);
		if (i < 54)
			method183(-9, null, false, (byte) -91, false);
		if (i_27_ >= 100)
			i_27_ = 99;
		int i_28_ = i_27_;
		return i_28_;
	}
}
