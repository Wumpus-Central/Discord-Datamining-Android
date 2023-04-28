package p177jc;

import tc.AbstractC13052a;
import tc.AbstractC13053b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jc.b0 */
/* loaded from: classes3.dex */
public class C9520b0<T> implements AbstractC13053b<T> {

    /* renamed from: c */
    private static final AbstractC13052a<Object> f21105c = new AbstractC13052a() { // from class: jc.z
        @Override // tc.AbstractC13052a
        /* renamed from: a */
        public final void mo4699a(AbstractC13053b bVar) {
            C9520b0.m16101d(bVar);
        }
    };

    /* renamed from: d */
    private static final AbstractC13053b<Object> f21106d = new AbstractC13053b() { // from class: jc.a0
        @Override // tc.AbstractC13053b
        public final Object get() {
            Object e;
            e = C9520b0.m16100e();
            return e;
        }
    };

    /* renamed from: a */
    private AbstractC13052a<T> f21107a;

    /* renamed from: b */
    private volatile AbstractC13053b<T> f21108b;

    private C9520b0(AbstractC13052a<T> aVar, AbstractC13053b<T> bVar) {
        this.f21107a = aVar;
        this.f21108b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> C9520b0<T> m16102c() {
        return new C9520b0<>(f21105c, f21106d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m16101d(AbstractC13053b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Object m16100e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m16099f(AbstractC13053b<T> bVar) {
        AbstractC13052a<T> aVar;
        if (this.f21108b == f21106d) {
            synchronized (this) {
                aVar = this.f21107a;
                this.f21107a = null;
                this.f21108b = bVar;
            }
            aVar.mo4699a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // tc.AbstractC13053b
    public T get() {
        return this.f21108b.get();
    }
}
