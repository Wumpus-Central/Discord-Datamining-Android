package p193k7;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.AbstractC8299u;
import p193k7.AbstractC9815v;

/* renamed from: k7.v */
/* loaded from: classes7.dex */
public interface AbstractC9815v {

    /* renamed from: k7.v$a */
    /* loaded from: classes7.dex */
    public static class C9816a {

        /* renamed from: a */
        public final int f21854a;

        /* renamed from: b */
        public final AbstractC8299u.C8300a f21855b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0298a> f21856c;

        /* renamed from: k7.v$a$a */
        /* loaded from: classes7.dex */
        private static final class C0298a {

            /* renamed from: a */
            public Handler f21857a;

            /* renamed from: b */
            public AbstractC9815v f21858b;

            public C0298a(Handler handler, AbstractC9815v vVar) {
                this.f21857a = handler;
                this.f21858b = vVar;
            }
        }

        public C9816a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m15286n(AbstractC9815v vVar) {
            vVar.mo15303p(this.f21854a, this.f21855b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m15285o(AbstractC9815v vVar) {
            vVar.mo15301v(this.f21854a, this.f21855b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m15284p(AbstractC9815v vVar) {
            vVar.mo15304n(this.f21854a, this.f21855b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m15283q(AbstractC9815v vVar) {
            vVar.mo15300z(this.f21854a, this.f21855b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m15282r(AbstractC9815v vVar, Exception exc) {
            vVar.mo15302t(this.f21854a, this.f21855b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m15281s(AbstractC9815v vVar) {
            vVar.mo15305m(this.f21854a, this.f21855b);
        }

        /* renamed from: g */
        public void m15293g(Handler handler, AbstractC9815v vVar) {
            C7510a.m22367e(handler);
            C7510a.m22367e(vVar);
            this.f21856c.add(new C0298a(handler, vVar));
        }

        /* renamed from: h */
        public void m15292h() {
            Iterator<C0298a> it = this.f21856c.iterator();
            while (it.hasNext()) {
                C0298a next = it.next();
                final AbstractC9815v vVar = next.f21858b;
                C7557q0.m22204F0(next.f21857a, new Runnable() { // from class: k7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC9815v.C9816a.this.m15286n(vVar);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m15291i() {
            Iterator<C0298a> it = this.f21856c.iterator();
            while (it.hasNext()) {
                C0298a next = it.next();
                final AbstractC9815v vVar = next.f21858b;
                C7557q0.m22204F0(next.f21857a, new Runnable() { // from class: k7.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC9815v.C9816a.this.m15285o(vVar);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m15290j() {
            Iterator<C0298a> it = this.f21856c.iterator();
            while (it.hasNext()) {
                C0298a next = it.next();
                final AbstractC9815v vVar = next.f21858b;
                C7557q0.m22204F0(next.f21857a, new Runnable() { // from class: k7.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC9815v.C9816a.this.m15284p(vVar);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m15289k() {
            Iterator<C0298a> it = this.f21856c.iterator();
            while (it.hasNext()) {
                C0298a next = it.next();
                final AbstractC9815v vVar = next.f21858b;
                C7557q0.m22204F0(next.f21857a, new Runnable() { // from class: k7.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC9815v.C9816a.this.m15283q(vVar);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m15288l(final Exception exc) {
            Iterator<C0298a> it = this.f21856c.iterator();
            while (it.hasNext()) {
                C0298a next = it.next();
                final AbstractC9815v vVar = next.f21858b;
                C7557q0.m22204F0(next.f21857a, new Runnable() { // from class: k7.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC9815v.C9816a.this.m15282r(vVar, exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m15287m() {
            Iterator<C0298a> it = this.f21856c.iterator();
            while (it.hasNext()) {
                C0298a next = it.next();
                final AbstractC9815v vVar = next.f21858b;
                C7557q0.m22204F0(next.f21857a, new Runnable() { // from class: k7.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC9815v.C9816a.this.m15281s(vVar);
                    }
                });
            }
        }

        /* renamed from: t */
        public C9816a m15280t(int i, AbstractC8299u.C8300a aVar) {
            return new C9816a(this.f21856c, i, aVar);
        }

        private C9816a(CopyOnWriteArrayList<C0298a> copyOnWriteArrayList, int i, AbstractC8299u.C8300a aVar) {
            this.f21856c = copyOnWriteArrayList;
            this.f21854a = i;
            this.f21855b = aVar;
        }
    }

    /* renamed from: m */
    void mo15305m(int i, AbstractC8299u.C8300a aVar);

    /* renamed from: n */
    void mo15304n(int i, AbstractC8299u.C8300a aVar);

    /* renamed from: p */
    void mo15303p(int i, AbstractC8299u.C8300a aVar);

    /* renamed from: t */
    void mo15302t(int i, AbstractC8299u.C8300a aVar, Exception exc);

    /* renamed from: v */
    void mo15301v(int i, AbstractC8299u.C8300a aVar);

    /* renamed from: z */
    void mo15300z(int i, AbstractC8299u.C8300a aVar);
}
