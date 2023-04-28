package p193k7;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p079e7.C6713c;
import p119g9.AbstractC7526g;
import p119g9.C7510a;
import p119g9.C7532h;
import p119g9.C7557q0;
import p119g9.C7558r;
import p153i8.C8273n;
import p153i8.C8284q;
import p193k7.AbstractC9763c0;
import p193k7.AbstractC9805n;
import p193k7.AbstractC9815v;
import p193k7.C9798l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.h */
/* loaded from: classes7.dex */
public class C9777h implements AbstractC9805n {

    /* renamed from: a */
    public final List<C9798l.C9800b> f21751a;

    /* renamed from: b */
    private final AbstractC9763c0 f21752b;

    /* renamed from: c */
    private final AbstractC9778a f21753c;

    /* renamed from: d */
    private final AbstractC9779b f21754d;

    /* renamed from: e */
    private final int f21755e;

    /* renamed from: f */
    private final boolean f21756f;

    /* renamed from: g */
    private final boolean f21757g;

    /* renamed from: h */
    private final HashMap<String, String> f21758h;

    /* renamed from: i */
    private final C7532h<AbstractC9815v.C9816a> f21759i;

    /* renamed from: j */
    private final AbstractC5318g f21760j;

    /* renamed from: k */
    final AbstractC9795j0 f21761k;

    /* renamed from: l */
    final UUID f21762l;

    /* renamed from: m */
    final HandlerC9782e f21763m;

    /* renamed from: n */
    private int f21764n;

    /* renamed from: o */
    private int f21765o;

    /* renamed from: p */
    private HandlerThread f21766p;

    /* renamed from: q */
    private HandlerC9780c f21767q;

    /* renamed from: r */
    private AbstractC9761b0 f21768r;

    /* renamed from: s */
    private AbstractC9805n.C9806a f21769s;

    /* renamed from: t */
    private byte[] f21770t;

    /* renamed from: u */
    private byte[] f21771u;

    /* renamed from: v */
    private AbstractC9763c0.C9765b f21772v;

    /* renamed from: w */
    private AbstractC9763c0.C9768e f21773w;

    /* renamed from: k7.h$a */
    /* loaded from: classes7.dex */
    public interface AbstractC9778a {
        /* renamed from: a */
        void mo15341a();

        /* renamed from: b */
        void mo15340b(C9777h hVar);

        /* renamed from: c */
        void mo15339c(Exception exc);
    }

    /* renamed from: k7.h$b */
    /* loaded from: classes7.dex */
    public interface AbstractC9779b {
        /* renamed from: a */
        void mo15338a(C9777h hVar, int i);

