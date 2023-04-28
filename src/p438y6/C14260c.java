package p438y6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p008a7.AbstractC1282d;
import p027b7.AbstractC3394b;
import p279p6.AbstractC11578h;
import p315r6.AbstractC12420i;
import p315r6.AbstractC12430o;
import p315r6.C12436t;
import p335s6.AbstractC12792e;
import p335s6.AbstractC12803m;
import p458z6.AbstractC14575x;

/* renamed from: y6.c */
/* loaded from: classes7.dex */
public class C14260c implements AbstractC14262e {

    /* renamed from: f */
    private static final Logger f32230f = Logger.getLogger(C12436t.class.getName());

    /* renamed from: a */
    private final AbstractC14575x f32231a;

    /* renamed from: b */
    private final Executor f32232b;

    /* renamed from: c */
    private final AbstractC12792e f32233c;

    /* renamed from: d */
    private final AbstractC1282d f32234d;

    /* renamed from: e */
    private final AbstractC3394b f32235e;

    public C14260c(Executor executor, AbstractC12792e eVar, AbstractC14575x xVar, AbstractC1282d dVar, AbstractC3394b bVar) {
        this.f32232b = executor;
        this.f32233c = eVar;
        this.f32231a = xVar;
        this.f32234d = dVar;
        this.f32235e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m1220d(AbstractC12430o oVar, AbstractC12420i iVar) {
        this.f32234d.mo41450C0(oVar, iVar);
        this.f32231a.mo188a(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1219e(final AbstractC12430o oVar, AbstractC11578h hVar, AbstractC12420i iVar) {
        try {
            AbstractC12803m a = this.f32233c.mo5457a(oVar.mo6801b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.mo6801b());
                f32230f.warning(format);
                hVar.mo6791a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC12420i a2 = a.mo5449a(iVar);
            this.f32235e.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: y6.b
                @Override // p027b7.AbstractC3394b.AbstractC3395a
                public final Object execute() {
                    Object d;
                    d = C14260c.this.m1220d(oVar, a2);
                    return d;
                }
            });
            hVar.mo6791a(null);
        } catch (Exception e) {
            Logger logger = f32230f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo6791a(e);
        }
    }

    @Override // p438y6.AbstractC14262e
    /* renamed from: a */
    public void mo1215a(final AbstractC12430o oVar, final AbstractC12420i iVar, final AbstractC11578h hVar) {
        this.f32232b.execute(new Runnable() { // from class: y6.a
            @Override // java.lang.Runnable
            public final void run() {
                C14260c.this.m1219e(oVar, hVar, iVar);
            }
        });
    }
}
