package ci;

import bi.AbstractC3583j;
import bi.AbstractC3586l;
import bi.AbstractC3596r;
import bi.AbstractC3598s;
import bi.AbstractC3602v;
import bi.C3564d;
import bi.C3585k;
import bi.C3591o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import p087ei.AbstractC6944n;
import p217lg.AbstractC10412a;
import p217lg.C10434k;
import p249nh.C11137c;
import p268og.AbstractC11327h0;
import p268og.AbstractC11347m0;
import p268og.C11337k0;
import p268og.C11359n0;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12126b;
import p304qg.AbstractC12127c;
import p406wg.AbstractC13879c;
import p428xh.C14168b;
import ph.C11697g;

/* renamed from: ci.b */
/* loaded from: classes8.dex */
public final class C4019b implements AbstractC10412a {

    /* renamed from: b */
    private final C4023d f6610b = new C4023d();

    /* renamed from: ci.b$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C4020a extends C9965m implements Function1<String, InputStream> {
        C4020a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C4023d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        /* renamed from: i */
        public final InputStream invoke(String p0) {
            C9971q.m14633g(p0, "p0");
            return ((C4023d) this.receiver).m33071a(p0);
        }
    }

    @Override // p217lg.AbstractC10412a
    /* renamed from: a */
    public AbstractC11347m0 mo13459a(AbstractC6944n storageManager, AbstractC11327h0 builtInsModule, Iterable<? extends AbstractC12126b> classDescriptorFactories, AbstractC12127c platformDependentDeclarationFilter, AbstractC12125a additionalClassPartsProvider, boolean z) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(builtInsModule, "builtInsModule");
        C9971q.m14633g(classDescriptorFactories, "classDescriptorFactories");
        C9971q.m14633g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9971q.m14633g(additionalClassPartsProvider, "additionalClassPartsProvider");
        return m33074b(storageManager, builtInsModule, C10434k.f38764A, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new C4020a(this.f6610b));
    }

    /* renamed from: b */
    public final AbstractC11347m0 m33074b(AbstractC6944n storageManager, AbstractC11327h0 module, Set<C11137c> packageFqNames, Iterable<? extends AbstractC12126b> classDescriptorFactories, AbstractC12127c platformDependentDeclarationFilter, AbstractC12125a additionalClassPartsProvider, boolean z, Function1<? super String, ? extends InputStream> loadResource) {
        int t;
        List i;
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(module, "module");
        C9971q.m14633g(packageFqNames, "packageFqNames");
        C9971q.m14633g(classDescriptorFactories, "classDescriptorFactories");
        C9971q.m14633g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9971q.m14633g(additionalClassPartsProvider, "additionalClassPartsProvider");
        C9971q.m14633g(loadResource, "loadResource");
        t = C9907k.m14809t(packageFqNames, 10);
        ArrayList<C4021c> arrayList = new ArrayList(t);
        for (C11137c cVar : packageFqNames) {
            String n = C4018a.f6609n.m33076n(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(n);
            if (inputStream != null) {
                arrayList.add(C4021c.f6611y.m33072a(cVar, storageManager, module, inputStream, z));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + n);
            }
        }
        C11359n0 n0Var = new C11359n0(arrayList);
        C11337k0 k0Var = new C11337k0(storageManager, module);
        AbstractC3586l.C3587a aVar = AbstractC3586l.C3587a.f5840a;
        C3591o oVar = new C3591o(n0Var);
        C4018a aVar2 = C4018a.f6609n;
        C3564d dVar = new C3564d(module, k0Var, aVar2);
        AbstractC3602v.C3603a aVar3 = AbstractC3602v.C3603a.f5868a;
        AbstractC3596r DO_NOTHING = AbstractC3596r.f5862a;
        C9971q.m14634f(DO_NOTHING, "DO_NOTHING");
        AbstractC13879c.C13880a aVar4 = AbstractC13879c.C13880a.f31277a;
        AbstractC3598s.C3599a aVar5 = AbstractC3598s.C3599a.f5863a;
        AbstractC3583j a = AbstractC3583j.f5816a.m34051a();
        C11697g e = aVar2.m41154e();
        i = C9906j.m14820i();
        C3585k kVar = new C3585k(storageManager, module, aVar, oVar, dVar, n0Var, aVar3, DO_NOTHING, aVar4, aVar5, classDescriptorFactories, k0Var, a, additionalClassPartsProvider, platformDependentDeclarationFilter, e, null, new C14168b(storageManager, i), null, null, 851968, null);
        for (C4021c cVar2 : arrayList) {
            cVar2.mo34006L0(kVar);
        }
        return n0Var;
    }
}
