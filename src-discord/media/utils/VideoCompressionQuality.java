package com.discord.media.utils;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/discord/media/utils/VideoCompressionQuality;", "", "value", "", "targetResolution", "", "targetBitrate", "(Ljava/lang/String;ILjava/lang/String;II)V", "getTargetBitrate", "()I", "getTargetResolution", "getValue", "()Ljava/lang/String;", "Original", "VeryHigh", "High", "Medium", "Low", "VeryLow", "None", "Companion", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum VideoCompressionQuality {
    Original("original", ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES),
    VeryHigh("very_high", 1080, 7000000),
    High("high", 720, 2500000),
    Medium("medium", DiscordVideoMediaSource.DEFAULT_HEIGHT, 2000000),
    Low("low", 360, 1200000),
    VeryLow("very_low", 360, 800000),
    None(ViewProps.NONE, DiscordVideoMediaSource.DEFAULT_HEIGHT, 3000000);
    
    public static final Companion Companion = new Companion(null);
    private final int targetBitrate;
    private final int targetResolution;
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/media/utils/VideoCompressionQuality$Companion;", "", "()V", "fromString", "Lcom/discord/media/utils/VideoCompressionQuality;", "value", "", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VideoCompressionQuality fromString(String str) {
            VideoCompressionQuality videoCompressionQuality;
            VideoCompressionQuality[] values = VideoCompressionQuality.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    videoCompressionQuality = null;
                    break;
                }
                videoCompressionQuality = values[i10];
                if (q.c(videoCompressionQuality.getValue(), str)) {
                    break;
                }
                i10++;
            }
            if (videoCompressionQuality == null) {
                return VideoCompressionQuality.None;
            }
            return videoCompressionQuality;
        }
    }

    VideoCompressionQuality(String str, int i10, int i11) {
        this.value = str;
        this.targetResolution = i10;
        this.targetBitrate = i11;
    }

    public final int getTargetBitrate() {
        return this.targetBitrate;
    }

    public final int getTargetResolution() {
        return this.targetResolution;
    }

    public final String getValue() {
        return this.value;
    }
}
