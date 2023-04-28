package p273p0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.C1990a1;
import androidx.core.util.C2517g;
import java.io.IOException;
import p186k0.C9714k;
import p221m0.C10460d;
import p221m0.C10463g;
import p221m0.C10464h;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public class C11508b {

    /* renamed from: a */
    private final boolean f25643a;

    public C11508b() {
        boolean z;
        if (((C10463g) C10460d.m13127a(C10463g.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f25643a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m9539b(android.media.MediaFormat r7, android.media.MediaCodecList r8) {
        /*
            r6 = this;
            java.lang.String r0 = "aac-profile"
            java.lang.String r1 = "frame-rate"
            r2 = 0
            boolean r3 = r6.f25643a     // Catch: all -> 0x005c
            if (r3 == 0) goto L_0x001b
            boolean r3 = r7.containsKey(r1)     // Catch: all -> 0x005c
            if (r3 == 0) goto L_0x001b
            int r3 = r7.getInteger(r1)     // Catch: all -> 0x005c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x005c
            r7.setString(r1, r2)     // Catch: all -> 0x0058
            goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0058
            r5 = 23
            if (r4 > r5) goto L_0x0037
            boolean r4 = r7.containsKey(r0)     // Catch: all -> 0x0058
            if (r4 == 0) goto L_0x0037
            int r4 = r7.getInteger(r0)     // Catch: all -> 0x0058
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0058
            r7.setString(r0, r2)     // Catch: all -> 0x0035
            r2 = r4
            goto L_0x0037
        L_0x0035:
            r8 = move-exception
            goto L_0x005a
        L_0x0037:
            java.lang.String r4 = r8.findEncoderForFormat(r7)     // Catch: all -> 0x0058
            if (r4 != 0) goto L_0x0045
            android.media.MediaCodecInfo[] r8 = r8.getCodecInfos()     // Catch: all -> 0x0058
            java.lang.String r4 = r6.m9538c(r7, r8)     // Catch: all -> 0x0058
        L_0x0045:
            if (r3 == 0) goto L_0x004e
            int r8 = r3.intValue()
            r7.setInteger(r1, r8)
        L_0x004e:
            if (r2 == 0) goto L_0x0057
            int r8 = r2.intValue()
            r7.setInteger(r0, r8)
        L_0x0057:
            return r4
        L_0x0058:
            r8 = move-exception
            r4 = r2
        L_0x005a:
            r2 = r3
            goto L_0x005e
        L_0x005c:
            r8 = move-exception
            r4 = r2
        L_0x005e:
            if (r2 == 0) goto L_0x0067
            int r2 = r2.intValue()
            r7.setInteger(r1, r2)
        L_0x0067:
            if (r4 == 0) goto L_0x0070
            int r1 = r4.intValue()
            r7.setInteger(r0, r1)
        L_0x0070:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p273p0.C11508b.m9539b(android.media.MediaFormat, android.media.MediaCodecList):java.lang.String");
    }

    /* renamed from: c */
    private String m9538c(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        Integer num;
        Throwable th2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z;
        int i;
        boolean z2;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            C1915r1.m39517k("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i2];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C2517g.m37593b(z, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C2517g.m37593b(z2, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i);
                        } catch (IllegalArgumentException unused) {
                            if (num == null) {
                            }
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th3) {
                            th2 = th3;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th2;
                        }
                    } else {
                        i = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th4) {
                    th2 = th4;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    C1915r1.m39517k("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    /* renamed from: d */
    private boolean m9537d(MediaFormat mediaFormat) {
        C10464h hVar = (C10464h) C10460d.m13127a(C10464h.class);
        if (hVar == null) {
            return false;
        }
        return hVar.m13119e(mediaFormat);
    }

    /* renamed from: a */
    public MediaCodec m9540a(MediaFormat mediaFormat, MediaCodecList mediaCodecList) {
        if (m9537d(mediaFormat)) {
            String string = mediaFormat.getString("mime");
            try {
                return MediaCodec.createEncoderByType(string);
            } catch (IOException e) {
                throw new C1990a1("Cannot create encoder by mime type: " + string, e);
            }
        } else {
            String b = m9539b(mediaFormat, mediaCodecList);
            try {
                return MediaCodec.createByCodecName(b);
            } catch (IOException | IllegalArgumentException | NullPointerException e2) {
                C9714k.m15539d(mediaCodecList, mediaFormat);
                throw new C1990a1("Encoder cannot created: " + b, e2);
            }
        }
    }
}
