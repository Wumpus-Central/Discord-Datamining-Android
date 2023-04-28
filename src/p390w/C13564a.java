package p390w;

/* renamed from: w.a */
/* loaded from: classes.dex */
final class C13564a extends AbstractC13609j {

    /* renamed from: b */
    private final int f30345b;

    /* renamed from: c */
    private final int f30346c;

    /* renamed from: d */
    private final int f30347d;

    /* renamed from: e */
    private final int f30348e;

    /* renamed from: f */
    private final int f30349f;

    /* renamed from: g */
    private final int f30350g;

    /* renamed from: h */
    private final int f30351h;

    /* renamed from: i */
    private final int f30352i;

    /* renamed from: j */
    private final int f30353j;

    /* renamed from: k */
    private final int f30354k;

    /* renamed from: l */
    private final int f30355l;

    /* renamed from: m */
    private final int f30356m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13564a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f30345b = i;
        this.f30346c = i2;
        this.f30347d = i3;
        this.f30348e = i4;
        this.f30349f = i5;
        this.f30350g = i6;
        this.f30351h = i7;
        this.f30352i = i8;
        this.f30353j = i9;
        this.f30354k = i10;
        this.f30355l = i11;
        this.f30356m = i12;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: b */
    public int mo3246b() {
        return this.f30354k;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: c */
    public int mo3245c() {
        return this.f30356m;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: d */
    public int mo3244d() {
        return this.f30353j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13609j)) {
            return false;
        }
        AbstractC13609j jVar = (AbstractC13609j) obj;
        if (this.f30345b == jVar.mo3241g() && this.f30346c == jVar.mo3239i() && this.f30347d == jVar.mo3240h() && this.f30348e == jVar.mo3236l() && this.f30349f == jVar.mo3237k() && this.f30350g == jVar.mo3233o() && this.f30351h == jVar.mo3232p() && this.f30352i == jVar.mo3234n() && this.f30353j == jVar.mo3244d() && this.f30354k == jVar.mo3246b() && this.f30355l == jVar.mo3242f() && this.f30356m == jVar.mo3245c()) {
            return true;
        }
        return false;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: f */
    public int mo3242f() {
        return this.f30355l;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: g */
    public int mo3241g() {
        return this.f30345b;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: h */
    public int mo3240h() {
        return this.f30347d;
    }

    public int hashCode() {
        return ((((((((((((((((((((((this.f30345b ^ 1000003) * 1000003) ^ this.f30346c) * 1000003) ^ this.f30347d) * 1000003) ^ this.f30348e) * 1000003) ^ this.f30349f) * 1000003) ^ this.f30350g) * 1000003) ^ this.f30351h) * 1000003) ^ this.f30352i) * 1000003) ^ this.f30353j) * 1000003) ^ this.f30354k) * 1000003) ^ this.f30355l) * 1000003) ^ this.f30356m;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: i */
    public int mo3239i() {
        return this.f30346c;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: k */
    public int mo3237k() {
        return this.f30349f;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: l */
    public int mo3236l() {
        return this.f30348e;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: n */
    public int mo3234n() {
        return this.f30352i;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: o */
    public int mo3233o() {
        return this.f30350g;
    }

    @Override // p390w.AbstractC13609j
    /* renamed from: p */
    public int mo3232p() {
        return this.f30351h;
    }

    public String toString() {
        return "CamcorderProfileProxy{duration=" + this.f30345b + ", quality=" + this.f30346c + ", fileFormat=" + this.f30347d + ", videoCodec=" + this.f30348e + ", videoBitRate=" + this.f30349f + ", videoFrameRate=" + this.f30350g + ", videoFrameWidth=" + this.f30351h + ", videoFrameHeight=" + this.f30352i + ", audioCodec=" + this.f30353j + ", audioBitRate=" + this.f30354k + ", audioSampleRate=" + this.f30355l + ", audioChannels=" + this.f30356m + "}";
    }
}
