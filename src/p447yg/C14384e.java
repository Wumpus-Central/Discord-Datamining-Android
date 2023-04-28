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
import th.AbstractC13104g;
import th.C13130v;

/* renamed from: yg.e */
/* loaded from: classes8.dex */
public final class C14384e extends C14379b {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f32561h = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C14384e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final AbstractC6938i f32562g;

    /* renamed from: yg.e$a */
    /* loaded from: classes8.dex */
    static final class C14385a extends AbstractC9973s implements Function0<Map<C11142f, ? extends C13130v>> {

        /* renamed from: k */
        public static final C14385a f32563k = new C14385a();

        C14385a() {
            super(0);
        }

        /* renamed from: a */
        public final Map<C11142f, C13130v> invoke() {
            Map<C11142f, C13130v> e;
            e = C11288u.m10254e(C11098x.m10921a(C14381c.f32552a.m718b(), new C13130v("Deprecated in Java")));
            return e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14384e(AbstractC6885a aVar, C1399g c) {
        super(c, aVar, C10434k.C10435a.f22948y);
        C9971q.m14633g(c, "c");
        this.f32562g = c.m41170e().mo23898c(C14385a.f32563k);
    }

    @Override // p447yg.C14379b, pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<?>> mo700a() {
        return (Map) C6943m.m23902a(this.f32562g, this, f32561h[0]);
    }
}
