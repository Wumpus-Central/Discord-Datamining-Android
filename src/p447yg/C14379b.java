package p447yg;

import fi.AbstractC7304o0;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p013ah.C1399g;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6887b;
import p087ei.AbstractC6938i;
import p087ei.C6943m;
import p249nh.C11137c;
import p249nh.C11142f;
import p267of.C11289v;
import p268og.AbstractC11299a1;
import p467zg.AbstractC14655g;
import pg.AbstractC11666c;
import th.AbstractC13104g;

/* renamed from: yg.b */
/* loaded from: classes8.dex */
public class C14379b implements AbstractC11666c, AbstractC14655g {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f32544f = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C14379b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    private final C11137c f32545a;

    /* renamed from: b */
    private final AbstractC11299a1 f32546b;

    /* renamed from: c */
    private final AbstractC6938i f32547c;

    /* renamed from: d */
    private final AbstractC6887b f32548d;

    /* renamed from: e */
    private final boolean f32549e;

    /* renamed from: yg.b$a */
    /* loaded from: classes8.dex */
    static final class C14380a extends AbstractC9973s implements Function0<AbstractC7304o0> {

        /* renamed from: k */
        final /* synthetic */ C1399g f32550k;

        /* renamed from: l */
        final /* synthetic */ C14379b f32551l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14380a(C1399g gVar, C14379b bVar) {
            super(0);
            this.f32550k = gVar;
            this.f32551l = bVar;
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke() {
            AbstractC7304o0 p = this.f32550k.m41171d().mo6136n().m13375o(this.f32551l.mo722e()).mo6166p();
            C9971q.m14634f(p, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return p;
        }
    }

    public C14379b(C1399g c, AbstractC6885a aVar, C11137c fqName) {
        AbstractC11299a1 NO_SOURCE;
        AbstractC6887b bVar;
        Collection<AbstractC6887b> j;
        Object V;
        C9971q.m14633g(c, "c");
        C9971q.m14633g(fqName, "fqName");
        this.f32545a = fqName;
        if (aVar == null || (NO_SOURCE = c.m41174a().m41190t().mo4613a(aVar)) == null) {
            NO_SOURCE = AbstractC11299a1.f25230a;
            C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
        }
        this.f32546b = NO_SOURCE;
        this.f32547c = c.m41170e().mo23898c(new C14380a(c, this));
        if (aVar == null || (j = aVar.mo4040j()) == null) {
            bVar = null;
        } else {
            V = C9914r.m14769V(j);
            bVar = (AbstractC6887b) V;
        }
        this.f32548d = bVar;
        boolean z = false;
        if (aVar != null && aVar.mo4038n()) {
            z = true;
        }
        this.f32549e = z;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<?>> mo700a() {
        Map<C11142f, AbstractC13104g<?>> h;
        h = C11289v.m10251h();
        return h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final AbstractC6887b m724b() {
        return this.f32548d;
    }

    /* renamed from: c */
    public AbstractC7304o0 getType() {
        return (AbstractC7304o0) C6943m.m23902a(this.f32547c, this, f32544f[0]);
    }

    @Override // pg.AbstractC11666c
    /* renamed from: e */
    public C11137c mo722e() {
        return this.f32545a;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: j */
    public AbstractC11299a1 mo721j() {
        return this.f32546b;
    }

    @Override // p467zg.AbstractC14655g
    /* renamed from: n */
    public boolean mo54n() {
        return this.f32549e;
    }
}
