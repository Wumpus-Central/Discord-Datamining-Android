package p182ji;

import fi.EnumC7338w1;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;

/* renamed from: ji.q */
/* loaded from: classes8.dex */
public final class C9626q {

    /* renamed from: ji.q$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C9627a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21301a;

        static {
            int[] iArr = new int[EnumC7338w1.values().length];
            try {
                iArr[EnumC7338w1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7338w1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7338w1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21301a = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC9631u m15919a(EnumC7338w1 w1Var) {
        C9971q.m14633g(w1Var, "<this>");
        int i = C9627a.f21301a[w1Var.ordinal()];
        if (i == 1) {
            return EnumC9631u.INV;
        }
        if (i == 2) {
            return EnumC9631u.IN;
        }
        if (i == 3) {
            return EnumC9631u.OUT;
        }
        throw new C11088q();
    }
}
