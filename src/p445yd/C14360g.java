package p445yd;

import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: yd.g */
/* loaded from: classes3.dex */
final class C14360g {

    /* renamed from: c */
    private static final int[][] f32496c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final EnumC14359f f32497a;

    /* renamed from: b */
    private final byte f32498b;

    private C14360g(int i) {
        this.f32497a = EnumC14359f.m787a((i >> 3) & 3);
        this.f32498b = (byte) (i & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C14360g m786a(int i, int i2) {
        C14360g b = m785b(i, i2);
        if (b != null) {
            return b;
        }
        return m785b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C14360g m785b(int i, int i2) {
        int e;
        int[][] iArr = f32496c;
        int i3 = ViewDefaults.NUMBER_OF_LINES;
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            int i5 = iArr2[0];
            if (i5 == i || i5 == i2) {
                return new C14360g(iArr2[1]);
            }
            int e2 = m782e(i, i5);
            if (e2 < i3) {
                i4 = iArr2[1];
                i3 = e2;
            }
            if (i != i2 && (e = m782e(i2, i5)) < i3) {
                i4 = iArr2[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C14360g(i4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m782e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m784c() {
        return this.f32498b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC14359f m783d() {
        return this.f32497a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14360g)) {
            return false;
        }
        C14360g gVar = (C14360g) obj;
        if (this.f32497a == gVar.f32497a && this.f32498b == gVar.f32498b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32497a.ordinal() << 3) | this.f32498b;
    }
}
