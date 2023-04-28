package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.discord.nearby.NearbyManager;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p028b8.C3396a;
import p028b8.C3397b;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6728o;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6774h;
import p119g9.C7557q0;
import p119g9.C7570y;
import p153i8.C8274n0;
import p194k8.AbstractC9827e;
import p228m7.AbstractC10500b0;
import p228m7.C10498a0;
import p229m8.C10539b;
import p459z7.C14576a;
import p459z7.C14582e;

/* renamed from: com.google.android.exoplayer2.source.dash.e */
/* loaded from: classes7.dex */
public final class C5239e implements Handler.Callback {

    /* renamed from: k */
    private final AbstractC6765b f9455k;

    /* renamed from: l */
    private final AbstractC5241b f9456l;

    /* renamed from: p */
    private C10539b f9460p;

    /* renamed from: q */
    private long f9461q;

    /* renamed from: r */
    private boolean f9462r;

    /* renamed from: s */
    private boolean f9463s;

    /* renamed from: t */
    private boolean f9464t;

    /* renamed from: o */
    private final TreeMap<Long, Long> f9459o = new TreeMap<>();

    /* renamed from: n */
    private final Handler f9458n = C7557q0.m22115y(this);

    /* renamed from: m */
    private final C3397b f9457m = new C3397b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.e$a */
    /* loaded from: classes7.dex */
    public static final class C5240a {

        /* renamed from: a */
        public final long f9465a;

        /* renamed from: b */
        public final long f9466b;

