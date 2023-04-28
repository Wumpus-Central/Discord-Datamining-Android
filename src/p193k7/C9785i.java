package p193k7;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import cc.AbstractC3868g2;
import cc.AbstractC3884i0;
import cc.AbstractC3960w0;
import cc.C3828b2;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5309d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p079e7.C6713c;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p193k7.AbstractC9763c0;
import p193k7.AbstractC9805n;
import p193k7.AbstractC9815v;
import p193k7.C9777h;
import p193k7.C9798l;

/* renamed from: k7.i */
/* loaded from: classes7.dex */
public class C9785i implements AbstractC9818x {

    /* renamed from: c */
    private final UUID f21786c;

    /* renamed from: d */
    private final AbstractC9763c0.AbstractC9767d f21787d;

    /* renamed from: e */
    private final AbstractC9795j0 f21788e;

    /* renamed from: f */
    private final HashMap<String, String> f21789f;

    /* renamed from: g */
    private final boolean f21790g;

    /* renamed from: h */
    private final int[] f21791h;

    /* renamed from: i */
    private final boolean f21792i;

    /* renamed from: j */
    private final C9791f f21793j;

    /* renamed from: k */
    private final AbstractC5318g f21794k;

    /* renamed from: l */
    private final C9792g f21795l;

    /* renamed from: m */
    private final long f21796m;

    /* renamed from: n */
    private final List<C9777h> f21797n;

    /* renamed from: o */
    private final List<C9777h> f21798o;

    /* renamed from: p */
    private final Set<C9777h> f21799p;

    /* renamed from: q */
    private int f21800q;

    /* renamed from: r */
    private AbstractC9763c0 f21801r;

    /* renamed from: s */
    private C9777h f21802s;

    /* renamed from: t */
    private C9777h f21803t;

    /* renamed from: u */
    private Looper f21804u;

    /* renamed from: v */
    private Handler f21805v;

    /* renamed from: w */
    private int f21806w;

    /* renamed from: x */
    private byte[] f21807x;

    /* renamed from: y */
    volatile HandlerC9789d f21808y;

    /* renamed from: k7.i$b */
    /* loaded from: classes7.dex */
    public static final class C9787b {

        /* renamed from: d */
        private boolean f21812d;

        /* renamed from: f */
        private boolean f21814f;

        /* renamed from: a */
        private final HashMap<String, String> f21809a = new HashMap<>();

        /* renamed from: b */
        private UUID f21810b = C6713c.f14280d;

        /* renamed from: c */
        private AbstractC9763c0.AbstractC9767d f21811c = C9776g0.f21747d;

        /* renamed from: g */
        private AbstractC5318g f21815g = new C5309d();

        /* renamed from: e */
        private int[] f21813e = new int[0];

        /* renamed from: h */
        private long f21816h = 300000;

        /* renamed from: a */
        public C9785i m15347a(AbstractC9795j0 j0Var) {
            return new C9785i(this.f21810b, this.f21811c, j0Var, this.f21809a, this.f21812d, this.f21813e, this.f21814f, this.f21815g, this.f21816h);
        }

        /* renamed from: b */
        public C9787b m15346b(boolean z) {
            this.f21812d = z;
            return this;
        }

        /* renamed from: c */
        public C9787b m15345c(boolean z) {
            this.f21814f = z;
            return this;
        }

