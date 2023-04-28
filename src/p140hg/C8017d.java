package p140hg;

import bi.C3604w;
import kh.C9879g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import mh.C10612e;
import mh.C10614f;
import mh.C10619i;
import nf.AbstractC11069g;
import p158ig.C8429h;
import p158ig.C8503p0;
import p158ig.C8505q;
import p159ih.C8568i;
import p159ih.C8608t;
import p268og.AbstractC11404z0;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0004"}, m15073d2 = {"R", "Lnf/g;", "Lkotlin/reflect/KFunction;", "a", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: hg.d */
/* loaded from: classes8.dex */
public final class C8017d {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: hg.d$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C8018a extends C9965m implements Function2<C3604w, C8568i, AbstractC11404z0> {

        /* renamed from: k */
        public static final C8018a f17285k = new C8018a();

        C8018a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C3604w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        /* renamed from: i */
        public final AbstractC11404z0 invoke(C3604w p0, C8568i p1) {
            C9971q.m14633g(p0, "p0");
            C9971q.m14633g(p1, "p1");
            return p0.m33990j(p1);
        }
    }

    /* renamed from: a */
    public static final <R> KFunction<R> m20846a(AbstractC11069g<? extends R> gVar) {
        boolean z;
        C9971q.m14633g(gVar, "<this>");
        Metadata metadata = (Metadata) gVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d1 = metadata.m15074d1();
        boolean z2 = true;
        if (d1.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        Pair<C10614f, C8568i> j = C10619i.m12719j(d1, metadata.m15073d2());
        C10614f a = j.m15067a();
        C8568i b = j.m15066b();
        int[] mv = metadata.m15071mv();
        if ((metadata.m15069xi() & 8) == 0) {
            z2 = false;
        }
        C10612e eVar = new C10612e(mv, z2);
        Class<?> cls = gVar.getClass();
        C8608t n0 = b.m19106n0();
        C9971q.m14634f(n0, "proto.typeTable");
        return new C8505q(C8429h.f18378n, (AbstractC11404z0) C8503p0.m19652h(cls, b, a, new C9879g(n0), eVar, C8018a.f17285k));
    }
}
