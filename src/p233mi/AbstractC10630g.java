package p233mi;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mi.g */
/* loaded from: classes8.dex */
public abstract class AbstractC10630g {

    /* renamed from: a */
    private final boolean f23521a;

    /* renamed from: mi.g$a */
    /* loaded from: classes8.dex */
    public static final class C10631a extends AbstractC10630g {

        /* renamed from: b */
        public static final C10631a f23522b = new C10631a();

        private C10631a() {
            super(false, null);
        }
    }

    /* renamed from: mi.g$b */
    /* loaded from: classes8.dex */
    public static final class C10632b extends AbstractC10630g {

        /* renamed from: b */
        private final String f23523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10632b(String error) {
            super(false, null);
            C9971q.m14633g(error, "error");
            this.f23523b = error;
        }
    }

    /* renamed from: mi.g$c */
    /* loaded from: classes8.dex */
    public static final class C10633c extends AbstractC10630g {

        /* renamed from: b */
        public static final C10633c f23524b = new C10633c();

        private C10633c() {
            super(true, null);
        }
    }

    private AbstractC10630g(boolean z) {
        this.f23521a = z;
    }

    public /* synthetic */ AbstractC10630g(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m12706a() {
        return this.f23521a;
    }
}
