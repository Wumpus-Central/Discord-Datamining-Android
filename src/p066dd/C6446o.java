package p066dd;

import id.C8388a;

/* renamed from: dd.o */
/* loaded from: classes3.dex */
public class C6446o {

    /* renamed from: a */
    private final float f13531a;

    /* renamed from: b */
    private final float f13532b;

    public C6446o(float f, float f2) {
        this.f13531a = f;
        this.f13532b = f2;
    }

    /* renamed from: a */
    private static float m25547a(C6446o oVar, C6446o oVar2, C6446o oVar3) {
        float f = oVar2.f13531a;
        float f2 = oVar2.f13532b;
        return ((oVar3.f13531a - f) * (oVar.f13532b - f2)) - ((oVar3.f13532b - f2) * (oVar.f13531a - f));
    }

    /* renamed from: b */
    public static float m25546b(C6446o oVar, C6446o oVar2) {
        return C8388a.m19878a(oVar.f13531a, oVar.f13532b, oVar2.f13531a, oVar2.f13532b);
    }

    /* renamed from: e */
    public static void m25543e(C6446o[] oVarArr) {
        C6446o oVar;
        C6446o oVar2;
        C6446o oVar3;
        float b = m25546b(oVarArr[0], oVarArr[1]);
        float b2 = m25546b(oVarArr[1], oVarArr[2]);
        float b3 = m25546b(oVarArr[0], oVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            oVar3 = oVarArr[0];
            oVar2 = oVarArr[1];
            oVar = oVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            oVar3 = oVarArr[2];
            oVar2 = oVarArr[0];
            oVar = oVarArr[1];
        } else {
            oVar3 = oVarArr[1];
            oVar2 = oVarArr[0];
            oVar = oVarArr[2];
        }
        if (m25547a(oVar2, oVar3, oVar) < 0.0f) {
            oVar = oVar2;
            oVar2 = oVar;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar3;
        oVarArr[2] = oVar;
    }

    /* renamed from: c */
    public final float m25545c() {
        return this.f13531a;
    }

    /* renamed from: d */
    public final float m25544d() {
        return this.f13532b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6446o) {
            C6446o oVar = (C6446o) obj;
            if (this.f13531a == oVar.f13531a && this.f13532b == oVar.f13532b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f13531a) * 31) + Float.floatToIntBits(this.f13532b);
    }

    public final String toString() {
        return "(" + this.f13531a + ',' + this.f13532b + ')';
    }
}
