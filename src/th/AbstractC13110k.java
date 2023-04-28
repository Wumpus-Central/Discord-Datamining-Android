package th;

import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.C8036h;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p268og.AbstractC11327h0;

/* renamed from: th.k */
/* loaded from: classes8.dex */
public abstract class AbstractC13110k extends AbstractC13104g<Unit> {

    /* renamed from: b */
    public static final C13111a f29415b = new C13111a(null);

    /* renamed from: th.k$a */
    /* loaded from: classes8.dex */
    public static final class C13111a {
        private C13111a() {
        }

        public /* synthetic */ C13111a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13110k m4588a(String message) {
            C9971q.m14633g(message, "message");
            return new C13112b(message);
        }
    }

    /* renamed from: th.k$b */
    /* loaded from: classes8.dex */
    public static final class C13112b extends AbstractC13110k {

        /* renamed from: c */
        private final String f29416c;

        public C13112b(String message) {
            C9971q.m14633g(message, "message");
            this.f29416c = message;
        }

        /* renamed from: d */
        public C8036h mo4552a(AbstractC11327h0 module) {
            C9971q.m14633g(module, "module");
            return C8039k.m20774d(EnumC8038j.ERROR_CONSTANT_VALUE, this.f29416c);
        }

        @Override // th.AbstractC13104g
        public String toString() {
            return this.f29416c;
        }
    }

    public AbstractC13110k() {
        super(Unit.f22042a);
    }

    /* renamed from: c */
    public Unit mo4590b() {
        throw new UnsupportedOperationException();
    }
}
