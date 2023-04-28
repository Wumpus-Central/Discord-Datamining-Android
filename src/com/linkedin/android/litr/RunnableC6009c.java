package com.linkedin.android.litr;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import je.AbstractC9567d;
import je.C9562a;
import je.C9568e;
import p138he.C8009b;
import p266oe.AbstractC11261c;
import p266oe.AbstractC11262d;
import p302qe.AbstractC12115c;
import p302qe.C12116d;
import re.C12575d;
import re.C12580h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.linkedin.android.litr.c */
/* loaded from: classes6.dex */
public class RunnableC6009c implements Runnable {

    /* renamed from: t */
    private static final String f12183t = "c";

    /* renamed from: k */
    List<AbstractC12115c> f12184k;

    /* renamed from: m */
    int f12186m;

    /* renamed from: q */
    private final List<C6007b> f12190q;

    /* renamed from: r */
    private final String f12191r;

    /* renamed from: s */
    private final C6005a f12192s;

    /* renamed from: l */
    float f12185l = 0.0f;

    /* renamed from: n */
    C12116d f12187n = new C12116d();

    /* renamed from: o */
    C12575d f12188o = new C12575d();

    /* renamed from: p */
    C8009b f12189p = new C8009b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6009c(String str, List<C6007b> list, int i, C6005a aVar) {
        this.f12191r = str;
        this.f12190q = list;
        this.f12186m = i;
        this.f12192s = aVar;
    }

    /* renamed from: h */
    private void m26442h() {
        for (C6007b bVar : this.f12190q) {
            bVar.m26461c().seekTo(bVar.m26461c().getSelection().m26436b(), 0);
        }
    }

    /* renamed from: a */
    void m26449a() {
        this.f12192s.m26468b(this.f12191r, this.f12189p.m20864b());
        m26443g(false);
    }

    /* renamed from: b */
    void m26448b() {
        int size = this.f12190q.size();
        this.f12184k = new ArrayList(size);
        if (size >= 1) {
            for (int i = 0; i < size; i++) {
                C6007b bVar = this.f12190q.get(i);
                AbstractC12115c a = this.f12187n.m7793a(bVar.m26458f(), bVar.m26456h(), bVar.m26461c(), bVar.m26463a(), bVar.m26459e(), bVar.m26462b(), bVar.m26460d(), bVar.m26457g());
                this.f12184k.add(a);
                this.f12189p.m20861e(i, a.mo7797c(), a.mo7796d());
            }
            return;
        }
        throw new C9568e(C9568e.EnumC9569a.NO_TRACKS_FOUND);
    }

    /* renamed from: c */
    boolean m26447c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).delete();
    }

    /* renamed from: d */
    protected void m26446d(Throwable th2) {
        this.f12192s.m26466d(this.f12191r, th2, this.f12189p.m20864b());
        m26443g(false);
    }

    /* renamed from: e */
    void m26445e() {
        for (C6007b bVar : this.f12190q) {
            this.f12189p.m20865a(bVar.m26461c().getTrackFormat(bVar.m26458f()));
        }
    }

    /* renamed from: f */
    boolean m26444f() {
        boolean z;
        boolean z2 = true;
        for (int i = 0; i < this.f12184k.size(); i++) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f12184k.get(i).mo7792g() == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
            this.f12189p.m20863c(i, System.currentTimeMillis() - currentTimeMillis);
        }
        float f = 0.0f;
        for (AbstractC12115c cVar : this.f12184k) {
            f += cVar.m7795e();
        }
        float size = f / this.f12184k.size();
        int i2 = this.f12186m;
        if ((i2 == 0 && size != this.f12185l) || (i2 != 0 && size >= this.f12185l + (1.0f / i2))) {
            this.f12192s.m26465e(this.f12191r, size);
            this.f12185l = size;
        }
        return z2;
    }

    /* renamed from: g */
    void m26443g(boolean z) {
        if (this.f12184k != null) {
            for (int i = 0; i < this.f12184k.size(); i++) {
                AbstractC12115c cVar = this.f12184k.get(i);
                cVar.mo7790i();
                this.f12189p.m20862d(i, cVar.m7794f());
            }
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C6007b bVar : this.f12190q) {
            hashSet.add(bVar.m26461c());
            hashSet2.add(bVar.m26460d());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((AbstractC11261c) it.next()).release();
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            AbstractC11262d dVar = (AbstractC11262d) it2.next();
            dVar.release();
            if (!z) {
                m26447c(dVar.mo10312a());
            }
        }
        if (z) {
            this.f12192s.m26467c(this.f12191r, this.f12189p.m20864b());
        }
    }

    /* renamed from: i */
    void m26441i() {
        for (AbstractC12115c cVar : this.f12184k) {
            cVar.mo7791h();
        }
    }

    /* renamed from: j */
    void m26440j() {
        boolean f;
        m26445e();
        m26439k();
        m26448b();
        m26441i();
        m26442h();
        this.f12192s.m26464f(this.f12191r);
        this.f12185l = 0.0f;
        while (true) {
            f = m26444f();
            if (!Thread.interrupted()) {
                if (f) {
                    break;
                }
            } else {
                m26449a();
                f = false;
                break;
            }
        }
        m26443g(f);
    }

    /* renamed from: k */
    void m26439k() {
        long d = C12580h.m6480d(this.f12190q);
        long j = ((float) d) * 1.1f;
        long a = this.f12188o.m6492a();
        if (a != -1 && a < j) {
            throw new C9562a(d, a);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m26440j();
        } catch (RuntimeException e) {
            Log.e(f12183t, "Transformation job error", e);
            if (e.getCause() instanceof InterruptedException) {
                m26449a();
            } else {
                m26446d(e);
            }
        } catch (AbstractC9567d e2) {
            Log.e(f12183t, "Transformation job error", e2);
            e2.m15981a(this.f12191r);
            m26446d(e2);
        }
    }
}