        public C5240a(long j, long j2) {
            this.f9465a = j;
            this.f9466b = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$b */
    /* loaded from: classes7.dex */
    public interface AbstractC5241b {
        /* renamed from: a */
        void mo29876a(long j);

        /* renamed from: b */
        void mo29875b();
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$c */
    /* loaded from: classes7.dex */
    public final class C5242c implements AbstractC10500b0 {

        /* renamed from: a */
        private final C8274n0 f9467a;

        /* renamed from: b */
        private final C6725l f9468b = new C6725l();

        /* renamed from: c */
        private final C14582e f9469c = new C14582e();

        /* renamed from: d */
        private long f9470d = -9223372036854775807L;

        C5242c(AbstractC6765b bVar) {
            this.f9467a = C8274n0.m20072k(bVar);
        }

        /* renamed from: g */
        private C14582e m29874g() {
            this.f9469c.mo1151f();
            if (this.f9467a.m20091Q(this.f9468b, this.f9469c, false, false) != -4) {
                return null;
            }
            this.f9469c.m20284p();
            return this.f9469c;
        }

        /* renamed from: k */
        private void m29870k(long j, long j2) {
            C5239e.this.f9458n.sendMessage(C5239e.this.f9458n.obtainMessage(1, new C5240a(j, j2)));
        }

        /* renamed from: l */
        private void m29869l() {
            while (this.f9467a.m20098J(false)) {
                C14582e g = m29874g();
                if (g != null) {
                    long j = g.f17800o;
                    C14576a a = C5239e.this.f9457m.mo162a(g);
                    if (a != null) {
                        C3396a aVar = (C3396a) a.m184e(0);
                        if (C5239e.m29886h(aVar.f5428k, aVar.f5429l)) {
                            m29868m(j, aVar);
                        }
                    }
                }
            }
            this.f9467a.m20065r();
        }

        /* renamed from: m */
        private void m29868m(long j, C3396a aVar) {
            long f = C5239e.m29888f(aVar);
            if (f != -9223372036854775807L) {
                m29870k(j, f);
            }
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: a */
        public int mo12390a(AbstractC6774h hVar, int i, boolean z, int i2) {
            return this.f9467a.mo12387e(hVar, i, z);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: b */
        public void mo12389b(C7570y yVar, int i, int i2) {
            this.f9467a.mo12386f(yVar, i);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: c */
        public void mo12382c(long j, int i, int i2, int i3, AbstractC10500b0.C10501a aVar) {
            this.f9467a.mo12382c(j, i, i2, i3, aVar);
            m29869l();
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: d */
        public void mo12388d(C6722k kVar) {
            this.f9467a.mo12388d(kVar);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: e */
        public /* synthetic */ int mo12387e(AbstractC6774h hVar, int i, boolean z) {
            return C10498a0.m13009a(this, hVar, i, z);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: f */
        public /* synthetic */ void mo12386f(C7570y yVar, int i) {
            C10498a0.m13008b(this, yVar, i);
        }

        /* renamed from: h */
        public boolean m29873h(long j) {
            return C5239e.this.m29884j(j);
        }

        /* renamed from: i */
        public void m29872i(AbstractC9827e eVar) {
            long j = this.f9470d;
            if (j == -9223372036854775807L || eVar.f21894h > j) {
                this.f9470d = eVar.f21894h;
            }
            C5239e.this.m29881m(eVar);
        }

        /* renamed from: j */
        public boolean m29871j(AbstractC9827e eVar) {
            boolean z;
            long j = this.f9470d;
            if (j == -9223372036854775807L || j >= eVar.f21893g) {
                z = false;
            } else {
                z = true;
            }
            return C5239e.this.m29880n(z);
        }

        /* renamed from: n */
        public void m29867n() {
            this.f9467a.m20090R();
        }
    }

    public C5239e(C10539b bVar, AbstractC5241b bVar2, AbstractC6765b bVar3) {
        this.f9460p = bVar;
        this.f9456l = bVar2;
        this.f9455k = bVar3;
    }

    /* renamed from: e */
    private Map.Entry<Long, Long> m29889e(long j) {
        return this.f9459o.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static long m29888f(C3396a aVar) {
        try {
            return C7557q0.m22208D0(C7557q0.m22207E(aVar.f5432o));
        } catch (C6728o unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: g */
    private void m29887g(long j, long j2) {
        Long l = this.f9459o.get(Long.valueOf(j2));
        if (l == null) {
            this.f9459o.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f9459o.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m29886h(String str, String str2) {
        if (!"urn:mpeg:dash:event:2012".equals(str) || (!NearbyManager.PERMISSION_DENIED.equals(str2) && !"2".equals(str2) && !"3".equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m29885i() {
        if (this.f9462r) {
            this.f9463s = true;
            this.f9462r = false;
            this.f9456l.mo29875b();
        }
    }

    /* renamed from: l */
    private void m29882l() {
        this.f9456l.mo29876a(this.f9461q);
    }

    /* renamed from: p */
    private void m29878p() {
        Iterator<Map.Entry<Long, Long>> it = this.f9459o.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f9460p.f23311h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9464t) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C5240a aVar = (C5240a) message.obj;
        m29887g(aVar.f9465a, aVar.f9466b);
        return true;
    }

    /* renamed from: j */
    boolean m29884j(long j) {
        C10539b bVar = this.f9460p;
        boolean z = false;
        if (!bVar.f23307d) {
            return false;
        }
        if (this.f9463s) {
            return true;
        }
        Map.Entry<Long, Long> e = m29889e(bVar.f23311h);
        if (e != null && e.getValue().longValue() < j) {
            this.f9461q = e.getKey().longValue();
            m29882l();
            z = true;
        }
        if (z) {
            m29885i();
        }
        return z;
    }

    /* renamed from: k */
    public C5242c m29883k() {
        return new C5242c(this.f9455k);
    }

    /* renamed from: m */
    void m29881m(AbstractC9827e eVar) {
        this.f9462r = true;
    }

    /* renamed from: n */
    boolean m29880n(boolean z) {
        if (!this.f9460p.f23307d) {
            return false;
        }
        if (this.f9463s) {
            return true;
        }
        if (!z) {
            return false;
        }
        m29885i();
        return true;
    }

    /* renamed from: o */
    public void m29879o() {
        this.f9464t = true;
        this.f9458n.removeCallbacksAndMessages(null);
    }

    /* renamed from: q */
    public void m29877q(C10539b bVar) {
        this.f9463s = false;
        this.f9461q = -9223372036854775807L;
        this.f9460p = bVar;
        m29878p();
    }
}
