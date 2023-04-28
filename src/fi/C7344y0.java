package fi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267of.C11289v;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: fi.y0 */
/* loaded from: classes8.dex */
public final class C7344y0 {

    /* renamed from: e */
    public static final C7345a f15836e = new C7345a(null);

    /* renamed from: a */
    private final C7344y0 f15837a;

    /* renamed from: b */
    private final AbstractC11316e1 f15838b;

    /* renamed from: c */
    private final List<AbstractC7290k1> f15839c;

    /* renamed from: d */
    private final Map<AbstractC11319f1, AbstractC7290k1> f15840d;

    /* renamed from: fi.y0$a */
    /* loaded from: classes8.dex */
    public static final class C7345a {
        private C7345a() {
        }

        public /* synthetic */ C7345a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7344y0 m22857a(C7344y0 y0Var, AbstractC11316e1 typeAliasDescriptor, List<? extends AbstractC7290k1> arguments) {
            int t;
            List K0;
            Map r;
            C9971q.m14633g(typeAliasDescriptor, "typeAliasDescriptor");
            C9971q.m14633g(arguments, "arguments");
            List<AbstractC11319f1> parameters = typeAliasDescriptor.mo6111k().getParameters();
            C9971q.m14634f(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            t = C9907k.m14809t(parameters, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC11319f1 f1Var : parameters) {
                arrayList.add(f1Var.mo6162a());
            }
            K0 = C9914r.m14781K0(arrayList, arguments);
            r = C11289v.m10241r(K0);
            return new C7344y0(y0Var, typeAliasDescriptor, arguments, r, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C7344y0(C7344y0 y0Var, AbstractC11316e1 e1Var, List<? extends AbstractC7290k1> list, Map<AbstractC11319f1, ? extends AbstractC7290k1> map) {
        this.f15837a = y0Var;
        this.f15838b = e1Var;
        this.f15839c = list;
        this.f15840d = map;
    }

    public /* synthetic */ C7344y0(C7344y0 y0Var, AbstractC11316e1 e1Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, e1Var, list, map);
    }

    /* renamed from: a */
    public final List<AbstractC7290k1> m22861a() {
        return this.f15839c;
    }

    /* renamed from: b */
    public final AbstractC11316e1 m22860b() {
        return this.f15838b;
    }

    /* renamed from: c */
    public final AbstractC7290k1 m22859c(AbstractC7268g1 constructor) {
        C9971q.m14633g(constructor, "constructor");
        AbstractC11326h p = constructor.mo4565p();
        if (p instanceof AbstractC11319f1) {
            return this.f15840d.get(p);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m22858d(AbstractC11316e1 descriptor) {
        boolean z;
        C9971q.m14633g(descriptor, "descriptor");
        if (!C9971q.m14638b(this.f15838b, descriptor)) {
            C7344y0 y0Var = this.f15837a;
            if (y0Var != null) {
                z = y0Var.m22858d(descriptor);
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
