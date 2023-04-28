package p459z7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p079e7.AbstractC6712b;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6732s;
import p119g9.C7510a;
import p119g9.C7557q0;
import p459z7.C14576a;

/* renamed from: z7.g */
/* loaded from: classes7.dex */
public final class C14584g extends AbstractC6712b implements Handler.Callback {

    /* renamed from: A */
    private final C14576a[] f39510A;

    /* renamed from: B */
    private final long[] f39511B;

    /* renamed from: C */
    private int f39512C;

    /* renamed from: D */
    private int f39513D;

    /* renamed from: E */
    private AbstractC14579c f39514E;

    /* renamed from: F */
    private boolean f39515F;

    /* renamed from: G */
    private boolean f39516G;

    /* renamed from: H */
    private long f39517H;

    /* renamed from: w */
    private final AbstractC14580d f33050w;

    /* renamed from: x */
    private final AbstractC14583f f33051x;

    /* renamed from: y */
    private final Handler f33052y;

    /* renamed from: z */
    private final C14582e f33053z;

    public C14584g(AbstractC14583f fVar, Looper looper) {
        this(fVar, looper, AbstractC14580d.f33048a);
    }

    /* renamed from: M */
    private void m170M(C14576a aVar, List<C14576a.AbstractC14577b> list) {
        for (int i = 0; i < aVar.m183f(); i++) {
            C6722k g = aVar.m184e(i).mo179g();
            if (g == null || !this.f33050w.mo176a(g)) {
                list.add(aVar.m184e(i));
            } else {
                AbstractC14579c b = this.f33050w.mo175b(g);
                byte[] bArr = (byte[]) C7510a.m22367e(aVar.m184e(i).mo180Q());
                this.f33053z.mo1151f();
                this.f33053z.m20285o(bArr.length);
                ((ByteBuffer) C7557q0.m22145j(this.f33053z.f17798m)).put(bArr);
                this.f33053z.m20284p();
                C14576a a = b.mo162a(this.f33053z);
                if (a != null) {
                    m170M(a, list);
                }
            }
        }
    }

    /* renamed from: N */
    private void m169N() {
        Arrays.fill(this.f39510A, (Object) null);
        this.f39512C = 0;
        this.f39513D = 0;
    }

    /* renamed from: O */
    private void m168O(C14576a aVar) {
        Handler handler = this.f33052y;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            m167P(aVar);
        }
    }

    /* renamed from: P */
    private void m167P(C14576a aVar) {
        this.f33051x.mo174s(aVar);
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: D */
    protected void mo173D() {
        m169N();
        this.f39514E = null;
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: F */
    protected void mo172F(long j, boolean z) {
        m169N();
        this.f39515F = false;
        this.f39516G = false;
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: J */
    protected void mo171J(C6722k[] kVarArr, long j, long j2) {
        this.f39514E = this.f33050w.mo175b(kVarArr[0]);
    }

    @Override // p079e7.AbstractC6733t
    /* renamed from: a */
    public int mo166a(C6722k kVar) {
        int i;
        if (!this.f33050w.mo176a(kVar)) {
            return C6732s.m24429a(0);
        }
        if (kVar.f37975O == null) {
            i = 4;
        } else {
            i = 2;
        }
        return C6732s.m24429a(i);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: c */
    public boolean mo165c() {
        return this.f39516G;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: e */
    public boolean mo164e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0, p079e7.AbstractC6733t
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m167P((C14576a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: r */
    public void mo163r(long j, long j2) {
        if (!this.f39515F && this.f39513D < 5) {
            this.f33053z.mo1151f();
            C6725l z = m24569z();
            int K = m24584K(z, this.f33053z, false);
            if (K == -4) {
                if (this.f33053z.m20299k()) {
                    this.f39515F = true;
                } else {
                    C14582e eVar = this.f33053z;
                    eVar.f33049s = this.f39517H;
                    eVar.m20284p();
                    C14576a a = ((AbstractC14579c) C7557q0.m22145j(this.f39514E)).mo162a(this.f33053z);
                    if (a != null) {
                        ArrayList arrayList = new ArrayList(a.m183f());
                        m170M(a, arrayList);
                        if (!arrayList.isEmpty()) {
                            C14576a aVar = new C14576a(arrayList);
                            int i = this.f39512C;
                            int i2 = this.f39513D;
                            int i3 = (i + i2) % 5;
                            this.f39510A[i3] = aVar;
                            this.f39511B[i3] = this.f33053z.f17800o;
                            this.f39513D = i2 + 1;
                        }
                    }
                }
            } else if (K == -5) {
                this.f39517H = ((C6722k) C7510a.m22367e(z.f14361b)).f14333z;
            }
        }
        if (this.f39513D > 0) {
            long[] jArr = this.f39511B;
            int i4 = this.f39512C;
            if (jArr[i4] <= j) {
                m168O((C14576a) C7557q0.m22145j(this.f39510A[i4]));
                C14576a[] aVarArr = this.f39510A;
                int i5 = this.f39512C;
                aVarArr[i5] = null;
                this.f39512C = (i5 + 1) % 5;
                this.f39513D--;
            }
        }
        if (this.f39515F && this.f39513D == 0) {
            this.f39516G = true;
        }
    }

    public C14584g(AbstractC14583f fVar, Looper looper, AbstractC14580d dVar) {
        super(5);
        this.f33051x = (AbstractC14583f) C7510a.m22367e(fVar);
        this.f33052y = looper == null ? null : C7557q0.m22119w(looper, this);
        this.f33050w = (AbstractC14580d) C7510a.m22367e(dVar);
        this.f33053z = new C14582e();
        this.f39510A = new C14576a[5];
        this.f39511B = new long[5];
    }
}
