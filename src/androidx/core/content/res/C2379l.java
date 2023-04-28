package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.l */
/* loaded from: classes.dex */
public class C2379l {
    /* renamed from: a */
    public static boolean m37959a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m37950j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m37958b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m37950j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m37957c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m37950j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C2357c.m38033d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m37956d(typedValue);
        }
    }

    /* renamed from: d */
    private static ColorStateList m37956d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C2358d m37955e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m37950j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C2358d.m38027b(typedValue.data);
            }
            C2358d g = C2358d.m38022g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C2358d.m38027b(i2);
    }

    /* renamed from: f */
    public static float m37954f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m37950j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m37953g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m37950j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m37952h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m37950j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m37951i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m37950j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m37950j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static TypedArray m37949k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m37948l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m37950j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
