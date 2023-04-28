package net.time4j.calendar;

import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8641j;
import p201kj.C9887b;

/* renamed from: net.time4j.calendar.h */
/* loaded from: classes8.dex */
public final class C10847h implements Comparable<C10847h>, Serializable {

    /* renamed from: k */
    public static final AbstractC8046c<Character> f24053k = C8627a.m18482e("LEAP_MONTH_INDICATOR", Character.class);

    /* renamed from: l */
    public static final AbstractC8046c<Boolean> f24054l = C8627a.m18482e("LEAP_MONTH_IS_TRAILING", Boolean.class);

    /* renamed from: m */
    private static final C10847h[] f24055m;
    private static final long serialVersionUID = 7544059597266533279L;
    private final int index;
    private final boolean leap;

    static {
        C10847h[] hVarArr = new C10847h[24];
        for (int i = 0; i < 12; i++) {
            hVarArr[i] = new C10847h(i, false);
            hVarArr[i + 12] = new C10847h(i, true);
        }
        f24055m = hVarArr;
    }

    private C10847h(int i, boolean z) {
        this.index = i;
        this.leap = z;
    }

    /* renamed from: d */
    public static C10847h m12031d(int i) {
        if (i >= 1 && i <= 12) {
            return f24055m[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    private Object readResolve() {
        int i;
        try {
            C10847h[] hVarArr = f24055m;
            int i2 = this.index;
            if (this.leap) {
                i = 12;
            } else {
                i = 0;
            }
            return hVarArr[i2 + i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    /* renamed from: a */
    public int compareTo(C10847h hVar) {
        int i = this.index;
        int i2 = hVar.index;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (this.leap) {
            return !hVar.leap ? 1 : 0;
        }
        if (hVar.leap) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m12033b(Locale locale, EnumC8641j jVar, AbstractC8048d dVar) {
        StringBuilder sb2;
        Map<String, String> o = C8629b.m18469c("generic", locale).m18457o();
        String a = C9887b.m15077a(jVar, ((Character) dVar.mo15674c(C8627a.f19064m, Character.valueOf(jVar.mo18427j().charAt(0)))).charValue(), getNumber());
        if (!this.leap) {
            return a;
        }
        boolean booleanValue = ((Boolean) dVar.mo15674c(f24054l, Boolean.valueOf("R".equals(o.get("leap-alignment"))))).booleanValue();
        char charValue = ((Character) dVar.mo15674c(f24053k, Character.valueOf(o.get("leap-indicator").charAt(0)))).charValue();
        if (booleanValue) {
            sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append(charValue);
        } else {
            sb2 = new StringBuilder();
            sb2.append(charValue);
            sb2.append(a);
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public boolean m12032c() {
        return this.leap;
    }

    /* renamed from: e */
    public C10847h m12030e() {
        return f24055m[this.index + 12];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10847h)) {
            return false;
        }
        C10847h hVar = (C10847h) obj;
        if (this.index == hVar.index && this.leap == hVar.leap) {
            return true;
        }
        return false;
    }

    public int getNumber() {
        return this.index + 1;
    }

    public int hashCode() {
        return this.index + (this.leap ? 12 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.index + 1);
        if (!this.leap) {
            return valueOf;
        }
        return "*" + valueOf;
    }
}
