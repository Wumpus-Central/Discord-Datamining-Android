package p163j$.time;

import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.e */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC9178e {

    /* renamed from: a */
    static final /* synthetic */ int[] f20145a;

    /* renamed from: b */
    static final /* synthetic */ int[] f20146b;

    static {
        int[] iArr = new int[EnumC9214b.values().length];
        f20146b = iArr;
        try {
            iArr[EnumC9214b.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20146b[EnumC9214b.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20146b[EnumC9214b.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20146b[EnumC9214b.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20146b[EnumC9214b.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20146b[EnumC9214b.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20146b[EnumC9214b.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20146b[EnumC9214b.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC9213a.values().length];
        f20145a = iArr2;
        try {
            iArr2[EnumC9213a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f20145a[EnumC9213a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f20145a[EnumC9213a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f20145a[EnumC9213a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
