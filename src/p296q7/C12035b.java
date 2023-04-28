package p296q7;

import java.util.List;
import p099f8.C7080b;

/* renamed from: q7.b */
/* loaded from: classes7.dex */
final class C12035b {

    /* renamed from: a */
    public final long f27009a;

    /* renamed from: b */
    public final List<C12036a> f27010b;

    /* renamed from: q7.b$a */
    /* loaded from: classes7.dex */
    public static final class C12036a {

        /* renamed from: a */
        public final String f27011a;

        /* renamed from: b */
        public final String f27012b;

        /* renamed from: c */
        public final long f27013c;

        /* renamed from: d */
        public final long f27014d;

        public C12036a(String str, String str2, long j, long j2) {
            this.f27011a = str;
            this.f27012b = str2;
            this.f27013c = j;
            this.f27014d = j2;
        }
    }

    public C12035b(long j, List<C12036a> list) {
        this.f27009a = j;
        this.f27010b = list;
    }

    /* renamed from: a */
    public C7080b m7940a(long j) {
        long j2;
        if (this.f27010b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f27010b.size() - 1; size >= 0; size--) {
            C12036a aVar = this.f27010b.get(size);
            boolean equals = "video/mp4".equals(aVar.f27011a) | z;
            if (size == 0) {
                j3 -= aVar.f27014d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.f27013c;
            }
            j3 = j2;
            if (!equals || j3 == j3) {
                z = equals;
            } else {
                j7 = j3 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j3;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C7080b(j4, j5, this.f27009a, j6, j7);
    }
}
