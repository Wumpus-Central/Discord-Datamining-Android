package com.discord;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.support.annotation.RequiresApi;
import java.util.Locale;


public class DiscordMediaCodec {
    static final String[] KNOWN_HARDWARE_ENCODER_PREFIXES = {"omx.qcom.", "omx.exynos.", "omx.intel.", "omx.nvidia.", "omx.mtk.", "omx.hisi.", "omx.img.topaz."};
    static final String[] KNOWN_BAD_ENCODER_MODELS = {"samsung-sgh-i337", "nexus 4", "nexus 7"};

    @RequiresApi(29)
    private static boolean isHardwareAccelerated_API29(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    public static boolean supportsHardwareEncoding(MediaCodecInfo mediaCodecInfo) {
        for (String str : KNOWN_BAD_ENCODER_MODELS) {
            if (str.equalsIgnoreCase(Build.MODEL)) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return isHardwareAccelerated_API29(mediaCodecInfo);
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
        for (String str2 : KNOWN_HARDWARE_ENCODER_PREFIXES) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
