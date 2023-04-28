package p364u8;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p119g9.C7557q0;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: u8.a */
/* loaded from: classes7.dex */
public final class C13213a extends AbstractC12456d {

    /* renamed from: o */
    private final C7570y f29660o = new C7570y();

    /* renamed from: p */
    private final C7570y f29661p = new C7570y();

    /* renamed from: q */
    private final C0429a f29662q = new C0429a();

    /* renamed from: r */
    private Inflater f29663r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.a$a */
    /* loaded from: classes7.dex */
    public static final class C0429a {

        /* renamed from: a */
        private final C7570y f29664a = new C7570y();

        /* renamed from: b */
        private final int[] f29665b = new int[Spliterator.NONNULL];

        /* renamed from: c */
        private boolean f29666c;

        /* renamed from: d */
        private int f29667d;

        /* renamed from: e */
        private int f29668e;

        /* renamed from: f */
        private int f29669f;

        /* renamed from: g */
        private int f29670g;

        /* renamed from: h */
        private int f29671h;

        /* renamed from: i */
        private int f29672i;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m4303e(C7570y yVar, int i) {
            boolean z;
            int G;
            if (i >= 4) {
                yVar.m22016Q(3);
                if ((yVar.m22029D() & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i - 4;
                if (z) {
                    if (i2 >= 7 && (G = yVar.m22026G()) >= 4) {
                        this.f29671h = yVar.m22023J();
                        this.f29672i = yVar.m22023J();
                        this.f29664a.m22021L(G - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int e = this.f29664a.m22011e();
                int f = this.f29664a.m22010f();
                if (e < f && i2 > 0) {
                    int min = Math.min(i2, f - e);
                    yVar.m22006j(this.f29664a.m22012d(), e, min);
                    this.f29664a.m22017P(e + min);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m4302f(C7570y yVar, int i) {
            if (i >= 19) {
                this.f29667d = yVar.m22023J();
                this.f29668e = yVar.m22023J();
                yVar.m22016Q(11);
                this.f29669f = yVar.m22023J();
                this.f29670g = yVar.m22023J();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m4301g(C7570y yVar, int i) {
            if (i % 5 == 2) {
                yVar.m22016Q(2);
                Arrays.fill(this.f29665b, 0);
                int i2 = i / 5;
                for (int i3 = 0; i3 < i2; i3++) {
                    int D = yVar.m22029D();
                    int D2 = yVar.m22029D();
                    int D3 = yVar.m22029D();
                    int D4 = yVar.m22029D();
                    double d = D2;
                    double d2 = D3 - 128;
                    double d3 = D4 - 128;
                    this.f29665b[D] = (C7557q0.m22129r((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (yVar.m22029D() << 24) | (C7557q0.m22129r((int) ((1.402d * d2) + d), 0, 255) << 16) | C7557q0.m22129r((int) (d + (d3 * 1.772d)), 0, 255);
                }
                this.f29666c = true;
            }
        }

        /* renamed from: d */
        public C12453b m4304d() {
            int i;
            int i2;
            int i3;
            if (this.f29667d == 0 || this.f29668e == 0 || this.f29671h == 0 || this.f29672i == 0 || this.f29664a.m22010f() == 0 || this.f29664a.m22011e() != this.f29664a.m22010f() || !this.f29666c) {
                return null;
            }
            this.f29664a.m22017P(0);
            int i4 = this.f29671h * this.f29672i;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int D = this.f29664a.m22029D();
                if (D != 0) {
                    i = i5 + 1;
                    iArr[i5] = this.f29665b[D];
                } else {
                    int D2 = this.f29664a.m22029D();
                    if (D2 != 0) {
                        if ((D2 & 64) == 0) {
                            i2 = D2 & 63;
                        } else {
                            i2 = ((D2 & 63) << 8) | this.f29664a.m22029D();
                        }
                        if ((D2 & 128) == 0) {
                            i3 = 0;
                        } else {
                            i3 = this.f29665b[this.f29664a.m22029D()];
                        }
                        i = i2 + i5;
                        Arrays.fill(iArr, i5, i, i3);
                    }
                }
                i5 = i;
            }
            return new C12453b.C0400b().m6690f(Bitmap.createBitmap(iArr, this.f29671h, this.f29672i, Bitmap.Config.ARGB_8888)).m6686j(this.f29669f / this.f29667d).m6685k(0).m6688h(this.f29670g / this.f29668e, 0).m6687i(0).m6683m(this.f29671h / this.f29667d).m6689g(this.f29672i / this.f29668e).m6695a();
        }

        /* renamed from: h */
        public void m4300h() {
            this.f29667d = 0;
            this.f29668e = 0;
            this.f29669f = 0;
            this.f29670g = 0;
            this.f29671h = 0;
            this.f29672i = 0;
            this.f29664a.m22021L(0);
            this.f29666c = false;
        }
    }

    public C13213a() {
        super("PgsDecoder");
    }

    /* renamed from: B */
    private void m4309B(C7570y yVar) {
        if (yVar.m22015a() > 0 && yVar.m22008h() == 120) {
            if (this.f29663r == null) {
                this.f29663r = new Inflater();
            }
            if (C7557q0.m22136n0(yVar, this.f29661p, this.f29663r)) {
                yVar.m22019N(this.f29661p.m22012d(), this.f29661p.m22010f());
            }
        }
    }

    /* renamed from: C */
    private static C12453b m4308C(C7570y yVar, C0429a aVar) {
        int f = yVar.m22010f();
        int D = yVar.m22029D();
        int J = yVar.m22023J();
        int e = yVar.m22011e() + J;
        C12453b bVar = null;
        if (e > f) {
            yVar.m22017P(f);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.m4301g(yVar, J);
                    break;
                case 21:
                    aVar.m4303e(yVar, J);
                    break;
                case 22:
                    aVar.m4302f(yVar, J);
                    break;
            }
        } else {
            bVar = aVar.m4304d();
            aVar.m4300h();
        }
        yVar.m22017P(e);
        return bVar;
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        this.f29660o.m22019N(bArr, i);
        m4309B(this.f29660o);
        this.f29662q.m4300h();
        ArrayList arrayList = new ArrayList();
        while (this.f29660o.m22015a() >= 3) {
            C12453b C = m4308C(this.f29660o, this.f29662q);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new C13214b(Collections.unmodifiableList(arrayList));
    }
}
