package p390w;

import androidx.camera.core.C1915r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p390w.C13619k2;
import p390w.C13685v2;

/* renamed from: w.v2 */
/* loaded from: classes.dex */
public final class C13685v2 {

    /* renamed from: a */
    private final String f30559a;

    /* renamed from: b */
    private final Map<String, C13687b> f30560b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.v2$a */
    /* loaded from: classes.dex */
    public interface AbstractC13686a {
        /* renamed from: a */
        boolean mo3035a(C13687b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.v2$b */
    /* loaded from: classes.dex */
    public static final class C13687b {

        /* renamed from: a */
        private final C13619k2 f30561a;

        /* renamed from: b */
        private boolean f30562b = false;

        /* renamed from: c */
        private boolean f30563c = false;

        C13687b(C13619k2 k2Var) {
            this.f30561a = k2Var;
        }

        /* renamed from: a */
        boolean m3034a() {
            return this.f30563c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m3033b() {
            return this.f30562b;
        }

        /* renamed from: c */
        C13619k2 m3032c() {
            return this.f30561a;
        }

        /* renamed from: d */
        void m3031d(boolean z) {
            this.f30563c = z;
        }

        /* renamed from: e */
        void m3030e(boolean z) {
            this.f30562b = z;
        }
    }

    public C13685v2(String str) {
        this.f30559a = str;
    }

    /* renamed from: g */
    private C13687b m3046g(String str, C13619k2 k2Var) {
        C13687b bVar = this.f30560b.get(str);
        if (bVar != null) {
            return bVar;
        }
        C13687b bVar2 = new C13687b(k2Var);
        this.f30560b.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: h */
    private Collection<C13619k2> m3045h(AbstractC13686a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C13687b> entry : this.f30560b.entrySet()) {
            if (aVar == null || aVar.mo3035a(entry.getValue())) {
                arrayList.add(entry.getValue().m3032c());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ boolean m3043j(C13687b bVar) {
        return bVar.m3034a() && bVar.m3033b();
    }

    /* renamed from: c */
    public C13619k2.C13625f m3050c() {
        C13619k2.C13625f fVar = new C13619k2.C13625f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C13687b> entry : this.f30560b.entrySet()) {
            C13687b value = entry.getValue();
            if (value.m3034a() && value.m3033b()) {
                fVar.m3177a(value.m3032c());
                arrayList.add(entry.getKey());
            }
        }
        C1915r1.m39527a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f30559a);
        return fVar;
    }

    /* renamed from: d */
    public Collection<C13619k2> m3049d() {
        return Collections.unmodifiableCollection(m3045h(new AbstractC13686a() { // from class: w.u2
            @Override // p390w.C13685v2.AbstractC13686a
            /* renamed from: a */
            public final boolean mo3035a(C13685v2.C13687b bVar) {
                boolean j;
                j = C13685v2.m3043j(bVar);
                return j;
            }
        }));
    }

    /* renamed from: e */
    public C13619k2.C13625f m3048e() {
        C13619k2.C13625f fVar = new C13619k2.C13625f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C13687b> entry : this.f30560b.entrySet()) {
            C13687b value = entry.getValue();
            if (value.m3033b()) {
                fVar.m3177a(value.m3032c());
                arrayList.add(entry.getKey());
            }
        }
        C1915r1.m39527a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f30559a);
        return fVar;
    }

    /* renamed from: f */
    public Collection<C13619k2> m3047f() {
        return Collections.unmodifiableCollection(m3045h(new AbstractC13686a() { // from class: w.t2
            @Override // p390w.C13685v2.AbstractC13686a
            /* renamed from: a */
            public final boolean mo3035a(C13685v2.C13687b bVar) {
                boolean b;
                b = bVar.m3033b();
                return b;
            }
        }));
    }

    /* renamed from: i */
    public boolean m3044i(String str) {
        if (!this.f30560b.containsKey(str)) {
            return false;
        }
        return this.f30560b.get(str).m3033b();
    }

    /* renamed from: l */
    public void m3041l(String str) {
        this.f30560b.remove(str);
    }

    /* renamed from: m */
    public void m3040m(String str, C13619k2 k2Var) {
        m3046g(str, k2Var).m3031d(true);
    }

    /* renamed from: n */
    public void m3039n(String str, C13619k2 k2Var) {
        m3046g(str, k2Var).m3030e(true);
    }

    /* renamed from: o */
    public void m3038o(String str) {
        if (this.f30560b.containsKey(str)) {
            C13687b bVar = this.f30560b.get(str);
            bVar.m3030e(false);
            if (!bVar.m3034a()) {
                this.f30560b.remove(str);
            }
        }
    }

    /* renamed from: p */
    public void m3037p(String str) {
        if (this.f30560b.containsKey(str)) {
            C13687b bVar = this.f30560b.get(str);
            bVar.m3031d(false);
            if (!bVar.m3033b()) {
                this.f30560b.remove(str);
            }
        }
    }

    /* renamed from: q */
    public void m3036q(String str, C13619k2 k2Var) {
        if (this.f30560b.containsKey(str)) {
            C13687b bVar = new C13687b(k2Var);
            C13687b bVar2 = this.f30560b.get(str);
            bVar.m3030e(bVar2.m3033b());
            bVar.m3031d(bVar2.m3034a());
            this.f30560b.put(str, bVar);
        }
    }
}
