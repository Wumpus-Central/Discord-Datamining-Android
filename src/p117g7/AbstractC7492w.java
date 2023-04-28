package p117g7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p117g7.AbstractC7453h;

/* renamed from: g7.w */
/* loaded from: classes7.dex */
public abstract class AbstractC7492w implements AbstractC7453h {

    /* renamed from: b */
    protected AbstractC7453h.C7454a f16239b;

    /* renamed from: c */
    protected AbstractC7453h.C7454a f16240c;

    /* renamed from: d */
    private AbstractC7453h.C7454a f16241d;

    /* renamed from: e */
    private AbstractC7453h.C7454a f16242e;

    /* renamed from: f */
    private ByteBuffer f16243f;

    /* renamed from: g */
    private ByteBuffer f16244g;

    /* renamed from: h */
    private boolean f16245h;

    public AbstractC7492w() {
        ByteBuffer byteBuffer = AbstractC7453h.f16082a;
        this.f16243f = byteBuffer;
        this.f16244g = byteBuffer;
        AbstractC7453h.C7454a aVar = AbstractC7453h.C7454a.f16083e;
        this.f16241d = aVar;
        this.f16242e = aVar;
        this.f16239b = aVar;
        this.f16240c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m22413a() {
        return this.f16244g.hasRemaining();
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: b */
    public boolean mo22412b() {
        return this.f16242e != AbstractC7453h.C7454a.f16083e;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: c */
    public boolean mo22411c() {
        return this.f16245h && this.f16244g == AbstractC7453h.f16082a;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: d */
    public ByteBuffer mo22410d() {
        ByteBuffer byteBuffer = this.f16244g;
        this.f16244g = AbstractC7453h.f16082a;
        return byteBuffer;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: e */
    public final AbstractC7453h.C7454a mo22409e(AbstractC7453h.C7454a aVar) {
        this.f16241d = aVar;
        this.f16242e = mo22404h(aVar);
        if (mo22412b()) {
            return this.f16242e;
        }
        return AbstractC7453h.C7454a.f16083e;
    }

    @Override // p117g7.AbstractC7453h
    public final void flush() {
        this.f16244g = AbstractC7453h.f16082a;
        this.f16245h = false;
        this.f16239b = this.f16241d;
        this.f16240c = this.f16242e;
        mo22403i();
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: g */
    public final void mo22408g() {
        this.f16245h = true;
        mo22407j();
    }

    /* renamed from: h */
    protected abstract AbstractC7453h.C7454a mo22404h(AbstractC7453h.C7454a aVar);

    /* renamed from: i */
    protected void mo22403i() {
    }

    /* renamed from: j */
    protected void mo22407j() {
    }

    /* renamed from: k */
    protected void mo22402k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final ByteBuffer m22406l(int i) {
        if (this.f16243f.capacity() < i) {
            this.f16243f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f16243f.clear();
        }
        ByteBuffer byteBuffer = this.f16243f;
        this.f16244g = byteBuffer;
        return byteBuffer;
    }

    @Override // p117g7.AbstractC7453h
    public final void reset() {
        flush();
        this.f16243f = AbstractC7453h.f16082a;
        AbstractC7453h.C7454a aVar = AbstractC7453h.C7454a.f16083e;
        this.f16241d = aVar;
        this.f16242e = aVar;
        this.f16239b = aVar;
        this.f16240c = aVar;
        mo22402k();
    }
}