        /* renamed from: d */
        public C9787b m15344d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                C7510a.m22371a(z);
            }
            this.f21813e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public C9787b m15343e(UUID uuid, AbstractC9763c0.AbstractC9767d dVar) {
            this.f21810b = (UUID) C7510a.m22367e(uuid);
            this.f21811c = (AbstractC9763c0.AbstractC9767d) C7510a.m22367e(dVar);
            return this;
        }
    }

    /* renamed from: k7.i$c */
    /* loaded from: classes7.dex */
    private class C9788c implements AbstractC9763c0.AbstractC9766c {
        private C9788c() {
        }

        @Override // p193k7.AbstractC9763c0.AbstractC9766c
        /* renamed from: a */
        public void mo15342a(AbstractC9763c0 c0Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC9789d) C7510a.m22367e(C9785i.this.f21808y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: k7.i$d */
    /* loaded from: classes7.dex */
    public class HandlerC9789d extends Handler {
        public HandlerC9789d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C9777h hVar : C9785i.this.f21797n) {
                    if (hVar.m15382o(bArr)) {
                        hVar.m15375v(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: k7.i$e */
    /* loaded from: classes7.dex */
    public static final class C9790e extends Exception {
        private C9790e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.i$f */
    /* loaded from: classes7.dex */
    public class C9791f implements C9777h.AbstractC9778a {
        private C9791f() {
        }

        @Override // p193k7.C9777h.AbstractC9778a
        /* renamed from: a */
        public void mo15341a() {
            for (C9777h hVar : C9785i.this.f21798o) {
                hVar.m15374w();
            }
            C9785i.this.f21798o.clear();
        }

        @Override // p193k7.C9777h.AbstractC9778a
        /* renamed from: b */
        public void mo15340b(C9777h hVar) {
            if (!C9785i.this.f21798o.contains(hVar)) {
                C9785i.this.f21798o.add(hVar);
                if (C9785i.this.f21798o.size() == 1) {
                    hVar.m15391B();
                }
            }
        }

        @Override // p193k7.C9777h.AbstractC9778a
        /* renamed from: c */
        public void mo15339c(Exception exc) {
            for (C9777h hVar : C9785i.this.f21798o) {
                hVar.m15373x(exc);
            }
            C9785i.this.f21798o.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.i$g */
    /* loaded from: classes7.dex */
    public class C9792g implements C9777h.AbstractC9779b {
        private C9792g() {
        }

        @Override // p193k7.C9777h.AbstractC9779b
        /* renamed from: a */
        public void mo15338a(final C9777h hVar, int i) {
            if (i == 1 && C9785i.this.f21796m != -9223372036854775807L) {
                C9785i.this.f21799p.add(hVar);
                ((Handler) C7510a.m22367e(C9785i.this.f21805v)).postAtTime(new Runnable() { // from class: k7.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9777h.this.mo15312e(null);
                    }
                }, hVar, SystemClock.uptimeMillis() + C9785i.this.f21796m);
            } else if (i == 0) {
                C9785i.this.f21797n.remove(hVar);
                if (C9785i.this.f21802s == hVar) {
                    C9785i.this.f21802s = null;
                }
                if (C9785i.this.f21803t == hVar) {
                    C9785i.this.f21803t = null;
                }
                if (C9785i.this.f21798o.size() > 1 && C9785i.this.f21798o.get(0) == hVar) {
                    ((C9777h) C9785i.this.f21798o.get(1)).m15391B();
                }
                C9785i.this.f21798o.remove(hVar);
                if (C9785i.this.f21796m != -9223372036854775807L) {
                    ((Handler) C7510a.m22367e(C9785i.this.f21805v)).removeCallbacksAndMessages(hVar);
                    C9785i.this.f21799p.remove(hVar);
                }
            }
        }

        @Override // p193k7.C9777h.AbstractC9779b
        /* renamed from: b */
        public void mo15337b(C9777h hVar, int i) {
            if (C9785i.this.f21796m != -9223372036854775807L) {
                C9785i.this.f21799p.remove(hVar);
                ((Handler) C7510a.m22367e(C9785i.this.f21805v)).removeCallbacksAndMessages(hVar);
            }
        }
    }

    /* renamed from: m */
    private boolean m15355m(C9798l lVar) {
        if (this.f21807x != null) {
            return true;
        }
        if (m15352p(lVar, this.f21786c, true).isEmpty()) {
            if (lVar.f21834n != 1 || !lVar.m15329O(0).m15320f(C6713c.f14278b)) {
                return false;
            }
            C7558r.m22104h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f21786c);
        }
        String str = lVar.f21833m;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (C7557q0.f16368a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: n */
    private C9777h m15354n(List<C9798l.C9800b> list, boolean z, AbstractC9815v.C9816a aVar) {
        C7510a.m22367e(this.f21801r);
        C9777h hVar = new C9777h(this.f21786c, this.f21801r, this.f21793j, this.f21795l, list, this.f21806w, this.f21792i | z, z, this.f21807x, this.f21789f, this.f21788e, (Looper) C7510a.m22367e(this.f21804u), this.f21794k);
        hVar.mo15311f(aVar);
        if (this.f21796m != -9223372036854775807L) {
            hVar.mo15311f(null);
        }
        return hVar;
    }

    /* renamed from: o */
    private C9777h m15353o(List<C9798l.C9800b> list, boolean z, AbstractC9815v.C9816a aVar) {
        C9777h n = m15354n(list, z, aVar);
        if (n.getState() != 1) {
            return n;
        }
        if ((C7557q0.f16368a >= 19 && !(((AbstractC9805n.C9806a) C7510a.m22367e(n.mo15313d())).getCause() instanceof ResourceBusyException)) || this.f21799p.isEmpty()) {
            return n;
        }
        AbstractC3868g2 j = AbstractC3960w0.m33259t(this.f21799p).iterator();
        while (j.hasNext()) {
            ((AbstractC9805n) j.next()).mo15312e(null);
        }
        n.mo15312e(aVar);
        if (this.f21796m != -9223372036854775807L) {
            n.mo15312e(null);
        }
        return m15354n(list, z, aVar);
    }

    /* renamed from: p */
    private static List<C9798l.C9800b> m15352p(C9798l lVar, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(lVar.f21834n);
        for (int i = 0; i < lVar.f21834n; i++) {
            C9798l.C9800b O = lVar.m15329O(i);
            if (O.m15320f(uuid) || (C6713c.f14279c.equals(uuid) && O.m15320f(C6713c.f14278b))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (O.f21839o != null || z)) {
                arrayList.add(O);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private void m15351q(Looper looper) {
        boolean z;
        Looper looper2 = this.f21804u;
        if (looper2 == null) {
            this.f21804u = looper;
            this.f21805v = new Handler(looper);
            return;
        }
        if (looper2 == looper) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
    }

    /* renamed from: r */
    private AbstractC9805n m15350r(int i) {
        boolean z;
        AbstractC9763c0 c0Var = (AbstractC9763c0) C7510a.m22367e(this.f21801r);
        if (!C9770d0.class.equals(c0Var.mo15273b()) || !C9770d0.f21740d) {
            z = false;
        } else {
            z = true;
        }
        if (z || C7557q0.m22122u0(this.f21791h, i) == -1 || C9804m0.class.equals(c0Var.mo15273b())) {
            return null;
        }
        C9777h hVar = this.f21802s;
        if (hVar == null) {
            C9777h o = m15353o(AbstractC3884i0.m33399x(), true, null);
            this.f21797n.add(o);
            this.f21802s = o;
        } else {
            hVar.mo15311f(null);
        }
        return this.f21802s;
    }

    /* renamed from: s */
    private void m15349s(Looper looper) {
        if (this.f21808y == null) {
            this.f21808y = new HandlerC9789d(looper);
        }
    }

    @Override // p193k7.AbstractC9818x
    /* renamed from: a */
    public Class<? extends AbstractC9761b0> mo15277a(C6722k kVar) {
        Class<? extends AbstractC9761b0> b = ((AbstractC9763c0) C7510a.m22367e(this.f21801r)).mo15273b();
        C9798l lVar = kVar.f14332y;
        if (lVar == null) {
            if (C7557q0.m22122u0(this.f21791h, C7562u.m22076l(kVar.f14329v)) != -1) {
                return b;
            }
            return null;
        } else if (m15355m(lVar)) {
            return b;
        } else {
            return C9804m0.class;
        }
    }

    @Override // p193k7.AbstractC9818x
    /* renamed from: b */
    public AbstractC9805n mo15276b(Looper looper, AbstractC9815v.C9816a aVar, C6722k kVar) {
        List<C9798l.C9800b> list;
        m15351q(looper);
        m15349s(looper);
        C9798l lVar = kVar.f14332y;
        if (lVar == null) {
            return m15350r(C7562u.m22076l(kVar.f14329v));
        }
        C9777h hVar = null;
        if (this.f21807x == null) {
            list = m15352p((C9798l) C7510a.m22367e(lVar), this.f21786c, false);
            if (list.isEmpty()) {
                C9790e eVar = new C9790e(this.f21786c);
                if (aVar != null) {
                    aVar.m15288l(eVar);
                }
                return new C9759a0(new AbstractC9805n.C9806a(eVar));
            }
        } else {
            list = null;
        }
        if (this.f21790g) {
            Iterator<C9777h> it = this.f21797n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9777h next = it.next();
                if (C7557q0.m22159c(next.f21751a, list)) {
                    hVar = next;
                    break;
                }
            }
        } else {
            hVar = this.f21803t;
        }
        if (hVar == null) {
            hVar = m15353o(list, false, aVar);
            if (!this.f21790g) {
                this.f21803t = hVar;
            }
            this.f21797n.add(hVar);
        } else {
            hVar.mo15311f(aVar);
        }
        return hVar;
    }

    @Override // p193k7.AbstractC9818x
    /* renamed from: c */
    public final void mo15275c() {
        boolean z;
        int i = this.f21800q;
        this.f21800q = i + 1;
        if (i == 0) {
            if (this.f21801r == null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            AbstractC9763c0 a = this.f21787d.mo15408a(this.f21786c);
            this.f21801r = a;
            a.mo15274a(new C9788c());
        }
    }

    @Override // p193k7.AbstractC9818x
    public final void release() {
        int i = this.f21800q - 1;
        this.f21800q = i;
        if (i == 0) {
            if (this.f21796m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f21797n);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((C9777h) arrayList.get(i2)).mo15312e(null);
                }
            }
            ((AbstractC9763c0) C7510a.m22367e(this.f21801r)).release();
            this.f21801r = null;
        }
    }

    /* renamed from: t */
    public void m15348t(int i, byte[] bArr) {
        C7510a.m22366f(this.f21797n.isEmpty());
        if (i == 1 || i == 3) {
            C7510a.m22367e(bArr);
        }
        this.f21806w = i;
        this.f21807x = bArr;
    }

    @Deprecated
    public C9785i(UUID uuid, AbstractC9763c0 c0Var, AbstractC9795j0 j0Var, HashMap<String, String> hashMap, boolean z, int i) {
        this(uuid, new AbstractC9763c0.C9764a(c0Var), j0Var, hashMap == null ? new HashMap<>() : hashMap, z, new int[0], false, new C5309d(i), 300000L);
    }

    private C9785i(UUID uuid, AbstractC9763c0.AbstractC9767d dVar, AbstractC9795j0 j0Var, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, AbstractC5318g gVar, long j) {
        C7510a.m22367e(uuid);
        C7510a.m22370b(!C6713c.f14278b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21786c = uuid;
        this.f21787d = dVar;
        this.f21788e = j0Var;
        this.f21789f = hashMap;
        this.f21790g = z;
        this.f21791h = iArr;
        this.f21792i = z2;
        this.f21794k = gVar;
        this.f21793j = new C9791f();
        this.f21795l = new C9792g();
        this.f21806w = 0;
        this.f21797n = new ArrayList();
        this.f21798o = new ArrayList();
        this.f21799p = C3828b2.m33508f();
        this.f21796m = j;
    }
}
