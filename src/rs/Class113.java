/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub12;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Static;

public class Class113 {
	public static int anInt1879;
	public static int anInt1881 = 0;
	static {
		anInt1879 = 0;
	}
	public static void method1580() {
		Class64.anInt1012 = 0;
		Class14_Sub8_Sub10.anInt4255 = 0;
		Class59.method1262();
		Static.method1131(-128);
		Class125_Sub1.method1728((byte) 22);
		Class14_Sub8_Sub17.method571(false);
		for (int i = 0; Class14_Sub8_Sub10.anInt4255 > i; i++) {
			int i_0_ = Class36.anIntArray626[i];
			if (Class14_Sub2_Sub20.anInt4064 != (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_].anInt3447)) {
				if ((Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_].anInt4917) > 0)
					Class14_Sub8_Sub14.method551((Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_]), -574);
				Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_] = null;
			}
		}
		if (Class14_Sub8_Sub12.anInt4280 != Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position)
			throw new RuntimeException(
					new StringBuilder("gpp1 pos:").append(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position)
							.append(" psize:").append(Class14_Sub8_Sub12.anInt4280).toString());
		for (int i = 0; i < Static2.anInt2878; i++) {
			if ((Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i]]) == null)
				throw new RuntimeException(new StringBuilder("gpp2 pos:").append(i).append(" size:")
						.append(Static2.anInt2878).toString());
		}
	}
	public static boolean method1581(int vaar0) {
		label42: {
			label41: {
				boolean var5;
				try {
					if (Class14_Sub2_Sub11.anInt3889 != 2) {
						break label42;
					}

					if (Class14_Sub9_Sub1.aClass14_Sub16_4780 == null) {
						Class14_Sub9_Sub1.aClass14_Sub16_4780 = Class14_Sub16.method875(Class9_Sub1.aClass9_2696,
								Class38.anInt2624, Static.anInt3930);
						if (Class14_Sub9_Sub1.aClass14_Sub16_4780 == null) {
							var5 = false;
							return var5;
						}
					}
				} catch (Exception var4) {
					break label41;
				}

				try {
					if (Static.aClass120_854 == null) {
						Static.aClass120_854 = new Class120(Static2.aClass9_3945, Class44.aClass9_725);
					}

					if (Class133_Sub5.aClass14_Sub9_Sub1_3625.method706(22050, Class14_Sub9_Sub1.aClass14_Sub16_4780,
							-67, Class59.aClass9_957, Static.aClass120_854)) {
						Class133_Sub5.aClass14_Sub9_Sub1_3625.method715(-22255);
						Class133_Sub5.aClass14_Sub9_Sub1_3625.method710(-28225, Static.anInt1132);
						Class133_Sub5.aClass14_Sub9_Sub1_3625.method719(0, Class35.aBoolean593,
								Class14_Sub9_Sub1.aClass14_Sub16_4780);
						Class9_Sub1.aClass9_2696 = null;
						Class14_Sub2_Sub11.anInt3889 = 0;
						Static.aClass120_854 = null;
						Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
						var5 = true;
						return var5;
					}
					break label42;
				} catch (Exception var3) {
					;
				}
			}

			Exception var1 = new Exception();
			var1.printStackTrace();
			Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(75);
			Static.aClass120_854 = null;
			Class14_Sub2_Sub11.anInt3889 = 0;
			Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
			Class9_Sub1.aClass9_2696 = null;
		}
		return false;
	}
	
	public Class133 aClass133_1877;
	public Class133 aClass133_1884;
	public long aLong1887 = 0L;
	public int anInt1878;
	public int anInt1880;

	public int anInt1882;

	public int anInt1886;

	public int anInt1888;
}