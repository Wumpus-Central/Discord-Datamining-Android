package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C2094a;
import ca.C3795b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p365u9.C13215a;
import p365u9.C13217c;
import p365u9.C13220f;
import p384v9.AbstractC13468e;
import p384v9.AbstractC13470f;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13459d;
import p384v9.C13480m;
import p400w9.AbstractC13842t;
import p400w9.BinderC13820e0;
import p400w9.C13813b;
import p400w9.C13824g0;
import p400w9.C13846x;
import p420x9.C13978h0;
import p420x9.C13996n;
import p420x9.C14004p;
import p461z9.C14592e;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes5.dex */
public final class C5411t<O extends C13456a.AbstractC13459d> implements AbstractC13470f.AbstractC13471a, AbstractC13470f.AbstractC13472b {

    /* renamed from: b */
    private final C13456a.AbstractC13463f f10203b;

    /* renamed from: c */
    private final C13813b<O> f10204c;

    /* renamed from: g */
    private final int f10208g;

    /* renamed from: h */
    private final BinderC13820e0 f10209h;

    /* renamed from: i */
    private boolean f10210i;

    /* renamed from: m */
    final /* synthetic */ C5376c f10214m;

    /* renamed from: a */
    private final Queue<AbstractC5395j0> f10202a = new LinkedList();

    /* renamed from: e */
    private final Set<C13824g0> f10206e = new HashSet();

    /* renamed from: f */
    private final Map<C5378d.C5379a<?>, C13846x> f10207f = new HashMap();

    /* renamed from: j */
    private final List<C5412u> f10211j = new ArrayList();

    /* renamed from: k */
    private C13215a f10212k = null;

    /* renamed from: l */
    private int f10213l = 0;

    /* renamed from: d */
    private final C5398l f10205d = new C5398l();

