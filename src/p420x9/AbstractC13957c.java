package p420x9;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p365u9.C13215a;
import p365u9.C13217c;
import p365u9.C13221g;

/* renamed from: x9.c */
/* loaded from: classes5.dex */
public abstract class AbstractC13957c<T extends IInterface> {

    /* renamed from: A */
    private T f39426A;

    /* renamed from: C */
    private ServiceConnectionC13956b1 f39428C;

    /* renamed from: E */
    private final AbstractC13958a f39430E;

    /* renamed from: F */
    private final AbstractC13959b f39431F;

    /* renamed from: G */
    private final int f39432G;

    /* renamed from: H */
    private final String f39433H;

    /* renamed from: I */
    private volatile String f39434I;

    /* renamed from: k */
    private int f31460k;

    /* renamed from: l */
    private long f31461l;

    /* renamed from: m */
    private long f31462m;

    /* renamed from: n */
    private int f31463n;

    /* renamed from: o */
    private long f31464o;

    /* renamed from: q */
    C14006p1 f31466q;

    /* renamed from: r */
    private final Context f31467r;

    /* renamed from: s */
    private final Looper f31468s;

    /* renamed from: t */
    private final AbstractC13977h f31469t;

    /* renamed from: u */
    private final C13221g f31470u;

    /* renamed from: v */
    final Handler f31471v;

    /* renamed from: y */
    private AbstractC13990l f31474y;

    /* renamed from: z */
    protected AbstractC0452c f31475z;

    /* renamed from: O */
    private static final C13217c[] f39425O = new C13217c[0];

    /* renamed from: N */
    public static final String[] f39424N = {"service_esmobile", "service_googleme"};

    /* renamed from: p */
    private volatile String f31465p = null;

    /* renamed from: w */
    private final Object f31472w = new Object();

    /* renamed from: x */
    private final Object f31473x = new Object();

    /* renamed from: B */
    private final ArrayList<AbstractC14030z0<?>> f39427B = new ArrayList<>();

    /* renamed from: D */
    private int f39429D = 1;

    /* renamed from: J */
    private C13215a f39435J = null;

    /* renamed from: K */
    private boolean f39436K = false;

    /* renamed from: L */
    private volatile C13970e1 f39437L = null;

    /* renamed from: M */
    protected AtomicInteger f39438M = new AtomicInteger(0);

    /* renamed from: x9.c$a */
    /* loaded from: classes5.dex */
    public interface AbstractC13958a {
        /* renamed from: c */
        void mo2116c(Bundle bundle);

        /* renamed from: e */
        void mo2115e(int i);
    }

    /* renamed from: x9.c$b */
    /* loaded from: classes5.dex */
    public interface AbstractC13959b {
        /* renamed from: b */
        void mo2107b(C13215a aVar);
    }

    /* renamed from: x9.c$c */
    /* loaded from: classes5.dex */
    public interface AbstractC0452c {
        /* renamed from: c */
        void mo2144c(C13215a aVar);
    }

    /* renamed from: x9.c$d */
    /* loaded from: classes5.dex */
    protected class C13960d implements AbstractC0452c {
        public C13960d() {
        }

        @Override // p420x9.AbstractC13957c.AbstractC0452c
        /* renamed from: c */
        public final void mo2144c(C13215a aVar) {
            if (aVar.m4294z()) {
                AbstractC13957c cVar = AbstractC13957c.this;
                cVar.m2154i(null, cVar.mo2114B());
            } else if (AbstractC13957c.this.f39431F != null) {
                AbstractC13957c.this.f39431F.mo2107b(aVar);
            }
        }
    }

