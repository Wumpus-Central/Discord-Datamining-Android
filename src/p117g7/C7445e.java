package p117g7;

import android.media.AudioAttributes;
import p119g9.C7557q0;

/* renamed from: g7.e */
/* loaded from: classes7.dex */
public final class C7445e {

    /* renamed from: f */
    public static final C7445e f16068f = new C7447b().m22605a();

    /* renamed from: a */
    public final int f16069a;

    /* renamed from: b */
    public final int f16070b;

    /* renamed from: c */
    public final int f16071c;

    /* renamed from: d */
    public final int f16072d;

    /* renamed from: e */
    private AudioAttributes f16073e;

    /* renamed from: g7.e$b */
    /* loaded from: classes7.dex */
    public static final class C7447b {

        /* renamed from: a */
        private int f16074a = 0;

        /* renamed from: b */
        private int f16075b = 0;

        /* renamed from: c */
        private int f16076c = 1;

        /* renamed from: d */
        private int f16077d = 1;

        /* renamed from: a */
        public C7445e m22605a() {
            return new C7445e(this.f16074a, this.f16075b, this.f16076c, this.f16077d);
        }
    }

    /* renamed from: a */
    public AudioAttributes m22606a() {
        if (this.f16073e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f16069a).setFlags(this.f16070b).setUsage(this.f16071c);
            if (C7557q0.f16368a >= 29) {
                usage.setAllowedCapturePolicy(this.f16072d);
            }
            this.f16073e = usage.build();
        }
        return this.f16073e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7445e.class != obj.getClass()) {
            return false;
        }
        C7445e eVar = (C7445e) obj;
        if (this.f16069a == eVar.f16069a && this.f16070b == eVar.f16070b && this.f16071c == eVar.f16071c && this.f16072d == eVar.f16072d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f16069a) * 31) + this.f16070b) * 31) + this.f16071c) * 31) + this.f16072d;
    }

    private C7445e(int i, int i2, int i3, int i4) {
        this.f16069a = i;
        this.f16070b = i2;
        this.f16071c = i3;
        this.f16072d = i4;
    }
}
