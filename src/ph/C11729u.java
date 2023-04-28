package ph;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import ph.AbstractC11691d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ph.u */
/* loaded from: classes8.dex */
public class C11729u extends AbstractC11691d {

    /* renamed from: r */
    private static final int[] f26180r;

    /* renamed from: l */
    private final int f26181l;

    /* renamed from: m */
    private final AbstractC11691d f26182m;

    /* renamed from: n */
    private final AbstractC11691d f26183n;

    /* renamed from: o */
    private final int f26184o;

    /* renamed from: p */
    private final int f26185p;

    /* renamed from: q */
    private int f26186q;

    /* renamed from: ph.u$b */
    /* loaded from: classes8.dex */
    private static class C11731b {

        /* renamed from: a */
        private final Stack<AbstractC11691d> f26187a;

        private C11731b() {
            this.f26187a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public AbstractC11691d m8752b(AbstractC11691d dVar, AbstractC11691d dVar2) {
            m8751c(dVar);
            m8751c(dVar2);
            AbstractC11691d pop = this.f26187a.pop();
            while (!this.f26187a.isEmpty()) {
                pop = new C11729u(this.f26187a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        private void m8751c(AbstractC11691d dVar) {
            if (dVar.mo8760s()) {
                m8749e(dVar);
            } else if (dVar instanceof C11729u) {
                C11729u uVar = (C11729u) dVar;
                m8751c(uVar.f26182m);
                m8751c(uVar.f26183n);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: d */
        private int m8750d(int i) {
            int binarySearch = Arrays.binarySearch(C11729u.f26180r, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m8749e(AbstractC11691d dVar) {
            int d = m8750d(dVar.size());
            int i = C11729u.f26180r[d + 1];
            if (this.f26187a.isEmpty() || this.f26187a.peek().size() >= i) {
                this.f26187a.push(dVar);
                return;
            }
            int i2 = C11729u.f26180r[d];
            AbstractC11691d pop = this.f26187a.pop();
            while (!this.f26187a.isEmpty() && this.f26187a.peek().size() < i2) {
                pop = new C11729u(this.f26187a.pop(), pop);
            }
            C11729u uVar = new C11729u(pop, dVar);
            while (!this.f26187a.isEmpty()) {
                if (this.f26187a.peek().size() >= C11729u.f26180r[m8750d(uVar.size()) + 1]) {
                    break;
                }
                uVar = new C11729u(this.f26187a.pop(), uVar);
            }
            this.f26187a.push(uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.u$c */
    /* loaded from: classes8.dex */
    public static class C11732c implements Iterator<C11721p>, p163j$.util.Iterator {

        /* renamed from: k */
        private final Stack<C11729u> f26188k;

        /* renamed from: l */
        private C11721p f26189l;

        /* renamed from: b */
        private C11721p m8748b(AbstractC11691d dVar) {
            while (dVar instanceof C11729u) {
                C11729u uVar = (C11729u) dVar;
                this.f26188k.push(uVar);
                dVar = uVar.f26182m;
            }
            return (C11721p) dVar;
        }

        /* renamed from: c */
        private C11721p m8747c() {
            while (!this.f26188k.isEmpty()) {
                C11721p b = m8748b(this.f26188k.pop().f26183n);
                if (!b.isEmpty()) {
                    return b;
                }
            }
            return null;
        }

        /* renamed from: d */
        public C11721p next() {
            C11721p pVar = this.f26189l;
            if (pVar != null) {
                this.f26189l = m8747c();
                return pVar;
            }
            throw new NoSuchElementException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C11721p> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26189l != null;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C11732c(AbstractC11691d dVar) {
            this.f26188k = new Stack<>();
            this.f26189l = m8748b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.u$d */
    /* loaded from: classes8.dex */
    public class C11733d implements AbstractC11691d.AbstractC11692a, p163j$.util.Iterator {

        /* renamed from: k */
        private final C11732c f26190k;

        /* renamed from: l */
        private AbstractC11691d.AbstractC11692a f26191l;

        /* renamed from: m */
        int f26192m;

        @Override // ph.AbstractC11691d.AbstractC11692a
        /* renamed from: a */
        public byte mo8745a() {
            if (!this.f26191l.hasNext()) {
                this.f26191l = this.f26190k.next().iterator();
            }
            this.f26192m--;
            return this.f26191l.mo8745a();
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
            return this.f26192m > 0;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C11733d() {
            C11732c cVar = new C11732c(C11729u.this);
            this.f26190k = cVar;
            this.f26191l = cVar.next().iterator();
            this.f26192m = C11729u.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf((int) ViewDefaults.NUMBER_OF_LINES));
        f26180r = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f26180r;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static AbstractC11691d m8765I(AbstractC11691d dVar, AbstractC11691d dVar2) {
        C11729u uVar;
        if (dVar instanceof C11729u) {
            uVar = (C11729u) dVar;
        } else {
            uVar = null;
        }
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return m8764J(dVar, dVar2);
            }
            if (uVar != null && uVar.f26183n.size() + dVar2.size() < 128) {
                dVar2 = new C11729u(uVar.f26182m, m8764J(uVar.f26183n, dVar2));
            } else if (uVar == null || uVar.f26182m.mo8761r() <= uVar.f26183n.mo8761r() || uVar.mo8761r() <= dVar2.mo8761r()) {
                if (size >= f26180r[Math.max(dVar.mo8761r(), dVar2.mo8761r()) + 1]) {
                    return new C11729u(dVar, dVar2);
                }
                return new C11731b().m8752b(dVar, dVar2);
            } else {
                dVar2 = new C11729u(uVar.f26182m, new C11729u(uVar.f26183n, dVar2));
            }
        }
        return dVar2;
    }

    /* renamed from: J */
    private static C11721p m8764J(AbstractC11691d dVar, AbstractC11691d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.m9012j(bArr, 0, 0, size);
        dVar2.m9012j(bArr, 0, size, size2);
        return new C11721p(bArr);
    }

    /* renamed from: K */
    private boolean m8763K(AbstractC11691d dVar) {
        boolean z;
        C11732c cVar = new C11732c(this);
        C11721p next = cVar.next();
        C11732c cVar2 = new C11732c(dVar);
        C11721p next2 = cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = next.m8786G(next2, i2, min);
            } else {
                z = next2.m8786G(next, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f26181l;
            if (i3 < i4) {
                if (min == size) {
                    next = cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    next2 = cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // ph.AbstractC11691d
    /* renamed from: B */
    public String mo8770B(String str) {
        return new String(m9021A(), str);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: E */
    void mo8769E(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f26184o;
        if (i3 <= i4) {
            this.f26182m.mo8769E(outputStream, i, i2);
        } else if (i >= i4) {
            this.f26183n.mo8769E(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f26182m.mo8769E(outputStream, i, i5);
            this.f26183n.mo8769E(outputStream, 0, i2 - i5);
        }
    }

    public boolean equals(Object obj) {
        int z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11691d)) {
            return false;
        }
        AbstractC11691d dVar = (AbstractC11691d) obj;
        if (this.f26181l != dVar.size()) {
            return false;
        }
        if (this.f26181l == 0) {
            return true;
        }
        if (this.f26186q == 0 || (z = dVar.mo8754z()) == 0 || this.f26186q == z) {
            return m8763K(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f26186q;
        if (i == 0) {
            int i2 = this.f26181l;
            i = mo8756x(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f26186q = i;
        }
        return i;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: p */
    protected void mo8762p(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f26184o;
        if (i4 <= i5) {
            this.f26182m.mo8762p(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f26183n.mo8762p(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f26182m.mo8762p(bArr, i, i2, i6);
            this.f26183n.mo8762p(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // ph.AbstractC11691d
    /* renamed from: r */
    protected int mo8761r() {
        return this.f26185p;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: s */
    protected boolean mo8760s() {
        return this.f26181l >= f26180r[this.f26185p];
    }

    @Override // ph.AbstractC11691d
    public int size() {
        return this.f26181l;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: t */
    public boolean mo8759t() {
        int y = this.f26182m.mo8755y(0, 0, this.f26184o);
        AbstractC11691d dVar = this.f26183n;
        if (dVar.mo8755y(y, 0, dVar.size()) == 0) {
            return true;
        }
        return false;
    }

    @Override // ph.AbstractC11691d
    /* renamed from: u */
    public AbstractC11691d.AbstractC11692a iterator() {
        return new C11733d();
    }

    @Override // ph.AbstractC11691d
    /* renamed from: v */
    public C11694e mo8757v() {
        return C11694e.m8980g(new C11734e());
    }

    @Override // ph.AbstractC11691d
    /* renamed from: x */
    protected int mo8756x(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f26184o;
        if (i4 <= i5) {
            return this.f26182m.mo8756x(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f26183n.mo8756x(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f26183n.mo8756x(this.f26182m.mo8756x(i, i2, i6), 0, i3 - i6);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: y */
    protected int mo8755y(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f26184o;
        if (i4 <= i5) {
            return this.f26182m.mo8755y(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f26183n.mo8755y(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f26183n.mo8755y(this.f26182m.mo8755y(i, i2, i6), 0, i3 - i6);
    }

    @Override // ph.AbstractC11691d
    /* renamed from: z */
    protected int mo8754z() {
        return this.f26186q;
    }

    private C11729u(AbstractC11691d dVar, AbstractC11691d dVar2) {
        this.f26186q = 0;
        this.f26182m = dVar;
        this.f26183n = dVar2;
        int size = dVar.size();
        this.f26184o = size;
        this.f26181l = size + dVar2.size();
        this.f26185p = Math.max(dVar.mo8761r(), dVar2.mo8761r()) + 1;
    }

    /* renamed from: ph.u$e */
    /* loaded from: classes8.dex */
    private class C11734e extends InputStream {

        /* renamed from: k */
        private C11732c f26194k;

        /* renamed from: l */
        private C11721p f26195l;

        /* renamed from: m */
        private int f26196m;

        /* renamed from: n */
        private int f26197n;

        /* renamed from: o */
        private int f26198o;

        /* renamed from: p */
        private int f26199p;

        public C11734e() {
            m8742g();
        }

        /* renamed from: b */
        private void m8743b() {
            if (this.f26195l != null) {
                int i = this.f26197n;
                int i2 = this.f26196m;
                if (i == i2) {
                    this.f26198o += i2;
                    this.f26197n = 0;
                    if (this.f26194k.hasNext()) {
                        C11721p d = this.f26194k.next();
                        this.f26195l = d;
                        this.f26196m = d.size();
                        return;
                    }
                    this.f26195l = null;
                    this.f26196m = 0;
                }
            }
        }

        /* renamed from: g */
        private void m8742g() {
            C11732c cVar = new C11732c(C11729u.this);
            this.f26194k = cVar;
            C11721p d = cVar.next();
            this.f26195l = d;
            this.f26196m = d.size();
            this.f26197n = 0;
            this.f26198o = 0;
        }

        /* renamed from: h */
        private int m8741h(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m8743b();
                if (this.f26195l != null) {
                    int min = Math.min(this.f26196m - this.f26197n, i3);
                    if (bArr != null) {
                        this.f26195l.m9012j(bArr, this.f26197n, i, min);
                        i += min;
                    }
                    this.f26197n += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int available() {
            return C11729u.this.size() - (this.f26198o + this.f26197n);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f26199p = this.f26198o + this.f26197n;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m8741h(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m8742g();
            m8741h(null, 0, this.f26199p);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m8741h(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            m8743b();
            C11721p pVar = this.f26195l;
            if (pVar == null) {
                return -1;
            }
            int i = this.f26197n;
            this.f26197n = i + 1;
            return pVar.mo8787F(i) & 255;
        }
    }
}
