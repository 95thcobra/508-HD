/* Class14_Sub8_Sub39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import rs.JunkTex;

public class Class14_Sub8_Sub39_Sub1 extends Class14_Sub8_Sub39 {
	@Override
	public int[][] method474(int i, int i_6_) {
		if (i_6_ >= -4)
			JunkTex.method684(-110);
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628 && method679(true)) {
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int i_9_ = i % anInt4744 * anInt4744;
			int[] is_10_ = is[2];
			for (int i_11_ = 0; TexStatic.anInt1876 > i_11_; i_11_++) {
				int i_12_ = anIntArray4743[i_9_ + i_11_ % anInt4753];
				is_10_[i_11_] = JunkTex.method617(4080, i_12_ << 36);
				is_8_[i_11_] = JunkTex.method617(i_12_, 65280) >> 4;
				is_7_[i_11_] = JunkTex.method617(i_12_, 16711680) >> 12;
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}
}
