/* Class14_Sub8_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub8 extends Class14_Sub8 {
	public int anInt4216 = 4096;

	public int anInt4220 = 0;

	public Class14_Sub8_Sub8() {
		super(1, true);
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_19_ = i;
		do {
			if (i_19_ != 0) {
				if (i_19_ != 1)
					break;
			} else {
				anInt4220 = class14_sub10.readUShort((byte) 111);
				break;
			}
			anInt4216 = class14_sub10.readUShort((byte) 107);
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int[] is_21_ = method483(0, i);
			for (int i_22_ = 0; TexStatic.anInt1876 > i_22_; i_22_++) {
				int i_23_ = is_21_[i_22_];
				is[i_22_] = anInt4220 > i_23_ || anInt4216 < i_23_ ? 0 : 4096;
			}
		}
		int[] is_24_ = is;
		return is_24_;
	}
}
