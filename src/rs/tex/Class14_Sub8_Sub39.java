/* Class14_Sub8_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;

import rs.Class14_Sub2_Sub3;
import rs.Class7_Sub2;
import rs.JunkTex;

public class Class14_Sub8_Sub39 extends Class14_Sub8 {
	public int anInt4744;

	public int anInt4752 = -1;

	public int anInt4753;

	public int[] anIntArray4743;

	public Class14_Sub8_Sub39() {
		super(0, false);
	}

	@Override
	public int[][] method474(int i, int i_3_) {
		if (i_3_ > -4)
			JunkTex.aShortArray4747 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628 && method679(true)) {
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			int i_7_ = anInt4753 * (anInt4744 == TexStatic.anInt407 ? i : anInt4744 * i / TexStatic.anInt407);
			if (TexStatic.anInt1876 != anInt4753) {
				for (int i_8_ = 0; TexStatic.anInt1876 > i_8_; i_8_++) {
					int i_9_ = i_8_ * anInt4753 / TexStatic.anInt1876;
					int i_10_ = anIntArray4743[i_7_ + i_9_];
					is_6_[i_8_] = JunkTex.method617(255, i_10_) << 36;
					is_5_[i_8_] = JunkTex.method617(i_10_, 65280) >> 36;
					is_4_[i_8_] = JunkTex.method617(16711680, i_10_) >> 44;
				}
			} else {
				for (int i_11_ = 0; TexStatic.anInt1876 > i_11_; i_11_++) {
					int i_12_ = anIntArray4743[i_7_++];
					is_6_[i_11_] = JunkTex.method617(4080, i_12_ << 4);
					is_5_[i_11_] = JunkTex.method617(i_12_, 65280) >> 4;
					is_4_[i_11_] = JunkTex.method617(4080, i_12_ >> 44);
				}
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	@Override
	public void method475(int i, int i_14_, Buffer class14_sub10) {
		if (i_14_ == 24777 && i == 0)
			anInt4752 = class14_sub10.readUShort((byte) 119);
	}

	@Override
	public int method477() {
		int i_15_ = anInt4752;
		return i_15_;
	}

	@Override
	public void method478(int i) {
		super.method478(i);
		anIntArray4743 = null;
	}

	public boolean method679(boolean bool) {
		if (!bool)
			method679(true);
		if (anIntArray4743 != null) {
			boolean bool_16_ = true;
			return bool_16_;
		}
		if (anInt4752 >= 0) {
			Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = Class14_Sub2_Sub3.method269(Class7_Sub2.aClass9_2671, 0,
					anInt4752);
			class14_sub2_sub19_sub1.method404();
			anInt4753 = class14_sub2_sub19_sub1.anInt4035;
			anInt4744 = class14_sub2_sub19_sub1.anInt4042;
			anIntArray4743 = class14_sub2_sub19_sub1.anIntArray5088;
			boolean bool_17_ = true;
			return bool_17_;
		}
		boolean bool_18_ = false;
		return bool_18_;
	}
}
