package bg;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0007¨\u0006\u0006"}, m15073d2 = {"", "", "b", "", "", "a", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/math/MathKt")
/* renamed from: bg.c */
/* loaded from: classes8.dex */
public class C3491c extends C3490b {
    /* renamed from: a */
    public static int m34305a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: b */
    public static long m34304b(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
