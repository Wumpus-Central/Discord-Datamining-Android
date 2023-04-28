package p458z6;

import java.util.concurrent.Executor;
import p008a7.AbstractC1282d;
import p027b7.AbstractC3394b;
import p315r6.AbstractC12430o;

/* renamed from: z6.v */
/* loaded from: classes7.dex */
public class C14573v {

    /* renamed from: a */
    private final Executor f33039a;

    /* renamed from: b */
    private final AbstractC1282d f33040b;

    /* renamed from: c */
    private final AbstractC14575x f33041c;

    /* renamed from: d */
    private final AbstractC3394b f33042d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14573v(Executor executor, AbstractC1282d dVar, AbstractC14575x xVar, AbstractC3394b bVar) {
        this.f33039a = executor;
        this.f33040b = dVar;
        this.f33041c = xVar;
        this.f33042d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m193d() {
        for (AbstractC12430o oVar : this.f33040b.mo41378w()) {
            this.f33041c.mo188a(oVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m192e() {
        this.f33042d.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.u
            @Override // p027b7.AbstractC3394b.AbstractC3395a
            public final Object execute() {
                Object d;
                d = C14573v.this.m193d();
                return d;
            }
        });
    }

    /* renamed from: c */
    public void m194c() {
        this.f33039a.execute(new Runnable() { // from class: z6.t
            @Override // java.lang.Runnable
            public final void run() {
                C14573v.this.m192e();
            }
        });
    }
}
