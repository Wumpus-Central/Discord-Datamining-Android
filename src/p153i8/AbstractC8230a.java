package p153i8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8299u;
import p193k7.AbstractC9815v;

/* renamed from: i8.a */
/* loaded from: classes7.dex */
public abstract class AbstractC8230a implements AbstractC8299u {

    /* renamed from: k */
    private final ArrayList<AbstractC8299u.AbstractC8301b> f17827k = new ArrayList<>(1);

    /* renamed from: l */
    private final HashSet<AbstractC8299u.AbstractC8301b> f17828l = new HashSet<>(1);

    /* renamed from: m */
    private final AbstractC8233b0.C8234a f17829m = new AbstractC8233b0.C8234a();

    /* renamed from: n */
    private final AbstractC9815v.C9816a f17830n = new AbstractC9815v.C9816a();

    /* renamed from: o */
    private Looper f17831o;

    /* renamed from: p */
    private Timeline f17832p;

    /* renamed from: A */
    protected abstract void mo20008A(AbstractC6795x xVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final void m20266B(Timeline timeline) {
        this.f17832p = timeline;
        Iterator<AbstractC8299u.AbstractC8301b> it = this.f17827k.iterator();
        while (it.hasNext()) {
            it.next().mo19991a(this, timeline);
        }
    }

    /* renamed from: C */
    protected abstract void mo20007C();

    @Override // p153i8.AbstractC8299u
    /* renamed from: b */
    public final void mo20005b(Handler handler, AbstractC9815v vVar) {
        C7510a.m22367e(handler);
        C7510a.m22367e(vVar);
        this.f17830n.m15293g(handler, vVar);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: d */
    public final void mo20003d(AbstractC8233b0 b0Var) {
        this.f17829m.m20257C(b0Var);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: e */
    public final void mo20002e(AbstractC8299u.AbstractC8301b bVar, AbstractC6795x xVar) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f17831o;
        if (looper == null || looper == myLooper) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        Timeline timeline = this.f17832p;
        this.f17827k.add(bVar);
        if (this.f17831o == null) {
            this.f17831o = myLooper;
            this.f17828l.add(bVar);
            mo20008A(xVar);
        } else if (timeline != null) {
            mo20000g(bVar);
            bVar.mo19991a(this, timeline);
        }
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: f */
    public final void mo20001f(AbstractC8299u.AbstractC8301b bVar) {
        this.f17827k.remove(bVar);
        if (this.f17827k.isEmpty()) {
            this.f17831o = null;
            this.f17832p = null;
            this.f17828l.clear();
            mo20007C();
            return;
        }
        mo19993r(bVar);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: g */
    public final void mo20000g(AbstractC8299u.AbstractC8301b bVar) {
        C7510a.m22367e(this.f17831o);
        boolean isEmpty = this.f17828l.isEmpty();
        this.f17828l.add(bVar);
        if (isEmpty) {
            mo20206y();
        }
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: h */
    public final void mo19999h(Handler handler, AbstractC8233b0 b0Var) {
        C7510a.m22367e(handler);
        C7510a.m22367e(b0Var);
        this.f17829m.m20247g(handler, b0Var);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: p */
    public /* synthetic */ boolean mo19995p() {
        return C8295t.m20009b(this);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: q */
    public /* synthetic */ Timeline mo19994q() {
        return C8295t.m20010a(this);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: r */
    public final void mo19993r(AbstractC8299u.AbstractC8301b bVar) {
        boolean z = !this.f17828l.isEmpty();
        this.f17828l.remove(bVar);
        if (z && this.f17828l.isEmpty()) {
            mo20207x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final AbstractC9815v.C9816a m20265s(int i, AbstractC8299u.C8300a aVar) {
        return this.f17830n.m15280t(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final AbstractC9815v.C9816a m20264t(AbstractC8299u.C8300a aVar) {
        return this.f17830n.m15280t(0, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final AbstractC8233b0.C8234a m20263u(int i, AbstractC8299u.C8300a aVar, long j) {
        return this.f17829m.m20254F(i, aVar, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final AbstractC8233b0.C8234a m20262v(AbstractC8299u.C8300a aVar) {
        return this.f17829m.m20254F(0, aVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final AbstractC8233b0.C8234a m20261w(AbstractC8299u.C8300a aVar, long j) {
        C7510a.m22367e(aVar);
        return this.f17829m.m20254F(0, aVar, j);
    }

    /* renamed from: x */
    protected void mo20207x() {
    }

    /* renamed from: y */
    protected void mo20206y() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean m20260z() {
        return !this.f17828l.isEmpty();
    }
}
