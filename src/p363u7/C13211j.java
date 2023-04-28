package p363u7;

import java.util.ArrayList;
import java.util.Arrays;
import p079e7.C6722k;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.C10505d0;
import p363u7.AbstractC13207i;

/* renamed from: u7.j */
/* loaded from: classes7.dex */
final class C13211j extends AbstractC13207i {

    /* renamed from: n */
    private C13212a f29650n;

    /* renamed from: o */
    private int f29651o;

    /* renamed from: p */
    private boolean f29652p;

    /* renamed from: q */
    private C10505d0.C10509d f29653q;

    /* renamed from: r */
    private C10505d0.C10507b f29654r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u7.j$a */
    /* loaded from: classes7.dex */
    public static final class C13212a {

        /* renamed from: a */
        public final C10505d0.C10509d f29655a;

        /* renamed from: b */
        public final C10505d0.C10507b f29656b;

        /* renamed from: c */
        public final byte[] f29657c;

        /* renamed from: d */
        public final C10505d0.C10508c[] f29658d;

        /* renamed from: e */
        public final int f29659e;

        public C13212a(C10505d0.C10509d dVar, C10505d0.C10507b bVar, byte[] bArr, C10505d0.C10508c[] cVarArr, int i) {
            this.f29655a = dVar;
            this.f29656b = bVar;
            this.f29657c = bArr;
            this.f29658d = cVarArr;
            this.f29659e = i;
        }
    }

    /* renamed from: n */
    static void m4314n(C7570y yVar, long j) {
        if (yVar.m22014b() < yVar.m22010f() + 4) {
            yVar.m22020M(Arrays.copyOf(yVar.m22012d(), yVar.m22010f() + 4));
        } else {
            yVar.m22018O(yVar.m22010f() + 4);
        }
        byte[] d = yVar.m22012d();
        d[yVar.m22010f() - 4] = (byte) (j & 255);
        d[yVar.m22010f() - 3] = (byte) ((j >>> 8) & 255);
        d[yVar.m22010f() - 2] = (byte) ((j >>> 16) & 255);
        d[yVar.m22010f() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* renamed from: o */
    private static int m4313o(byte b, C13212a aVar) {
        if (!aVar.f29658d[m4312p(b, aVar.f29659e, 1)].f23220a) {
            return aVar.f29655a.f23230g;
        }
        return aVar.f29655a.f23231h;
    }

    /* renamed from: p */
    static int m4312p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: r */
    public static boolean m4310r(C7570y yVar) {
        try {
            return C10505d0.m12986l(1, yVar, true);
        } catch (C6728o unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p363u7.AbstractC13207i
    /* renamed from: e */
    public void mo4318e(long j) {
        boolean z;
        super.mo4318e(j);
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f29652p = z;
        C10505d0.C10509d dVar = this.f29653q;
        if (dVar != null) {
            i = dVar.f23230g;
        }
        this.f29651o = i;
    }

    @Override // p363u7.AbstractC13207i
    /* renamed from: f */
    protected long mo4317f(C7570y yVar) {
        int i = 0;
        if ((yVar.m22012d()[0] & 1) == 1) {
            return -1L;
        }
        int o = m4313o(yVar.m22012d()[0], (C13212a) C7510a.m22364h(this.f29650n));
        if (this.f29652p) {
            i = (this.f29651o + o) / 4;
        }
        long j = i;
        m4314n(yVar, j);
        this.f29652p = true;
        this.f29651o = o;
        return j;
    }

    @Override // p363u7.AbstractC13207i
    /* renamed from: h */
    protected boolean mo4316h(C7570y yVar, long j, AbstractC13207i.C13209b bVar) {
        if (this.f29650n != null) {
            C7510a.m22367e(bVar.f29648a);
            return false;
        }
        C13212a q = m4311q(yVar);
        this.f29650n = q;
        if (q == null) {
            return true;
        }
        C10505d0.C10509d dVar = q.f29655a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f23233j);
        arrayList.add(q.f29657c);
        bVar.f29648a = new C6722k.C6724b().m24488e0("audio/vorbis").m24517G(dVar.f23228e).m24498Z(dVar.f23227d).m24516H(dVar.f23225b).m24486f0(dVar.f23226c).m24504T(arrayList).m24519E();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p363u7.AbstractC13207i
    /* renamed from: l */
    public void mo4315l(boolean z) {
        super.mo4315l(z);
        if (z) {
            this.f29650n = null;
            this.f29653q = null;
            this.f29654r = null;
        }
        this.f29651o = 0;
        this.f29652p = false;
    }

    /* renamed from: q */
    C13212a m4311q(C7570y yVar) {
        C10505d0.C10509d dVar = this.f29653q;
        if (dVar == null) {
            this.f29653q = C10505d0.m12988j(yVar);
            return null;
        }
        C10505d0.C10507b bVar = this.f29654r;
        if (bVar == null) {
            this.f29654r = C10505d0.m12990h(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.m22010f()];
        System.arraycopy(yVar.m22012d(), 0, bArr, 0, yVar.m22010f());
        C10505d0.C10508c[] k = C10505d0.m12987k(yVar, dVar.f23225b);
        return new C13212a(dVar, bVar, bArr, k, C10505d0.m12997a(k.length - 1));
    }
}
