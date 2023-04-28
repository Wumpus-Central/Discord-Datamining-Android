package sh;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.AbstractC7299n1;
import fi.C7239e0;
import fi.C7281j0;
import fi.C7296m1;
import fi.C7314q;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9899f;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p087ei.C6920f;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: sh.d */
/* loaded from: classes8.dex */
public final class C12902d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh.d$a */
    /* loaded from: classes8.dex */
    public static final class C12903a extends AbstractC9973s implements Function0<AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7290k1 f28979k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12903a(AbstractC7290k1 k1Var) {
            super(0);
            this.f28979k = k1Var;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke() {
            AbstractC7267g0 type = this.f28979k.getType();
            C9971q.m14634f(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* renamed from: sh.d$b */
    /* loaded from: classes8.dex */
    public static final class C12904b extends C7314q {

        /* renamed from: d */
        final /* synthetic */ boolean f28980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12904b(AbstractC7299n1 n1Var, boolean z) {
            super(n1Var);
            this.f28980d = z;
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: b */
        public boolean mo5148b() {
            return this.f28980d;
        }

        @Override // fi.C7314q, fi.AbstractC7299n1
        /* renamed from: e */
        public AbstractC7290k1 mo5147e(AbstractC7267g0 key) {
            C9971q.m14633g(key, "key");
            AbstractC7290k1 e = super.mo5147e(key);
            AbstractC11319f1 f1Var = null;
            if (e == null) {
                return null;
            }
            AbstractC11326h p = key.mo5172N0().mo4565p();
            if (p instanceof AbstractC11319f1) {
                f1Var = (AbstractC11319f1) p;
            }
            return C12902d.m5154b(e, f1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final AbstractC7290k1 m5154b(AbstractC7290k1 k1Var, AbstractC11319f1 f1Var) {
        if (f1Var == null || k1Var.mo22906b() == EnumC7338w1.INVARIANT) {
            return k1Var;
        }
        if (f1Var.mo6392m() != k1Var.mo22906b()) {
            return new C7296m1(m5153c(k1Var));
        }
        if (!k1Var.mo22907a()) {
            return new C7296m1(k1Var.getType());
        }
        AbstractC6944n NO_LOCKS = C6920f.f15067e;
        C9971q.m14634f(NO_LOCKS, "NO_LOCKS");
        return new C7296m1(new C7281j0(NO_LOCKS, new C12903a(k1Var)));
    }

    /* renamed from: c */
    public static final AbstractC7267g0 m5153c(AbstractC7290k1 typeProjection) {
        C9971q.m14633g(typeProjection, "typeProjection");
        return new C12899a(typeProjection, null, false, null, 14, null);
    }

    /* renamed from: d */
    public static final boolean m5152d(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return g0Var.mo5172N0() instanceof AbstractC12900b;
    }

    /* renamed from: e */
    public static final AbstractC7299n1 m5151e(AbstractC7299n1 n1Var, boolean z) {
        List<Pair> J0;
        int t;
        C9971q.m14633g(n1Var, "<this>");
        if (!(n1Var instanceof C7239e0)) {
            return new C12904b(n1Var, z);
        }
        C7239e0 e0Var = (C7239e0) n1Var;
        AbstractC11319f1[] j = e0Var.m23136j();
        J0 = C9899f.m14953J0(e0Var.m23137i(), e0Var.m23136j());
        t = C9907k.m14809t(J0, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Pair pair : J0) {
            arrayList.add(m5154b((AbstractC7290k1) pair.m15065c(), (AbstractC11319f1) pair.m15064d()));
        }
        return new C7239e0(j, (AbstractC7290k1[]) arrayList.toArray(new AbstractC7290k1[0]), z);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC7299n1 m5150f(AbstractC7299n1 n1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m5151e(n1Var, z);
    }
}
