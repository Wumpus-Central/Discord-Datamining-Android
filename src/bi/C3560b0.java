package bi;

import kotlin.jvm.internal.C9971q;
import p159ih.EnumC8571j;
import p159ih.EnumC8624x;
import p268og.AbstractC11301b;
import p268og.AbstractC11387u;
import p268og.C11373t;

/* renamed from: bi.b0 */
/* loaded from: classes8.dex */
public final class C3560b0 {

    /* renamed from: bi.b0$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3561a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5779a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5780b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f5781c;

        static {
            int[] iArr = new int[EnumC8571j.values().length];
            try {
                iArr[EnumC8571j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8571j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8571j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8571j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5779a = iArr;
            int[] iArr2 = new int[AbstractC11301b.EnumC11302a.values().length];
            try {
                iArr2[AbstractC11301b.EnumC11302a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AbstractC11301b.EnumC11302a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AbstractC11301b.EnumC11302a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AbstractC11301b.EnumC11302a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f5780b = iArr2;
            int[] iArr3 = new int[EnumC8624x.values().length];
            try {
                iArr3[EnumC8624x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC8624x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC8624x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC8624x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC8624x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[EnumC8624x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f5781c = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC11387u m34101a(C3557a0 a0Var, EnumC8624x xVar) {
        int i;
        C9971q.m14633g(a0Var, "<this>");
        if (xVar == null) {
            i = -1;
        } else {
            i = C3561a.f5781c[xVar.ordinal()];
        }
        switch (i) {
            case 1:
                AbstractC11387u INTERNAL = C11373t.f25298d;
                C9971q.m14634f(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC11387u PRIVATE = C11373t.f25295a;
                C9971q.m14634f(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC11387u PRIVATE_TO_THIS = C11373t.f25296b;
                C9971q.m14634f(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC11387u PROTECTED = C11373t.f25297c;
                C9971q.m14634f(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC11387u PUBLIC = C11373t.f25299e;
                C9971q.m14634f(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC11387u LOCAL = C11373t.f25300f;
                C9971q.m14634f(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC11387u PRIVATE2 = C11373t.f25295a;
                C9971q.m14634f(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    /* renamed from: b */
    public static final AbstractC11301b.EnumC11302a m34100b(C3557a0 a0Var, EnumC8571j jVar) {
        int i;
        C9971q.m14633g(a0Var, "<this>");
        if (jVar == null) {
            i = -1;
        } else {
            i = C3561a.f5779a[jVar.ordinal()];
        }
        if (i == 1) {
            return AbstractC11301b.EnumC11302a.DECLARATION;
        }
        if (i == 2) {
            return AbstractC11301b.EnumC11302a.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return AbstractC11301b.EnumC11302a.DELEGATION;
        }
        if (i != 4) {
            return AbstractC11301b.EnumC11302a.DECLARATION;
        }
        return AbstractC11301b.EnumC11302a.SYNTHESIZED;
    }
}
