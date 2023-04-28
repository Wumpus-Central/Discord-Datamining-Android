package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.AbstractC1980a;

/* renamed from: androidx.camera.video.internal.encoder.b */
/* loaded from: classes.dex */
final class C1991b extends AbstractC1980a {

    /* renamed from: b */
    private final String f2181b;

    /* renamed from: c */
    private final int f2182c;

    /* renamed from: d */
    private final int f2183d;

    /* renamed from: e */
    private final int f2184e;

    /* renamed from: f */
    private final int f2185f;

    /* renamed from: androidx.camera.video.internal.encoder.b$b */
    /* loaded from: classes.dex */
    static final class C0024b extends AbstractC1980a.AbstractC0022a {

        /* renamed from: a */
        private String f2186a;

        /* renamed from: b */
        private Integer f2187b;

        /* renamed from: c */
        private Integer f2188c;

        /* renamed from: d */
        private Integer f2189d;

        /* renamed from: e */
        private Integer f2190e;

        @Override // androidx.camera.video.internal.encoder.AbstractC1980a.AbstractC0022a
        /* renamed from: a */
        AbstractC1980a mo39227a() {
            String str = "";
            if (this.f2186a == null) {
                str = str + " mimeType";
            }
            if (this.f2187b == null) {
                str = str + " profile";
            }
            if (this.f2188c == null) {
                str = str + " bitrate";
            }
            if (this.f2189d == null) {
                str = str + " sampleRate";
            }
            if (this.f2190e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C1991b(this.f2186a, this.f2187b.intValue(), this.f2188c.intValue(), this.f2189d.intValue(), this.f2190e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1980a.AbstractC0022a
        /* renamed from: c */
        public AbstractC1980a.AbstractC0022a mo39226c(int i) {
            this.f2188c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1980a.AbstractC0022a
        /* renamed from: d */
        public AbstractC1980a.AbstractC0022a mo39225d(int i) {
            this.f2190e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1980a.AbstractC0022a
        /* renamed from: e */
        public AbstractC1980a.AbstractC0022a mo39224e(String str) {
            if (str != null) {
                this.f2186a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1980a.AbstractC0022a
        /* renamed from: f */
        public AbstractC1980a.AbstractC0022a mo39223f(int i) {
            this.f2187b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC1980a.AbstractC0022a
        /* renamed from: g */
        public AbstractC1980a.AbstractC0022a mo39222g(int i) {
            this.f2189d = Integer.valueOf(i);
            return this;
        }
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1980a
    /* renamed from: c */
    public int mo39232c() {
        return this.f2183d;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1980a
    /* renamed from: d */
    public int mo39231d() {
        return this.f2185f;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1980a
    /* renamed from: e */
    public String mo39230e() {
        return this.f2181b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1980a)) {
            return false;
        }
        AbstractC1980a aVar = (AbstractC1980a) obj;
        if (this.f2181b.equals(aVar.mo39230e()) && this.f2182c == aVar.mo39229f() && this.f2183d == aVar.mo39232c() && this.f2184e == aVar.mo39228g() && this.f2185f == aVar.mo39231d()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1980a
    /* renamed from: f */
    public int mo39229f() {
        return this.f2182c;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC1980a
    /* renamed from: g */
    public int mo39228g() {
        return this.f2184e;
    }

    public int hashCode() {
        return ((((((((this.f2181b.hashCode() ^ 1000003) * 1000003) ^ this.f2182c) * 1000003) ^ this.f2183d) * 1000003) ^ this.f2184e) * 1000003) ^ this.f2185f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f2181b + ", profile=" + this.f2182c + ", bitrate=" + this.f2183d + ", sampleRate=" + this.f2184e + ", channelCount=" + this.f2185f + "}";
    }

    private C1991b(String str, int i, int i2, int i3, int i4) {
        this.f2181b = str;
        this.f2182c = i;
        this.f2183d = i2;
        this.f2184e = i3;
        this.f2185f = i4;
    }
}
