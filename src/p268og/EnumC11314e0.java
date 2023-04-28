package p268og;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: og.e0 */
/* loaded from: classes8.dex */
public enum EnumC11314e0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    

    /* renamed from: k */
    public static final C11315a f25242k = new C11315a(null);

    /* renamed from: og.e0$a */
    /* loaded from: classes8.dex */
    public static final class C11315a {
        private C11315a() {
        }

        public /* synthetic */ C11315a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC11314e0 m10219a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return EnumC11314e0.SEALED;
            }
            if (z2) {
                return EnumC11314e0.ABSTRACT;
            }
            if (z3) {
                return EnumC11314e0.OPEN;
            }
            return EnumC11314e0.FINAL;
        }
    }
}
