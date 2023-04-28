package ph;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ph.d */
/* loaded from: classes8.dex */
public abstract class AbstractC11691d implements Iterable<Byte> {

    /* renamed from: k */
    public static final AbstractC11691d f26108k = new C11721p(new byte[0]);

    /* renamed from: ph.d$a */
    /* loaded from: classes8.dex */
    public interface AbstractC11692a extends Iterator<Byte> {
        /* renamed from: a */
        byte mo8745a();
    }

    /* renamed from: a */
    private static AbstractC11691d m9018a(Iterator<AbstractC11691d> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m9018a(it, i2).m9017b(m9018a(it, i - i2));
    }

    /* renamed from: e */
    public static AbstractC11691d m9016e(Iterable<AbstractC11691d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (AbstractC11691d dVar : iterable) {
                collection.add(dVar);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f26108k;
        }
        return m9018a(collection.iterator(), collection.size());
    }

    /* renamed from: f */
    public static AbstractC11691d m9015f(byte[] bArr) {
        return m9014g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static AbstractC11691d m9014g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C11721p(bArr2);
    }

    /* renamed from: i */
    public static AbstractC11691d m9013i(String str) {
        try {
            return new C11721p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: w */
    public static C11693b m9011w() {
        return new C11693b(128);
    }

    /* renamed from: A */
    public byte[] m9021A() {
        int size = size();
        if (size == 0) {
            return C11710j.f26163a;
        }
        byte[] bArr = new byte[size];
        mo8762p(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: B */
    public abstract String mo8770B(String str);

    /* renamed from: C */
    public String m9020C() {
        try {
            return mo8770B("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m9019D(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Source end offset exceeded: ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else if (i2 > 0) {
                mo8769E(outputStream, i, i2);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract void mo8769E(OutputStream outputStream, int i, int i2);

    /* renamed from: b */
    public AbstractC11691d m9017b(AbstractC11691d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return C11729u.m8765I(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public void m9012j(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i2 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb4 = new StringBuilder(34);
                    sb4.append("Target end offset < 0: ");
                    sb4.append(i5);
                    throw new IndexOutOfBoundsException(sb4.toString());
                } else if (i3 > 0) {
                    mo8762p(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb5 = new StringBuilder(34);
                sb5.append("Source end offset < 0: ");
                sb5.append(i4);
                throw new IndexOutOfBoundsException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder(23);
            sb6.append("Length < 0: ");
            sb6.append(i3);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo8762p(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo8761r();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo8760s();

    public abstract int size();

    /* renamed from: t */
    public abstract boolean mo8759t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: u */
    public abstract AbstractC11692a iterator();

    /* renamed from: v */
    public abstract C11694e mo8757v();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public abstract int mo8756x(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public abstract int mo8755y(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo8754z();

    /* renamed from: ph.d$b */
    /* loaded from: classes8.dex */
    public static final class C11693b extends OutputStream {

        /* renamed from: p */
        private static final byte[] f26109p = new byte[0];

        /* renamed from: k */
        private final int f26110k;

        /* renamed from: l */
        private final ArrayList<AbstractC11691d> f26111l;

        /* renamed from: m */
        private int f26112m;

        /* renamed from: n */
        private byte[] f26113n;

        /* renamed from: o */
        private int f26114o;

        C11693b(int i) {
            if (i >= 0) {
                this.f26110k = i;
                this.f26111l = new ArrayList<>();
                this.f26113n = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: b */
        private byte[] m9010b(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: g */
        private void m9009g(int i) {
            this.f26111l.add(new C11721p(this.f26113n));
            int length = this.f26112m + this.f26113n.length;
            this.f26112m = length;
            this.f26113n = new byte[Math.max(this.f26110k, Math.max(i, length >>> 1))];
            this.f26114o = 0;
        }

        /* renamed from: h */
        private void m9008h() {
            int i = this.f26114o;
            byte[] bArr = this.f26113n;
            if (i >= bArr.length) {
                this.f26111l.add(new C11721p(this.f26113n));
                this.f26113n = f26109p;
            } else if (i > 0) {
                this.f26111l.add(new C11721p(m9010b(bArr, i)));
            }
            this.f26112m += this.f26114o;
            this.f26114o = 0;
        }

        /* renamed from: i */
        public synchronized AbstractC11691d m9007i() {
            m9008h();
            return AbstractC11691d.m9016e(this.f26111l);
        }

        public synchronized int size() {
            return this.f26112m + this.f26114o;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.f26114o == this.f26113n.length) {
                m9009g(1);
            }
            byte[] bArr = this.f26113n;
            int i2 = this.f26114o;
            this.f26114o = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f26113n;
            int length = bArr2.length;
            int i3 = this.f26114o;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f26114o += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m9009g(i4);
                System.arraycopy(bArr, i + length2, this.f26113n, 0, i4);
                this.f26114o = i4;
            }
        }
    }
}
