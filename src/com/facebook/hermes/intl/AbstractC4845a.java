package com.facebook.hermes.intl;

import p129h5.AbstractC7805b;

/* renamed from: com.facebook.hermes.intl.a */
/* loaded from: classes7.dex */
public interface AbstractC4845a {

    /* renamed from: com.facebook.hermes.intl.a$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C0115a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7922a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7923b;

        /* renamed from: c */
        static final /* synthetic */ int[] f7924c;

        static {
            int[] iArr = new int[EnumC4846b.values().length];
            f7924c = iArr;
            try {
                iArr[EnumC4846b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7924c[EnumC4846b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7924c[EnumC4846b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC4848d.values().length];
            f7923b = iArr2;
            try {
                iArr2[EnumC4848d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7923b[EnumC4848d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[EnumC4847c.values().length];
            f7922a = iArr3;
            try {
                iArr3[EnumC4847c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7922a[EnumC4847c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7922a[EnumC4847c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7922a[EnumC4847c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7922a[EnumC4847c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.facebook.hermes.intl.a$b */
    /* loaded from: classes7.dex */
    public enum EnumC4846b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i = C0115a.f7924c[ordinal()];
            if (i == 1) {
                return "upper";
            }
            if (i == 2) {
                return "lower";
            }
            if (i == 3) {
                return "false";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.a$c */
    /* loaded from: classes7.dex */
    public enum EnumC4847c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i = C0115a.f7922a[ordinal()];
            if (i == 1) {
                return "base";
            }
            if (i == 2) {
                return "accent";
            }
            if (i == 3) {
                return "case";
            }
            if (i == 4) {
                return "variant";
            }
            if (i == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.a$d */
    /* loaded from: classes7.dex */
    public enum EnumC4848d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i = C0115a.f7923b[ordinal()];
            if (i == 1) {
                return "sort";
            }
            if (i == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    int mo31563a(String str, String str2);

    /* renamed from: b */
    AbstractC4845a mo31562b(AbstractC7805b<?> bVar);

    /* renamed from: c */
    EnumC4847c mo31561c();

    /* renamed from: d */
    AbstractC4845a mo31560d(boolean z);

    /* renamed from: e */
    AbstractC4845a mo31559e(EnumC4846b bVar);

    /* renamed from: f */
    AbstractC4845a mo31558f(boolean z);

    /* renamed from: g */
    AbstractC4845a mo31557g(EnumC4847c cVar);
}
