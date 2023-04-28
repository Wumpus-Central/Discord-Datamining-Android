package p447yg;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import nf.C11098x;
import p013ah.C1399g;
import p086eh.AbstractC6885a;
import p087ei.AbstractC6938i;
import p087ei.C6943m;
import p217lg.C10434k;
import p249nh.C11142f;
import p267of.C11288u;
import p267of.C11289v;
import th.AbstractC13104g;

/* renamed from: yg.h */
/* loaded from: classes8.dex */
public final class C14390h extends C14379b {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f32566h = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C14390h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final AbstractC6938i f32567g;

    /* renamed from: yg.h$a */
    /* loaded from: classes8.dex */
    static final class C14391a extends AbstractC9973s implements Function0<Map<C11142f, ? extends AbstractC13104g<?>>> {
        C14391a() {
            super(0);
        }

        /* renamed from: a */
        public final Map<C11142f, AbstractC13104g<?>> invoke() {
            Map<C11142f, AbstractC13104g<?>> map;
            Map<C11142f, AbstractC13104g<?>> h;
            AbstractC13104g<?> a = C14382d.f32557a.m713a(C14390h.this.m724b());
            if (a != null) {
                map = C11288u.m10254e(C11098x.m10921a(C14381c.f32552a.m717c(), a));
            } else {
                map = null;
            }
            if (map != null) {
                return map;
            }
            h = C11289v.m10251h();
            return h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14390h(AbstractC6885a annotation, C1399g c) {
        super(c, annotation, C10434k.C10435a.f38786L);
        C9971q.m14633g(annotation, "annotation");
        C9971q.m14633g(c, "c");
        this.f32567g = c.m41170e().mo23898c(new C14391a());
    }

    @Override // p447yg.C14379b, pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<?>> mo700a() {
        return (Map) C6943m.m23902a(this.f32567g, this, f32566h[0]);
    }
}
