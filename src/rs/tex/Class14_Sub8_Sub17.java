/* Class14_Sub8_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.awt.Component;
import java.lang.reflect.Method;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.Class1;
import rs.Class112;
import rs.Class118;
import rs.Class124;
import rs.Class126;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub5;
import rs.Class14_Sub21;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub7;
import rs.Class43;
import rs.Class56;
import rs.Class64;
import rs.Class66;
import rs.Class9;
import rs.Class9_Sub1;

public class Class14_Sub8_Sub17 extends Class14_Sub8 {
	public static Class124 aClass124_4359;
	public static Class124 aClass124_4360;
	public static Class124 aClass124_4362;
	public static Class124 aClass124_4363 = Class14_Sub2_Sub2.method263(1178, "Take");
	public static Class124 aClass124_4365;
	public static Class124 aClass124_4368;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4366;
	public static Class9 aClass9_4371;
	public static int anInt4367;
	public static int anInt4377;
	public static int anInt4378;
	public static int anInt4379;
	static {
		aClass124_4362 = Class14_Sub2_Sub2.method263(1178, "mem=");
		aClass124_4360 = Class14_Sub2_Sub2.method263(1178, " (X");
		aClass124_4359 = Class14_Sub2_Sub2.method263(1178, "<col=00ffff>");
		anInt4378 = 0;
		aClass124_4365 = Class14_Sub2_Sub2.method263(1178, "Spieler kann nicht gefunden werden: ");
		aClass124_4368 = aClass124_4363;
	}
	public static void method566(int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		if (Class126.method1741((byte) -101, i_0_))
			Static.method340(Class1.aClass94ArrayArray75[i_0_], bool, i_1_, i, (byte) 125, i_2_);
	}

	public static void method568(int i) {
		Class56.method1240();
		int i_3_ = 0;
		if (i != 4)
			anInt4378 = 6;
		for (/**/; i_3_ < 4; i_3_++)
			Class14_Sub21.aClass32Array3100[i_3_].method1071(true);
		System.gc();
	}

	public static void method569(int i) {
		if (i > -79)
			method568(-112);
		Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(11);
		Class14_Sub2_Sub11.anInt3889 = 1;
		Class9_Sub1.aClass9_2696 = null;
	}

	public static void method570(int i) {
		aClass9_4371 = null;
		if (i != 4)
			method572(null, true);
		aClass124_4359 = null;
		aClass124_4363 = null;
		aClass124_4365 = null;
		aClass124_4362 = null;
		aClass124_4360 = null;
		aClass124_4368 = null;
		aClass14_Sub2_Sub19Array4366 = null;
	}

	public static void method571(boolean bool) {
		if (bool)
			method572(null, true);
		for (int i = 0; Class64.anInt1012 > i; i++) {
			int i_4_ = Class14_Sub2_Sub7.anIntArray3825[i];
			Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_4_];
			int i_5_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte();
			if ((i_5_ & 0x10) != 0)
				i_5_ += (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte() << 40);
			Class118.method1603(1, class133_sub1_sub1, i_5_, i_4_);
		}
	}

	public static void method572(Component component, boolean bool) {
		Method method = Class43.aMethod707;
		if (bool)
			method566(-35, 74, -4, -122, true);
		if (method != null) {
			try {
				method.invoke(component, new Object[] { Boolean.FALSE });
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		component.addKeyListener(Class14_Sub8_Sub9.aClass141_4239);
		component.addFocusListener(Class14_Sub8_Sub9.aClass141_4239);
	}

	public int[] anIntArray4372 = new int[257];

	public int[][] anIntArrayArray4376;

	public Class14_Sub8_Sub17() {
		super(1, false);
	}

	public void method472() {
		if (anIntArrayArray4376 == null)
			method567(true, 1);
		method565(-27458);
	}

	public int[][] method474(int i, int i_6_) {
		if (i_6_ >= -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_7_ = method483(0, (byte) -41, i);
			int[] is_8_ = is[0];
			int[] is_9_ = is[1];
			int[] is_10_ = is[2];
			for (int i_11_ = 0; i_11_ < Class112.anInt1876; i_11_++) {
				int i_12_ = is_7_[i_11_] >> 4;
				if (i_12_ < 0)
					i_12_ = 0;
				if (i_12_ > 256)
					i_12_ = 256;
				i_12_ = anIntArray4372[i_12_];
				is_8_[i_11_] = Class14_Sub8_Sub26.method617(4080, i_12_ >> 44);
				is_9_[i_11_] = Class14_Sub8_Sub26.method617(i_12_ >> 4, 4080);
				is_10_[i_11_] = Class14_Sub8_Sub26.method617(i_12_ << 36, 4080);
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	public void method475(int i, int i_14_, Buffer class14_sub10) {
		if (i_14_ == 24777 && i == 0) {
			int i_15_ = class14_sub10.readUByte();
			if (i_15_ == 0) {
				anIntArrayArray4376 = new int[class14_sub10.readUByte()][4];
				for (int i_16_ = 0; anIntArrayArray4376.length > i_16_; i_16_++) {
					anIntArrayArray4376[i_16_][0] = class14_sub10.readUShort((byte) 115);
					anIntArrayArray4376[i_16_][1] = class14_sub10.readUByte() << 36;
					anIntArrayArray4376[i_16_][2] = class14_sub10.readUByte() << 36;
					anIntArrayArray4376[i_16_][3] = class14_sub10.readUByte() << 4;
				}
			} else
				method567(true, i_15_);
		}
	}

	public void method565(int i) {
		if (i != -27458)
			method567(false, -71);
		int i_17_ = anIntArrayArray4376.length;
		if (i_17_ > 0) {
			for (int i_18_ = 0; i_18_ < 257; i_18_++) {
				int i_19_ = 0;
				int i_20_ = i_18_ << 36;
				for (int i_21_ = 0; i_21_ < i_17_ && anIntArrayArray4376[i_21_][0] <= i_20_; i_21_++)
					i_19_++;
				int i_22_;
				int i_23_;
				int i_24_;
				if (i_19_ >= i_17_) {
					int[] is = anIntArrayArray4376[i_17_ - 1];
					i_24_ = is[3];
					i_23_ = is[2];
					i_22_ = is[1];
				} else {
					int[] is = anIntArrayArray4376[i_19_];
					if (i_19_ > 0) {
						int[] is_25_ = anIntArrayArray4376[i_19_ - 1];
						int i_26_ = (i_20_ - is_25_[0] << 44) / (is[0] - is_25_[0]);
						int i_27_ = -i_26_ + 4096;
						i_22_ = i_27_ * is_25_[1] + i_26_ * is[1] >> 12;
						i_23_ = is_25_[2] * i_27_ + i_26_ * is[2] >> 44;
						i_24_ = i_27_ * is_25_[3] + i_26_ * is[3] >> 12;
					} else {
						i_23_ = is[2];
						i_22_ = is[1];
						i_24_ = is[3];
					}
				}
				i_23_ >>= 4;
				i_24_ >>= 4;
				i_22_ >>= 4;
				if (i_22_ >= 0) {
					if (i_22_ > 255)
						i_22_ = 255;
				} else
					i_22_ = 0;
				if (i_23_ >= 0) {
					if (i_23_ > 255)
						i_23_ = 255;
				} else
					i_23_ = 0;
				if (i_24_ < 0)
					i_24_ = 0;
				else if (i_24_ > 255)
					i_24_ = 255;
				anIntArray4372[i_18_] = Class66.method1294(i_24_, Class66.method1294(i_23_ << 40, i_22_ << 16));
			}
		}
	}

	public void method567(boolean bool, int i) {
		while_84_: do {
			if (i != 0) {
				int i_28_ = i;
				while_83_: do {
					while_82_: do {
						while_81_: do {
							while_80_: do {
								do {
									if (i_28_ != 1) {
										if (i_28_ != 2) {
											if (i_28_ != 3) {
												if (i_28_ != 4) {
													if (i_28_ != 5) {
														if (i_28_ != 6)
															break while_83_;
													} else
														break while_81_;
													break while_82_;
												}
											} else
												break;
											break while_80_;
										}
									} else {
										anIntArrayArray4376 = new int[2][4];
										anIntArrayArray4376[0][0] = 0;
										anIntArrayArray4376[1][0] = 4096;
										anIntArrayArray4376[0][3] = 0;
										anIntArrayArray4376[0][1] = 0;
										anIntArrayArray4376[0][2] = 0;
										anIntArrayArray4376[1][1] = 4096;
										anIntArrayArray4376[1][3] = 4096;
										anIntArrayArray4376[1][2] = 4096;
										break while_84_;
									}
									anIntArrayArray4376 = new int[8][4];
									anIntArrayArray4376[0][0] = 0;
									anIntArrayArray4376[1][0] = 2867;
									anIntArrayArray4376[2][0] = 3072;
									anIntArrayArray4376[0][3] = 2361;
									anIntArrayArray4376[1][3] = 1558;
									anIntArrayArray4376[3][0] = 3276;
									anIntArrayArray4376[4][0] = 3481;
									anIntArrayArray4376[0][1] = 2650;
									anIntArrayArray4376[0][2] = 2602;
									anIntArrayArray4376[5][0] = 3686;
									anIntArrayArray4376[6][0] = 3891;
									anIntArrayArray4376[1][1] = 2313;
									anIntArrayArray4376[7][0] = 4096;
									anIntArrayArray4376[2][3] = 1413;
									anIntArrayArray4376[2][1] = 2618;
									anIntArrayArray4376[3][3] = 947;
									anIntArrayArray4376[4][3] = 722;
									anIntArrayArray4376[5][3] = 1766;
									anIntArrayArray4376[3][1] = 2296;
									anIntArrayArray4376[4][1] = 2072;
									anIntArrayArray4376[6][3] = 915;
									anIntArrayArray4376[5][1] = 2730;
									anIntArrayArray4376[1][2] = 1799;
									anIntArrayArray4376[7][3] = 1140;
									anIntArrayArray4376[2][2] = 1734;
									anIntArrayArray4376[3][2] = 1220;
									anIntArrayArray4376[4][2] = 963;
									anIntArrayArray4376[6][1] = 2232;
									anIntArrayArray4376[7][1] = 1686;
									anIntArrayArray4376[5][2] = 2152;
									anIntArrayArray4376[6][2] = 1060;
									anIntArrayArray4376[7][2] = 1413;
									break while_84_;
								} while (false);
								anIntArrayArray4376 = new int[7][4];
								anIntArrayArray4376[0][2] = 0;
								anIntArrayArray4376[0][3] = 4096;
								anIntArrayArray4376[0][1] = 0;
								anIntArrayArray4376[1][3] = 4096;
								anIntArrayArray4376[1][1] = 0;
								anIntArrayArray4376[2][3] = 0;
								anIntArrayArray4376[0][0] = 0;
								anIntArrayArray4376[3][3] = 0;
								anIntArrayArray4376[1][2] = 4096;
								anIntArrayArray4376[2][2] = 4096;
								anIntArrayArray4376[1][0] = 663;
								anIntArrayArray4376[4][3] = 0;
								anIntArrayArray4376[3][2] = 4096;
								anIntArrayArray4376[2][0] = 1363;
								anIntArrayArray4376[2][1] = 0;
								anIntArrayArray4376[3][1] = 4096;
								anIntArrayArray4376[5][3] = 4096;
								anIntArrayArray4376[6][3] = 4096;
								anIntArrayArray4376[4][2] = 0;
								anIntArrayArray4376[3][0] = 2048;
								anIntArrayArray4376[4][1] = 4096;
								anIntArrayArray4376[4][0] = 2727;
								anIntArrayArray4376[5][2] = 0;
								anIntArrayArray4376[5][0] = 3411;
								anIntArrayArray4376[6][2] = 0;
								anIntArrayArray4376[6][0] = 4096;
								anIntArrayArray4376[5][1] = 4096;
								anIntArrayArray4376[6][1] = 0;
								break while_84_;
							} while (false);
							anIntArrayArray4376 = new int[6][4];
							anIntArrayArray4376[0][1] = 0;
							anIntArrayArray4376[1][1] = 0;
							anIntArrayArray4376[0][0] = 0;
							anIntArrayArray4376[0][3] = 0;
							anIntArrayArray4376[1][0] = 1843;
							anIntArrayArray4376[1][3] = 1493;
							anIntArrayArray4376[2][3] = 2939;
							anIntArrayArray4376[2][1] = 0;
							anIntArrayArray4376[2][0] = 2457;
							anIntArrayArray4376[3][1] = 0;
							anIntArrayArray4376[4][1] = 546;
							anIntArrayArray4376[3][3] = 3565;
							anIntArrayArray4376[0][2] = 0;
							anIntArrayArray4376[3][0] = 2781;
							anIntArrayArray4376[1][2] = 0;
							anIntArrayArray4376[5][1] = 4096;
							anIntArrayArray4376[4][3] = 4031;
							anIntArrayArray4376[4][0] = 3481;
							anIntArrayArray4376[2][2] = 0;
							anIntArrayArray4376[5][3] = 4096;
							anIntArrayArray4376[3][2] = 1124;
							anIntArrayArray4376[4][2] = 3084;
							anIntArrayArray4376[5][0] = 4096;
							anIntArrayArray4376[5][2] = 4096;
							break while_84_;
						} while (false);
						anIntArrayArray4376 = new int[16][4];
						anIntArrayArray4376[0][2] = 192;
						anIntArrayArray4376[1][2] = 449;
						anIntArrayArray4376[0][3] = 321;
						anIntArrayArray4376[2][2] = 690;
						anIntArrayArray4376[0][0] = 0;
						anIntArrayArray4376[1][0] = 155;
						anIntArrayArray4376[2][0] = 389;
						anIntArrayArray4376[3][0] = 671;
						anIntArrayArray4376[0][1] = 80;
						anIntArrayArray4376[4][0] = 897;
						anIntArrayArray4376[3][2] = 995;
						anIntArrayArray4376[4][2] = 1397;
						anIntArrayArray4376[1][1] = 321;
						anIntArrayArray4376[5][0] = 1175;
						anIntArrayArray4376[1][3] = 562;
						anIntArrayArray4376[2][1] = 578;
						anIntArrayArray4376[5][2] = 1429;
						anIntArrayArray4376[6][0] = 1368;
						anIntArrayArray4376[7][0] = 1507;
						anIntArrayArray4376[2][3] = 803;
						anIntArrayArray4376[8][0] = 1736;
						anIntArrayArray4376[9][0] = 2088;
						anIntArrayArray4376[3][3] = 1140;
						anIntArrayArray4376[6][2] = 1461;
						anIntArrayArray4376[10][0] = 2355;
						anIntArrayArray4376[11][0] = 2691;
						anIntArrayArray4376[3][1] = 947;
						anIntArrayArray4376[7][2] = 1525;
						anIntArrayArray4376[4][3] = 1509;
						anIntArrayArray4376[8][2] = 1590;
						anIntArrayArray4376[4][1] = 1285;
						anIntArrayArray4376[5][1] = 1525;
						anIntArrayArray4376[5][3] = 1413;
						anIntArrayArray4376[6][3] = 1333;
						anIntArrayArray4376[12][0] = 3031;
						anIntArrayArray4376[9][2] = 2056;
						anIntArrayArray4376[6][1] = 1734;
						anIntArrayArray4376[13][0] = 3522;
						anIntArrayArray4376[7][3] = 1702;
						anIntArrayArray4376[7][1] = 1413;
						anIntArrayArray4376[8][1] = 1108;
						anIntArrayArray4376[14][0] = 3727;
						anIntArrayArray4376[10][2] = 2586;
						anIntArrayArray4376[9][1] = 1766;
						anIntArrayArray4376[15][0] = 4096;
						anIntArrayArray4376[8][3] = 2056;
						anIntArrayArray4376[11][2] = 3148;
						anIntArrayArray4376[12][2] = 3710;
						anIntArrayArray4376[13][2] = 3421;
						anIntArrayArray4376[14][2] = 3148;
						anIntArrayArray4376[9][3] = 2666;
						anIntArrayArray4376[10][3] = 3276;
						anIntArrayArray4376[11][3] = 3228;
						anIntArrayArray4376[15][2] = 2505;
						anIntArrayArray4376[10][1] = 2409;
						anIntArrayArray4376[11][1] = 3116;
						anIntArrayArray4376[12][1] = 3806;
						anIntArrayArray4376[13][1] = 3437;
						anIntArrayArray4376[12][3] = 3196;
						anIntArrayArray4376[13][3] = 3019;
						anIntArrayArray4376[14][1] = 3116;
						anIntArrayArray4376[15][1] = 2377;
						anIntArrayArray4376[14][3] = 3228;
						anIntArrayArray4376[15][3] = 2746;
						break while_84_;
					} while (false);
					anIntArrayArray4376 = new int[4][4];
					anIntArrayArray4376[0][3] = 0;
					anIntArrayArray4376[0][0] = 2048;
					anIntArrayArray4376[1][0] = 2867;
					anIntArrayArray4376[0][2] = 4096;
					anIntArrayArray4376[1][3] = 0;
					anIntArrayArray4376[2][0] = 3276;
					anIntArrayArray4376[0][1] = 0;
					anIntArrayArray4376[3][0] = 4096;
					anIntArrayArray4376[1][2] = 4096;
					anIntArrayArray4376[2][3] = 0;
					anIntArrayArray4376[3][3] = 0;
					anIntArrayArray4376[1][1] = 4096;
					anIntArrayArray4376[2][2] = 4096;
					anIntArrayArray4376[2][1] = 4096;
					anIntArrayArray4376[3][2] = 0;
					anIntArrayArray4376[3][1] = 4096;
					break while_84_;
				} while (false);
				throw new RuntimeException("Invalid gradient preset");
			}
		} while (false);
		if (!bool)
			aClass124_4360 = null;
	}
}
