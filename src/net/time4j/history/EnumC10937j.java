package net.time4j.history;

import net.time4j.base.C10813c;
import p143hj.AbstractC8064i;

/* renamed from: net.time4j.history.j */
/* loaded from: classes8.dex */
public enum EnumC10937j implements AbstractC8064i {
    BC,
    AD,
    HISPANIC,
    BYZANTINE,
    AB_URBE_CONDITA;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.history.j$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10938a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24295a;

        static {
            int[] iArr = new int[EnumC10937j.values().length];
            f24295a = iArr;
            try {
                iArr[EnumC10937j.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24295a[EnumC10937j.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24295a[EnumC10937j.HISPANIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24295a[EnumC10937j.BYZANTINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24295a[EnumC10937j.AB_URBE_CONDITA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public int m11528a(int i) {
        try {
            int i2 = C10938a.f24295a[ordinal()];
            if (i2 == 1) {
                return C10813c.m12191l(1, i);
            }
            if (i2 == 2) {
                return i;
            }
            if (i2 == 3) {
                return C10813c.m12191l(i, 38);
            }
            if (i2 == 4) {
                return C10813c.m12191l(i, 5508);
            }
            if (i2 == 5) {
                return C10813c.m12191l(i, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m11527b(EnumC10937j jVar, int i) {
        int a = jVar.m11528a(i);
        try {
            int i2 = C10938a.f24295a[ordinal()];
            if (i2 == 1) {
                return C10813c.m12191l(1, a);
            }
            if (i2 == 2) {
                return a;
            }
            if (i2 == 3) {
                return C10813c.m12198e(a, 38);
            }
            if (i2 == 4) {
                return C10813c.m12198e(a, 5508);
            }
            if (i2 == 5) {
                return C10813c.m12198e(a, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i);
        }
    }
}
