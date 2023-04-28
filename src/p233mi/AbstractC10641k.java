package p233mi;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p233mi.AbstractC10628f;
import p268og.AbstractC11397y;

/* renamed from: mi.k */
/* loaded from: classes8.dex */
public abstract class AbstractC10641k implements AbstractC10628f {

    /* renamed from: a */
    private final String f23536a;

    /* renamed from: mi.k$a */
    /* loaded from: classes8.dex */
    public static final class C10642a extends AbstractC10641k {

        /* renamed from: b */
        public static final C10642a f23537b = new C10642a();

        private C10642a() {
            super("must be a member function", null);
        }

        @Override // p233mi.AbstractC10628f
        /* renamed from: a */
        public boolean mo12674a(AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo6266J() != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: mi.k$b */
    /* loaded from: classes8.dex */
    public static final class C10643b extends AbstractC10641k {

        /* renamed from: b */
        public static final C10643b f23538b = new C10643b();

        private C10643b() {
            super("must be a member or an extension function", null);
        }

        @Override // p233mi.AbstractC10628f
        /* renamed from: a */
        public boolean mo12674a(AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo6266J() == null && functionDescriptor.mo6264M() == null) {
                return false;
            }
            return true;
        }
    }

    private AbstractC10641k(String str) {
        this.f23536a = str;
    }

    public /* synthetic */ AbstractC10641k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: b */
    public String mo12675b(AbstractC11397y yVar) {
        return AbstractC10628f.C10629a.m12707a(this, yVar);
    }

    @Override // p233mi.AbstractC10628f
    public String getDescription() {
        return this.f23536a;
    }
}
