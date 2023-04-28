package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f4516a = 0;

    /* renamed from: b */
    public int f4517b = 0;

    /* renamed from: c */
    public int f4518c = 0;

    /* renamed from: d */
    public int f4519d = -1;

    /* renamed from: a */
    public int m35704a() {
        return this.f4517b;
    }

    /* renamed from: b */
    public int m35703b() {
        int i = this.f4518c;
        int c = m35702c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m35702c() {
        int i = this.f4519d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m35707a(false, this.f4518c, this.f4516a);
    }

    /* renamed from: d */
    public int m35701d() {
        return this.f4516a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4517b == audioAttributesImplBase.m35704a() && this.f4518c == audioAttributesImplBase.m35703b() && this.f4516a == audioAttributesImplBase.m35701d() && this.f4519d == audioAttributesImplBase.f4519d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4517b), Integer.valueOf(this.f4518c), Integer.valueOf(this.f4516a), Integer.valueOf(this.f4519d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f4519d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f4519d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m35706b(this.f4516a));
        sb2.append(" content=");
        sb2.append(this.f4517b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f4518c).toUpperCase());
        return sb2.toString();
    }
}
