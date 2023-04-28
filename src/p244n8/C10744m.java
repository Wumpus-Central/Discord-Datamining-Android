package p244n8;

import p079e7.C6725l;
import p119g9.C7510a;
import p152i7.C8223h;
import p153i8.AbstractC8278o0;

/* renamed from: n8.m */
/* loaded from: classes7.dex */
final class C10744m implements AbstractC8278o0 {

    /* renamed from: k */
    private final int f23862k;

    /* renamed from: l */
    private final C10748q f23863l;

    /* renamed from: m */
    private int f23864m = -1;

    public C10744m(C10748q qVar, int i) {
        this.f23863l = qVar;
        this.f23862k = i;
    }

    /* renamed from: c */
    private boolean m12454c() {
        int i = this.f23864m;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: a */
    public void mo12456a() {
        int i = this.f23864m;
        if (i == -2) {
            throw new C10757s(this.f23863l.m12399t().m29997a(this.f23862k).m19990a(0).f14329v);
        } else if (i == -1) {
            this.f23863l.m12430T();
        } else if (i != -3) {
            this.f23863l.m12429U(i);
        }
    }

    /* renamed from: b */
    public void m12455b() {
        boolean z;
        if (this.f23864m == -1) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f23864m = this.f23863l.m12394y(this.f23862k);
    }

    /* renamed from: d */
    public void m12453d() {
        if (this.f23864m != -1) {
            this.f23863l.m12403o0(this.f23862k);
            this.f23864m = -1;
        }
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: e */
    public boolean mo12452e() {
        if (this.f23864m == -3 || (m12454c() && this.f23863l.m12433Q(this.f23864m))) {
            return true;
        }
        return false;
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: j */
    public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
        if (this.f23864m == -3) {
            hVar.m20304e(4);
            return -4;
        } else if (m12454c()) {
            return this.f23863l.m12417d0(this.f23864m, lVar, hVar, z);
        } else {
            return -3;
        }
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: s */
    public int mo12450s(long j) {
        if (m12454c()) {
            return this.f23863l.m12404n0(this.f23864m, j);
        }
        return 0;
    }
}
