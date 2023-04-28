package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;

/* renamed from: net.time4j.calendar.c */
/* loaded from: classes8.dex */
public final class C10836c extends C10860o {

    /* renamed from: A */
    private static final C10836c[] f38878A;
    private static final long serialVersionUID = 4908662352833192131L;

    /* renamed from: net.time4j.calendar.c$a */
    /* loaded from: classes8.dex */
    class C10837a extends AbstractC10849j {

        /* renamed from: a */
        final /* synthetic */ int f24034a;

        C10837a(int i) {
            this.f24034a = i;
        }

        @Override // net.time4j.calendar.AbstractC10849j
        /* renamed from: d */
        public int mo12013d() {
            return (((this.f24034a - 1) * 60) + C10836c.this.getNumber()) - 1;
        }
    }

    static {
        C10836c[] cVarArr = new C10836c[60];
        int i = 0;
        while (i < 60) {
            int i2 = i + 1;
            cVarArr[i] = new C10836c(i2);
            i = i2;
        }
        f38878A = cVarArr;
    }

    private C10836c(int i) {
        super(i);
    }

    /* renamed from: n */
    public static C10836c m12108n(int i) {
        if (i >= 1 && i <= 60) {
            return f38878A[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static C10836c m12107o(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z) {
        C10860o k = C10860o.m11968k(charSequence, parsePosition, locale, z);
        if (k == null) {
            return null;
        }
        return m12108n(k.getNumber());
    }

    /* renamed from: m */
    public AbstractC10849j m12109m(int i) {
        if (i >= 1) {
            return new C10837a(i);
        }
        throw new IllegalArgumentException("Cycle number must not be smaller than 1: " + i);
    }

    @Override // net.time4j.calendar.C10860o
    Object readResolve() {
        return m12108n(super.getNumber());
    }
}
