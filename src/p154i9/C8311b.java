package p154i9;

import java.nio.ByteBuffer;
import p079e7.AbstractC6712b;
import p079e7.C6722k;
import p079e7.C6732s;
import p119g9.C7557q0;
import p119g9.C7570y;
import p152i7.C8223h;

/* renamed from: i9.b */
/* loaded from: classes5.dex */
public final class C8311b extends AbstractC6712b {

    /* renamed from: A */
    private long f38607A;

    /* renamed from: w */
    private final C8223h f18124w = new C8223h(1);

    /* renamed from: x */
    private final C7570y f18125x = new C7570y();

    /* renamed from: y */
    private long f18126y;

    /* renamed from: z */
    private AbstractC8310a f18127z;

    public C8311b() {
        super(6);
    }

    /* renamed from: M */
    private float[] m19984M(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f18125x.m22019N(byteBuffer.array(), byteBuffer.limit());
        this.f18125x.m22017P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f18125x.m21999q());
        }
        return fArr;
    }

    /* renamed from: N */
    private void m19983N() {
        AbstractC8310a aVar = this.f18127z;
        if (aVar != null) {
            aVar.mo19985c();
        }
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: D */
    protected void mo173D() {
        m19983N();
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: F */
    protected void mo172F(long j, boolean z) {
        this.f38607A = Long.MIN_VALUE;
        m19983N();
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: J */
    protected void mo171J(C6722k[] kVarArr, long j, long j2) {
        this.f18126y = j2;
    }

    @Override // p079e7.AbstractC6733t
    /* renamed from: a */
    public int mo166a(C6722k kVar) {
        if ("application/x-camera-motion".equals(kVar.f14329v)) {
            return C6732s.m24429a(4);
        }
        return C6732s.m24429a(0);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: c */
    public boolean mo165c() {
        return mo24582g();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: e */
    public boolean mo164e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0, p079e7.AbstractC6733t
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // p079e7.AbstractC6712b, com.google.android.exoplayer2.C5218r0.AbstractC5220b
    /* renamed from: i */
    public void mo19982i(int i, Object obj) {
        if (i == 7) {
            this.f18127z = (AbstractC8310a) obj;
        } else {
            super.mo19982i(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: r */
    public void mo163r(long j, long j2) {
        while (!mo24582g() && this.f38607A < 100000 + j) {
            this.f18124w.mo1151f();
            if (m24584K(m24569z(), this.f18124w, false) == -4 && !this.f18124w.m20299k()) {
                C8223h hVar = this.f18124w;
                this.f38607A = hVar.f17800o;
                if (this.f18127z != null && !hVar.m20300j()) {
                    this.f18124w.m20284p();
                    float[] M = m19984M((ByteBuffer) C7557q0.m22145j(this.f18124w.f17798m));
                    if (M != null) {
                        ((AbstractC8310a) C7557q0.m22145j(this.f18127z)).mo19986a(this.f38607A - this.f18126y, M);
                    }
                }
            } else {
                return;
            }
        }
    }
}
