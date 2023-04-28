package fk;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.ByteString;
import p122gk.C7709b;
import p122gk.C7713e;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110(\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00103J\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J'\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J(\u0010!\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u000f\u0010\"\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\u0003H\u0016R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m15073d2 = {"Lfk/w;", "Lokio/ByteString;", "G", "", "a", "k", "y", "algorithm", "d", "(Ljava/lang/String;)Lokio/ByteString;", "", "pos", "", "m", "(I)B", "i", "()I", "", "z", "Ljava/io/OutputStream;", "out", "", "C", "Lokio/Buffer;", "buffer", "offset", "byteCount", "D", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "p", "q", "l", "()[B", "", "equals", "hashCode", "toString", "", "[[B", "F", "()[[B", "segments", "", "[I", "E", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.w */
/* loaded from: classes8.dex */
public final class C7380w extends ByteString {

    /* renamed from: p */
    private final transient byte[][] f15898p;

    /* renamed from: q */
    private final transient int[] f15899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7380w(byte[][] segments, int[] directory) {
        super(ByteString.f25541n.m9712g());
        C9971q.m14633g(segments, "segments");
        C9971q.m14633g(directory, "directory");
        this.f15898p = segments;
        this.f15899q = directory;
    }

    /* renamed from: G */
    private final ByteString m22767G() {
        return new ByteString(mo9694z());
    }

    @Override // okio.ByteString
    /* renamed from: C */
    public void mo9720C(OutputStream out) {
        C9971q.m14633g(out, "out");
        int length = m22768F().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m22769E()[length + i];
            int i4 = m22769E()[i];
            out.write(m22768F()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // okio.ByteString
    /* renamed from: D */
    public void mo9719D(Buffer buffer, int i, int i2) {
        int i3;
        C9971q.m14633g(buffer, "buffer");
        int i4 = i + i2;
        int b = C7713e.m21575b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = m22769E()[b - 1];
            }
            int i5 = m22769E()[m22768F().length + b];
            int min = Math.min(i4, (m22769E()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C7377u uVar = new C7377u(m22768F()[b], i6, i6 + min, true, false);
            C7377u uVar2 = buffer.f25530k;
            if (uVar2 == null) {
                uVar.f15892g = uVar;
                uVar.f15891f = uVar;
                buffer.f25530k = uVar;
            } else {
                C9971q.m14636d(uVar2);
                C7377u uVar3 = uVar2.f15892g;
                C9971q.m14636d(uVar3);
                uVar3.m22777c(uVar);
            }
            i += min;
            b++;
        }
        buffer.m9791F0(buffer.size() + i2);
    }

    /* renamed from: E */
    public final int[] m22769E() {
        return this.f15899q;
    }

    /* renamed from: F */
    public final byte[][] m22768F() {
        return this.f15898p;
    }

    @Override // okio.ByteString
    /* renamed from: a */
    public String mo9718a() {
        return m22767G().mo9718a();
    }

    @Override // okio.ByteString
    /* renamed from: d */
    public ByteString mo9715d(String algorithm) {
        C9971q.m14633g(algorithm, "algorithm");
        return C7709b.m21582e(this, algorithm);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.m9697v() == m9697v() && mo9703p(0, byteString, 0, m9697v())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public int hashCode() {
        int h = m9711h();
        if (h != 0) {
            return h;
        }
        int length = m22768F().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = m22769E()[length + i];
            int i5 = m22769E()[i];
            byte[] bArr = m22768F()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        m9701r(i2);
        return i2;
    }

    @Override // okio.ByteString
    /* renamed from: i */
    public int mo9710i() {
        return m22769E()[m22768F().length - 1];
    }

    @Override // okio.ByteString
    /* renamed from: k */
    public String mo9708k() {
        return m22767G().mo9708k();
    }

    @Override // okio.ByteString
    /* renamed from: l */
    public byte[] mo9707l() {
        return mo9694z();
    }

    @Override // okio.ByteString
    /* renamed from: m */
    public byte mo9706m(int i) {
        int i2;
        C7355c.m22840b(m22769E()[m22768F().length - 1], i, 1L);
        int b = C7713e.m21575b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = m22769E()[b - 1];
        }
        return m22768F()[b][(i - i2) + m22769E()[m22768F().length + b]];
    }

    @Override // okio.ByteString
    /* renamed from: p */
    public boolean mo9703p(int i, ByteString other, int i2, int i3) {
        int i4;
        C9971q.m14633g(other, "other");
        if (i < 0 || i > m9697v() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C7713e.m21575b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = m22769E()[b - 1];
            }
            int i6 = m22769E()[m22768F().length + b];
            int min = Math.min(i5, (m22769E()[b] - i4) + i4) - i;
            if (!other.mo9702q(i2, m22768F()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* renamed from: q */
    public boolean mo9702q(int i, byte[] other, int i2, int i3) {
        int i4;
        C9971q.m14633g(other, "other");
        if (i < 0 || i > m9697v() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C7713e.m21575b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = m22769E()[b - 1];
            }
            int i6 = m22769E()[m22768F().length + b];
            int min = Math.min(i5, (m22769E()[b] - i4) + i4) - i;
            if (!C7355c.m22841a(m22768F()[b], i6 + (i - i4), other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String toString() {
        return m22767G().toString();
    }

    @Override // okio.ByteString
    /* renamed from: y */
    public ByteString mo9695y() {
        return m22767G().mo9695y();
    }

    @Override // okio.ByteString
    /* renamed from: z */
    public byte[] mo9694z() {
        byte[] bArr = new byte[m9697v()];
        int length = m22768F().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m22769E()[length + i];
            int i5 = m22769E()[i];
            int i6 = i5 - i2;
            C9897e.m14990e(m22768F()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
