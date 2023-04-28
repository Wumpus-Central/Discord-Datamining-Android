package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.text.AttributedCharacterIterator;
import p129h5.AbstractC7805b;
import p129h5.C7848j;

/* renamed from: com.facebook.hermes.intl.c */
/* loaded from: classes7.dex */
public interface AbstractC4861c {

    /* renamed from: com.facebook.hermes.intl.c$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C4862a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7999a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8000b;

        /* renamed from: c */
        static final /* synthetic */ int[] f8001c;

        /* renamed from: d */
        static final /* synthetic */ int[] f8002d;

        /* renamed from: e */
        static final /* synthetic */ int[] f8003e;

        /* renamed from: f */
        static final /* synthetic */ int[] f8004f;

        /* renamed from: g */
        static final /* synthetic */ int[] f8005g;

        static {
            int[] iArr = new int[EnumC4864d.values().length];
            f8005g = iArr;
            try {
                iArr[EnumC4864d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8005g[EnumC4864d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0117c.values().length];
            f8004f = iArr2;
            try {
                iArr2[EnumC0117c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8004f[EnumC0117c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8004f[EnumC0117c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8004f[EnumC0117c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EnumC4869i.values().length];
            f8003e = iArr3;
            try {
                iArr3[EnumC4869i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8003e[EnumC4869i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8003e[EnumC4869i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[EnumC4867g.values().length];
            f8002d = iArr4;
            try {
                iArr4[EnumC4867g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8002d[EnumC4867g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8002d[EnumC4867g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8002d[EnumC4867g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[EnumC4863b.values().length];
            f8001c = iArr5;
            try {
                iArr5[EnumC4863b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8001c[EnumC4863b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[EnumC4865e.values().length];
            f8000b = iArr6;
            try {
                iArr6[EnumC4865e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8000b[EnumC4865e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8000b[EnumC4865e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f8000b[EnumC4865e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[EnumC4868h.values().length];
            f7999a = iArr7;
            try {
                iArr7[EnumC4868h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7999a[EnumC4868h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7999a[EnumC4868h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7999a[EnumC4868h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$b */
    /* loaded from: classes7.dex */
    public enum EnumC4863b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f8001c[ordinal()];
            if (i == 1) {
                return "short";
            }
            if (i == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$c */
    /* loaded from: classes7.dex */
    public enum EnumC0117c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        /* renamed from: a */
        public int m31618a() {
            return C4862a.f8004f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f8004f[ordinal()];
            if (i == 1) {
                return "symbol";
            }
            if (i == 2) {
                return "narrowSymbol";
            }
            if (i == 3) {
                return "code";
            }
            if (i == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$d */
    /* loaded from: classes7.dex */
    public enum EnumC4864d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f8005g[ordinal()];
            if (i == 1) {
                return "accounting";
            }
            if (i == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$e */
    /* loaded from: classes7.dex */
    public enum EnumC4865e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f8000b[ordinal()];
            if (i == 1) {
                return "standard";
            }
            if (i == 2) {
                return "scientific";
            }
            if (i == 3) {
                return "engineering";
            }
            if (i == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$f */
    /* loaded from: classes7.dex */
    public enum EnumC4866f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    /* renamed from: com.facebook.hermes.intl.c$g */
    /* loaded from: classes7.dex */
    public enum EnumC4867g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f8002d[ordinal()];
            if (i == 1) {
                return "auto";
            }
            if (i == 2) {
                return ReactScrollViewHelper.OVER_SCROLL_ALWAYS;
            }
            if (i == 3) {
                return ReactScrollViewHelper.OVER_SCROLL_NEVER;
            }
            if (i == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$h */
    /* loaded from: classes7.dex */
    public enum EnumC4868h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        /* renamed from: a */
        public int m31617a(EnumC4865e eVar, EnumC4864d dVar) {
            int i = C4862a.f7999a[ordinal()];
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                if (eVar == EnumC4865e.SCIENTIFIC || eVar == EnumC4865e.ENGINEERING) {
                    return 3;
                }
                return 0;
            } else if (dVar == EnumC4864d.ACCOUNTING) {
                return 7;
            } else {
                if (dVar == EnumC4864d.STANDARD) {
                    return 1;
                }
                throw new C7848j("Unrecognized formatting style requested.");
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f7999a[ordinal()];
            if (i == 1) {
                return "decimal";
            }
            if (i == 2) {
                return "percent";
            }
            if (i == 3) {
                return "currency";
            }
            if (i == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$i */
    /* loaded from: classes7.dex */
    public enum EnumC4869i {
        SHORT,
        NARROW,
        LONG;

        /* renamed from: a */
        public MeasureFormat.FormatWidth m31616a() {
            MeasureFormat.FormatWidth formatWidth;
            MeasureFormat.FormatWidth formatWidth2;
            MeasureFormat.FormatWidth formatWidth3;
            int i = C4862a.f8003e[ordinal()];
            if (i == 2) {
                formatWidth = MeasureFormat.FormatWidth.NARROW;
                return formatWidth;
            } else if (i != 3) {
                formatWidth3 = MeasureFormat.FormatWidth.SHORT;
                return formatWidth3;
            } else {
                formatWidth2 = MeasureFormat.FormatWidth.WIDE;
                return formatWidth2;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C4862a.f8003e[ordinal()];
            if (i == 1) {
                return "short";
            }
            if (i == 2) {
                return "narrow";
            }
            if (i == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    AttributedCharacterIterator mo31535a(double d);

    /* renamed from: b */
    String mo31534b(AbstractC7805b<?> bVar);

    /* renamed from: c */
    String mo31533c(double d);

    /* renamed from: d */
    AbstractC4861c mo31532d(String str, EnumC0117c cVar);

    /* renamed from: e */
    AbstractC4861c mo31531e(EnumC4866f fVar, int i, int i2);

    /* renamed from: f */
    AbstractC4861c mo31530f(int i);

    /* renamed from: g */
    AbstractC4861c mo31529g(boolean z);

    /* renamed from: h */
    AbstractC4861c mo31528h(EnumC4866f fVar, int i, int i2);

    /* renamed from: i */
    AbstractC4861c mo31527i(String str, EnumC4869i iVar);

    /* renamed from: j */
    AbstractC4861c mo31526j(AbstractC7805b<?> bVar, String str, EnumC4868h hVar, EnumC4864d dVar, EnumC4865e eVar, EnumC4863b bVar2);

    /* renamed from: k */
    AbstractC4861c mo31525k(EnumC4867g gVar);

    /* renamed from: l */
    String mo31524l(AttributedCharacterIterator.Attribute attribute, double d);
}
