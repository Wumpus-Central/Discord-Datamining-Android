package p324rg;

import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p249nh.C11137c;
import p268og.AbstractC11368q0;
import p268og.C11321g0;

/* renamed from: rg.a0 */
/* loaded from: classes8.dex */
public interface AbstractC12585a0 {

    /* renamed from: a */
    public static final C12586a f28289a = C12586a.f28290a;

    /* renamed from: rg.a0$a */
    /* loaded from: classes8.dex */
    public static final class C12586a {

        /* renamed from: a */
        static final /* synthetic */ C12586a f28290a = new C12586a();

        /* renamed from: b */
        private static final C11321g0<AbstractC12585a0> f28291b = new C11321g0<>("PackageViewDescriptorFactory");

        private C12586a() {
        }

        /* renamed from: a */
        public final C11321g0<AbstractC12585a0> m6469a() {
            return f28291b;
        }
    }

    /* renamed from: rg.a0$b */
    /* loaded from: classes8.dex */
    public static final class C12587b implements AbstractC12585a0 {

        /* renamed from: b */
        public static final C12587b f28292b = new C12587b();

        private C12587b() {
        }

        @Override // p324rg.AbstractC12585a0
        /* renamed from: a */
        public AbstractC11368q0 mo6468a(C12649x module, C11137c fqName, AbstractC6944n storageManager) {
            C9971q.m14633g(module, "module");
            C9971q.m14633g(fqName, "fqName");
            C9971q.m14633g(storageManager, "storageManager");
            return new C12637r(module, fqName, storageManager);
        }
    }

    /* renamed from: a */
    AbstractC11368q0 mo6468a(C12649x xVar, C11137c cVar, AbstractC6944n nVar);
}
