package com.google.android.exoplayer2;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p098f7.C7030d1;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8285q0;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;
import p153i8.C8273n;
import p153i8.C8277o;
import p153i8.C8279p;
import p153i8.C8284q;
import p193k7.AbstractC9815v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.p0 */
/* loaded from: classes7.dex */
public final class C5210p0 {

    /* renamed from: d */
    private final AbstractC5214d f9298d;

    /* renamed from: e */
    private final AbstractC8233b0.C8234a f9299e;

    /* renamed from: f */
    private final AbstractC9815v.C9816a f9300f;

    /* renamed from: j */
    private boolean f9304j;

    /* renamed from: k */
    private AbstractC6795x f9305k;

    /* renamed from: i */
    private AbstractC8285q0 f9303i = new AbstractC8285q0.C8286a(0);

    /* renamed from: b */
    private final IdentityHashMap<AbstractC8287r, C5213c> f9296b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, C5213c> f9297c = new HashMap();

    /* renamed from: a */
    private final List<C5213c> f9295a = new ArrayList();

    /* renamed from: g */
    private final HashMap<C5213c, C5212b> f9301g = new HashMap<>();

    /* renamed from: h */
    private final Set<C5213c> f9302h = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.p0$a */
    /* loaded from: classes7.dex */
    public final class C5211a implements AbstractC8233b0, AbstractC9815v {

        /* renamed from: k */
        private final C5213c f9306k;

        /* renamed from: l */
        private AbstractC8233b0.C8234a f9307l;

        /* renamed from: m */
        private AbstractC9815v.C9816a f9308m;

        public C5211a(C5213c cVar) {
            this.f9307l = C5210p0.this.f9299e;
            this.f9308m = C5210p0.this.f9300f;
            this.f9306k = cVar;
        }

