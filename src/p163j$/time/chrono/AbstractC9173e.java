package p163j$.time.chrono;

import p163j$.time.temporal.EnumC9213a;

/* renamed from: j$.time.chrono.e */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC9173e {

    /* renamed from: a */
    static final /* synthetic */ int[] f20140a;

    static {
        int[] iArr = new int[EnumC9213a.values().length];
        f20140a = iArr;
        try {
            iArr[EnumC9213a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20140a[EnumC9213a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