    /* renamed from: x9.c$e */
    /* loaded from: classes5.dex */
    public interface AbstractC13961e {
        /* renamed from: a */
        void mo2143a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13957c(Context context, Looper looper, AbstractC13977h hVar, C13221g gVar, int i, AbstractC13958a aVar, AbstractC13959b bVar, String str) {
        C14004p.m2050k(context, "Context must not be null");
        this.f31467r = context;
        C14004p.m2050k(looper, "Looper must not be null");
        this.f31468s = looper;
        C14004p.m2050k(hVar, "Supervisor must not be null");
        this.f31469t = hVar;
        C14004p.m2050k(gVar, "API availability must not be null");
        this.f31470u = gVar;
        this.f31471v = new HandlerC14028y0(this, looper);
        this.f39432G = i;
        this.f39430E = aVar;
        this.f39431F = bVar;
        this.f39433H = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static /* bridge */ /* synthetic */ void m2167a0(AbstractC13957c cVar, C13970e1 e1Var) {
        C14010r rVar;
        cVar.f39437L = e1Var;
        if (cVar.mo2178Q()) {
            C13968e eVar = e1Var.f31509n;
            C14007q b = C14007q.m2042b();
            if (eVar == null) {
                rVar = null;
            } else {
                rVar = eVar.m2126B();
            }
            b.m2041c(rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m2165b0(AbstractC13957c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f31472w) {
            i2 = cVar.f39429D;
        }
        if (i2 == 3) {
            cVar.f39436K = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f31471v;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f39438M.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public static /* bridge */ /* synthetic */ boolean m2159e0(AbstractC13957c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f31472w) {
            if (cVar.f39429D != i) {
                return false;
            }
            cVar.m2155g0(i2, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:686)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:765)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: f0 */
    static /* bridge */ /* synthetic */ boolean m2157f0(p420x9.AbstractC13957c r2) {
        /*
            boolean r0 = r2.f39436K
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0024
        L_0x0006:
            java.lang.String r0 = r2.mo146D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            java.lang.String r0 = r2.m2190A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            java.lang.String r2 = r2.mo146D()     // Catch: ClassNotFoundException -> 0x0024
            java.lang.Class.forName(r2)     // Catch: ClassNotFoundException -> 0x0024
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p420x9.AbstractC13957c.m2157f0(x9.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m2155g0(int i, T t) {
        boolean z;
        boolean z2;
        C14006p1 p1Var;
        String str;
        C14006p1 p1Var2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (t == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        C14004p.m2060a(z3);
        synchronized (this.f31472w) {
            this.f39429D = i;
            this.f39426A = t;
            if (i == 1) {
                ServiceConnectionC13956b1 b1Var = this.f39428C;
                if (b1Var != null) {
                    AbstractC13977h hVar = this.f31469t;
                    String c = this.f31466q.m2045c();
                    C14004p.m2051j(c);
                    hVar.m2103e(c, this.f31466q.m2046b(), this.f31466q.m2047a(), b1Var, m2173V(), this.f31466q.m2044d());
                    this.f39428C = null;
                }
            } else if (i == 2 || i == 3) {
                ServiceConnectionC13956b1 b1Var2 = this.f39428C;
                if (!(b1Var2 == null || (p1Var2 = this.f31466q) == null)) {
                    String c2 = p1Var2.m2045c();
                    String b = p1Var2.m2046b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(b).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(c2);
                    sb2.append(" on ");
                    sb2.append(b);
                    Log.e("GmsClient", sb2.toString());
                    AbstractC13977h hVar2 = this.f31469t;
                    String c3 = this.f31466q.m2045c();
                    C14004p.m2051j(c3);
                    hVar2.m2103e(c3, this.f31466q.m2046b(), this.f31466q.m2047a(), b1Var2, m2173V(), this.f31466q.m2044d());
                    this.f39438M.incrementAndGet();
                }
                ServiceConnectionC13956b1 b1Var3 = new ServiceConnectionC13956b1(this, this.f39438M.get());
                this.f39428C = b1Var3;
                if (this.f39429D != 3 || m2190A() == null) {
                    p1Var = new C14006p1(m2188F(), mo145E(), false, AbstractC13977h.m2106a(), mo144H());
                } else {
                    p1Var = new C14006p1(m2146x().getPackageName(), m2190A(), true, AbstractC13977h.m2106a(), false);
                }
                this.f31466q = p1Var;
                if (!p1Var.m2044d() || mo143n() >= 17895000) {
                    AbstractC13977h hVar3 = this.f31469t;
                    String c4 = this.f31466q.m2045c();
                    C14004p.m2051j(c4);
                    if (!hVar3.mo2078f(new C13982i1(c4, this.f31466q.m2046b(), this.f31466q.m2047a(), this.f31466q.m2044d()), b1Var3, m2173V(), mo2108v())) {
                        String c5 = this.f31466q.m2045c();
                        String b2 = this.f31466q.m2046b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(c5).length() + 34 + String.valueOf(b2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(c5);
                        sb3.append(" on ");
                        sb3.append(b2);
                        Log.w("GmsClient", sb3.toString());
                        m2163c0(16, null, this.f39438M.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f31466q.m2045c());
                    if (valueOf.length() != 0) {
                        str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                    } else {
                        str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                    }
                    throw new IllegalStateException(str);
                }
            } else if (i == 4) {
                C14004p.m2051j(t);
                mo2185J(t);
            }
        }
    }

    /* renamed from: A */
    protected String m2190A() {
        return null;
    }

    /* renamed from: B */
    protected Set<Scope> mo2114B() {
        return Collections.emptySet();
    }

    /* renamed from: C */
    public final T m2189C() {
        T t;
        synchronized (this.f31472w) {
            if (this.f39429D != 5) {
                m2149q();
                t = this.f39426A;
                C14004p.m2050k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo146D();

    /* renamed from: E */
    protected abstract String mo145E();

    /* renamed from: F */
    protected String m2188F() {
        return "com.google.android.gms";
    }

    /* renamed from: G */
    public C13968e m2187G() {
        C13970e1 e1Var = this.f39437L;
        if (e1Var == null) {
            return null;
        }
        return e1Var.f31509n;
    }

    /* renamed from: H */
    protected boolean mo144H() {
        return mo143n() >= 211700000;
    }

    /* renamed from: I */
    public boolean m2186I() {
        return this.f39437L != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public void mo2185J(T t) {
        this.f31462m = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void m2184K(C13215a aVar) {
        this.f31463n = aVar.m4298p();
        this.f31464o = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void mo2183L(int i) {
        this.f31460k = i;
        this.f31461l = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void m2182M(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f31471v;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C13963c1(this, i, iBinder, bundle)));
    }

    /* renamed from: N */
    public boolean m2181N() {
        return false;
    }

    /* renamed from: O */
    public void m2180O(String str) {
        this.f39434I = str;
    }

    /* renamed from: P */
    public void m2179P(int i) {
        Handler handler = this.f31471v;
        handler.sendMessage(handler.obtainMessage(6, this.f39438M.get(), i));
    }

    /* renamed from: Q */
    public boolean mo2178Q() {
        return false;
    }

    /* renamed from: V */
    protected final String m2173V() {
        String str = this.f39433H;
        return str == null ? this.f31467r.getClass().getName() : str;
    }

    /* renamed from: a */
    public boolean m2168a() {
        boolean z;
        synchronized (this.f31472w) {
            if (this.f39429D == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void m2166b(String str) {
        this.f31465p = str;
        mo2152l();
    }

    /* renamed from: c */
    public boolean m2164c() {
        boolean z;
        synchronized (this.f31472w) {
            int i = this.f39429D;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c0 */
    public final void m2163c0(int i, Bundle bundle, int i2) {
        Handler handler = this.f31471v;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C13967d1(this, i, null)));
    }

    /* renamed from: d */
    public String m2162d() {
        C14006p1 p1Var;
        if (m2168a() && (p1Var = this.f31466q) != null) {
            return p1Var.m2046b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: e */
    public boolean mo2160e() {
        return true;
    }

    /* renamed from: f */
    public void m2158f(AbstractC0452c cVar) {
        C14004p.m2050k(cVar, "Connection progress callbacks cannot be null.");
        this.f31475z = cVar;
        m2155g0(2, null);
    }

    /* renamed from: g */
    public boolean mo2156g() {
        return false;
    }

    /* renamed from: i */
    public void m2154i(AbstractC13983j jVar, Set<Scope> set) {
        Throwable e;
        Bundle z = mo140z();
        C13971f fVar = new C13971f(this.f39432G, this.f39434I);
        fVar.f31513n = this.f31467r.getPackageName();
        fVar.f31516q = z;
        if (set != null) {
            fVar.f31515p = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo2156g()) {
            Account t = mo2109t();
            if (t == null) {
                t = new Account("<<default account>>", "com.google");
            }
            fVar.f31517r = t;
            if (jVar != null) {
                fVar.f31514o = jVar.asBinder();
            }
        } else if (m2181N()) {
            fVar.f31517r = mo2109t();
        }
        fVar.f31518s = f39425O;
        fVar.f31519t = mo141u();
        if (mo2178Q()) {
            fVar.f31522w = true;
        }
        try {
            synchronized (this.f31473x) {
                AbstractC13990l lVar = this.f31474y;
                if (lVar != null) {
                    lVar.mo2021U(new BinderC13953a1(this, this.f39438M.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m2179P(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m2182M(8, null, null, this.f39438M.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m2182M(8, null, null, this.f39438M.get());
        }
    }

    /* renamed from: k */
    public void m2153k(AbstractC13961e eVar) {
        eVar.mo2143a();
    }

    /* renamed from: l */
    public void mo2152l() {
        this.f39438M.incrementAndGet();
        synchronized (this.f39427B) {
            int size = this.f39427B.size();
            for (int i = 0; i < size; i++) {
                this.f39427B.get(i).m2010d();
            }
            this.f39427B.clear();
        }
        synchronized (this.f31473x) {
            this.f31474y = null;
        }
        m2155g0(1, null);
    }

    /* renamed from: n */
    public int mo143n() {
        return C13221g.f29689a;
    }

    /* renamed from: o */
    public final C13217c[] m2151o() {
        C13970e1 e1Var = this.f39437L;
        if (e1Var == null) {
            return null;
        }
        return e1Var.f31507l;
    }

    /* renamed from: p */
    public String m2150p() {
        return this.f31465p;
    }

    /* renamed from: q */
    protected final void m2149q() {
        if (!m2168a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public abstract T mo142r(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public boolean m2148s() {
        return false;
    }

    /* renamed from: t */
    public Account mo2109t() {
        return null;
    }

    /* renamed from: u */
    public C13217c[] mo141u() {
        return f39425O;
    }

    /* renamed from: v */
    protected Executor mo2108v() {
        return null;
    }

    /* renamed from: w */
    public Bundle m2147w() {
        return null;
    }

    /* renamed from: x */
    public final Context m2146x() {
        return this.f31467r;
    }

    /* renamed from: y */
    public int m2145y() {
        return this.f39432G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public Bundle mo140z() {
        return new Bundle();
    }
}
