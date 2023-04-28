package p337s8;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p119g9.C7510a;
import p119g9.C7557q0;
import p152i7.AbstractC8226j;
import p317r8.AbstractC12458f;
import p317r8.AbstractC12459g;
import p317r8.AbstractC12464k;
import p317r8.C12463j;
import p337s8.AbstractC12820e;

/* renamed from: s8.e */
/* loaded from: classes7.dex */
abstract class AbstractC12820e implements AbstractC12459g {

    /* renamed from: a */
    private final ArrayDeque<C12822b> f28852a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<AbstractC12464k> f28853b;

    /* renamed from: c */
    private final PriorityQueue<C12822b> f28854c;

    /* renamed from: d */
    private C12822b f28855d;

    /* renamed from: e */
    private long f28856e;

    /* renamed from: f */
    private long f28857f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.e$b */
    /* loaded from: classes7.dex */
    public static final class C12822b extends C12463j implements Comparable<C12822b> {

        /* renamed from: t */
        private long f28858t;

        private C12822b() {
        }

        /* renamed from: v */
        public int compareTo(C12822b bVar) {
            if (m20299k() == bVar.m20299k()) {
                long j = this.f17800o - bVar.f17800o;
                if (j == 0) {
                    j = this.f28858t - bVar.f28858t;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
                return -1;
            } else if (m20299k()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.e$c */
    /* loaded from: classes7.dex */
    public static final class C12823c extends AbstractC12464k {

        /* renamed from: p */
        private AbstractC8226j.AbstractC8227a<C12823c> f28859p;

        public C12823c(AbstractC8226j.AbstractC8227a<C12823c> aVar) {
            this.f28859p = aVar;
        }

        @Override // p152i7.AbstractC8226j
        /* renamed from: n */
        public final void mo5319n() {
            this.f28859p.mo5336a(this);
        }
    }

    public AbstractC12820e() {
        for (int i = 0; i < 10; i++) {
            this.f28852a.add(new C12822b());
        }
        this.f28853b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f28853b.add(new C12823c(new AbstractC8226j.AbstractC8227a() { // from class: s8.d
                @Override // p152i7.AbstractC8226j.AbstractC8227a
                /* renamed from: a */
                public final void mo5336a(AbstractC8226j jVar) {
                    AbstractC12820e.this.m5322n((AbstractC12820e.C12823c) jVar);
                }
            }));
        }
        this.f28854c = new PriorityQueue<>();
    }

    /* renamed from: m */
    private void m5323m(C12822b bVar) {
        bVar.mo1151f();
        this.f28852a.add(bVar);
    }

    @Override // p317r8.AbstractC12459g
    /* renamed from: a */
    public void mo5335a(long j) {
        this.f28856e = j;
    }

    /* renamed from: e */
    protected abstract AbstractC12458f mo5331e();

    /* renamed from: f */
    protected abstract void mo5330f(C12463j jVar);

    @Override // p152i7.AbstractC8220e
    public void flush() {
        this.f28857f = 0L;
        this.f28856e = 0L;
        while (!this.f28854c.isEmpty()) {
            m5323m((C12822b) C7557q0.m22145j(this.f28854c.poll()));
        }
        C12822b bVar = this.f28855d;
        if (bVar != null) {
            m5323m(bVar);
            this.f28855d = null;
        }
    }

    /* renamed from: g */
    public C12463j mo5332d() {
        boolean z;
        if (this.f28855d == null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (this.f28852a.isEmpty()) {
            return null;
        }
        C12822b pollFirst = this.f28852a.pollFirst();
        this.f28855d = pollFirst;
        return pollFirst;
    }

    /* renamed from: h */
    public AbstractC12464k mo5334b() {
        if (this.f28853b.isEmpty()) {
            return null;
        }
        while (!this.f28854c.isEmpty() && ((C12822b) C7557q0.m22145j(this.f28854c.peek())).f17800o <= this.f28856e) {
            C12822b bVar = (C12822b) C7557q0.m22145j(this.f28854c.poll());
            if (bVar.m20299k()) {
                AbstractC12464k kVar = (AbstractC12464k) C7557q0.m22145j(this.f28853b.pollFirst());
                kVar.m20304e(4);
                m5323m(bVar);
                return kVar;
            }
            mo5330f(bVar);
            if (mo5325k()) {
                AbstractC12458f e = mo5331e();
                AbstractC12464k kVar2 = (AbstractC12464k) C7557q0.m22145j(this.f28853b.pollFirst());
                kVar2.m6666o(bVar.f17800o, e, Long.MAX_VALUE);
                m5323m(bVar);
                return kVar2;
            }
            m5323m(bVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final AbstractC12464k m5327i() {
        return this.f28853b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final long m5326j() {
        return this.f28856e;
    }

    /* renamed from: k */
    protected abstract boolean mo5325k();

    /* renamed from: l */
    public void mo5333c(C12463j jVar) {
        boolean z;
        if (jVar == this.f28855d) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        C12822b bVar = (C12822b) jVar;
        if (bVar.m20300j()) {
            m5323m(bVar);
        } else {
            long j = this.f28857f;
            this.f28857f = 1 + j;
            bVar.f28858t = j;
            this.f28854c.add(bVar);
        }
        this.f28855d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m5322n(AbstractC12464k kVar) {
        kVar.mo1151f();
        this.f28853b.add(kVar);
    }

    @Override // p152i7.AbstractC8220e
    public void release() {
    }
}
