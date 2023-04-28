package ph;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import ph.AbstractC11691d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ph.p */
/* loaded from: classes8.dex */
public class C11721p extends AbstractC11691d {

    /* renamed from: l */
    protected final byte[] f26175l;

    /* renamed from: m */
    private int f26176m = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.p$b */
    /* loaded from: classes8.dex */
    public class C11723b implements AbstractC11691d.AbstractC11692a, Iterator {

        /* renamed from: k */
        private int f26177k;

        /* renamed from: l */
        private final int f26178l;

        @Override // ph.AbstractC11691d.AbstractC11692a
        /* renamed from: a */
        public byte mo8745a() {
            try {
                byte[] bArr = C11721p.this.f26175l;
                int i = this.f26177k;
                this.f26177k = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        /* renamed from: b */
        public Byte next() {
            return Byte.valueOf(mo8745a());
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Byte> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26177k < this.f26178l;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C11723b() {
            this.f26177k = 0;
            this.f26178l = C11721p.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11721p(byte[] bArr) {
        this.f26175l = bArr;
    }

    /* renamed from: I */
    static int m8784I(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: B */
    public String mo8770B(String str) {
        return new String(this.f26175l, mo8785H(), size(), str);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: E */
    void mo8769E(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f26175l, mo8785H() + i, i2);
    }

    /* renamed from: F */
    public byte mo8787F(int i) {
        return this.f26175l[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m8786G(C11721p pVar, int i, int i2) {
        if (i2 > pVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i + i2 <= pVar.size()) {
            byte[] bArr = this.f26175l;
            byte[] bArr2 = pVar.f26175l;
            int H = mo8785H() + i2;
            int H2 = mo8785H();
            int H3 = pVar.mo8785H() + i;
            while (H2 < H) {
                if (bArr[H2] != bArr2[H3]) {
                    return false;
                }
                H2++;
                H3++;
            }
            return true;
        } else {
            int size2 = pVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i);
            sb3.append(", ");
            sb3.append(i2);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public int mo8785H() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11691d) || size() != ((AbstractC11691d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C11721p) {
            return m8786G((C11721p) obj, 0, size());
        }
        if (obj instanceof C11729u) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i = this.f26176m;
        if (i == 0) {
            int size = size();
            i = mo8756x(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f26176m = i;
        }
        return i;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: p */
    protected void mo8762p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f26175l, i, bArr, i2, i3);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: r */
    protected int mo8761r() {
        return 0;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: s */
    protected boolean mo8760s() {
        return true;
    }

    @Override // ph.AbstractC11691d
    public int size() {
        return this.f26175l.length;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: t */
    public boolean mo8759t() {
        int H = mo8785H();
        return C11746y.m8699f(this.f26175l, H, size() + H);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: u */
    public AbstractC11691d.AbstractC11692a iterator() {
        return new C11723b();
    }

    @Override // ph.AbstractC11691d
    /* renamed from: v */
    public C11694e mo8757v() {
        return C11694e.m8979h(this);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: x */
    protected int mo8756x(int i, int i2, int i3) {
        return m8784I(i, this.f26175l, mo8785H() + i2, i3);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: y */
    protected int mo8755y(int i, int i2, int i3) {
        int H = mo8785H() + i2;
        return C11746y.m8698g(i, this.f26175l, H, i3 + H);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: z */
    protected int mo8754z() {
        return this.f26176m;
    }
}
