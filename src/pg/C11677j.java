package pg;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p217lg.AbstractC10420h;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import th.AbstractC13104g;

/* renamed from: pg.j */
/* loaded from: classes8.dex */
public final class C11677j implements AbstractC11666c {

    /* renamed from: a */
    private final AbstractC10420h f26048a;

    /* renamed from: b */
    private final C11137c f26049b;

    /* renamed from: c */
    private final Map<C11142f, AbstractC13104g<?>> f26050c;

    /* renamed from: d */
    private final Lazy f26051d;

    /* renamed from: pg.j$a */
    /* loaded from: classes8.dex */
    static final class C11678a extends AbstractC9973s implements Function0<AbstractC7304o0> {
        C11678a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke() {
            return C11677j.this.f26048a.m13375o(C11677j.this.mo722e()).mo6166p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11677j(AbstractC10420h builtIns, C11137c fqName, Map<C11142f, ? extends AbstractC13104g<?>> allValueArguments) {
        Lazy b;
        C9971q.m14633g(builtIns, "builtIns");
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(allValueArguments, "allValueArguments");
        this.f26048a = builtIns;
        this.f26049b = fqName;
        this.f26050c = allValueArguments;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C11678a());
        this.f26051d = b;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<?>> mo700a() {
        return this.f26050c;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: e */
    public C11137c mo722e() {
        return this.f26049b;
    }

    @Override // pg.AbstractC11666c
    public AbstractC7267g0 getType() {
        Object value = this.f26051d.getValue();
        C9971q.m14634f(value, "<get-type>(...)");
        return (AbstractC7267g0) value;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: j */
    public AbstractC11299a1 mo721j() {
        AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
        C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }
}
