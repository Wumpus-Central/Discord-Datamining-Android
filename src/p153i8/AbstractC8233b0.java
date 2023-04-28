package p153i8;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p079e7.C6713c;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8299u;

/* renamed from: i8.b0 */
/* loaded from: classes7.dex */
public interface AbstractC8233b0 {

    /* renamed from: i8.b0$a */
    /* loaded from: classes7.dex */
    public static class C8234a {

        /* renamed from: a */
        public final int f17837a;

        /* renamed from: b */
        public final AbstractC8299u.C8300a f17838b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0256a> f17839c;

        /* renamed from: d */
        private final long f17840d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i8.b0$a$a */
        /* loaded from: classes7.dex */
        public static final class C0256a {

            /* renamed from: a */
            public Handler f17841a;

            /* renamed from: b */
            public AbstractC8233b0 f17842b;

            public C0256a(Handler handler, AbstractC8233b0 b0Var) {
                this.f17841a = handler;
                this.f17842b = b0Var;
            }
        }

        public C8234a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        /* renamed from: h */
        private long m20246h(long j) {
            long d = C6713c.m24565d(j);
            if (d == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f17840d + d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m20243k(AbstractC8233b0 b0Var, C8284q qVar) {
            b0Var.mo20205C(this.f17837a, this.f17838b, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m20242l(AbstractC8233b0 b0Var, C8273n nVar, C8284q qVar) {
            b0Var.mo20203b(this.f17837a, this.f17838b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m20241m(AbstractC8233b0 b0Var, C8273n nVar, C8284q qVar) {
            b0Var.mo20201r(this.f17837a, this.f17838b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m20240n(AbstractC8233b0 b0Var, C8273n nVar, C8284q qVar, IOException iOException, boolean z) {
            b0Var.mo20200s(this.f17837a, this.f17838b, nVar, qVar, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m20239o(AbstractC8233b0 b0Var, C8273n nVar, C8284q qVar) {
            b0Var.mo20198x(this.f17837a, this.f17838b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m20238p(AbstractC8233b0 b0Var, AbstractC8299u.C8300a aVar, C8284q qVar) {
            b0Var.mo20199w(this.f17837a, aVar, qVar);
        }

        /* renamed from: A */
        public void m20259A(C8273n nVar, int i, int i2, C6722k kVar, int i3, Object obj, long j, long j2) {
            m20258B(nVar, new C8284q(i, i2, kVar, i3, obj, m20246h(j), m20246h(j2)));
        }

        /* renamed from: B */
        public void m20258B(final C8273n nVar, final C8284q qVar) {
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                final AbstractC8233b0 b0Var = next.f17842b;
                C7557q0.m22204F0(next.f17841a, new Runnable() { // from class: i8.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8233b0.C8234a.this.m20239o(b0Var, nVar, qVar);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m20257C(AbstractC8233b0 b0Var) {
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                if (next.f17842b == b0Var) {
                    this.f17839c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void m20256D(int i, long j, long j2) {
            m20255E(new C8284q(1, i, null, 3, null, m20246h(j), m20246h(j2)));
        }

        /* renamed from: E */
        public void m20255E(final C8284q qVar) {
            final AbstractC8299u.C8300a aVar = (AbstractC8299u.C8300a) C7510a.m22367e(this.f17838b);
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                final AbstractC8233b0 b0Var = next.f17842b;
                C7557q0.m22204F0(next.f17841a, new Runnable() { // from class: i8.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8233b0.C8234a.this.m20238p(b0Var, aVar, qVar);
                    }
                });
            }
        }

        /* renamed from: F */
        public C8234a m20254F(int i, AbstractC8299u.C8300a aVar, long j) {
            return new C8234a(this.f17839c, i, aVar, j);
        }

        /* renamed from: g */
        public void m20247g(Handler handler, AbstractC8233b0 b0Var) {
            C7510a.m22367e(handler);
            C7510a.m22367e(b0Var);
            this.f17839c.add(new C0256a(handler, b0Var));
        }

        /* renamed from: i */
        public void m20245i(int i, C6722k kVar, int i2, Object obj, long j) {
            m20244j(new C8284q(1, i, kVar, i2, obj, m20246h(j), -9223372036854775807L));
        }

        /* renamed from: j */
        public void m20244j(final C8284q qVar) {
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                final AbstractC8233b0 b0Var = next.f17842b;
                C7557q0.m22204F0(next.f17841a, new Runnable() { // from class: i8.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8233b0.C8234a.this.m20243k(b0Var, qVar);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m20237q(C8273n nVar, int i) {
            m20236r(nVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void m20236r(C8273n nVar, int i, int i2, C6722k kVar, int i3, Object obj, long j, long j2) {
            m20235s(nVar, new C8284q(i, i2, kVar, i3, obj, m20246h(j), m20246h(j2)));
        }

        /* renamed from: s */
        public void m20235s(final C8273n nVar, final C8284q qVar) {
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                final AbstractC8233b0 b0Var = next.f17842b;
                C7557q0.m22204F0(next.f17841a, new Runnable() { // from class: i8.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8233b0.C8234a.this.m20242l(b0Var, nVar, qVar);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m20234t(C8273n nVar, int i) {
            m20233u(nVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void m20233u(C8273n nVar, int i, int i2, C6722k kVar, int i3, Object obj, long j, long j2) {
            m20232v(nVar, new C8284q(i, i2, kVar, i3, obj, m20246h(j), m20246h(j2)));
        }

        /* renamed from: v */
        public void m20232v(final C8273n nVar, final C8284q qVar) {
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                final AbstractC8233b0 b0Var = next.f17842b;
                C7557q0.m22204F0(next.f17841a, new Runnable() { // from class: i8.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8233b0.C8234a.this.m20241m(b0Var, nVar, qVar);
                    }
                });
            }
        }

        /* renamed from: w */
        public void m20231w(C8273n nVar, int i, int i2, C6722k kVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            m20229y(nVar, new C8284q(i, i2, kVar, i3, obj, m20246h(j), m20246h(j2)), iOException, z);
        }

        /* renamed from: x */
        public void m20230x(C8273n nVar, int i, IOException iOException, boolean z) {
            m20231w(nVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: y */
        public void m20229y(final C8273n nVar, final C8284q qVar, final IOException iOException, final boolean z) {
            Iterator<C0256a> it = this.f17839c.iterator();
            while (it.hasNext()) {
                C0256a next = it.next();
                final AbstractC8233b0 b0Var = next.f17842b;
                C7557q0.m22204F0(next.f17841a, new Runnable() { // from class: i8.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8233b0.C8234a.this.m20240n(b0Var, nVar, qVar, iOException, z);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m20228z(C8273n nVar, int i) {
            m20259A(nVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        private C8234a(CopyOnWriteArrayList<C0256a> copyOnWriteArrayList, int i, AbstractC8299u.C8300a aVar, long j) {
            this.f17839c = copyOnWriteArrayList;
            this.f17837a = i;
            this.f17838b = aVar;
            this.f17840d = j;
        }
    }

    /* renamed from: C */
    void mo20205C(int i, AbstractC8299u.C8300a aVar, C8284q qVar);

    /* renamed from: b */
    void mo20203b(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar);

    /* renamed from: r */
    void mo20201r(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar);

    /* renamed from: s */
    void mo20200s(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar, IOException iOException, boolean z);

    /* renamed from: w */
    void mo20199w(int i, AbstractC8299u.C8300a aVar, C8284q qVar);

    /* renamed from: x */
    void mo20198x(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar);
}
