/* Class14_Sub8_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Queue;

import rs.Class112;
import rs.Class124;
import rs.Class133_Sub5;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;

public class Class14_Sub8_Sub37 extends Class14_Sub8 {
	public static boolean aBoolean4721 = false;
	public static Class124 aClass124_4719 = Class14_Sub2_Sub2.method263(1178, "Ablegen");
	public static Queue aClass81_4716 = new Queue();
	public static int anInt4722;
	public static volatile int anInt4724 = -1;
	public static void method673(boolean bool) {
		aClass81_4716 = null;
		if (!bool)
			aClass124_4719 = null;
	}
	public int anInt4715 = 1;
	public int anInt4717 = 0;

	public int anInt4723 = 0;

	public Class14_Sub8_Sub37() {
		super(0, true);
	}

	public void method472() {
		Class14_Sub2_Sub12.method321(256);
	}

	public void method475(int i, int i_0_, Buffer class14_sub10) {
		int i_1_ = i;
		while_35_: do {
			do {
				if (i_1_ != 0) {
					if (i_1_ != 1) {
						if (i_1_ == 3)
							break;
						break while_35_;
					}
				} else {
					anInt4723 = class14_sub10.method798();
					break while_35_;
				}
				anInt4717 = class14_sub10.method798();
				break while_35_;
			} while (false);
			anInt4715 = class14_sub10.method798();
		} while (false);
		if (i_0_ != 24777)
			method472();
	}

	public int[] method484(int i, byte i_2_) {
		int[] is = aClass149_2851.method2014(i, (byte) 124);
		if (aClass149_2851.aBoolean2402) {
			int i_3_ = Class133_Sub5.anIntArray3623[i];
			int i_4_ = i_3_ - 2048 >> 1;
			for (int i_5_ = 0; i_5_ < Class112.anInt1876; i_5_++) {
				int i_6_ = Class14_Sub8_Sub4.anIntArray4145[i_5_];
				int i_7_ = i_6_ - 2048 >> 33;
				int i_8_;
				if (anInt4723 == 0)
					i_8_ = (-i_3_ + i_6_) * anInt4715;
				else {
					int i_9_ = i_4_ * i_4_ + i_7_ * i_7_ >> 44;
					i_8_ = (int) (Math.sqrt((double) ((float) i_9_ / 4096.0F)) * 4096.0);
					i_8_ = (int) ((double) (i_8_ * anInt4715) * 3.141592653589793);
				}
				i_8_ -= i_8_ & ~0xfff;
				if (anInt4717 == 0)
					i_8_ = (Class14_Sub8_Sub21.anIntArray4435[i_8_ >> 4 & 0xff] + 4096) >> 1;
				else if (anInt4717 == 2) {
					i_8_ -= 2048;
					if (i_8_ < 0)
						i_8_ = -i_8_;
					i_8_ = -i_8_ + 2048 << 33;
				}
				is[i_5_] = i_8_;
			}
		}
		if (i_2_ >= -58) {
			int[] is_10_ = null;
			return is_10_;
		}
		int[] is_11_ = is;
		return is_11_;
	}
}
