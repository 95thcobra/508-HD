/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Class52;
import com.jagex.rt4.AthmosphericEffects;

import rs.tex.Static;

public class Class62 {
	public static int anInt988 = 0;
	public static Buffer aClass14_Sub10_989;
	public static int anInt990 = 0;
	public static Class52 aClass52_991 = new Class52(30);
	public static int[] anIntArray992;
	public static Class9 aClass9_993;
	public static Class124 aClass124_994 = Class14_Sub2_Sub2.method263(1178, ":");
	public static Class124 aClass124_995 = Class14_Sub2_Sub2.method263(1178, "k");

	public static void method1274(int i) {
		aClass52_991 = null;
		aClass124_994 = null;
		anIntArray992 = null;
		aClass124_995 = null;
		if (i > 33) {
			aClass9_993 = null;
			aClass14_Sub10_989 = null;
		}
	}

	public static void method1275(int i, int i_0_, int i_1_) {
		Class82.anInt1330 = Class150.aClass71ArrayArray2421[i][i_0_].anInt1087;
		Class49.anInt815 = Class150.aClass71ArrayArray2421[i][i_0_].anInt1097;
		if (i_1_ == 1) {
			Static.anInt847 = Class150.aClass71ArrayArray2421[i][i_0_].anInt1090;
			AthmosphericEffects.setSunPosition((float) Class82.anInt1330, (float) Class49.anInt815, (float) Static.anInt847);
		}
	}
}
