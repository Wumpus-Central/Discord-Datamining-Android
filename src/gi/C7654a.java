package gi;

import fi.C7250f1;
import gi.AbstractC7661f;
import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;

/* renamed from: gi.a */
/* loaded from: classes8.dex */
public final class C7654a {
    /* renamed from: a */
    public static final C7250f1 m21780a(boolean z, boolean z2, AbstractC7655b typeSystemContext, AbstractC7661f kotlinTypePreparator, AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(typeSystemContext, "typeSystemContext");
        C9971q.m14633g(kotlinTypePreparator, "kotlinTypePreparator");
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C7250f1(z, z2, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    /* renamed from: b */
    public static /* synthetic */ C7250f1 m21779b(boolean z, boolean z2, AbstractC7655b bVar, AbstractC7661f fVar, AbstractC7664g gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            bVar = C7680q.f16687a;
        }
        if ((i & 8) != 0) {
            fVar = AbstractC7661f.C7662a.f16660a;
        }
        if ((i & 16) != 0) {
            gVar = AbstractC7664g.C7665a.f16661a;
        }
        return m21780a(z, z2, bVar, fVar, gVar);
    }
}
