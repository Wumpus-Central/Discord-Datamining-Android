package tg;

import gh.AbstractC7637r;
import gh.C7618h;
import gh.C7636q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p141hh.C8019a;
import p163j$.util.concurrent.ConcurrentHashMap;
import p249nh.C11136b;
import p249nh.C11137c;
import p324rg.C12623m;
import p407wh.C13885d;
import p448yh.AbstractC14411h;
import p448yh.C14398b;

/* renamed from: tg.a */
/* loaded from: classes8.dex */
public final class C13081a {

    /* renamed from: a */
    private final C7618h f29387a;

    /* renamed from: b */
    private final C13088g f29388b;

    /* renamed from: c */
    private final ConcurrentHashMap<C11136b, AbstractC14411h> f29389c = new ConcurrentHashMap<>();

    public C13081a(C7618h resolver, C13088g kotlinClassFinder) {
        C9971q.m14633g(resolver, "resolver");
        C9971q.m14633g(kotlinClassFinder, "kotlinClassFinder");
        this.f29387a = resolver;
        this.f29388b = kotlinClassFinder;
    }

    /* renamed from: a */
    public final AbstractC14411h m4645a(C13086f fileClass) {
        Collection<AbstractC7637r> collection;
        List D0;
        C9971q.m14633g(fileClass, "fileClass");
        ConcurrentHashMap<C11136b, AbstractC14411h> concurrentHashMap = this.f29389c;
        C11136b k = fileClass.mo4628k();
        AbstractC14411h hVar = concurrentHashMap.get(k);
        if (hVar == null) {
            C11137c h = fileClass.mo4628k().m10810h();
            C9971q.m14634f(h, "fileClass.classId.packageFqName");
            if (fileClass.mo4630d().m20842c() == C8019a.EnumC0249a.MULTIFILE_CLASS) {
                List<String> f = fileClass.mo4630d().m20839f();
                collection = new ArrayList();
                for (String str : f) {
                    C11136b m = C11136b.m10805m(C13885d.m2399d(str).m2398e());
                    C9971q.m14634f(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    AbstractC7637r b = C7636q.m21818b(this.f29388b, m);
                    if (b != null) {
                        collection.add(b);
                    }
                }
            } else {
                collection = C9905i.m14825d(fileClass);
            }
            C12623m mVar = new C12623m(this.f29387a.m21872d().m34034p(), h);
            ArrayList arrayList = new ArrayList();
            for (AbstractC7637r rVar : collection) {
                AbstractC14411h b2 = this.f29387a.m21874b(mVar, rVar);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            D0 = C9914r.m14790D0(arrayList);
            C14398b.C14399a aVar = C14398b.f32579d;
            AbstractC14411h a = aVar.m686a("package " + h + " (" + fileClass + ')', D0);
            AbstractC14411h putIfAbsent = concurrentHashMap.putIfAbsent(k, a);
            if (putIfAbsent == null) {
                hVar = a;
            } else {
                hVar = putIfAbsent;
            }
        }
        C9971q.m14634f(hVar, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return hVar;
    }
}
