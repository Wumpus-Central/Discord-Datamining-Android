package bi;

import kh.C9879g;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import p159ih.C8568i;
import p268og.AbstractC11297a;
import p268og.AbstractC11397y;

/* renamed from: bi.j */
/* loaded from: classes8.dex */
public interface AbstractC3583j {

    /* renamed from: a */
    public static final C3584a f5816a = C3584a.f5817a;

    /* renamed from: bi.j$a */
    /* loaded from: classes8.dex */
    public static final class C3584a {

        /* renamed from: a */
        static final /* synthetic */ C3584a f5817a = new C3584a();

        /* renamed from: b */
        private static final AbstractC3583j f5818b = new C0092a();

        /* renamed from: bi.j$a$a */
        /* loaded from: classes8.dex */
        public static final class C0092a implements AbstractC3583j {
            C0092a() {
            }

            @Override // bi.AbstractC3583j
            /* renamed from: a */
            public Pair mo34050a(C8568i proto, AbstractC11397y ownerFunction, C9879g typeTable, C3566d0 typeDeserializer) {
                C9971q.m14633g(proto, "proto");
                C9971q.m14633g(ownerFunction, "ownerFunction");
                C9971q.m14633g(typeTable, "typeTable");
                C9971q.m14633g(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        private C3584a() {
        }

        /* renamed from: a */
        public final AbstractC3583j m34051a() {
            return f5818b;
        }
    }

    /* renamed from: a */
    Pair<AbstractC11297a.AbstractC0362a<?>, Object> mo34050a(C8568i iVar, AbstractC11397y yVar, C9879g gVar, C3566d0 d0Var);
}
