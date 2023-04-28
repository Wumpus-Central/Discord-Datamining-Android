package p228m7;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p081e9.AbstractC6774h;
import p119g9.C7557q0;

/* renamed from: m7.f */
/* loaded from: classes7.dex */
public final class C10511f implements AbstractC10515j {

    /* renamed from: b */
    private final AbstractC6774h f23241b;

    /* renamed from: c */
    private final long f23242c;

    /* renamed from: d */
    private long f23243d;

    /* renamed from: f */
    private int f23245f;

    /* renamed from: g */
    private int f23246g;

    /* renamed from: e */
    private byte[] f23244e = new byte[65536];

    /* renamed from: a */
    private final byte[] f23240a = new byte[4096];

    public C10511f(AbstractC6774h hVar, long j, long j2) {
        this.f23241b = hVar;
        this.f23243d = j;
        this.f23242c = j2;
    }

    /* renamed from: o */
    private void m12982o(int i) {
        if (i != -1) {
            this.f23243d += i;
        }
    }

    /* renamed from: p */
    private void m12981p(int i) {
        int i2 = this.f23245f + i;
        byte[] bArr = this.f23244e;
        if (i2 > bArr.length) {
            this.f23244e = Arrays.copyOf(this.f23244e, C7557q0.m22129r(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: q */
    private int m12980q(byte[] bArr, int i, int i2) {
        int i3 = this.f23246g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f23244e, 0, bArr, i, min);
        m12976u(min);
        return min;
    }

    /* renamed from: r */
    private int m12979r(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f23241b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: s */
    private int m12978s(int i) {
        int min = Math.min(this.f23246g, i);
        m12976u(min);
        return min;
    }

    /* renamed from: u */
    private void m12976u(int i) {
        byte[] bArr;
        int i2 = this.f23246g - i;
        this.f23246g = i2;
        this.f23245f = 0;
        byte[] bArr2 = this.f23244e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f23244e = bArr;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: a */
    public int mo12938a(int i) {
        int s = m12978s(i);
        if (s == 0) {
            byte[] bArr = this.f23240a;
            s = m12979r(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m12982o(s);
        return s;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: d */
    public boolean mo12937d(byte[] bArr, int i, int i2, boolean z) {
        if (!mo12931l(i2, z)) {
            return false;
        }
        System.arraycopy(this.f23244e, this.f23245f - i2, bArr, i, i2);
        return true;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: f */
    public void mo12936f() {
        this.f23245f = 0;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: g */
    public boolean mo12935g(byte[] bArr, int i, int i2, boolean z) {
        int q = m12980q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = m12979r(bArr, i, i2, q, z);
        }
        m12982o(q);
        if (q != -1) {
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10515j
    public long getLength() {
        return this.f23242c;
    }

    @Override // p228m7.AbstractC10515j
    public long getPosition() {
        return this.f23243d;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: h */
    public long mo7939h() {
        return this.f23243d + this.f23245f;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: i */
    public void mo12934i(int i) {
        mo12931l(i, false);
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: j */
    public int mo12933j(byte[] bArr, int i, int i2) {
        int i3;
        m12981p(i2);
        int i4 = this.f23246g;
        int i5 = this.f23245f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m12979r(this.f23244e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f23246g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f23244e, this.f23245f, bArr, i, i3);
        this.f23245f += i3;
        return i3;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: k */
    public void mo12932k(int i) {
        m12977t(i, false);
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: l */
    public boolean mo12931l(int i, boolean z) {
        m12981p(i);
        int i2 = this.f23246g - this.f23245f;
        while (i2 < i) {
            i2 = m12979r(this.f23244e, this.f23245f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f23246g = this.f23245f + i2;
        }
        this.f23245f += i;
        return true;
    }

    @Override // p228m7.AbstractC10515j
    /* renamed from: n */
    public void mo12930n(byte[] bArr, int i, int i2) {
        mo12937d(bArr, i, i2, false);
    }

    @Override // p228m7.AbstractC10515j, p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        int q = m12980q(bArr, i, i2);
        if (q == 0) {
            q = m12979r(bArr, i, i2, 0, true);
        }
        m12982o(q);
        return q;
    }

    @Override // p228m7.AbstractC10515j
    public void readFully(byte[] bArr, int i, int i2) {
        mo12935g(bArr, i, i2, false);
    }

    /* renamed from: t */
    public boolean m12977t(int i, boolean z) {
        int s = m12978s(i);
        while (s < i && s != -1) {
            s = m12979r(this.f23240a, -s, Math.min(i, this.f23240a.length + s), s, z);
        }
        m12982o(s);
        if (s != -1) {
            return true;
        }
        return false;
    }
}
