package je;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Log;
import java.util.Arrays;

/* renamed from: je.e */
/* loaded from: classes6.dex */
public class C9568e extends AbstractC9567d {

    /* renamed from: p */
    private static final String f21206p = "je.e";

    /* renamed from: l */
    private final EnumC9569a f21207l;

    /* renamed from: m */
    private final MediaFormat f21208m;

    /* renamed from: n */
    private final MediaCodec f21209n;

    /* renamed from: o */
    private final MediaCodecList f21210o;

    /* renamed from: je.e$a */
    /* loaded from: classes6.dex */
    public enum EnumC9569a {
        DECODER_FORMAT_NOT_FOUND("Failed to create decoder codec."),
        DECODER_CONFIGURATION_ERROR("Failed to configure decoder codec."),
        ENCODER_FORMAT_NOT_FOUND("Failed to create encoder codec."),
        ENCODER_CONFIGURATION_ERROR("Failed to configure encoder codec."),
        DECODER_NOT_FOUND("No decoder found."),
        ENCODER_NOT_FOUND("No encoder found."),
        CODEC_IN_RELEASED_STATE("Codecs are in released state."),
        SOURCE_TRACK_MIME_TYPE_NOT_FOUND("Mime type not found for the source track."),
        NO_TRACKS_FOUND("No tracks found."),
        INTERNAL_CODEC_ERROR("Internal codec error occurred."),
        NO_FRAME_AVAILABLE("No frame available for specified tag"),
        DECODER_NOT_PROVIDED("Decoder is not provided"),
        ENCODER_NOT_PROVIDED("Encoder is not provided"),
        RENDERER_NOT_PROVIDED("Renderer is not provided");
        

        /* renamed from: k */
        private final String f21226k;

        EnumC9569a(String str) {
            this.f21226k = str;
        }
    }

    public C9568e(EnumC9569a aVar) {
        this(aVar, null, null, null);
    }

    /* renamed from: b */
    private String m15980b(MediaCodec mediaCodec) {
        try {
            return m15979c(mediaCodec.getCodecInfo());
        } catch (IllegalStateException unused) {
            Log.e(f21206p, "Failed to retrieve media codec info.");
            return "";
        }
    }

    /* renamed from: c */
    private String m15979c(MediaCodecInfo mediaCodecInfo) {
        return "MediaCodecInfo: " + mediaCodecInfo.getName() + ',' + mediaCodecInfo.isEncoder() + ',' + Arrays.asList(mediaCodecInfo.getSupportedTypes()).toString();
    }

    /* renamed from: d */
    private String m15978d(MediaCodecList mediaCodecList) {
        MediaCodecInfo[] codecInfos;
        StringBuilder sb2 = new StringBuilder();
        try {
            for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
                if (mediaCodecInfo != null) {
                    sb2.append('\n');
                    sb2.append(m15979c(mediaCodecInfo));
                }
            }
        } catch (IllegalStateException e) {
            Log.e(f21206p, "Failed to retrieve media codec info.", e);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    private String m15977e(Throwable th2) {
        if (!(th2 instanceof MediaCodec.CodecException)) {
            return null;
        }
        return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f21207l.f21226k;
    }

    @Override // je.AbstractC9567d, java.lang.Throwable
    public String toString() {
        String str = super.toString() + '\n';
        if (this.f21208m != null) {
            str = str + "Media format: " + this.f21208m.toString() + '\n';
        }
        if (this.f21209n != null) {
            str = str + "Selected media codec info: " + m15980b(this.f21209n) + '\n';
        }
        if (this.f21210o != null) {
            str = str + "Available media codec info list (Name, IsEncoder, Supported Types): " + m15978d(this.f21210o);
        }
        if (getCause() == null) {
            return str;
        }
        return str + "Diagnostic info: " + m15977e(getCause());
    }

    public C9568e(EnumC9569a aVar, Throwable th2) {
        this(aVar, null, null, null, th2);
    }

    public C9568e(EnumC9569a aVar, MediaFormat mediaFormat, MediaCodec mediaCodec, MediaCodecList mediaCodecList) {
        this(aVar, mediaFormat, mediaCodec, mediaCodecList, null);
    }

    public C9568e(EnumC9569a aVar, MediaFormat mediaFormat, MediaCodec mediaCodec, MediaCodecList mediaCodecList, Throwable th2) {
        super(th2);
        this.f21207l = aVar;
        this.f21208m = mediaFormat;
        this.f21209n = mediaCodec;
        this.f21210o = mediaCodecList;
    }
}
