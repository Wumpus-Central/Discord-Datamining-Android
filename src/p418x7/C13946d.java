package p418x7;

import android.util.Pair;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p228m7.AbstractC10515j;

/* renamed from: x7.d */
/* loaded from: classes7.dex */
final class C13946d {

    /* renamed from: x7.d$a */
    /* loaded from: classes7.dex */
    private static final class C13947a {

        /* renamed from: a */
        public final int f31440a;

        /* renamed from: b */
        public final long f31441b;

        private C13947a(int i, long j) {
            this.f31440a = i;
            this.f31441b = j;
        }

        /* renamed from: a */
        public static C13947a m2210a(AbstractC10515j jVar, C7570y yVar) {
            jVar.mo12930n(yVar.m22012d(), 0, 8);
            yVar.m22017P(0);
            return new C13947a(yVar.m22002n(), yVar.m21996t());
        }
    }

    /* renamed from: a */
    public static C13945c m2212a(AbstractC10515j jVar) {
        boolean z;
        byte[] bArr;
        C7510a.m22367e(jVar);
        C7570y yVar = new C7570y(16);
        if (C13947a.m2210a(jVar, yVar).f31440a != 1380533830) {
            return null;
        }
        jVar.mo12930n(yVar.m22012d(), 0, 4);
        yVar.m22017P(0);
        int n = yVar.m22002n();
        if (n != 1463899717) {
            C7558r.m22109c("WavHeaderReader", "Unsupported RIFF format: " + n);
            return null;
        }
        C13947a a = C13947a.m2210a(jVar, yVar);
        while (a.f31440a != 1718449184) {
            jVar.mo12934i((int) a.f31441b);
            a = C13947a.m2210a(jVar, yVar);
        }
        if (a.f31441b >= 16) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        jVar.mo12930n(yVar.m22012d(), 0, 16);
        yVar.m22017P(0);
        int v = yVar.m21994v();
        int v2 = yVar.m21994v();
        int u = yVar.m21995u();
        int u2 = yVar.m21995u();
        int v3 = yVar.m21994v();
        int v4 = yVar.m21994v();
        int i = ((int) a.f31441b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            jVar.mo12930n(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = C7557q0.f16373f;
        }
        return new C13945c(v, v2, u, u2, v3, v4, bArr);
    }

    /* renamed from: b */
    public static Pair<Long, Long> m2211b(AbstractC10515j jVar) {
        C7510a.m22367e(jVar);
        jVar.mo12936f();
        C7570y yVar = new C7570y(8);
        C13947a a = C13947a.m2210a(jVar, yVar);
        while (true) {
            int i = a.f31440a;
            if (i != 1684108385) {
                if (!(i == 1380533830 || i == 1718449184)) {
                    C7558r.m22104h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.f31440a);
                }
                long j = a.f31441b + 8;
                if (a.f31440a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    jVar.mo12932k((int) j);
                    a = C13947a.m2210a(jVar, yVar);
                } else {
                    throw new C6728o("Chunk is too large (~2GB+) to skip; id: " + a.f31440a);
                }
            } else {
                jVar.mo12932k(8);
                long position = jVar.getPosition();
                long j2 = a.f31441b + position;
                long length = jVar.getLength();
                if (length != -1 && j2 > length) {
                    C7558r.m22104h("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + length);
                    j2 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j2));
            }
        }
    }
}