        /* renamed from: b */
        void mo15337b(C9777h hVar, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: k7.h$c */
    /* loaded from: classes7.dex */
    public class HandlerC9780c extends Handler {

        /* renamed from: a */
        private boolean f21774a;

        public HandlerC9780c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private boolean m15370a(Message message, C9797k0 k0Var) {
            IOException iOException;
            C9781d dVar = (C9781d) message.obj;
            if (!dVar.f21777b) {
                return false;
            }
            int i = dVar.f21780e + 1;
            dVar.f21780e = i;
            if (i > C9777h.this.f21760j.mo29487c(3)) {
                return false;
            }
            C8273n nVar = new C8273n(dVar.f21776a, k0Var.f21827k, k0Var.f21828l, k0Var.f21829m, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f21778c, k0Var.f21830n);
            C8284q qVar = new C8284q(3);
            if (k0Var.getCause() instanceof IOException) {
                iOException = (IOException) k0Var.getCause();
            } else {
                iOException = new C9783f(k0Var.getCause());
            }
            long a = C9777h.this.f21760j.mo29489a(new AbstractC5318g.C5319a(nVar, qVar, iOException, dVar.f21780e));
            if (a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f21774a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a);
                return true;
            }
        }

        /* renamed from: b */
        void m15369b(int i, Object obj, boolean z) {
            obtainMessage(i, new C9781d(C8273n.m20108a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void m15368c() {
            removeCallbacksAndMessages(null);
            this.f21774a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                k7.h$d r0 = (p193k7.C9777h.C9781d) r0
                int r1 = r6.what     // Catch: Exception -> 0x002f, k0 -> 0x0038
                if (r1 == 0) goto L_0x0020
                r2 = 1
                if (r1 != r2) goto L_0x001a
                k7.h r1 = p193k7.C9777h.this     // Catch: Exception -> 0x002f, k0 -> 0x0038
                k7.j0 r2 = r1.f21761k     // Catch: Exception -> 0x002f, k0 -> 0x0038
                java.util.UUID r1 = r1.f21762l     // Catch: Exception -> 0x002f, k0 -> 0x0038
                java.lang.Object r3 = r0.f21779d     // Catch: Exception -> 0x002f, k0 -> 0x0038
                k7.c0$b r3 = (p193k7.AbstractC9763c0.C9765b) r3     // Catch: Exception -> 0x002f, k0 -> 0x0038
                byte[] r1 = r2.mo15333b(r1, r3)     // Catch: Exception -> 0x002f, k0 -> 0x0038
                goto L_0x0040
            L_0x001a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: Exception -> 0x002f, k0 -> 0x0038
                r1.<init>()     // Catch: Exception -> 0x002f, k0 -> 0x0038
                throw r1     // Catch: Exception -> 0x002f, k0 -> 0x0038
            L_0x0020:
                k7.h r1 = p193k7.C9777h.this     // Catch: Exception -> 0x002f, k0 -> 0x0038
                k7.j0 r2 = r1.f21761k     // Catch: Exception -> 0x002f, k0 -> 0x0038
                java.util.UUID r1 = r1.f21762l     // Catch: Exception -> 0x002f, k0 -> 0x0038
                java.lang.Object r3 = r0.f21779d     // Catch: Exception -> 0x002f, k0 -> 0x0038
                k7.c0$e r3 = (p193k7.AbstractC9763c0.C9768e) r3     // Catch: Exception -> 0x002f, k0 -> 0x0038
                byte[] r1 = r2.mo15334a(r1, r3)     // Catch: Exception -> 0x002f, k0 -> 0x0038
                goto L_0x0040
            L_0x002f:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p119g9.C7558r.m22103i(r2, r3, r1)
                goto L_0x0040
            L_0x0038:
                r1 = move-exception
                boolean r2 = r5.m15370a(r6, r1)
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                k7.h r2 = p193k7.C9777h.this
                com.google.android.exoplayer2.upstream.g r2 = p193k7.C9777h.m15386k(r2)
                long r3 = r0.f21776a
                r2.mo29486d(r3)
                monitor-enter(r5)
                boolean r2 = r5.f21774a     // Catch: all -> 0x0065
                if (r2 != 0) goto L_0x0063
                k7.h r2 = p193k7.C9777h.this     // Catch: all -> 0x0065
                k7.h$e r2 = r2.f21763m     // Catch: all -> 0x0065
                int r6 = r6.what     // Catch: all -> 0x0065
                java.lang.Object r0 = r0.f21779d     // Catch: all -> 0x0065
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: all -> 0x0065
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch: all -> 0x0065
                r6.sendToTarget()     // Catch: all -> 0x0065
            L_0x0063:
                monitor-exit(r5)     // Catch: all -> 0x0065
                return
            L_0x0065:
                r6 = move-exception
                monitor-exit(r5)     // Catch: all -> 0x0065
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p193k7.C9777h.HandlerC9780c.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.h$d */
    /* loaded from: classes7.dex */
    public static final class C9781d {

        /* renamed from: a */
        public final long f21776a;

        /* renamed from: b */
        public final boolean f21777b;

        /* renamed from: c */
        public final long f21778c;

        /* renamed from: d */
        public final Object f21779d;

        /* renamed from: e */
        public int f21780e;

        public C9781d(long j, boolean z, long j2, Object obj) {
            this.f21776a = j;
            this.f21777b = z;
            this.f21778c = j2;
            this.f21779d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: k7.h$e */
    /* loaded from: classes7.dex */
    private class HandlerC9782e extends Handler {
        public HandlerC9782e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C9777h.this.m15372y(obj, obj2);
            } else if (i == 1) {
                C9777h.this.m15378s(obj, obj2);
            }
        }
    }

    /* renamed from: k7.h$f */
    /* loaded from: classes7.dex */
    public static final class C9783f extends IOException {
        public C9783f(Throwable th2) {
            super(th2);
        }
    }

    public C9777h(UUID uuid, AbstractC9763c0 c0Var, AbstractC9778a aVar, AbstractC9779b bVar, List<C9798l.C9800b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, AbstractC9795j0 j0Var, Looper looper, AbstractC5318g gVar) {
        if (i == 1 || i == 3) {
            C7510a.m22367e(bArr);
        }
        this.f21762l = uuid;
        this.f21753c = aVar;
        this.f21754d = bVar;
        this.f21752b = c0Var;
        this.f21755e = i;
        this.f21756f = z;
        this.f21757g = z2;
        if (bArr != null) {
            this.f21771u = bArr;
            this.f21751a = null;
        } else {
            this.f21751a = Collections.unmodifiableList((List) C7510a.m22367e(list));
        }
        this.f21758h = hashMap;
        this.f21761k = j0Var;
        this.f21759i = new C7532h<>();
        this.f21760j = gVar;
        this.f21764n = 2;
        this.f21763m = new HandlerC9782e(looper);
    }

    /* renamed from: A */
    private void m15392A(byte[] bArr, int i, boolean z) {
        try {
            this.f21772v = this.f21752b.mo15264k(bArr, this.f21751a, i, this.f21758h);
            ((HandlerC9780c) C7557q0.m22145j(this.f21767q)).m15369b(1, C7510a.m22367e(this.f21772v), z);
        } catch (Exception e) {
            m15377t(e);
        }
    }

    /* renamed from: C */
    private boolean m15390C() {
        try {
            this.f21752b.mo15268g(this.f21770t, this.f21771u);
            return true;
        } catch (Exception e) {
            C7558r.m22108d("DefaultDrmSession", "Error trying to restore keys.", e);
            m15379r(e);
            return false;
        }
    }

    /* renamed from: l */
    private void m15385l(AbstractC7526g<AbstractC9815v.C9816a> gVar) {
        for (AbstractC9815v.C9816a aVar : this.f21759i.m22306n()) {
            gVar.accept(aVar);
        }
    }

    /* renamed from: m */
    private void m15384m(boolean z) {
        if (!this.f21757g) {
            byte[] bArr = (byte[]) C7557q0.m22145j(this.f21770t);
            int i = this.f21755e;
            if (i == 0 || i == 1) {
                if (this.f21771u == null) {
                    m15392A(bArr, 1, z);
                } else if (this.f21764n == 4 || m15390C()) {
                    long n = m15383n();
                    if (this.f21755e == 0 && n <= 60) {
                        C7558r.m22110b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + n);
                        m15392A(bArr, 2, z);
                    } else if (n <= 0) {
                        m15379r(new C9793i0());
                    } else {
                        this.f21764n = 4;
                        m15385l(new AbstractC7526g() { // from class: k7.f
                            @Override // p119g9.AbstractC7526g
                            public final void accept(Object obj) {
                                ((AbstractC9815v.C9816a) obj).m15290j();
                            }
                        });
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    C7510a.m22367e(this.f21771u);
                    C7510a.m22367e(this.f21770t);
                    if (m15390C()) {
                        m15392A(this.f21771u, 3, z);
                    }
                }
            } else if (this.f21771u == null || m15390C()) {
                m15392A(bArr, 2, z);
            }
        }
    }

    /* renamed from: n */
    private long m15383n() {
        if (!C6713c.f14280d.equals(this.f21762l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C7510a.m22367e(C9807n0.m15308b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: p */
    private boolean m15381p() {
        int i = this.f21764n;
        return i == 3 || i == 4;
    }

    /* renamed from: r */
    private void m15379r(final Exception exc) {
        this.f21769s = new AbstractC9805n.C9806a(exc);
        m15385l(new AbstractC7526g() { // from class: k7.e
            @Override // p119g9.AbstractC7526g
            public final void accept(Object obj) {
                ((AbstractC9815v.C9816a) obj).m15288l(exc);
            }
        });
        if (this.f21764n != 4) {
            this.f21764n = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m15378s(Object obj, Object obj2) {
        if (obj == this.f21772v && m15381p()) {
            this.f21772v = null;
            if (obj2 instanceof Exception) {
                m15377t((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f21755e == 3) {
                    this.f21752b.mo15265j((byte[]) C7557q0.m22145j(this.f21771u), bArr);
                    m15385l(new AbstractC7526g() { // from class: k7.c
                        @Override // p119g9.AbstractC7526g
                        public final void accept(Object obj3) {
                            ((AbstractC9815v.C9816a) obj3).m15291i();
                        }
                    });
                    return;
                }
                byte[] j = this.f21752b.mo15265j(this.f21770t, bArr);
                int i = this.f21755e;
                if (!((i != 2 && (i != 0 || this.f21771u == null)) || j == null || j.length == 0)) {
                    this.f21771u = j;
                }
                this.f21764n = 4;
                m15385l(new AbstractC7526g() { // from class: k7.d
                    @Override // p119g9.AbstractC7526g
                    public final void accept(Object obj3) {
                        ((AbstractC9815v.C9816a) obj3).m15292h();
                    }
                });
            } catch (Exception e) {
                m15377t(e);
            }
        }
    }

    /* renamed from: t */
    private void m15377t(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f21753c.mo15340b(this);
        } else {
            m15379r(exc);
        }
    }

    /* renamed from: u */
    private void m15376u() {
        if (this.f21755e == 0 && this.f21764n == 4) {
            C7557q0.m22145j(this.f21770t);
            m15384m(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m15372y(Object obj, Object obj2) {
        if (obj != this.f21773w) {
            return;
        }
        if (this.f21764n == 2 || m15381p()) {
            this.f21773w = null;
            if (obj2 instanceof Exception) {
                this.f21753c.mo15339c((Exception) obj2);
                return;
            }
            try {
                this.f21752b.mo15267h((byte[]) obj2);
                this.f21753c.mo15341a();
            } catch (Exception e) {
                this.f21753c.mo15339c(e);
            }
        }
    }

    /* renamed from: z */
    private boolean m15371z(boolean z) {
        if (m15381p()) {
            return true;
        }
        try {
            byte[] f = this.f21752b.mo15269f();
            this.f21770t = f;
            this.f21768r = this.f21752b.mo15271d(f);
            m15385l(new AbstractC7526g() { // from class: k7.b
                @Override // p119g9.AbstractC7526g
                public final void accept(Object obj) {
                    ((AbstractC9815v.C9816a) obj).m15289k();
                }
            });
            this.f21764n = 3;
            C7510a.m22367e(this.f21770t);
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.f21753c.mo15340b(this);
                return false;
            }
            m15379r(e);
            return false;
        } catch (Exception e2) {
            m15379r(e2);
            return false;
        }
    }

    /* renamed from: B */
    public void m15391B() {
        this.f21773w = this.f21752b.mo15270e();
        ((HandlerC9780c) C7557q0.m22145j(this.f21767q)).m15369b(0, C7510a.m22367e(this.f21773w), true);
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: a */
    public final UUID mo15316a() {
        return this.f21762l;
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: b */
    public boolean mo15315b() {
        return this.f21756f;
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: c */
    public final AbstractC9761b0 mo15314c() {
        return this.f21768r;
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: d */
    public final AbstractC9805n.C9806a mo15313d() {
        if (this.f21764n == 1) {
            return this.f21769s;
        }
        return null;
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: e */
    public void mo15312e(AbstractC9815v.C9816a aVar) {
        boolean z;
        if (this.f21765o > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        int i = this.f21765o - 1;
        this.f21765o = i;
        if (i == 0) {
            this.f21764n = 0;
            ((HandlerC9782e) C7557q0.m22145j(this.f21763m)).removeCallbacksAndMessages(null);
            ((HandlerC9780c) C7557q0.m22145j(this.f21767q)).m15368c();
            this.f21767q = null;
            ((HandlerThread) C7557q0.m22145j(this.f21766p)).quit();
            this.f21766p = null;
            this.f21768r = null;
            this.f21769s = null;
            this.f21772v = null;
            this.f21773w = null;
            byte[] bArr = this.f21770t;
            if (bArr != null) {
                this.f21752b.mo15266i(bArr);
                this.f21770t = null;
            }
            m15385l(new AbstractC7526g() { // from class: k7.g
                @Override // p119g9.AbstractC7526g
                public final void accept(Object obj) {
                    ((AbstractC9815v.C9816a) obj).m15287m();
                }
            });
        }
        if (aVar != null) {
            if (m15381p()) {
                aVar.m15287m();
            }
            this.f21759i.m22307b(aVar);
        }
        this.f21754d.mo15338a(this, this.f21765o);
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: f */
    public void mo15311f(AbstractC9815v.C9816a aVar) {
        boolean z;
        boolean z2 = false;
        if (this.f21765o >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (aVar != null) {
            this.f21759i.m22308a(aVar);
        }
        int i = this.f21765o + 1;
        this.f21765o = i;
        if (i == 1) {
            if (this.f21764n == 2) {
                z2 = true;
            }
            C7510a.m22366f(z2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f21766p = handlerThread;
            handlerThread.start();
            this.f21767q = new HandlerC9780c(this.f21766p.getLooper());
            if (m15371z(true)) {
                m15384m(true);
            }
        } else if (aVar != null && m15381p()) {
            aVar.m15289k();
        }
        this.f21754d.mo15337b(this, this.f21765o);
    }

    @Override // p193k7.AbstractC9805n
    /* renamed from: g */
    public Map<String, String> mo15310g() {
        byte[] bArr = this.f21770t;
        if (bArr == null) {
            return null;
        }
        return this.f21752b.mo15272c(bArr);
    }

    @Override // p193k7.AbstractC9805n
    public final int getState() {
        return this.f21764n;
    }

    /* renamed from: o */
    public boolean m15382o(byte[] bArr) {
        return Arrays.equals(this.f21770t, bArr);
    }

    /* renamed from: v */
    public void m15375v(int i) {
        if (i == 2) {
            m15376u();
        }
    }

    /* renamed from: w */
    public void m15374w() {
        if (m15371z(false)) {
            m15384m(true);
        }
    }

    /* renamed from: x */
    public void m15373x(Exception exc) {
        m15379r(exc);
    }
}
