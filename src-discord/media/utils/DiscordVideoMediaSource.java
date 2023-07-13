package com.discord.media.utils;

import android.media.CamcorderProfile;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qd.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B'\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\f\u001a\u00020\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010!¨\u0006+"}, d2 = {"Lcom/discord/media/utils/DiscordVideoMediaSource;", "Lqd/a;", "", "width", "height", "frameRate", "getAVCBitrate", "getDefaultBitrate", "Landroid/media/MediaFormat;", "srcAudioFormat", "getAudioFormatWithBitrate", "", "isHevc", "Landroid/net/Uri;", "inputUri", "Landroid/net/Uri;", "getInputUri", "()Landroid/net/Uri;", "outputUri", "getOutputUri", "", "srcTrackFormats", "Ljava/util/List;", "srcVideoFormat", "Landroid/media/MediaFormat;", "estimatedVideoBitrate", "I", "bitRate", "", "iFrameInterval", "F", "videoFormat", "getVideoFormat", "()Landroid/media/MediaFormat;", "audioFormat", "getAudioFormat", "Landroid/content/Context;", "context", "Lcom/discord/media/utils/VideoCompressionQuality;", "compressionQuality", "<init>", "(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;)V", "Companion", "media_release"}, k = 1, mv = {1, 8, 0})

public final class DiscordVideoMediaSource extends a {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int DEFAULT_FRAMERATE = 30;
    @Deprecated
    public static final int DEFAULT_HEIGHT = 480;
    @Deprecated
    public static final float DEFAULT_IFRAME = 5.0f;
    @Deprecated
    public static final int DEFAULT_WIDTH = 640;
    private final MediaFormat audioFormat;
    private final int bitRate;
    private final int estimatedVideoBitrate;
    private final int frameRate;
    private final int height;
    private final float iFrameInterval;
    private final Uri inputUri;
    private final Uri outputUri;
    private final MediaFormat srcAudioFormat;
    private final List<MediaFormat> srcTrackFormats;
    private final MediaFormat srcVideoFormat;
    private final MediaFormat videoFormat;
    private final int width;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/media/utils/DiscordVideoMediaSource$Companion;", "", "()V", "DEFAULT_FRAMERATE", "", "DEFAULT_HEIGHT", "DEFAULT_IFRAME", "", "DEFAULT_WIDTH", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    private static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    
    
    
    public DiscordVideoMediaSource(android.content.Context r12, android.net.Uri r13, android.net.Uri r14, com.discord.media.utils.VideoCompressionQuality r15) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.DiscordVideoMediaSource.<init>(android.content.Context, android.net.Uri, android.net.Uri, com.discord.media.utils.VideoCompressionQuality):void");
    }

    private final int getAVCBitrate(int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int[] iArr = {8, 6, 5, 4, 0};
        boolean z12 = false;
        int i13 = -1;
        for (int i14 = 0; i14 < 2; i14++) {
            int i15 = 0;
            while (true) {
                if (i15 < 5) {
                    int i16 = iArr[i15];
                    if (CamcorderProfile.hasProfile(i14, i16)) {
                        CamcorderProfile camcorderProfile = CamcorderProfile.get(i14, i16);
                        int i17 = camcorderProfile.videoFrameWidth;
                        if (i10 == i17 && i11 == camcorderProfile.videoFrameHeight) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 == i17 && i10 == camcorderProfile.videoFrameHeight) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((z10 || z11) && i12 == camcorderProfile.videoFrameRate && camcorderProfile.videoCodec == 2) {
                            int i18 = camcorderProfile.videoBitRate;
                            if (i13 < i18) {
                                i13 = i18;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        Integer valueOf = Integer.valueOf(i13);
        if (valueOf.intValue() != -1) {
            z12 = true;
        }
        if (!z12) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return getDefaultBitrate(i10, i11, i12);
    }

    private final MediaFormat getAudioFormatWithBitrate(MediaFormat mediaFormat) {
        if (mediaFormat == null || mediaFormat.containsKey("bitrate")) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
            mediaFormat2.setInteger("bitrate", 256000);
            return mediaFormat2;
        }
        mediaFormat.setInteger("bitrate", 256000);
        return mediaFormat;
    }

    private final int getDefaultBitrate(int i10, int i11, int i12) {
        return (int) (i10 * i11 * i12 * 0.25d);
    }

    public final MediaFormat getAudioFormat() {
        return this.audioFormat;
    }

    public final Uri getInputUri() {
        return this.inputUri;
    }

    public final Uri getOutputUri() {
        return this.outputUri;
    }

    public final MediaFormat getVideoFormat() {
        return this.videoFormat;
    }

    public final boolean isHevc() {
        MediaFormat mediaFormat = this.srcVideoFormat;
        return mediaFormat != null && MediaFormatUtilsKt.isHevcVideo(mediaFormat);
    }
}
