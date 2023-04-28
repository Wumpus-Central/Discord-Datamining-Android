package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.C1243i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.f */
/* loaded from: classes.dex */
public final class C2364f {
    /* renamed from: a */
    private static C2365a m37996a(C2365a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C2365a(i, i3, i2);
        }
        return new C2365a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m37995b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C1243i.f35049A);
            float f = C2379l.m37954f(k, xmlPullParser, "startX", C1243i.f35058J, 0.0f);
            float f2 = C2379l.m37954f(k, xmlPullParser, "startY", C1243i.f35059K, 0.0f);
            float f3 = C2379l.m37954f(k, xmlPullParser, "endX", C1243i.f35060L, 0.0f);
            float f4 = C2379l.m37954f(k, xmlPullParser, "endY", C1243i.f35061M, 0.0f);
            float f5 = C2379l.m37954f(k, xmlPullParser, "centerX", C1243i.f35053E, 0.0f);
            float f6 = C2379l.m37954f(k, xmlPullParser, "centerY", C1243i.f35054F, 0.0f);
            int g = C2379l.m37953g(k, xmlPullParser, "type", C1243i.f35052D, 0);
            int b = C2379l.m37958b(k, xmlPullParser, "startColor", C1243i.f35050B, 0);
            boolean j = C2379l.m37950j(xmlPullParser, "centerColor");
            int b2 = C2379l.m37958b(k, xmlPullParser, "centerColor", C1243i.f35057I, 0);
            int b3 = C2379l.m37958b(k, xmlPullParser, "endColor", C1243i.f35051C, 0);
            int g2 = C2379l.m37953g(k, xmlPullParser, "tileMode", C1243i.f35056H, 0);
            float f7 = C2379l.m37954f(k, xmlPullParser, "gradientRadius", C1243i.f35055G, 0.0f);
            k.recycle();
            C2365a a = m37996a(m37994c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g != 1) {
                if (g != 2) {
                    return new LinearGradient(f, f2, f3, f4, a.f3297a, a.f3298b, m37993d(g2));
                }
                return new SweepGradient(f5, f6, a.f3297a, a.f3298b);
            } else if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, a.f3297a, a.f3298b, m37993d(g2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.C2364f.C2365a m37994c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p002a1.C1243i.f35062N
            android.content.res.TypedArray r3 = androidx.core.content.res.C2379l.m37949k(r9, r12, r11, r3)
            int r5 = p002a1.C1243i.f35063O
            boolean r6 = r3.hasValue(r5)
            int r7 = p002a1.C1243i.f35064P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C2364f.m37994c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m37993d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: classes.dex */
    public static final class C2365a {

        /* renamed from: a */
        final int[] f3297a;

        /* renamed from: b */
        final float[] f3298b;

        C2365a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3297a = new int[size];
            this.f3298b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f3297a[i] = list.get(i).intValue();
                this.f3298b[i] = list2.get(i).floatValue();
            }
        }

        C2365a(int i, int i2) {
            this.f3297a = new int[]{i, i2};
            this.f3298b = new float[]{0.0f, 1.0f};
        }

        C2365a(int i, int i2, int i3) {
            this.f3297a = new int[]{i, i2, i3};
            this.f3298b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
