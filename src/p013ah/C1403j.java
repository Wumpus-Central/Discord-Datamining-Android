package p013ah;

import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6895g;
import p268og.AbstractC11313e;
import p407wh.C13884c;

/* renamed from: ah.j */
/* loaded from: classes8.dex */
public final class C1403j implements AbstractC1402i {

    /* renamed from: a */
    public C13884c f436a;

    @Override // p013ah.AbstractC1402i
    /* renamed from: a */
    public AbstractC11313e mo41162a(AbstractC6895g javaClass) {
        C9971q.m14633g(javaClass, "javaClass");
        return m41161b().m2403b(javaClass);
    }

    /* renamed from: b */
    public final C13884c m41161b() {
        C13884c cVar = this.f436a;
        if (cVar != null) {
            return cVar;
        }
        C9971q.m14615y("resolver");
        return null;
    }

    /* renamed from: c */
    public final void m41160c(C13884c cVar) {
        C9971q.m14633g(cVar, "<set-?>");
        this.f436a = cVar;
    }
}
