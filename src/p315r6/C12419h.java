package p315r6;

import java.util.Arrays;
import p279p6.C11572b;

/* renamed from: r6.h */
/* loaded from: classes7.dex */
public final class C12419h {

    /* renamed from: a */
    private final C11572b f27965a;

    /* renamed from: b */
    private final byte[] f27966b;

    public C12419h(C11572b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f27965a = bVar;
            this.f27966b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] m6847a() {
        return this.f27966b;
    }

    /* renamed from: b */
    public C11572b m6846b() {
        return this.f27965a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12419h)) {
            return false;
        }
        C12419h hVar = (C12419h) obj;
        if (!this.f27965a.equals(hVar.f27965a)) {
            return false;
        }
        return Arrays.equals(this.f27966b, hVar.f27966b);
    }

    public int hashCode() {
        return ((this.f27965a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27966b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f27965a + ", bytes=[...]}";
    }
}
