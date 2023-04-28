package p427xg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xg.g0 */
/* loaded from: classes8.dex */
public enum EnumC14123g0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    

    /* renamed from: l */
    public static final C14124a f31908l = new C14124a(null);

    /* renamed from: k */
    private final String f31913k;

    /* renamed from: xg.g0$a */
    /* loaded from: classes8.dex */
    public static final class C14124a {
        private C14124a() {
        }

        public /* synthetic */ C14124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EnumC14123g0(String str) {
        this.f31913k = str;
    }

    /* renamed from: b */
    public final String m1587b() {
        return this.f31913k;
    }

    /* renamed from: c */
    public final boolean m1586c() {
        return this == IGNORE;
    }

    /* renamed from: d */
    public final boolean m1585d() {
        return this == WARN;
    }
}
