package p117g7;

import android.os.Handler;
import p079e7.C6722k;
import p117g7.AbstractC7478r;
import p119g9.C7510a;
import p119g9.C7557q0;
import p152i7.C8221f;
import p152i7.C8225i;

/* renamed from: g7.r */
/* loaded from: classes7.dex */
public interface AbstractC7478r {

    /* renamed from: g7.r$a */
    /* loaded from: classes7.dex */
    public static final class C7479a {

        /* renamed from: a */
        private final Handler f16184a;

        /* renamed from: b */
        private final AbstractC7478r f16185b;

        public C7479a(Handler handler, AbstractC7478r rVar) {
            Handler handler2;
            if (rVar != null) {
                handler2 = (Handler) C7510a.m22367e(handler);
            } else {
                handler2 = null;
            }
            this.f16184a = handler2;
            this.f16185b = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m22495p(Exception exc) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22517c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m22494q(String str, long j, long j2) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22514l(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m22493r(String str) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22515k(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m22492s(C8221f fVar) {
            fVar.m20287c();
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22516e(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m22491t(C8221f fVar) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22520A(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m22490u(C6722k kVar, C8225i iVar) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22512u(kVar, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m22489v(long j) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22513o(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m22488w(boolean z) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22518a(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m22487x(int i, long j, long j2) {
            ((AbstractC7478r) C7557q0.m22145j(this.f16185b)).mo22519D(i, j, j2);
        }

        /* renamed from: A */
        public void m22511A(final int i, final long j, final long j2) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22487x(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m22501j(final Exception exc) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22495p(exc);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m22500k(final String str, final long j, final long j2) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22494q(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m22499l(final String str) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22493r(str);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m22498m(final C8221f fVar) {
            fVar.m20287c();
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22492s(fVar);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m22497n(final C8221f fVar) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22491t(fVar);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m22496o(final C6722k kVar, final C8225i iVar) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22490u(kVar, iVar);
                    }
                });
            }
        }

        /* renamed from: y */
        public void m22486y(final long j) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22489v(j);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m22485z(final boolean z) {
            Handler handler = this.f16184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7478r.C7479a.this.m22488w(z);
                    }
                });
            }
        }
    }

    /* renamed from: A */
    void mo22520A(C8221f fVar);

    /* renamed from: D */
    void mo22519D(int i, long j, long j2);

    /* renamed from: a */
    void mo22518a(boolean z);

    /* renamed from: c */
    void mo22517c(Exception exc);

    /* renamed from: e */
    void mo22516e(C8221f fVar);

    /* renamed from: k */
    void mo22515k(String str);

    /* renamed from: l */
    void mo22514l(String str, long j, long j2);

    /* renamed from: o */
    void mo22513o(long j);

    /* renamed from: u */
    void mo22512u(C6722k kVar, C8225i iVar);
}
