package p447yg;

import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9907k;
import kotlin.collections.C9911o;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p086eh.AbstractC6887b;
import p086eh.AbstractC6901m;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11142f;
import p267of.C11289v;
import p268og.AbstractC11327h0;
import p268og.AbstractC11335j1;
import pg.EnumC11683m;
import pg.EnumC11684n;
import th.AbstractC13104g;
import th.C13099b;
import th.C13109j;

/* renamed from: yg.d */
/* loaded from: classes8.dex */
public final class C14382d {

    /* renamed from: a */
    public static final C14382d f32557a = new C14382d();

    /* renamed from: b */
    private static final Map<String, EnumSet<EnumC11684n>> f32558b;

    /* renamed from: c */
    private static final Map<String, EnumC11683m> f32559c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yg.d$a */
    /* loaded from: classes8.dex */
    public static final class C14383a extends AbstractC9973s implements Function1<AbstractC11327h0, AbstractC7267g0> {

        /* renamed from: k */
        public static final C14383a f32560k = new C14383a();

        C14383a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11327h0 module) {
            AbstractC7267g0 g0Var;
            C9971q.m14633g(module, "module");
            AbstractC11335j1 b = C14378a.m732b(C14381c.f32552a.m716d(), module.mo6136n().m13375o(C10434k.C10435a.f38779H));
            if (b != null) {
                g0Var = b.getType();
            } else {
                g0Var = null;
            }
            if (g0Var == null) {
                return C8039k.m20774d(EnumC8038j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
            }
            return g0Var;
        }
    }

    static {
        Map<String, EnumSet<EnumC11684n>> k;
        Map<String, EnumC11683m> k2;
        k = C11289v.m10248k(C11098x.m10921a("PACKAGE", EnumSet.noneOf(EnumC11684n.class)), C11098x.m10921a("TYPE", EnumSet.of(EnumC11684n.CLASS, EnumC11684n.FILE)), C11098x.m10921a("ANNOTATION_TYPE", EnumSet.of(EnumC11684n.ANNOTATION_CLASS)), C11098x.m10921a("TYPE_PARAMETER", EnumSet.of(EnumC11684n.TYPE_PARAMETER)), C11098x.m10921a("FIELD", EnumSet.of(EnumC11684n.FIELD)), C11098x.m10921a("LOCAL_VARIABLE", EnumSet.of(EnumC11684n.LOCAL_VARIABLE)), C11098x.m10921a("PARAMETER", EnumSet.of(EnumC11684n.VALUE_PARAMETER)), C11098x.m10921a("CONSTRUCTOR", EnumSet.of(EnumC11684n.CONSTRUCTOR)), C11098x.m10921a("METHOD", EnumSet.of(EnumC11684n.FUNCTION, EnumC11684n.PROPERTY_GETTER, EnumC11684n.PROPERTY_SETTER)), C11098x.m10921a("TYPE_USE", EnumSet.of(EnumC11684n.TYPE)));
        f32558b = k;
        k2 = C11289v.m10248k(C11098x.m10921a("RUNTIME", EnumC11683m.RUNTIME), C11098x.m10921a("CLASS", EnumC11683m.BINARY), C11098x.m10921a("SOURCE", EnumC11683m.SOURCE));
        f32559c = k2;
    }

    private C14382d() {
    }

    /* renamed from: a */
    public final AbstractC13104g<?> m713a(AbstractC6887b bVar) {
        AbstractC6901m mVar;
        String str;
        if (bVar instanceof AbstractC6901m) {
            mVar = (AbstractC6901m) bVar;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        Map<String, EnumC11683m> map = f32559c;
        C11142f e = mVar.mo3989e();
        if (e != null) {
            str = e.m10771b();
        } else {
            str = null;
        }
        EnumC11683m mVar2 = map.get(str);
        if (mVar2 == null) {
            return null;
        }
        C11136b m = C11136b.m10805m(C10434k.C10435a.f38785K);
        C9971q.m14634f(m, "topLevel(StandardNames.F…ames.annotationRetention)");
        C11142f f = C11142f.m10767f(mVar2.name());
        C9971q.m14634f(f, "identifier(retention.name)");
        return new C13109j(m, f);
    }

    /* renamed from: b */
    public final Set<EnumC11684n> m712b(String str) {
        Set<EnumC11684n> d;
        EnumSet<EnumC11684n> enumSet = f32558b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        d = C9921w.m14722d();
        return d;
    }

    /* renamed from: c */
    public final AbstractC13104g<?> m711c(List<? extends AbstractC6887b> arguments) {
        int t;
        String str;
        C9971q.m14633g(arguments, "arguments");
        ArrayList<AbstractC6901m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof AbstractC6901m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC11684n> arrayList2 = new ArrayList();
        for (AbstractC6901m mVar : arrayList) {
            C14382d dVar = f32557a;
            C11142f e = mVar.mo3989e();
            if (e != null) {
                str = e.m10771b();
            } else {
                str = null;
            }
            C9911o.m14801y(arrayList2, dVar.m712b(str));
        }
        t = C9907k.m14809t(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(t);
        for (EnumC11684n nVar : arrayList2) {
            C11136b m = C11136b.m10805m(C10434k.C10435a.f38783J);
            C9971q.m14634f(m, "topLevel(StandardNames.FqNames.annotationTarget)");
            C11142f f = C11142f.m10767f(nVar.name());
            C9971q.m14634f(f, "identifier(kotlinTarget.name)");
            arrayList3.add(new C13109j(m, f));
        }
        return new C13099b(arrayList3, C14383a.f32560k);
    }
}
