package p029b9;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.C8302u0;
import p194k8.AbstractC9827e;
import p194k8.AbstractC9838m;

/* renamed from: b9.c */
/* loaded from: classes5.dex */
public abstract class AbstractC3402c implements AbstractC3415h {

    /* renamed from: a */
    protected final C8302u0 f5457a;

    /* renamed from: b */
    protected final int f5458b;

    /* renamed from: c */
    protected final int[] f5459c;

    /* renamed from: d */
    private final C6722k[] f5460d;

    /* renamed from: e */
    private final long[] f5461e;

    /* renamed from: f */
    private int f5462f;

    public AbstractC3402c(C8302u0 u0Var, int... iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f5457a = (C8302u0) C7510a.m22367e(u0Var);
        int length = iArr.length;
        this.f5458b = length;
        this.f5460d = new C6722k[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f5460d[i2] = u0Var.m19990a(iArr[i2]);
        }
        Arrays.sort(this.f5460d, new Comparator() { // from class: b9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int u;
                u = AbstractC3402c.m34500u((C6722k) obj, (C6722k) obj2);
                return u;
            }
        });
        this.f5459c = new int[this.f5458b];
        while (true) {
            int i3 = this.f5458b;
            if (i < i3) {
                this.f5459c[i] = u0Var.m19989b(this.f5460d[i]);
                i++;
            } else {
                this.f5461e = new long[i3];
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m34500u(C6722k kVar, C6722k kVar2) {
        return kVar2.f14325r - kVar.f14325r;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: b */
    public final boolean mo34435b(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean t = m34501t(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.f5458b && !t; i2++) {
            if (i2 == i || m34501t(i2, elapsedRealtime)) {
                t = false;
            } else {
                t = true;
            }
        }
        if (!t) {
            return false;
        }
        long[] jArr = this.f5461e;
        jArr[i] = Math.max(jArr[i], C7557q0.m22161b(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // p029b9.AbstractC3421k
    /* renamed from: c */
    public final C6722k mo34414c(int i) {
        return this.f5460d[i];
    }

    @Override // p029b9.AbstractC3421k
    /* renamed from: d */
    public final int mo34413d(int i) {
        return this.f5459c[i];
    }

    @Override // p029b9.AbstractC3415h
    public void disable() {
    }

    @Override // p029b9.AbstractC3415h
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3402c cVar = (AbstractC3402c) obj;
        if (this.f5457a != cVar.f5457a || !Arrays.equals(this.f5459c, cVar.f5459c)) {
            return false;
        }
        return true;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: f */
    public void mo34434f(float f) {
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: h */
    public /* synthetic */ void mo34433h() {
        C3414g.m34439a(this);
    }

    public int hashCode() {
        if (this.f5462f == 0) {
            this.f5462f = (System.identityHashCode(this.f5457a) * 31) + Arrays.hashCode(this.f5459c);
        }
        return this.f5462f;
    }

    @Override // p029b9.AbstractC3421k
    /* renamed from: i */
    public final int mo34412i(int i) {
        for (int i2 = 0; i2 < this.f5458b; i2++) {
            if (this.f5459c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: j */
    public /* synthetic */ boolean mo34432j(long j, AbstractC9827e eVar, List list) {
        return C3414g.m34436d(this, j, eVar, list);
    }

    @Override // p029b9.AbstractC3421k
    /* renamed from: k */
    public final C8302u0 mo34411k() {
        return this.f5457a;
    }

    @Override // p029b9.AbstractC3421k
    /* renamed from: l */
    public final int mo34410l(C6722k kVar) {
        for (int i = 0; i < this.f5458b; i++) {
            if (this.f5460d[i] == kVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // p029b9.AbstractC3421k
    public final int length() {
        return this.f5459c.length;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: m */
    public /* synthetic */ void mo34431m(boolean z) {
        C3414g.m34438b(this, z);
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: n */
    public int mo34430n(long j, List<? extends AbstractC9838m> list) {
        return list.size();
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: o */
    public final int mo34429o() {
        return this.f5459c[mo12503a()];
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: p */
    public final C6722k mo34428p() {
        return this.f5460d[mo12503a()];
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: r */
    public /* synthetic */ void mo34427r() {
        C3414g.m34437c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean m34501t(int i, long j) {
        return this.f5461e[i] > j;
    }
}