        /* renamed from: a */
        private boolean m30037a(int i, AbstractC8299u.C8300a aVar) {
            AbstractC8299u.C8300a aVar2;
            if (aVar != null) {
                aVar2 = C5210p0.m30050n(this.f9306k, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int r = C5210p0.m30046r(this.f9306k, i);
            AbstractC8233b0.C8234a aVar3 = this.f9307l;
            if (aVar3.f17837a != r || !C7557q0.m22159c(aVar3.f17838b, aVar2)) {
                this.f9307l = C5210p0.this.f9299e.m20254F(r, aVar2, 0L);
            }
            AbstractC9815v.C9816a aVar4 = this.f9308m;
            if (aVar4.f21854a == r && C7557q0.m22159c(aVar4.f21855b, aVar2)) {
                return true;
            }
            this.f9308m = C5210p0.this.f9300f.m15280t(r, aVar2);
            return true;
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: C */
        public void mo20205C(int i, AbstractC8299u.C8300a aVar, C8284q qVar) {
            if (m30037a(i, aVar)) {
                this.f9307l.m20244j(qVar);
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: b */
        public void mo20203b(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar) {
            if (m30037a(i, aVar)) {
                this.f9307l.m20235s(nVar, qVar);
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: m */
        public void mo15305m(int i, AbstractC8299u.C8300a aVar) {
            if (m30037a(i, aVar)) {
                this.f9308m.m15287m();
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: n */
        public void mo15304n(int i, AbstractC8299u.C8300a aVar) {
            if (m30037a(i, aVar)) {
                this.f9308m.m15290j();
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: p */
        public void mo15303p(int i, AbstractC8299u.C8300a aVar) {
            if (m30037a(i, aVar)) {
                this.f9308m.m15292h();
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: r */
        public void mo20201r(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar) {
            if (m30037a(i, aVar)) {
                this.f9307l.m20232v(nVar, qVar);
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: s */
        public void mo20200s(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar, IOException iOException, boolean z) {
            if (m30037a(i, aVar)) {
                this.f9307l.m20229y(nVar, qVar, iOException, z);
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: t */
        public void mo15302t(int i, AbstractC8299u.C8300a aVar, Exception exc) {
            if (m30037a(i, aVar)) {
                this.f9308m.m15288l(exc);
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: v */
        public void mo15301v(int i, AbstractC8299u.C8300a aVar) {
            if (m30037a(i, aVar)) {
                this.f9308m.m15291i();
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: w */
        public void mo20199w(int i, AbstractC8299u.C8300a aVar, C8284q qVar) {
            if (m30037a(i, aVar)) {
                this.f9307l.m20255E(qVar);
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: x */
        public void mo20198x(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar) {
            if (m30037a(i, aVar)) {
                this.f9307l.m20258B(nVar, qVar);
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: z */
        public void mo15300z(int i, AbstractC8299u.C8300a aVar) {
            if (m30037a(i, aVar)) {
                this.f9308m.m15289k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.p0$b */
    /* loaded from: classes7.dex */
    public static final class C5212b {

        /* renamed from: a */
        public final AbstractC8299u f9310a;

        /* renamed from: b */
        public final AbstractC8299u.AbstractC8301b f9311b;

        /* renamed from: c */
        public final AbstractC8233b0 f9312c;

        public C5212b(AbstractC8299u uVar, AbstractC8299u.AbstractC8301b bVar, AbstractC8233b0 b0Var) {
            this.f9310a = uVar;
            this.f9311b = bVar;
            this.f9312c = b0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.p0$c */
    /* loaded from: classes7.dex */
    public static final class C5213c implements AbstractC5206n0 {

        /* renamed from: a */
        public final C8279p f9313a;

        /* renamed from: d */
        public int f9316d;

        /* renamed from: e */
        public boolean f9317e;

        /* renamed from: c */
        public final List<AbstractC8299u.C8300a> f9315c = new ArrayList();

        /* renamed from: b */
        public final Object f9314b = new Object();

        public C5213c(AbstractC8299u uVar, boolean z) {
            this.f9313a = new C8279p(uVar, z);
        }

        @Override // com.google.android.exoplayer2.AbstractC5206n0
        /* renamed from: a */
        public Object mo30036a() {
            return this.f9314b;
        }

        @Override // com.google.android.exoplayer2.AbstractC5206n0
        /* renamed from: b */
        public Timeline mo30035b() {
            return this.f9313a.m20043O();
        }

        /* renamed from: c */
        public void m30034c(int i) {
            this.f9316d = i;
            this.f9317e = false;
            this.f9315c.clear();
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0$d */
    /* loaded from: classes7.dex */
    public interface AbstractC5214d {
        /* renamed from: c */
        void mo30033c();
    }

    public C5210p0(AbstractC5214d dVar, C7030d1 d1Var, Handler handler) {
        this.f9298d = dVar;
        AbstractC8233b0.C8234a aVar = new AbstractC8233b0.C8234a();
        this.f9299e = aVar;
        AbstractC9815v.C9816a aVar2 = new AbstractC9815v.C9816a();
        this.f9300f = aVar2;
        if (d1Var != null) {
            aVar.m20247g(handler, d1Var);
            aVar2.m15293g(handler, d1Var);
        }
    }

    /* renamed from: B */
    private void m30066B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C5213c remove = this.f9295a.remove(i3);
            this.f9297c.remove(remove.f9314b);
            m30057g(i3, -remove.f9313a.m20043O().mo20022p());
            remove.f9317e = true;
            if (this.f9304j) {
                m30043u(remove);
            }
        }
    }

    /* renamed from: g */
    private void m30057g(int i, int i2) {
        while (i < this.f9295a.size()) {
            this.f9295a.get(i).f9316d += i2;
            i++;
        }
    }

    /* renamed from: j */
    private void m30054j(C5213c cVar) {
        C5212b bVar = this.f9301g.get(cVar);
        if (bVar != null) {
            bVar.f9310a.mo19993r(bVar.f9311b);
        }
    }

    /* renamed from: k */
    private void m30053k() {
        Iterator<C5213c> it = this.f9302h.iterator();
        while (it.hasNext()) {
            C5213c next = it.next();
            if (next.f9315c.isEmpty()) {
                m30054j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    private void m30052l(C5213c cVar) {
        this.f9302h.add(cVar);
        C5212b bVar = this.f9301g.get(cVar);
        if (bVar != null) {
            bVar.f9310a.mo20000g(bVar.f9311b);
        }
    }

    /* renamed from: m */
    private static Object m30051m(Object obj) {
        return AbstractC5162a.m30408v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static AbstractC8299u.C8300a m30050n(C5213c cVar, AbstractC8299u.C8300a aVar) {
        for (int i = 0; i < cVar.f9315c.size(); i++) {
            if (cVar.f9315c.get(i).f18062d == aVar.f18062d) {
                return aVar.m19992c(m30048p(cVar, aVar.f18059a));
            }
        }
        return null;
    }

    /* renamed from: o */
    private static Object m30049o(Object obj) {
        return AbstractC5162a.m30407w(obj);
    }

    /* renamed from: p */
    private static Object m30048p(C5213c cVar, Object obj) {
        return AbstractC5162a.m30406y(cVar.f9314b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static int m30046r(C5213c cVar, int i) {
        return i + cVar.f9316d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m30044t(AbstractC8299u uVar, Timeline timeline) {
        this.f9298d.mo30033c();
    }

    /* renamed from: u */
    private void m30043u(C5213c cVar) {
        if (cVar.f9317e && cVar.f9315c.isEmpty()) {
            C5212b bVar = (C5212b) C7510a.m22367e(this.f9301g.remove(cVar));
            bVar.f9310a.mo20001f(bVar.f9311b);
            bVar.f9310a.mo20003d(bVar.f9312c);
            this.f9302h.remove(cVar);
        }
    }

    /* renamed from: x */
    private void m30040x(C5213c cVar) {
        C8279p pVar = cVar.f9313a;
        AbstractC8299u.AbstractC8301b o0Var = new AbstractC8299u.AbstractC8301b() { // from class: com.google.android.exoplayer2.o0
            @Override // p153i8.AbstractC8299u.AbstractC8301b
            /* renamed from: a */
            public final void mo19991a(AbstractC8299u uVar, Timeline timeline) {
                C5210p0.this.m30044t(uVar, timeline);
            }
        };
        C5211a aVar = new C5211a(cVar);
        this.f9301g.put(cVar, new C5212b(pVar, o0Var, aVar));
        pVar.mo19999h(C7557q0.m22113z(), aVar);
        pVar.mo20005b(C7557q0.m22113z(), aVar);
        pVar.mo20002e(o0Var, this.f9305k);
    }

    /* renamed from: A */
    public Timeline m30067A(int i, int i2, AbstractC8285q0 q0Var) {
        boolean z;
        if (i < 0 || i > i2 || i2 > m30047q()) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        this.f9303i = q0Var;
        m30066B(i, i2);
        return m30055i();
    }

    /* renamed from: C */
    public Timeline m30065C(List<C5213c> list, AbstractC8285q0 q0Var) {
        m30066B(0, this.f9295a.size());
        return m30058f(this.f9295a.size(), list, q0Var);
    }

    /* renamed from: D */
    public Timeline m30064D(AbstractC8285q0 q0Var) {
        int q = m30047q();
        if (q0Var.getLength() != q) {
            q0Var = q0Var.mo20032e().mo20030g(0, q);
        }
        this.f9303i = q0Var;
        return m30055i();
    }

    /* renamed from: f */
    public Timeline m30058f(int i, List<C5213c> list, AbstractC8285q0 q0Var) {
        if (!list.isEmpty()) {
            this.f9303i = q0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C5213c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    C5213c cVar2 = this.f9295a.get(i2 - 1);
                    cVar.m30034c(cVar2.f9316d + cVar2.f9313a.m20043O().mo20022p());
                } else {
                    cVar.m30034c(0);
                }
                m30057g(i2, cVar.f9313a.m20043O().mo20022p());
                this.f9295a.add(i2, cVar);
                this.f9297c.put(cVar.f9314b, cVar);
                if (this.f9304j) {
                    m30040x(cVar);
                    if (this.f9296b.isEmpty()) {
                        this.f9302h.add(cVar);
                    } else {
                        m30054j(cVar);
                    }
                }
            }
        }
        return m30055i();
    }

    /* renamed from: h */
    public AbstractC8287r m30056h(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        Object o = m30049o(aVar.f18059a);
        AbstractC8299u.C8300a c = aVar.m19992c(m30051m(aVar.f18059a));
        C5213c cVar = (C5213c) C7510a.m22367e(this.f9297c.get(o));
        m30052l(cVar);
        cVar.f9315c.add(c);
        C8277o K = cVar.f9313a.mo19997m(c, bVar, j);
        this.f9296b.put(K, cVar);
        m30053k();
        return K;
    }

    /* renamed from: i */
    public Timeline m30055i() {
        if (this.f9295a.isEmpty()) {
            return Timeline.f9081a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f9295a.size(); i2++) {
            C5213c cVar = this.f9295a.get(i2);
            cVar.f9316d = i;
            i += cVar.f9313a.m20043O().mo20022p();
        }
        return new C5222s0(this.f9295a, this.f9303i);
    }

    /* renamed from: q */
    public int m30047q() {
        return this.f9295a.size();
    }

    /* renamed from: s */
    public boolean m30045s() {
        return this.f9304j;
    }

    /* renamed from: v */
    public Timeline m30042v(int i, int i2, int i3, AbstractC8285q0 q0Var) {
        boolean z;
        if (i < 0 || i > i2 || i2 > m30047q() || i3 < 0) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        this.f9303i = q0Var;
        if (i == i2 || i == i3) {
            return m30055i();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = this.f9295a.get(min).f9316d;
        C7557q0.m22118w0(this.f9295a, i, i2, i3);
        while (min <= max) {
            C5213c cVar = this.f9295a.get(min);
            cVar.f9316d = i4;
            i4 += cVar.f9313a.m20043O().mo20022p();
            min++;
        }
        return m30055i();
    }

    /* renamed from: w */
    public void m30041w(AbstractC6795x xVar) {
        C7510a.m22366f(!this.f9304j);
        this.f9305k = xVar;
        for (int i = 0; i < this.f9295a.size(); i++) {
            C5213c cVar = this.f9295a.get(i);
            m30040x(cVar);
            this.f9302h.add(cVar);
        }
        this.f9304j = true;
    }

    /* renamed from: y */
    public void m30039y() {
        for (C5212b bVar : this.f9301g.values()) {
            try {
                bVar.f9310a.mo20001f(bVar.f9311b);
            } catch (RuntimeException e) {
                C7558r.m22108d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f9310a.mo20003d(bVar.f9312c);
        }
        this.f9301g.clear();
        this.f9302h.clear();
        this.f9304j = false;
    }

    /* renamed from: z */
    public void m30038z(AbstractC8287r rVar) {
        C5213c cVar = (C5213c) C7510a.m22367e(this.f9296b.remove(rVar));
        cVar.f9313a.mo19998l(rVar);
        cVar.f9315c.remove(((C8277o) rVar).f18017k);
        if (!this.f9296b.isEmpty()) {
            m30053k();
        }
        m30043u(cVar);
    }
}
