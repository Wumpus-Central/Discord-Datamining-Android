package com.facebook.yoga;

/* loaded from: classes7.dex */
public class YogaValue {

    /* renamed from: c */
    static final YogaValue f8886c = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* renamed from: d */
    static final YogaValue f8887d = new YogaValue(0.0f, YogaUnit.POINT);

    /* renamed from: e */
    static final YogaValue f8888e = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* renamed from: a */
    public final float f8889a;

    /* renamed from: b */
    public final YogaUnit f8890b;

    /* renamed from: com.facebook.yoga.YogaValue$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C5122a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8891a;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            f8891a = iArr;
            try {
                iArr[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8891a[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8891a[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8891a[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.f8889a = f;
        this.f8890b = yogaUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.f8890b;
        if (yogaUnit != yogaValue.f8890b) {
            return false;
        }
        if (yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.f8889a, yogaValue.f8889a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f8889a) + this.f8890b.m30602b();
    }

    public String toString() {
        int i = C5122a.f8891a[this.f8890b.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.f8889a);
        }
        if (i == 3) {
            return this.f8889a + "%";
        } else if (i == 4) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaValue(float f, int i) {
        this(f, YogaUnit.m30603a(i));
    }
}
