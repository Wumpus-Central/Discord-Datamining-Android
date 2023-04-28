package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.camera.video.internal.encoder.AbstractC1999c1;

/* renamed from: androidx.camera.video.internal.encoder.c */
/* loaded from: classes.dex */
final class C1995c extends AbstractC1999c1 {

    /* renamed from: b */
    private final String f2193b;

    /* renamed from: c */
    private final int f2194c;

    /* renamed from: d */
    private final Size f2195d;

    /* renamed from: e */
    private final int f2196e;

    /* renamed from: f */
    private final int f2197f;

    /* renamed from: g */
    private final int f2198g;

    /* renamed from: h */
    private final int f2199h;

    /* renamed from: androidx.camera.video.internal.encoder.c$b */
    /* loaded from: classes.dex */
    static final class C1997b extends AbstractC1999c1.AbstractC2000a {

        /* renamed from: a */
        private String f2200a;

        /* renamed from: b */
        private Integer f2201b;

        /* renamed from: c */
        private Size f2202c;

        /* renamed from: d */
        private Integer f2203d;

        /* renamed from: e */
        private Integer f2204e;

        /* renamed from: f */
        private Integer f2205f;

        /* renamed from: g */
        private Integer f2206g;

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: a */
        public AbstractC1999c1 mo39212a() {
            String str = "";
            if (this.f2200a == null) {
                str = str + " mimeType";
            }
            if (this.f2201b == null) {
                str = str + " profile";
            }
            if (this.f2202c == null) {
                str = str + " resolution";
            }
            if (this.f2203d == null) {
                str = str + " colorFormat";
            }
            if (this.f2204e == null) {
                str = str + " frameRate";
            }
            if (this.f2205f == null) {
                str = str + " IFrameInterval";
            }
            if (this.f2206g == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C1995c(this.f2200a, this.f2201b.intValue(), this.f2202c, this.f2203d.intValue(), this.f2204e.intValue(), this.f2205f.intValue(), this.f2206g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: b */
        public AbstractC1999c1.AbstractC2000a mo39211b(int i) {
            this.f2206g = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: c */
        public AbstractC1999c1.AbstractC2000a mo39210c(int i) {
            this.f2203d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: d */
        public AbstractC1999c1.AbstractC2000a mo39209d(int i) {
            this.f2204e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: e */
        public AbstractC1999c1.AbstractC2000a mo39208e(int i) {
            this.f2205f = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: f */
        public AbstractC1999c1.AbstractC2000a mo39207f(String str) {
            if (str != null) {
                this.f2200a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1999c1.AbstractC2000a
        /* renamed from: g */
        public AbstractC1999c1.AbstractC2000a mo39206g(Size size) {
            if (size != null) {
                this.f2202c = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        /* renamed from: h */
        public AbstractC1999c1.AbstractC2000a m39221h(int i) {
            this.f2201b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: c */
    public int mo39219c() {
        return this.f2199h;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: d */
    public int mo39218d() {
        return this.f2196e;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: e */
    public int mo39217e() {
        return this.f2197f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1999c1)) {
            return false;
        }
        AbstractC1999c1 c1Var = (AbstractC1999c1) obj;
        if (this.f2193b.equals(c1Var.mo39215g()) && this.f2194c == c1Var.mo39214h() && this.f2195d.equals(c1Var.mo39213i()) && this.f2196e == c1Var.mo39218d() && this.f2197f == c1Var.mo39217e() && this.f2198g == c1Var.mo39216f() && this.f2199h == c1Var.mo39219c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: f */
    public int mo39216f() {
        return this.f2198g;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: g */
    public String mo39215g() {
        return this.f2193b;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: h */
    public int mo39214h() {
        return this.f2194c;
    }

    public int hashCode() {
        return ((((((((((((this.f2193b.hashCode() ^ 1000003) * 1000003) ^ this.f2194c) * 1000003) ^ this.f2195d.hashCode()) * 1000003) ^ this.f2196e) * 1000003) ^ this.f2197f) * 1000003) ^ this.f2198g) * 1000003) ^ this.f2199h;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1999c1
    /* renamed from: i */
    public Size mo39213i() {
        return this.f2195d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f2193b + ", profile=" + this.f2194c + ", resolution=" + this.f2195d + ", colorFormat=" + this.f2196e + ", frameRate=" + this.f2197f + ", IFrameInterval=" + this.f2198g + ", bitrate=" + this.f2199h + "}";
    }

    private C1995c(String str, int i, Size size, int i2, int i3, int i4, int i5) {
        this.f2193b = str;
        this.f2194c = i;
        this.f2195d = size;
        this.f2196e = i2;
        this.f2197f = i3;
        this.f2198g = i4;
        this.f2199h = i5;
    }
}
