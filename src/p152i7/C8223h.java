package p152i7;

import java.nio.ByteBuffer;

/* renamed from: i7.h */
/* loaded from: classes7.dex */
public class C8223h extends AbstractC8215a {

    /* renamed from: l */
    public final C8216b f17797l;

    /* renamed from: m */
    public ByteBuffer f17798m;

    /* renamed from: n */
    public boolean f17799n;

    /* renamed from: o */
    public long f17800o;

    /* renamed from: p */
    public ByteBuffer f17801p;

    /* renamed from: q */
    private final int f17802q;

    /* renamed from: r */
    private final int f17803r;

    /* renamed from: i7.h$a */
    /* loaded from: classes7.dex */
    public static final class C8224a extends IllegalStateException {

        /* renamed from: k */
        public final int f17804k;

        /* renamed from: l */
        public final int f17805l;

        public C8224a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f17804k = i;
            this.f17805l = i2;
        }
    }

    public C8223h(int i) {
        this(i, 0);
    }

    /* renamed from: n */
    private ByteBuffer m20286n(int i) {
        int i2;
        int i3 = this.f17802q;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f17798m;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new C8224a(i2, i);
    }

    /* renamed from: s */
    public static C8223h m20281s() {
        return new C8223h(0);
    }

    @Override // p152i7.AbstractC8215a
    /* renamed from: f */
    public void mo1151f() {
        super.mo1151f();
        ByteBuffer byteBuffer = this.f17798m;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f17801p;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f17799n = false;
    }

    /* renamed from: o */
    public void m20285o(int i) {
        int i2 = i + this.f17803r;
        ByteBuffer byteBuffer = this.f17798m;
        if (byteBuffer == null) {
            this.f17798m = m20286n(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f17798m = byteBuffer;
            return;
        }
        ByteBuffer n = m20286n(i3);
        n.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            n.put(byteBuffer);
        }
        this.f17798m = n;
    }

    /* renamed from: p */
    public final void m20284p() {
        ByteBuffer byteBuffer = this.f17798m;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f17801p;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: q */
    public final boolean m20283q() {
        return m20302h(1073741824);
    }

    /* renamed from: r */
    public final boolean m20282r() {
        return this.f17798m == null && this.f17802q == 0;
    }

    /* renamed from: t */
    public void m20280t(int i) {
        ByteBuffer byteBuffer = this.f17801p;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f17801p = ByteBuffer.allocate(i);
        } else {
            this.f17801p.clear();
        }
    }

    public C8223h(int i, int i2) {
        this.f17797l = new C8216b();
        this.f17802q = i;
        this.f17803r = i2;
    }
}
