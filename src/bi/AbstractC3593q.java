package bi;

import java.util.ArrayList;
import java.util.Collection;
import kh.AbstractC9869a;
import kh.C9875d;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p070di.AbstractC6483f;
import p070di.C6504i;
import p087ei.AbstractC6944n;
import p159ih.C8575l;
import p159ih.C8578m;
import p159ih.C8584o;
import p159ih.C8590p;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11327h0;
import p448yh.AbstractC14411h;

/* renamed from: bi.q */
/* loaded from: classes8.dex */
public abstract class AbstractC3593q extends AbstractC3592p {

    /* renamed from: r */
    private final AbstractC9869a f5854r;

    /* renamed from: s */
    private final AbstractC6483f f5855s;

    /* renamed from: t */
    private final C9875d f5856t;

    /* renamed from: u */
    private final C3614y f5857u;

    /* renamed from: v */
    private C8578m f5858v;

    /* renamed from: w */
    private AbstractC14411h f5859w;

    /* renamed from: bi.q$a */
    /* loaded from: classes8.dex */
    static final class C3594a extends AbstractC9973s implements Function1<C11136b, AbstractC11299a1> {
        C3594a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11299a1 invoke(C11136b it) {
            C9971q.m14633g(it, "it");
            AbstractC6483f fVar = AbstractC3593q.this.f5855s;
            if (fVar != null) {
                return fVar;
            }
            AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
            C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
            return NO_SOURCE;
        }
    }

    /* renamed from: bi.q$b */
    /* loaded from: classes8.dex */
    static final class C3595b extends AbstractC9973s implements Function0<Collection<? extends C11142f>> {
        C3595b() {
            super(0);
        }

        /* renamed from: a */
        public final Collection<C11142f> invoke() {
            int t;
            boolean z;
            Collection<C11136b> b = AbstractC3593q.this.mo34007G0().m33978b();
            ArrayList<C11136b> arrayList = new ArrayList();
            for (Object obj : b) {
                C11136b bVar = (C11136b) obj;
                if (bVar.m10806l() || C3579i.f5809c.m34053a().contains(bVar)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            t = C9907k.m14809t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (C11136b bVar2 : arrayList) {
                arrayList2.add(bVar2.m10808j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3593q(C11137c fqName, AbstractC6944n storageManager, AbstractC11327h0 module, C8578m proto, AbstractC9869a metadataVersion, AbstractC6483f fVar) {
        super(fqName, storageManager, module);
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(module, "module");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        this.f5854r = metadataVersion;
        this.f5855s = fVar;
        C8590p P = proto.m19007P();
        C9971q.m14634f(P, "proto.strings");
        C8584o O = proto.m19008O();
        C9971q.m14634f(O, "proto.qualifiedNames");
        C9875d dVar = new C9875d(P, O);
        this.f5856t = dVar;
        this.f5857u = new C3614y(proto, dVar, metadataVersion, new C3594a());
        this.f5858v = proto;
    }

    @Override // bi.AbstractC3592p
    /* renamed from: L0 */
    public void mo34006L0(C3585k components) {
        C9971q.m14633g(components, "components");
        C8578m mVar = this.f5858v;
        if (mVar != null) {
            this.f5858v = null;
            C8575l N = mVar.m19009N();
            C9971q.m14634f(N, "proto.`package`");
            C9875d dVar = this.f5856t;
            AbstractC9869a aVar = this.f5854r;
            AbstractC6483f fVar = this.f5855s;
            this.f5859w = new C6504i(this, N, dVar, aVar, fVar, components, "scope of " + this, new C3595b());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: N0 */
    public C3614y mo34007G0() {
        return this.f5857u;
    }

    @Override // p268og.AbstractC11344l0
    /* renamed from: o */
    public AbstractC14411h mo6298o() {
        AbstractC14411h hVar = this.f5859w;
        if (hVar != null) {
            return hVar;
        }
        C9971q.m14615y("_memberScope");
        return null;
    }
}
