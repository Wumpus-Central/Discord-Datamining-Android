package p363u7;

import java.util.Arrays;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10534y;
import p228m7.C10522p;
import p228m7.C10524q;
import p228m7.C10526r;
import p228m7.C10527s;
import p363u7.AbstractC13207i;

/* renamed from: u7.b */
/* loaded from: classes7.dex */
final class C13199b extends AbstractC13207i {

    /* renamed from: n */
    private C10527s f29607n;

    /* renamed from: o */
    private C13200a f29608o;

    /* renamed from: u7.b$a */
    /* loaded from: classes7.dex */
    private static final class C13200a implements AbstractC13205g {

        /* renamed from: a */
        private C10527s f29609a;

        /* renamed from: b */
        private C10527s.C10528a f29610b;

        /* renamed from: c */
        private long f29611c = -1;

        /* renamed from: d */
        private long f29612d = -1;

        public C13200a(C10527s sVar, C10527s.C10528a aVar) {
            this.f29609a = sVar;
            this.f29610b = aVar;
        }

        @Override // p363u7.AbstractC13205g
        /* renamed from: a */
        public long mo4321a(AbstractC10515j jVar) {
            long j = this.f29612d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f29612d = -1L;
            return j2;
        }

        @Override // p363u7.AbstractC13205g
        /* renamed from: b */
        public AbstractC10534y mo4320b() {
            boolean z;
            if (this.f29611c != -1) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            return new C10526r(this.f29609a, this.f29611c);
        }

        @Override // p363u7.AbstractC13205g
        /* renamed from: c */
        public void mo4319c(long j) {
            long[] jArr = this.f29610b.f23279a;
            this.f29612d = jArr[C7557q0.m22147i(jArr, j, true, true)];
        }

        /* renamed from: d */
        public void m4348d(long j) {
            this.f29611c = j;
        }
    }

    /* renamed from: n */
    private int m4351n(C7570y yVar) {
        int i = (yVar.m22012d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yVar.m22016Q(4);
            yVar.m22022K();
        }
        int j = C10522p.m12962j(yVar, i);
        yVar.m22017P(0);
        return j;
    }

    /* renamed from: o */
    private static boolean m4350o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m4349p(C7570y yVar) {
        if (yVar.m22015a() >= 5 && yVar.m22029D() == 127 && yVar.m22027F() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // p363u7.AbstractC13207i
    /* renamed from: f */
    protected long mo4317f(C7570y yVar) {
        if (!m4350o(yVar.m22012d())) {
            return -1L;
        }
        return m4351n(yVar);
    }

    @Override // p363u7.AbstractC13207i
    /* renamed from: h */
    protected boolean mo4316h(C7570y yVar, long j, AbstractC13207i.C13209b bVar) {
        byte[] d = yVar.m22012d();
        C10527s sVar = this.f29607n;
        if (sVar == null) {
            C10527s sVar2 = new C10527s(d, 17);
            this.f29607n = sVar2;
            bVar.f29648a = sVar2.m12942h(Arrays.copyOfRange(d, 9, yVar.m22010f()), null);
            return true;
        } else if ((d[0] & Byte.MAX_VALUE) == 3) {
            C10527s.C10528a g = C10524q.m12955g(yVar);
            C10527s c = sVar.m12947c(g);
            this.f29607n = c;
            this.f29608o = new C13200a(c, g);
            return true;
        } else if (!m4350o(d)) {
            return true;
        } else {
            C13200a aVar = this.f29608o;
            if (aVar != null) {
                aVar.m4348d(j);
                bVar.f29649b = this.f29608o;
            }
            C7510a.m22367e(bVar.f29648a);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p363u7.AbstractC13207i
    /* renamed from: l */
    public void mo4315l(boolean z) {
        super.mo4315l(z);
        if (z) {
            this.f29607n = null;
            this.f29608o = null;
        }
    }
}
