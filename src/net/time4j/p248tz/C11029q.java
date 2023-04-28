package net.time4j.p248tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: net.time4j.tz.q */
/* loaded from: classes8.dex */
public final class C11029q implements Comparable<C11029q>, Serializable {
    private static final long serialVersionUID = 4594838367057225304L;
    private final int dst;
    private final long posix;
    private final int previous;
    private final int total;

    public C11029q(long j, int i, int i2, int i3) {
        this.posix = j;
        this.previous = i;
        this.total = i2;
        this.dst = i3;
        m11176b(i);
        m11176b(i2);
        m11177a(i3);
    }

    /* renamed from: a */
    private static void m11177a(int i) {
        if (i != Integer.MAX_VALUE) {
            m11176b(i);
        }
    }

    /* renamed from: b */
    private static void m11176b(int i) {
        if (i < -64800 || i > 64800) {
            throw new IllegalArgumentException("Offset out of range: " + i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            m11176b(this.previous);
            m11176b(this.total);
            m11177a(this.dst);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException(e.getMessage());
        }
    }

    /* renamed from: c */
    public int compareTo(C11029q qVar) {
        long j = this.posix - qVar.posix;
        if (j == 0) {
            j = this.previous - qVar.previous;
            if (j == 0) {
                j = this.total - qVar.total;
                if (j == 0) {
                    j = m11174d() - qVar.m11174d();
                    if (j == 0) {
                        return 0;
                    }
                }
            }
        }
        if (j < 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: d */
    public int m11174d() {
        int i = this.dst;
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    /* renamed from: e */
    public long m11173e() {
        return this.posix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11029q)) {
            return false;
        }
        C11029q qVar = (C11029q) obj;
        if (this.posix == qVar.posix && this.previous == qVar.previous && this.total == qVar.total && m11174d() == qVar.m11174d()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m11172f() {
        return this.previous;
    }

    /* renamed from: g */
    public int m11171g() {
        return this.total - this.previous;
    }

    /* renamed from: h */
    public int m11170h() {
        return this.total - m11174d();
    }

    public int hashCode() {
        long j = this.posix;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: i */
    public int m11169i() {
        return this.total;
    }

    /* renamed from: j */
    public boolean m11168j() {
        return this.total > this.previous;
    }

    /* renamed from: k */
    public boolean m11167k() {
        return this.total < this.previous;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[POSIX=");
        sb2.append(this.posix);
        sb2.append(", previous-offset=");
        sb2.append(this.previous);
        sb2.append(", total-offset=");
        sb2.append(this.total);
        sb2.append(", dst-offset=");
        sb2.append(m11174d());
        sb2.append(']');
        return sb2.toString();
    }
}
