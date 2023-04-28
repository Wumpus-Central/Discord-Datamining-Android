package p117g7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: g7.f */
/* loaded from: classes7.dex */
public final class C7449f {

    /* renamed from: c */
    public static final C7449f f16078c = new C7449f(new int[]{2}, 8);

    /* renamed from: d */
    private static final C7449f f16079d = new C7449f(new int[]{2, 5, 6}, 8);

    /* renamed from: a */
    private final int[] f16080a;

    /* renamed from: b */
    private final int f16081b;

    public C7449f(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f16080a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f16080a = new int[0];
        }
        this.f16081b = i;
    }

    /* renamed from: a */
    private static boolean m22603a() {
        if (C7557q0.f16368a >= 17) {
            String str = C7557q0.f16370c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static C7449f m22602b(Context context) {
        return m22601c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    static C7449f m22601c(Context context, Intent intent) {
        if (m22603a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f16079d;
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f16078c;
        }
        return new C7449f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: d */
    public int m22600d() {
        return this.f16081b;
    }

    /* renamed from: e */
    public boolean m22599e(int i) {
        return Arrays.binarySearch(this.f16080a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7449f)) {
            return false;
        }
        C7449f fVar = (C7449f) obj;
        if (!Arrays.equals(this.f16080a, fVar.f16080a) || this.f16081b != fVar.f16081b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f16081b + (Arrays.hashCode(this.f16080a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f16081b + ", supportedEncodings=" + Arrays.toString(this.f16080a) + "]";
    }
}