    public C5411t(C5376c cVar, AbstractC13468e<O> eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f10214m = cVar;
        handler = cVar.f10138z;
        C13456a.AbstractC13463f y = eVar.m3619y(handler.getLooper(), this);
        this.f10203b = y;
        this.f10204c = eVar.m3626r();
        this.f10208g = eVar.m3620x();
        if (y.mo2156g()) {
            context = cVar.f10129q;
            handler2 = cVar.f10138z;
            this.f10209h = eVar.m3618z(context, handler2);
            return;
        }
        this.f10209h = null;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m28987B(C5411t tVar, C5412u uVar) {
        if (!tVar.f10211j.contains(uVar) || tVar.f10210i) {
            return;
        }
        if (!tVar.f10203b.mo2576a()) {
            tVar.m28984E();
        } else {
            tVar.m28967i();
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m28986C(C5411t tVar, C5412u uVar) {
        Handler handler;
        Handler handler2;
        C13217c cVar;
        C13217c[] g;
        if (tVar.f10211j.remove(uVar)) {
            handler = tVar.f10214m.f10138z;
            handler.removeMessages(15, uVar);
            handler2 = tVar.f10214m.f10138z;
            handler2.removeMessages(16, uVar);
            cVar = uVar.f10216b;
            ArrayList arrayList = new ArrayList(tVar.f10202a.size());
            for (AbstractC5395j0 j0Var : tVar.f10202a) {
                if ((j0Var instanceof AbstractC13842t) && (g = ((AbstractC13842t) j0Var).mo2540g(tVar)) != null && C3795b.m33583b(g, cVar)) {
                    arrayList.add(j0Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC5395j0 j0Var2 = (AbstractC5395j0) arrayList.get(i);
                tVar.f10202a.remove(j0Var2);
                j0Var2.mo29021b(new C13480m(cVar));
            }
        }
    }

    /* renamed from: N */
    public static /* bridge */ /* synthetic */ boolean m28975N(C5411t tVar, boolean z) {
        return tVar.m28959q(false);
    }

    /* renamed from: d */
    private final C13217c m28971d(C13217c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            C13217c[] o = this.f10203b.mo2568o();
            if (o == null) {
                o = new C13217c[0];
            }
            C2094a aVar = new C2094a(o.length);
            for (C13217c cVar : o) {
                aVar.put(cVar.m4292p(), Long.valueOf(cVar.m4291r()));
            }
            for (C13217c cVar2 : cVarArr) {
                Long l = (Long) aVar.get(cVar2.m4292p());
                if (l == null || l.longValue() < cVar2.m4291r()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private final void m28970f(C13215a aVar) {
        String str;
        for (C13824g0 g0Var : this.f10206e) {
            if (C13996n.m2071b(aVar, C13215a.f29674o)) {
                str = this.f10203b.mo2573d();
            } else {
                str = null;
            }
            g0Var.m2561b(this.f10204c, aVar, str);
        }
        this.f10206e.clear();
    }

    /* renamed from: g */
    public final void m28969g(Status status) {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        m28968h(status, null, false);
    }

    /* renamed from: h */
    private final void m28968h(Status status, Exception exc, boolean z) {
        Handler handler;
        boolean z2;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator<AbstractC5395j0> it = this.f10202a.iterator();
            while (it.hasNext()) {
                AbstractC5395j0 next = it.next();
                if (!z || next.f10176a == 2) {
                    if (status != null) {
                        next.mo29022a(status);
                    } else {
                        next.mo29021b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: i */
    private final void m28967i() {
        ArrayList arrayList = new ArrayList(this.f10202a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5395j0 j0Var = (AbstractC5395j0) arrayList.get(i);
            if (this.f10203b.mo2576a()) {
                if (m28961o(j0Var)) {
                    this.f10202a.remove(j0Var);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void m28966j() {
        m28985D();
        m28970f(C13215a.f29674o);
        m28962n();
        Iterator<C13846x> it = this.f10207f.values().iterator();
        while (it.hasNext()) {
            C13846x next = it.next();
            if (m28971d(next.f31165a.m29048c()) != null) {
                it.remove();
            } else {
                try {
                    next.f31165a.mo29047d(this.f10203b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    mo2581e(3);
                    this.f10203b.mo2575b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m28967i();
        m28964l();
    }

    /* renamed from: k */
    public final void m28965k(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        C13978h0 h0Var;
        m28985D();
        this.f10210i = true;
        this.f10205d.m29011e(i, this.f10203b.mo2567p());
        C5376c cVar = this.f10214m;
        handler = cVar.f10138z;
        handler2 = cVar.f10138z;
        Message obtain = Message.obtain(handler2, 9, this.f10204c);
        j = this.f10214m.f10123k;
        handler.sendMessageDelayed(obtain, j);
        C5376c cVar2 = this.f10214m;
        handler3 = cVar2.f10138z;
        handler4 = cVar2.f10138z;
        Message obtain2 = Message.obtain(handler4, 11, this.f10204c);
        j2 = this.f10214m.f10124l;
        handler3.sendMessageDelayed(obtain2, j2);
        h0Var = this.f10214m.f10131s;
        h0Var.m2100c();
        for (C13846x xVar : this.f10207f.values()) {
            xVar.f31167c.run();
        }
    }

    /* renamed from: l */
    private final void m28964l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.f10214m.f10138z;
        handler.removeMessages(12, this.f10204c);
        C5376c cVar = this.f10214m;
        handler2 = cVar.f10138z;
        handler3 = cVar.f10138z;
        Message obtainMessage = handler3.obtainMessage(12, this.f10204c);
        j = this.f10214m.f10125m;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: m */
    private final void m28963m(AbstractC5395j0 j0Var) {
        j0Var.mo29019d(this.f10205d, m28973P());
        try {
            j0Var.mo29020c(this);
        } catch (DeadObjectException unused) {
            mo2581e(1);
            this.f10203b.mo2575b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: n */
    private final void m28962n() {
        Handler handler;
        Handler handler2;
        if (this.f10210i) {
            handler = this.f10214m.f10138z;
            handler.removeMessages(11, this.f10204c);
            handler2 = this.f10214m.f10138z;
            handler2.removeMessages(9, this.f10204c);
            this.f10210i = false;
        }
    }

    /* renamed from: o */
    private final boolean m28961o(AbstractC5395j0 j0Var) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(j0Var instanceof AbstractC13842t)) {
            m28963m(j0Var);
            return true;
        }
        AbstractC13842t tVar = (AbstractC13842t) j0Var;
        C13217c d = m28971d(tVar.mo2540g(this));
        if (d == null) {
            m28963m(j0Var);
            return true;
        }
        String name = this.f10203b.getClass().getName();
        String p = d.m4292p();
        long r = d.m4291r();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(p).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(p);
        sb2.append(", ");
        sb2.append(r);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z = this.f10214m.f37394A;
        if (!z || !tVar.mo2541f(this)) {
            tVar.mo29021b(new C13480m(d));
            return true;
        }
        C5412u uVar = new C5412u(this.f10204c, d, null);
        int indexOf = this.f10211j.indexOf(uVar);
        if (indexOf >= 0) {
            C5412u uVar2 = this.f10211j.get(indexOf);
            handler5 = this.f10214m.f10138z;
            handler5.removeMessages(15, uVar2);
            C5376c cVar = this.f10214m;
            handler6 = cVar.f10138z;
            handler7 = cVar.f10138z;
            Message obtain = Message.obtain(handler7, 15, uVar2);
            j3 = this.f10214m.f10123k;
            handler6.sendMessageDelayed(obtain, j3);
            return false;
        }
        this.f10211j.add(uVar);
        C5376c cVar2 = this.f10214m;
        handler = cVar2.f10138z;
        handler2 = cVar2.f10138z;
        Message obtain2 = Message.obtain(handler2, 15, uVar);
        j = this.f10214m.f10123k;
        handler.sendMessageDelayed(obtain2, j);
        C5376c cVar3 = this.f10214m;
        handler3 = cVar3.f10138z;
        handler4 = cVar3.f10138z;
        Message obtain3 = Message.obtain(handler4, 16, uVar);
        j2 = this.f10214m.f10124l;
        handler3.sendMessageDelayed(obtain3, j2);
        C13215a aVar = new C13215a(2, null);
        if (m28960p(aVar)) {
            return false;
        }
        this.f10214m.m29075h(aVar, this.f10208g);
        return false;
    }

    /* renamed from: p */
    private final boolean m28960p(C13215a aVar) {
        Object obj;
        C5400m mVar;
        Set set;
        C5400m mVar2;
        obj = C5376c.f37392D;
        synchronized (obj) {
            C5376c cVar = this.f10214m;
            mVar = cVar.f10135w;
            if (mVar != null) {
                set = cVar.f10136x;
                if (set.contains(this.f10204c)) {
                    mVar2 = this.f10214m.f10135w;
                    mVar2.m28989s(aVar, this.f10208g);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m28959q(boolean z) {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        if (!this.f10203b.mo2576a() || this.f10207f.size() != 0) {
            return false;
        }
        if (this.f10205d.m29009g()) {
            if (z) {
                m28964l();
            }
            return false;
        }
        this.f10203b.mo2575b("Timing out service connection.");
        return true;
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ C13813b m28953w(C5411t tVar) {
        return tVar.f10204c;
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m28951y(C5411t tVar, Status status) {
        tVar.m28969g(status);
    }

    /* renamed from: D */
    public final void m28985D() {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        this.f10212k = null;
    }

    /* renamed from: E */
    public final void m28984E() {
        Handler handler;
        C13978h0 h0Var;
        Context context;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        if (!this.f10203b.mo2576a() && !this.f10203b.mo2574c()) {
            try {
                C5376c cVar = this.f10214m;
                h0Var = cVar.f10131s;
                context = cVar.f10129q;
                int b = h0Var.m2101b(context, this.f10203b);
                if (b != 0) {
                    C13215a aVar = new C13215a(b, null);
                    String name = this.f10203b.getClass().getName();
                    String obj = aVar.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(obj);
                    Log.w("GoogleApiManager", sb2.toString());
                    m28981H(aVar, null);
                    return;
                }
                C5376c cVar2 = this.f10214m;
                C13456a.AbstractC13463f fVar = this.f10203b;
                C5414w wVar = new C5414w(cVar2, fVar, this.f10204c);
                if (fVar.mo2156g()) {
                    ((BinderC13820e0) C14004p.m2051j(this.f10209h)).m2578h0(wVar);
                }
                try {
                    this.f10203b.mo2572f(wVar);
                } catch (SecurityException e) {
                    m28981H(new C13215a(10), e);
                }
            } catch (IllegalStateException e2) {
                m28981H(new C13215a(10), e2);
            }
        }
    }

    /* renamed from: F */
    public final void m28983F(AbstractC5395j0 j0Var) {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        if (!this.f10203b.mo2576a()) {
            this.f10202a.add(j0Var);
            C13215a aVar = this.f10212k;
            if (aVar == null || !aVar.m4295u()) {
                m28984E();
            } else {
                m28981H(this.f10212k, null);
            }
        } else if (m28961o(j0Var)) {
            m28964l();
        } else {
            this.f10202a.add(j0Var);
        }
    }

    /* renamed from: G */
    public final void m28982G() {
        this.f10213l++;
    }

    /* renamed from: H */
    public final void m28981H(C13215a aVar, Exception exc) {
        Handler handler;
        C13978h0 h0Var;
        boolean z;
        Status i;
        Status i2;
        Status i3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        BinderC13820e0 e0Var = this.f10209h;
        if (e0Var != null) {
            e0Var.m2577i0();
        }
        m28985D();
        h0Var = this.f10214m.f10131s;
        h0Var.m2100c();
        m28970f(aVar);
        if ((this.f10203b instanceof C14592e) && aVar.m4298p() != 24) {
            this.f10214m.f10126n = true;
            C5376c cVar = this.f10214m;
            handler5 = cVar.f10138z;
            handler6 = cVar.f10138z;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (aVar.m4298p() == 4) {
            status = C5376c.f37391C;
            m28969g(status);
        } else if (this.f10202a.isEmpty()) {
            this.f10212k = aVar;
        } else if (exc != null) {
            handler4 = this.f10214m.f10138z;
            C14004p.m2057d(handler4);
            m28968h(null, exc, false);
        } else {
            z = this.f10214m.f37394A;
            if (z) {
                i2 = C5376c.m29074i(this.f10204c, aVar);
                m28968h(i2, null, true);
                if (!this.f10202a.isEmpty() && !m28960p(aVar) && !this.f10214m.m29075h(aVar, this.f10208g)) {
                    if (aVar.m4298p() == 18) {
                        this.f10210i = true;
                    }
                    if (this.f10210i) {
                        C5376c cVar2 = this.f10214m;
                        handler2 = cVar2.f10138z;
                        handler3 = cVar2.f10138z;
                        Message obtain = Message.obtain(handler3, 9, this.f10204c);
                        j = this.f10214m.f10123k;
                        handler2.sendMessageDelayed(obtain, j);
                        return;
                    }
                    i3 = C5376c.m29074i(this.f10204c, aVar);
                    m28969g(i3);
                    return;
                }
                return;
            }
            i = C5376c.m29074i(this.f10204c, aVar);
            m28969g(i);
        }
    }

    /* renamed from: I */
    public final void m28980I(C13215a aVar) {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        C13456a.AbstractC13463f fVar = this.f10203b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.mo2575b(sb2.toString());
        m28981H(aVar, null);
    }

    /* renamed from: J */
    public final void m28979J(C13824g0 g0Var) {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        this.f10206e.add(g0Var);
    }

    /* renamed from: K */
    public final void m28978K() {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        if (this.f10210i) {
            m28984E();
        }
    }

    /* renamed from: L */
    public final void m28977L() {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        m28969g(C5376c.f37390B);
        this.f10205d.m29010f();
        for (C5378d.C5379a aVar : (C5378d.C5379a[]) this.f10207f.keySet().toArray(new C5378d.C5379a[0])) {
            m28983F(new C5393i0(aVar, new TaskCompletionSource()));
        }
        m28970f(new C13215a(4));
        if (this.f10203b.mo2576a()) {
            this.f10203b.mo2569k(new C5410s(this));
        }
    }

    /* renamed from: M */
    public final void m28976M() {
        Handler handler;
        C13220f fVar;
        Context context;
        Status status;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        if (this.f10210i) {
            m28962n();
            C5376c cVar = this.f10214m;
            fVar = cVar.f10130r;
            context = cVar.f10129q;
            if (fVar.mo4271e(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m28969g(status);
            this.f10203b.mo2575b("Timing out connection while resuming.");
        }
    }

    /* renamed from: O */
    public final boolean m28974O() {
        return this.f10203b.mo2576a();
    }

    /* renamed from: P */
    public final boolean m28973P() {
        return this.f10203b.mo2156g();
    }

    /* renamed from: a */
    public final boolean m28972a() {
        return m28959q(true);
    }

    @Override // p400w9.AbstractC13825h
    /* renamed from: b */
    public final void mo2560b(C13215a aVar) {
        m28981H(aVar, null);
    }

    @Override // p400w9.AbstractC13817d
    /* renamed from: c */
    public final void mo2582c(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f10214m.f10138z;
        if (myLooper == handler.getLooper()) {
            m28966j();
            return;
        }
        handler2 = this.f10214m.f10138z;
        handler2.post(new RunnableC5406p(this));
    }

    @Override // p400w9.AbstractC13817d
    /* renamed from: e */
    public final void mo2581e(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f10214m.f10138z;
        if (myLooper == handler.getLooper()) {
            m28965k(i);
            return;
        }
        handler2 = this.f10214m.f10138z;
        handler2.post(new RunnableC5408q(this, i));
    }

    /* renamed from: r */
    public final int m28958r() {
        return this.f10208g;
    }

    /* renamed from: s */
    public final int m28957s() {
        return this.f10213l;
    }

    /* renamed from: t */
    public final C13215a m28956t() {
        Handler handler;
        handler = this.f10214m.f10138z;
        C14004p.m2057d(handler);
        return this.f10212k;
    }

    /* renamed from: v */
    public final C13456a.AbstractC13463f m28954v() {
        return this.f10203b;
    }

    /* renamed from: x */
    public final Map<C5378d.C5379a<?>, C13846x> m28952x() {
        return this.f10207f;
    }
}
