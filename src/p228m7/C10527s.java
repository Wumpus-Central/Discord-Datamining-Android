package p228m7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p041c8.C3778a;
import p041c8.C3779b;
import p079e7.C6722k;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7569x;
import p459z7.C14576a;

/* renamed from: m7.s */
/* loaded from: classes7.dex */
public final class C10527s {

    /* renamed from: a */
    public final int f23267a;

    /* renamed from: b */
    public final int f23268b;

    /* renamed from: c */
    public final int f23269c;

    /* renamed from: d */
    public final int f23270d;

    /* renamed from: e */
    public final int f23271e;

    /* renamed from: f */
    public final int f23272f;

    /* renamed from: g */
    public final int f23273g;

    /* renamed from: h */
    public final int f23274h;

    /* renamed from: i */
    public final int f23275i;

    /* renamed from: j */
    public final long f23276j;

    /* renamed from: k */
    public final C10528a f23277k;

    /* renamed from: l */
    private final C14576a f23278l;

    /* renamed from: m7.s$a */
    /* loaded from: classes7.dex */
    public static class C10528a {

        /* renamed from: a */
        public final long[] f23279a;

        /* renamed from: b */
        public final long[] f23280b;

        public C10528a(long[] jArr, long[] jArr2) {
            this.f23279a = jArr;
            this.f23280b = jArr2;
        }
    }

    public C10527s(byte[] bArr, int i) {
        C7569x xVar = new C7569x(bArr);
        xVar.m22036p(i * 8);
        this.f23267a = xVar.m22044h(16);
        this.f23268b = xVar.m22044h(16);
        this.f23269c = xVar.m22044h(24);
        this.f23270d = xVar.m22044h(24);
        int h = xVar.m22044h(20);
        this.f23271e = h;
        this.f23272f = m12939k(h);
        this.f23273g = xVar.m22044h(3) + 1;
        int h2 = xVar.m22044h(5) + 1;
        this.f23274h = h2;
        this.f23275i = m12944f(h2);
        this.f23276j = xVar.m22042j(36);
        this.f23277k = null;
        this.f23278l = null;
    }

    /* renamed from: a */
    private static C14576a m12949a(List<String> list, List<C3778a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] O0 = C7557q0.m22186O0(str, "=");
            if (O0.length != 2) {
                C7558r.m22104h("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new C3779b(O0[0], O0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C14576a(arrayList);
    }

    /* renamed from: f */
    private static int m12944f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: k */
    private static int m12939k(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public C10527s m12948b(List<C3778a> list) {
        return new C10527s(this.f23267a, this.f23268b, this.f23269c, this.f23270d, this.f23271e, this.f23273g, this.f23274h, this.f23276j, this.f23277k, m12941i(m12949a(Collections.emptyList(), list)));
    }

    /* renamed from: c */
    public C10527s m12947c(C10528a aVar) {
        return new C10527s(this.f23267a, this.f23268b, this.f23269c, this.f23270d, this.f23271e, this.f23273g, this.f23274h, this.f23276j, aVar, this.f23278l);
    }

    /* renamed from: d */
    public C10527s m12946d(List<String> list) {
        return new C10527s(this.f23267a, this.f23268b, this.f23269c, this.f23270d, this.f23271e, this.f23273g, this.f23274h, this.f23276j, this.f23277k, m12941i(m12949a(list, Collections.emptyList())));
    }

    /* renamed from: e */
    public long m12945e() {
        long j;
        long j2;
        long j3;
        int i = this.f23270d;
        if (i > 0) {
            j2 = (i + this.f23269c) / 2;
            j3 = 1;
        } else {
            int i2 = this.f23267a;
            if (i2 != this.f23268b || i2 <= 0) {
                j = 4096;
            } else {
                j = i2;
            }
            j2 = ((j * this.f23273g) * this.f23274h) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    /* renamed from: g */
    public long m12943g() {
        long j = this.f23276j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f23271e;
    }

    /* renamed from: h */
    public C6722k m12942h(byte[] bArr, C14576a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f23270d;
        if (i <= 0) {
            i = -1;
        }
        return new C6722k.C6724b().m24488e0("audio/flac").m24501W(i).m24516H(this.f23273g).m24486f0(this.f23271e).m24504T(Collections.singletonList(bArr)).m24500X(m12941i(aVar)).m24519E();
    }

    /* renamed from: i */
    public C14576a m12941i(C14576a aVar) {
        C14576a aVar2 = this.f23278l;
        return aVar2 == null ? aVar : aVar2.m185b(aVar);
    }

    /* renamed from: j */
    public long m12940j(long j) {
        return C7557q0.m22127s((j * this.f23271e) / 1000000, 0L, this.f23276j - 1);
    }

    private C10527s(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C10528a aVar, C14576a aVar2) {
        this.f23267a = i;
        this.f23268b = i2;
        this.f23269c = i3;
        this.f23270d = i4;
        this.f23271e = i5;
        this.f23272f = m12939k(i5);
        this.f23273g = i6;
        this.f23274h = i7;
        this.f23275i = m12944f(i7);
        this.f23276j = j;
        this.f23277k = aVar;
        this.f23278l = aVar2;
    }
}
