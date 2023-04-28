package p447yg;

import java.util.List;
import java.util.Map;
import kotlin.collections.C9905i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import nf.C11098x;
import p013ah.C1399g;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6887b;
import p086eh.AbstractC6893e;
import p086eh.AbstractC6901m;
import p087ei.AbstractC6938i;
import p087ei.C6943m;
import p217lg.C10434k;
import p249nh.C11142f;
import p267of.C11288u;
import p267of.C11289v;
import th.AbstractC13104g;

/* renamed from: yg.i */
/* loaded from: classes8.dex */
public final class C14392i extends C14379b {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f32569h = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C14392i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final AbstractC6938i f32570g;

    /* renamed from: yg.i$a */
    /* loaded from: classes8.dex */
    static final class C14393a extends AbstractC9973s implements Function0<Map<C11142f, ? extends AbstractC13104g<? extends Object>>> {
        C14393a() {
            super(0);
        }

        /* renamed from: a */
        public final Map<C11142f, AbstractC13104g<Object>> invoke() {
            AbstractC13104g<?> gVar;
            Map<C11142f, AbstractC13104g<Object>> h;
            List<? extends AbstractC6887b> d;
            AbstractC6887b b = C14392i.this.m724b();
            Map<C11142f, AbstractC13104g<Object>> map = null;
            if (b instanceof AbstractC6893e) {
                gVar = C14382d.f32557a.m711c(((AbstractC6893e) C14392i.this.m724b()).mo4032c());
            } else if (b instanceof AbstractC6901m) {
                C14382d dVar = C14382d.f32557a;
                d = C9905i.m14825d(C14392i.this.m724b());
                gVar = dVar.m711c(d);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                map = C11288u.m10254e(C11098x.m10921a(C14381c.f32552a.m716d(), gVar));
            }
            if (map != null) {
                return map;
            }
            h = C11289v.m10251h();
            return h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14392i(AbstractC6885a annotation, C1399g c) {
        super(c, annotation, C10434k.C10435a.f38779H);
        C9971q.m14633g(annotation, "annotation");
        C9971q.m14633g(c, "c");
        this.f32570g = c.m41170e().mo23898c(new C14393a());
    }

    @Override // p447yg.C14379b, pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<Object>> mo700a() {
        return (Map) C6943m.m23902a(this.f32570g, this, f32569h[0]);
    }
}
