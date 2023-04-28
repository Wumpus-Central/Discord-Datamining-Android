package p173j8;

import android.net.Uri;
import java.util.Arrays;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: j8.a */
/* loaded from: classes7.dex */
public final class C9503a {

    /* renamed from: g */
    public static final C9503a f21081g = new C9503a(null, new long[0], null, 0, -9223372036854775807L);

    /* renamed from: a */
    public final Object f21082a;

    /* renamed from: b */
    public final int f21083b;

    /* renamed from: c */
    public final long[] f21084c;

    /* renamed from: d */
    public final C0283a[] f21085d;

    /* renamed from: e */
    public final long f21086e;

    /* renamed from: f */
    public final long f21087f;

    /* renamed from: j8.a$a */
    /* loaded from: classes7.dex */
    public static final class C0283a {

        /* renamed from: a */
        public final int f21088a;

        /* renamed from: b */
        public final Uri[] f21089b;

        /* renamed from: c */
        public final int[] f21090c;

        /* renamed from: d */
        public final long[] f21091d;

        public C0283a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public int m16118a() {
            return m16117b(-1);
        }

        /* renamed from: b */
        public int m16117b(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f21090c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: c */
        public boolean m16116c() {
            return this.f21088a == -1 || m16118a() < this.f21088a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0283a.class != obj.getClass()) {
                return false;
            }
            C0283a aVar = (C0283a) obj;
            if (this.f21088a != aVar.f21088a || !Arrays.equals(this.f21089b, aVar.f21089b) || !Arrays.equals(this.f21090c, aVar.f21090c) || !Arrays.equals(this.f21091d, aVar.f21091d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((this.f21088a * 31) + Arrays.hashCode(this.f21089b)) * 31) + Arrays.hashCode(this.f21090c)) * 31) + Arrays.hashCode(this.f21091d);
        }

        private C0283a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C7510a.m22371a(iArr.length == uriArr.length);
            this.f21088a = i;
            this.f21090c = iArr;
            this.f21089b = uriArr;
            this.f21091d = jArr;
        }
    }

    private C9503a(Object obj, long[] jArr, C0283a[] aVarArr, long j, long j2) {
        this.f21082a = obj;
        this.f21084c = jArr;
        this.f21086e = j;
        this.f21087f = j2;
        int length = jArr.length;
        this.f21083b = length;
        if (aVarArr == null) {
            aVarArr = new C0283a[length];
            for (int i = 0; i < this.f21083b; i++) {
                aVarArr[i] = new C0283a();
            }
        }
        this.f21085d = aVarArr;
    }

    /* renamed from: c */
    private boolean m16119c(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = this.f21084c[i];
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    /* renamed from: a */
    public int m16121a(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f21084c;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 == Long.MIN_VALUE || (j < j3 && this.f21085d[i].m16116c())) {
                break;
            }
            i++;
        }
        if (i < this.f21084c.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public int m16120b(long j, long j2) {
        int length = this.f21084c.length - 1;
        while (length >= 0 && m16119c(j, j2, length)) {
            length--;
        }
        if (length < 0 || !this.f21085d[length].m16116c()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9503a.class != obj.getClass()) {
            return false;
        }
        C9503a aVar = (C9503a) obj;
        if (!C7557q0.m22159c(this.f21082a, aVar.f21082a) || this.f21083b != aVar.f21083b || this.f21086e != aVar.f21086e || this.f21087f != aVar.f21087f || !Arrays.equals(this.f21084c, aVar.f21084c) || !Arrays.equals(this.f21085d, aVar.f21085d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = this.f21083b * 31;
        Object obj = this.f21082a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return ((((((((i2 + i) * 31) + ((int) this.f21086e)) * 31) + ((int) this.f21087f)) * 31) + Arrays.hashCode(this.f21084c)) * 31) + Arrays.hashCode(this.f21085d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f21082a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f21086e);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f21085d.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f21084c[i]);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f21085d[i].f21090c.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f21085d[i].f21090c[i2];
                if (i3 == 0) {
                    sb2.append('_');
                } else if (i3 == 1) {
                    sb2.append('R');
                } else if (i3 == 2) {
                    sb2.append('S');
                } else if (i3 == 3) {
                    sb2.append('P');
                } else if (i3 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f21085d[i].f21091d[i2]);
                sb2.append(')');
                if (i2 < this.f21085d[i].f21090c.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f21085d.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
