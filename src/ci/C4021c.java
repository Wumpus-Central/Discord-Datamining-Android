package ci;

import bi.AbstractC3593q;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p087ei.AbstractC6944n;
import p159ih.C8578m;
import p181jh.C9607a;
import p181jh.C9609c;
import p217lg.AbstractC10413b;
import p249nh.C11137c;
import p268og.AbstractC11327h0;
import p388vh.C13508c;

/* renamed from: ci.c */
/* loaded from: classes8.dex */
public final class C4021c extends AbstractC3593q implements AbstractC10413b {

    /* renamed from: y */
    public static final C4022a f6611y = new C4022a(null);

    /* renamed from: x */
    private final boolean f6612x;

    /* renamed from: ci.c$a */
    /* loaded from: classes8.dex */
    public static final class C4022a {
        private C4022a() {
        }

        public /* synthetic */ C4022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4021c m33072a(C11137c fqName, AbstractC6944n storageManager, AbstractC11327h0 module, InputStream inputStream, boolean z) {
            C9971q.m14633g(fqName, "fqName");
            C9971q.m14633g(storageManager, "storageManager");
            C9971q.m14633g(module, "module");
            C9971q.m14633g(inputStream, "inputStream");
            Pair<C8578m, C9607a> a = C9609c.m15926a(inputStream);
            C8578m a2 = a.m15067a();
            C9607a b = a.m15066b();
            if (a2 != null) {
                return new C4021c(fqName, storageManager, module, a2, b, z, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C9607a.f21283h + ", actual " + b + ". Please update Kotlin");
        }
    }

    private C4021c(C11137c cVar, AbstractC6944n nVar, AbstractC11327h0 h0Var, C8578m mVar, C9607a aVar, boolean z) {
        super(cVar, nVar, h0Var, mVar, aVar, null);
        this.f6612x = z;
    }

    public /* synthetic */ C4021c(C11137c cVar, AbstractC6944n nVar, AbstractC11327h0 h0Var, C8578m mVar, C9607a aVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, h0Var, mVar, aVar, z);
    }

    @Override // p324rg.AbstractC12653z, p324rg.AbstractC12612j
    public String toString() {
        return "builtins package fragment for " + mo6103e() + " from " + C13508c.m3525p(this);
    }
}
