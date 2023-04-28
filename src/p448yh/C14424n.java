package p448yh;

import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p270oi.C11406a;
import p286pi.C11768e;
import p325rh.C12682m;
import p406wg.AbstractC13878b;

/* renamed from: yh.n */
/* loaded from: classes8.dex */
public final class C14424n extends AbstractC14397a {

    /* renamed from: d */
    public static final C14425a f32640d = new C14425a(null);

    /* renamed from: b */
    private final String f32641b;

    /* renamed from: c */
    private final AbstractC14411h f32642c;

    /* renamed from: yh.n$a */
    /* loaded from: classes8.dex */
    public static final class C14425a {
        private C14425a() {
        }

        public /* synthetic */ C14425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC14411h m622a(String message, Collection<? extends AbstractC7267g0> types) {
            int t;
            C9971q.m14633g(message, "message");
            C9971q.m14633g(types, "types");
            t = C9907k.m14809t(types, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC7267g0 g0Var : types) {
                arrayList.add(g0Var.mo5161o());
            }
            C11768e<AbstractC14411h> b = C11406a.m10132b(arrayList);
            AbstractC14411h b2 = C14398b.f32579d.m685b(message, b);
            if (b.size() <= 1) {
                return b2;
            }
            return new C14424n(message, b2, null);
        }
    }

    /* renamed from: yh.n$b */
    /* loaded from: classes8.dex */
    static final class C14426b extends AbstractC9973s implements Function1<AbstractC11297a, AbstractC11297a> {

        /* renamed from: k */
        public static final C14426b f32643k = new C14426b();

        C14426b() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11297a invoke(AbstractC11297a selectMostSpecificInEachOverridableGroup) {
            C9971q.m14633g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* renamed from: yh.n$c */
    /* loaded from: classes8.dex */
    static final class C14427c extends AbstractC9973s implements Function1<AbstractC11404z0, AbstractC11297a> {

        /* renamed from: k */
        public static final C14427c f32644k = new C14427c();

        C14427c() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11297a invoke(AbstractC11404z0 selectMostSpecificInEachOverridableGroup) {
            C9971q.m14633g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* renamed from: yh.n$d */
    /* loaded from: classes8.dex */
    static final class C14428d extends AbstractC9973s implements Function1<AbstractC11388u0, AbstractC11297a> {

        /* renamed from: k */
        public static final C14428d f32645k = new C14428d();

        C14428d() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11297a invoke(AbstractC11388u0 selectMostSpecificInEachOverridableGroup) {
            C9971q.m14633g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    private C14424n(String str, AbstractC14411h hVar) {
        this.f32641b = str;
        this.f32642c = hVar;
    }

    public /* synthetic */ C14424n(String str, AbstractC14411h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVar);
    }

    /* renamed from: j */
    public static final AbstractC14411h m623j(String str, Collection<? extends AbstractC7267g0> collection) {
        return f32640d.m622a(str, collection);
    }

    @Override // p448yh.AbstractC14397a, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return C12682m.m5878a(super.mo627a(name, location), C14428d.f32645k);
    }

    @Override // p448yh.AbstractC14397a, p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return C12682m.m5878a(super.mo626d(name, location), C14427c.f32644k);
    }

    @Override // p448yh.AbstractC14397a, p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List o0;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        Collection<AbstractC11346m> f = super.mo625f(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f) {
            if (((AbstractC11346m) obj) instanceof AbstractC11297a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.m15067a();
        C9971q.m14635e(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        o0 = C9914r.m14750o0(C12682m.m5878a(list, C14426b.f32643k), (List) pair.m15066b());
        return o0;
    }

    @Override // p448yh.AbstractC14397a
    /* renamed from: i */
    protected AbstractC14411h mo624i() {
        return this.f32642c;
    }
}
