package p186k0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p204l0.C10308f;
import p204l0.C10315m;

/* renamed from: k0.k */
/* loaded from: classes.dex */
public final class C9714k {
    /* renamed from: a */
    private static void m15542a(MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        C1915r1.m39527a("DebugUtils", "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        C1915r1.m39527a("DebugUtils", "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            C1915r1.m39527a("DebugUtils", "[AudioCaps] getMinInputChannelCount = " + C10315m.m13641b(audioCapabilities));
            C1915r1.m39527a("DebugUtils", "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(C10315m.m13642a(audioCapabilities)));
        }
        C1915r1.m39527a("DebugUtils", "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        C1915r1.m39527a("DebugUtils", "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            C1915r1.m39527a("DebugUtils", "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            C1915r1.m39517k("DebugUtils", "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    /* renamed from: b */
    private static void m15541b(MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        C1915r1.m39527a("DebugUtils", "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        C1915r1.m39527a("DebugUtils", "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(m15534i(codecProfileLevel));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            C1915r1.m39527a("DebugUtils", "[CodecCaps] profileLevels = " + ((Object) sb2));
        }
        if (codecCapabilities.colorFormats != null) {
            C1915r1.m39527a("DebugUtils", "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            m15538e(videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            m15542a(audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            m15540c(encoderCapabilities, mediaFormat);
        }
    }

    /* renamed from: c */
    private static void m15540c(MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        C1915r1.m39527a("DebugUtils", "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            C1915r1.m39527a("DebugUtils", "[EncoderCaps] getQualityRange = " + C10308f.m13651a(encoderCapabilities));
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            C1915r1.m39527a("DebugUtils", "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            C1915r1.m39517k("DebugUtils", "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    /* renamed from: d */
    public static void m15539d(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        MediaCodecInfo[] codecInfos;
        boolean z;
        C1915r1.m39527a("DebugUtils", "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z2 = true;
                if (string != null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    C2517g.m37594a(z);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z2 = false;
                    }
                    C2517g.m37594a(z2);
                    C1915r1.m39527a("DebugUtils", "[Start] [" + mediaCodecInfo.getName() + "]");
                    m15541b(capabilitiesForType, mediaFormat);
                    C1915r1.m39527a("DebugUtils", "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    C1915r1.m39517k("DebugUtils", "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        C1915r1.m39527a("DebugUtils", "[End] Dump MediaCodecList");
    }

    /* renamed from: e */
    private static void m15538e(MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        C1915r1.m39527a("DebugUtils", "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        C1915r1.m39527a("DebugUtils", "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        C1915r1.m39527a("DebugUtils", "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i3 = 0;
        boolean z3 = true;
        try {
            i2 = mediaFormat.getInteger("width");
            i = mediaFormat.getInteger("height");
            if (i2 <= 0 || i <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            C2517g.m37594a(z2);
            z = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            C1915r1.m39517k("DebugUtils", "[VideoCaps] mediaFormat does not contain valid width and height");
            i2 = 0;
            i = 0;
            z = false;
        }
        if (z) {
            try {
                C1915r1.m39527a("DebugUtils", "[VideoCaps] getSupportedHeightsFor " + i2 + " = " + videoCapabilities.getSupportedHeightsFor(i2));
            } catch (IllegalArgumentException e) {
                C1915r1.m39516l("DebugUtils", "[VideoCaps] could not getSupportedHeightsFor " + i2, e);
            }
            try {
                C1915r1.m39527a("DebugUtils", "[VideoCaps] getSupportedWidthsFor " + i + " = " + videoCapabilities.getSupportedWidthsFor(i));
            } catch (IllegalArgumentException e2) {
                C1915r1.m39516l("DebugUtils", "[VideoCaps] could not getSupportedWidthsFor " + i, e2);
            }
            C1915r1.m39527a("DebugUtils", "[VideoCaps] isSizeSupported for " + i2 + "x" + i + " = " + videoCapabilities.isSizeSupported(i2, i));
        }
        C1915r1.m39527a("DebugUtils", "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z3 = false;
            }
            C2517g.m37594a(z3);
            i3 = integer;
        } catch (IllegalArgumentException | NullPointerException unused2) {
            C1915r1.m39517k("DebugUtils", "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z) {
            C1915r1.m39527a("DebugUtils", "[VideoCaps] getSupportedFrameRatesFor " + i2 + "x" + i + " = " + videoCapabilities.getSupportedFrameRatesFor(i2, i));
        }
        if (z && i3 > 0) {
            C1915r1.m39527a("DebugUtils", "[VideoCaps] areSizeAndRateSupported for " + i2 + "x" + i + ", " + i3 + " = " + videoCapabilities.areSizeAndRateSupported(i2, i, i3));
        }
    }

    /* renamed from: f */
    private static String m15537f(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    /* renamed from: g */
    public static String m15536g(long j) {
        return m15537f(j);
    }

    /* renamed from: h */
    public static String m15535h(long j) {
        return m15536g(TimeUnit.MICROSECONDS.toMillis(j));
    }

    /* renamed from: i */
    private static String m15534i(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return "null";
        }
        return String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }
}
