package ph;

import java.util.NoSuchElementException;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import ph.AbstractC11691d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ph.c */
/* loaded from: classes8.dex */
public class C11688c extends C11721p {

    /* renamed from: n */
    private final int f26103n;

    /* renamed from: o */
    private final int f26104o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.c$b */
    /* loaded from: classes8.dex */
    public class C11690b implements AbstractC11691d.AbstractC11692a, Iterator {

        /* renamed from: k */
        private int f26105k;

        /* renamed from: l */
        private final int f26106l;

        @Override // ph.AbstractC11691d.AbstractC11692a
        /* renamed from: a */
        public byte mo8745a() {
            int i = this.f26105k;
            if (i < this.f26106l) {
                byte[] bArr = C11688c.this.f26175l;
                this.f26105k = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
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
            return this.f26105k < this.f26106l;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C11690b() {
            int H = C11688c.this.mo8785H();
            this.f26105k = H;
            this.f26106l = H + C11688c.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11688c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        } else if (i + i2 <= bArr.length) {
            this.f26103n = i;
            this.f26104o = i2;
        } else {
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append("Offset+Length too large: ");
            sb4.append(i);
            sb4.append("+");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    @Override // ph.C11721p
    /* renamed from: F */
    public byte mo8787F(int i) {
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        } else if (i < size()) {
            return this.f26175l[this.f26103n + i];
        } else {
            int size = size();
            StringBuilder sb3 = new StringBuilder(41);
            sb3.append("Index too large: ");
            sb3.append(i);
            sb3.append(", ");
            sb3.append(size);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ph.C11721p
    /* renamed from: H */
    public int mo8785H() {
        return this.f26103n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ph.C11721p, ph.AbstractC11691d
    /* renamed from: p */
    public void mo8762p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f26175l, mo8785H() + i, bArr, i2, i3);
    }

    @Override // ph.C11721p, ph.AbstractC11691d
    public int size() {
        return this.f26104o;
    }

    @Override // ph.C11721p, ph.AbstractC11691d
    /* renamed from: u */
    public AbstractC11691d.AbstractC11692a iterator() {
        return new C11690b();
    }
}
