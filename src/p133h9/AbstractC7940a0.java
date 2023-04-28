package p133h9;

import android.os.Handler;
import android.view.Surface;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p133h9.AbstractC7940a0;
import p152i7.C8221f;
import p152i7.C8225i;

/* renamed from: h9.a0 */
/* loaded from: classes5.dex */
public interface AbstractC7940a0 {

    /* renamed from: h9.a0$a */
    /* loaded from: classes5.dex */
    public static final class C7941a {

        /* renamed from: a */
        private final Handler f17043a;

        /* renamed from: b */
        private final AbstractC7940a0 f17044b;

        public C7941a(Handler handler, AbstractC7940a0 a0Var) {
            Handler handler2;
            if (a0Var != null) {
                handler2 = (Handler) C7510a.m22367e(handler);
            } else {
                handler2 = null;
            }
            this.f17043a = handler2;
            this.f17044b = a0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m21090p(String str, long j, long j2) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21111g(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m21089q(String str) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21112f(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m21088r(C8221f fVar) {
            fVar.m20287c();
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21110h(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m21087s(int i, long j) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21107y(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m21086t(C8221f fVar) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21108q(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m21085u(C6722k kVar, C8225i iVar) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21115B(kVar, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m21084v(Surface surface) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21109j(surface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m21083w(long j, int i) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21114E(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m21082x(int i, int i2, int i3, float f) {
            ((AbstractC7940a0) C7557q0.m22145j(this.f17044b)).mo21113d(i, i2, i3, f);
        }

        /* renamed from: A */
        public void m21106A(final int i, final int i2, final int i3, final float f) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21082x(i, i2, i3, f);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m21096j(final String str, final long j, final long j2) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21090p(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m21095k(final String str) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21089q(str);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m21094l(final C8221f fVar) {
            fVar.m20287c();
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21088r(fVar);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m21093m(final int i, final long j) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21087s(i, j);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m21092n(final C8221f fVar) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21086t(fVar);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m21091o(final C6722k kVar, final C8225i iVar) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21085u(kVar, iVar);
                    }
                });
            }
        }

        /* renamed from: y */
        public void m21081y(final Surface surface) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21084v(surface);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m21080z(final long j, final int i) {
            Handler handler = this.f17043a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h9.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7940a0.C7941a.this.m21083w(j, i);
                    }
                });
            }
        }
    }

    /* renamed from: B */
    void mo21115B(C6722k kVar, C8225i iVar);

    /* renamed from: E */
    void mo21114E(long j, int i);

    /* renamed from: d */
    void mo21113d(int i, int i2, int i3, float f);

    /* renamed from: f */
    void mo21112f(String str);

    /* renamed from: g */
    void mo21111g(String str, long j, long j2);

    /* renamed from: h */
    void mo21110h(C8221f fVar);

    /* renamed from: j */
    void mo21109j(Surface surface);

    /* renamed from: q */
    void mo21108q(C8221f fVar);

    /* renamed from: y */
    void mo21107y(int i, long j);
}
