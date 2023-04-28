package p117g7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p117g7.AbstractC7453h;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: g7.q0 */
/* loaded from: classes7.dex */
public final class C7477q0 implements AbstractC7453h {

    /* renamed from: e */
    private AbstractC7453h.C7454a f16172e;

    /* renamed from: f */
    private AbstractC7453h.C7454a f16173f;

    /* renamed from: g */
    private AbstractC7453h.C7454a f16174g;

    /* renamed from: h */
    private AbstractC7453h.C7454a f16175h;

    /* renamed from: i */
    private boolean f16176i;

    /* renamed from: j */
    private C7475p0 f16177j;

    /* renamed from: k */
    private ByteBuffer f16178k;

    /* renamed from: l */
    private ShortBuffer f16179l;

    /* renamed from: m */
    private ByteBuffer f16180m;

    /* renamed from: n */
    private long f16181n;

    /* renamed from: o */
    private long f16182o;

    /* renamed from: p */
    private boolean f16183p;

    /* renamed from: c */
    private float f16170c = 1.0f;

    /* renamed from: d */
    private float f16171d = 1.0f;

    /* renamed from: b */
    private int f16169b = -1;

    public C7477q0() {
        AbstractC7453h.C7454a aVar = AbstractC7453h.C7454a.f16083e;
        this.f16172e = aVar;
        this.f16173f = aVar;
        this.f16174g = aVar;
        this.f16175h = aVar;
        ByteBuffer byteBuffer = AbstractC7453h.f16082a;
        this.f16178k = byteBuffer;
        this.f16179l = byteBuffer.asShortBuffer();
        this.f16180m = byteBuffer;
    }

    /* renamed from: a */
    public long m22523a(long j) {
        if (this.f16182o < 1024) {
            return (long) (this.f16170c * j);
        }
        long l = this.f16181n - ((C7475p0) C7510a.m22367e(this.f16177j)).m22535l();
        int i = this.f16175h.f16084a;
        int i2 = this.f16174g.f16084a;
        if (i == i2) {
            return C7557q0.m22198I0(j, l, this.f16182o);
        }
        return C7557q0.m22198I0(j, l * i, this.f16182o * i2);
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: b */
    public boolean mo22412b() {
        if (this.f16173f.f16084a == -1 || (Math.abs(this.f16170c - 1.0f) < 1.0E-4f && Math.abs(this.f16171d - 1.0f) < 1.0E-4f && this.f16173f.f16084a == this.f16172e.f16084a)) {
            return false;
        }
        return true;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: c */
    public boolean mo22411c() {
        C7475p0 p0Var;
        return this.f16183p && ((p0Var = this.f16177j) == null || p0Var.m22536k() == 0);
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: d */
    public ByteBuffer mo22410d() {
        int k;
        C7475p0 p0Var = this.f16177j;
        if (p0Var != null && (k = p0Var.m22536k()) > 0) {
            if (this.f16178k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.f16178k = order;
                this.f16179l = order.asShortBuffer();
            } else {
                this.f16178k.clear();
                this.f16179l.clear();
            }
            p0Var.m22537j(this.f16179l);
            this.f16182o += k;
            this.f16178k.limit(k);
            this.f16180m = this.f16178k;
        }
        ByteBuffer byteBuffer = this.f16180m;
        this.f16180m = AbstractC7453h.f16082a;
        return byteBuffer;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: e */
    public AbstractC7453h.C7454a mo22409e(AbstractC7453h.C7454a aVar) {
        if (aVar.f16086c == 2) {
            int i = this.f16169b;
            if (i == -1) {
                i = aVar.f16084a;
            }
            this.f16172e = aVar;
            AbstractC7453h.C7454a aVar2 = new AbstractC7453h.C7454a(i, aVar.f16085b, 2);
            this.f16173f = aVar2;
            this.f16176i = true;
            return aVar2;
        }
        throw new AbstractC7453h.C7455b(aVar);
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: f */
    public void mo22405f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f16181n += remaining;
            ((C7475p0) C7510a.m22367e(this.f16177j)).m22527t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p117g7.AbstractC7453h
    public void flush() {
        if (mo22412b()) {
            AbstractC7453h.C7454a aVar = this.f16172e;
            this.f16174g = aVar;
            AbstractC7453h.C7454a aVar2 = this.f16173f;
            this.f16175h = aVar2;
            if (this.f16176i) {
                this.f16177j = new C7475p0(aVar.f16084a, aVar.f16085b, this.f16170c, this.f16171d, aVar2.f16084a);
            } else {
                C7475p0 p0Var = this.f16177j;
                if (p0Var != null) {
                    p0Var.m22538i();
                }
            }
        }
        this.f16180m = AbstractC7453h.f16082a;
        this.f16181n = 0L;
        this.f16182o = 0L;
        this.f16183p = false;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: g */
    public void mo22408g() {
        C7475p0 p0Var = this.f16177j;
        if (p0Var != null) {
            p0Var.m22528s();
        }
        this.f16183p = true;
    }

    /* renamed from: h */
    public void m22522h(float f) {
        if (this.f16171d != f) {
            this.f16171d = f;
            this.f16176i = true;
        }
    }

    /* renamed from: i */
    public void m22521i(float f) {
        if (this.f16170c != f) {
            this.f16170c = f;
            this.f16176i = true;
        }
    }

    @Override // p117g7.AbstractC7453h
    public void reset() {
        this.f16170c = 1.0f;
        this.f16171d = 1.0f;
        AbstractC7453h.C7454a aVar = AbstractC7453h.C7454a.f16083e;
        this.f16172e = aVar;
        this.f16173f = aVar;
        this.f16174g = aVar;
        this.f16175h = aVar;
        ByteBuffer byteBuffer = AbstractC7453h.f16082a;
        this.f16178k = byteBuffer;
        this.f16179l = byteBuffer.asShortBuffer();
        this.f16180m = byteBuffer;
        this.f16169b = -1;
        this.f16176i = false;
        this.f16177j = null;
        this.f16181n = 0L;
        this.f16182o = 0L;
        this.f16183p = false;
    }
}
