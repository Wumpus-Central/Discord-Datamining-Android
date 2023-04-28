package p324rg;

import fi.AbstractC7299n1;
import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p268og.AbstractC11313e;
import p448yh.AbstractC14411h;

/* renamed from: rg.t */
/* loaded from: classes8.dex */
public abstract class AbstractC12644t implements AbstractC11313e {

    /* renamed from: k */
    public static final C12645a f28457k = new C12645a(null);

    /* renamed from: rg.t$a */
    /* loaded from: classes8.dex */
    public static final class C12645a {
        private C12645a() {
        }

        public /* synthetic */ C12645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC14411h m6161a(AbstractC11313e eVar, AbstractC7299n1 typeSubstitution, AbstractC7664g kotlinTypeRefiner) {
            AbstractC12644t tVar;
            AbstractC14411h I;
            C9971q.m14633g(eVar, "<this>");
            C9971q.m14633g(typeSubstitution, "typeSubstitution");
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (eVar instanceof AbstractC12644t) {
                tVar = (AbstractC12644t) eVar;
            } else {
                tVar = null;
            }
            if (tVar != null && (I = tVar.mo6163I(typeSubstitution, kotlinTypeRefiner)) != null) {
                return I;
            }
            AbstractC14411h G = eVar.mo6176G(typeSubstitution);
            C9971q.m14634f(G, "this.getMemberScope(\n   …ubstitution\n            )");
            return G;
        }

        /* renamed from: b */
        public final AbstractC14411h m6160b(AbstractC11313e eVar, AbstractC7664g kotlinTypeRefiner) {
            AbstractC12644t tVar;
            AbstractC14411h e0;
            C9971q.m14633g(eVar, "<this>");
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (eVar instanceof AbstractC12644t) {
                tVar = (AbstractC12644t) eVar;
            } else {
                tVar = null;
            }
            if (tVar != null && (e0 = tVar.mo6117e0(kotlinTypeRefiner)) != null) {
                return e0;
            }
            AbstractC14411h U = eVar.mo6169U();
            C9971q.m14634f(U, "this.unsubstitutedMemberScope");
            return U;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public abstract AbstractC14411h mo6163I(AbstractC7299n1 n1Var, AbstractC7664g gVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract AbstractC14411h mo6117e0(AbstractC7664g gVar);
}
