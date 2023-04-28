package p451z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C14495a extends AbstractC14503f {

    /* renamed from: a */
    private final float f32876a;

    /* renamed from: b */
    private final float f32877b;

    /* renamed from: c */
    private final float f32878c;

    /* renamed from: d */
    private final float f32879d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14495a(float f, float f2, float f3, float f4) {
        this.f32876a = f;
        this.f32877b = f2;
        this.f32878c = f3;
        this.f32879d = f4;
    }

    @Override // p451z.AbstractC14503f, androidx.camera.core.AbstractC1801d3
    /* renamed from: a */
    public float mo309a() {
        return this.f32877b;
    }

    @Override // p451z.AbstractC14503f, androidx.camera.core.AbstractC1801d3
    /* renamed from: b */
    public float mo308b() {
        return this.f32879d;
    }

    @Override // p451z.AbstractC14503f, androidx.camera.core.AbstractC1801d3
    /* renamed from: c */
    public float mo307c() {
        return this.f32878c;
    }

    @Override // p451z.AbstractC14503f, androidx.camera.core.AbstractC1801d3
    /* renamed from: d */
    public float mo306d() {
        return this.f32876a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14503f)) {
            return false;
        }
        AbstractC14503f fVar = (AbstractC14503f) obj;
        if (Float.floatToIntBits(this.f32876a) == Float.floatToIntBits(fVar.mo306d()) && Float.floatToIntBits(this.f32877b) == Float.floatToIntBits(fVar.mo309a()) && Float.floatToIntBits(this.f32878c) == Float.floatToIntBits(fVar.mo307c()) && Float.floatToIntBits(this.f32879d) == Float.floatToIntBits(fVar.mo308b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f32876a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f32877b)) * 1000003) ^ Float.floatToIntBits(this.f32878c)) * 1000003) ^ Float.floatToIntBits(this.f32879d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f32876a + ", maxZoomRatio=" + this.f32877b + ", minZoomRatio=" + this.f32878c + ", linearZoom=" + this.f32879d + "}";
    }
}
