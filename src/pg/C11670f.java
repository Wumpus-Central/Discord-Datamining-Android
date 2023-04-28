package pg;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.EnumC7338w1;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p217lg.AbstractC10420h;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p267of.C11289v;
import p268og.AbstractC11327h0;
import th.C13097a;
import th.C13099b;
import th.C13109j;
import th.C13130v;

/* renamed from: pg.f */
/* loaded from: classes8.dex */
public final class C11670f {

    /* renamed from: a */
    private static final C11142f f26038a;

    /* renamed from: b */
    private static final C11142f f26039b;

    /* renamed from: c */
    private static final C11142f f26040c;

    /* renamed from: d */
    private static final C11142f f26041d;

    /* renamed from: e */
    private static final C11142f f26042e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pg.f$a */
    /* loaded from: classes8.dex */
    public static final class C11671a extends AbstractC9973s implements Function1<AbstractC11327h0, AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC10420h f26043k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11671a(AbstractC10420h hVar) {
            super(1);
            this.f26043k = hVar;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11327h0 module) {
            C9971q.m14633g(module, "module");
            AbstractC7304o0 l = module.mo6136n().m13381l(EnumC7338w1.INVARIANT, this.f26043k.m13406W());
            C9971q.m14634f(l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return l;
        }
    }

    static {
        C11142f f = C11142f.m10767f("message");
        C9971q.m14634f(f, "identifier(\"message\")");
        f26038a = f;
        C11142f f2 = C11142f.m10767f("replaceWith");
        C9971q.m14634f(f2, "identifier(\"replaceWith\")");
        f26039b = f2;
        C11142f f3 = C11142f.m10767f("level");
        C9971q.m14634f(f3, "identifier(\"level\")");
        f26040c = f3;
        C11142f f4 = C11142f.m10767f("expression");
        C9971q.m14634f(f4, "identifier(\"expression\")");
        f26041d = f4;
        C11142f f5 = C11142f.m10767f("imports");
        C9971q.m14634f(f5, "identifier(\"imports\")");
        f26042e = f5;
    }

    /* renamed from: a */
    public static final AbstractC11666c m9052a(AbstractC10420h hVar, String message, String replaceWith, String level) {
        List i;
        Map k;
        Map k2;
        C9971q.m14633g(hVar, "<this>");
        C9971q.m14633g(message, "message");
        C9971q.m14633g(replaceWith, "replaceWith");
        C9971q.m14633g(level, "level");
        C11137c cVar = C10434k.C10435a.f38767B;
        C11142f fVar = f26042e;
        i = C9906j.m14820i();
        k = C11289v.m10248k(C11098x.m10921a(f26041d, new C13130v(replaceWith)), C11098x.m10921a(fVar, new C13099b(i, new C11671a(hVar))));
        C11677j jVar = new C11677j(hVar, cVar, k);
        C11137c cVar2 = C10434k.C10435a.f22948y;
        C11142f fVar2 = f26040c;
        C11136b m = C11136b.m10805m(C10434k.C10435a.f38765A);
        C9971q.m14634f(m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C11142f f = C11142f.m10767f(level);
        C9971q.m14634f(f, "identifier(level)");
        k2 = C11289v.m10248k(C11098x.m10921a(f26038a, new C13130v(message)), C11098x.m10921a(f26039b, new C13097a(jVar)), C11098x.m10921a(fVar2, new C13109j(m, f)));
        return new C11677j(hVar, cVar2, k2);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC11666c m9051b(AbstractC10420h hVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m9052a(hVar, str, str2, str3);
    }
}
