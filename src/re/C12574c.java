package re;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import je.C9568e;
import p163j$.util.Spliterator;

/* renamed from: re.c */
/* loaded from: classes6.dex */
public class C12574c {

    /* renamed from: a */
    private static Map<String, int[]> f28276a = new HashMap();

    static {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            iArr = new int[]{65536, 1, 4, 2, 524288, 8, 16, 32, 64};
        } else {
            iArr = new int[]{1, 4, 2, 8, 16, 32, 64};
        }
        f28276a.put("video/avc", iArr);
        f28276a.put("video/x-vnd.on2.vp8", new int[]{1});
        if (i >= 29) {
            iArr2 = new int[]{1, 2, 4096, 8192};
        } else if (i >= 24) {
            iArr2 = new int[]{1, 2, 4096};
        } else {
            iArr2 = new int[]{1, 2};
        }
        f28276a.put("video/hevc", iArr2);
        if (i >= 24) {
            if (i >= 29) {
                iArr3 = new int[]{1, 2, 4, 4096, Spliterator.SUBSIZED, 8, 8192, 32768};
            } else {
                iArr3 = new int[]{1, 2, 4, 4096, 8, 8192};
            }
            f28276a.put("video/x-vnd.on2.vp9", iArr3);
        }
        if (i >= 29) {
            f28276a.put("video/av01", new int[]{1, 2, 4096, 8192});
        }
    }

    /* renamed from: b */
    private static void m6499b(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, boolean z) {
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, z ? 1 : 0);
    }

    /* renamed from: c */
    private static MediaCodec m6498c(MediaFormat mediaFormat, Surface surface, boolean z, List<Callable<MediaCodec>> list) {
        MediaCodec mediaCodec;
        Exception e;
        Iterator<Callable<MediaCodec>> it = list.iterator();
        MediaCodec mediaCodec2 = null;
        IOException iOException = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                mediaCodec = it.next().call();
            } catch (Exception e2) {
                mediaCodec = mediaCodec2;
                e = e2;
            }
            if (mediaCodec != null) {
                try {
                    m6499b(mediaCodec, mediaFormat, surface, z);
                    mediaCodec2 = mediaCodec;
                    break;
                } catch (Exception e3) {
                    e = e3;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                        mediaCodec = null;
                    }
                    if (e instanceof IOException) {
                        iOException = (IOException) e;
                    }
                    mediaCodec2 = mediaCodec;
                }
            } else {
                continue;
                mediaCodec2 = mediaCodec;
            }
        }
        if (mediaCodec2 != null) {
            return mediaCodec2;
        }
        if (iOException != null) {
            throw iOException;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    private static List<Callable<MediaCodec>> m6497d(boolean z, String str, MediaFormat mediaFormat) {
        MediaCodecInfo[] codecInfos;
        ArrayList arrayList = new ArrayList();
        for (final MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() == z) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (mediaFormat == null || capabilitiesForType.isFormatSupported(mediaFormat))) {
                        arrayList.add(new Callable() { // from class: re.b
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                MediaCodec h;
                                h = C12574c.m6493h(mediaCodecInfo);
                                return h;
                            }
                        });
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static MediaCodec m6496e(MediaFormat mediaFormat, Surface surface, boolean z, C9568e.EnumC9569a aVar, C9568e.EnumC9569a aVar2, C9568e.EnumC9569a aVar3) {
        try {
            try {
                MediaCodec f = m6495f(mediaFormat, surface, z);
                if (f != null) {
                    return f;
                }
                throw new IllegalStateException("Try fallbackToGetCodecByType");
            } catch (IOException | IllegalStateException unused) {
                MediaCodec g = m6494g(mediaFormat, surface, z);
                if (g != null) {
                    return g;
                }
                throw new C9568e(aVar, mediaFormat, null, null);
            }
        } catch (IOException | IllegalStateException e) {
            if (e instanceof IOException) {
                throw new C9568e(aVar2, mediaFormat, null, null, e);
            }
            throw new C9568e(aVar3, mediaFormat, null, null, e);
        }
    }

    /* renamed from: f */
    private static MediaCodec m6495f(MediaFormat mediaFormat, Surface surface, boolean z) {
        List<Callable<MediaCodec>> d = m6497d(z, mediaFormat.getString("mime"), mediaFormat);
        if (!d.isEmpty()) {
            return m6498c(mediaFormat, surface, z, d);
        }
        return null;
    }

    /* renamed from: g */
    private static MediaCodec m6494g(MediaFormat mediaFormat, Surface surface, boolean z) {
        List<Callable<MediaCodec>> d = m6497d(z, mediaFormat.getString("mime"), null);
        if (!d.isEmpty()) {
            return m6498c(mediaFormat, surface, z, d);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ MediaCodec m6493h(MediaCodecInfo mediaCodecInfo) {
        return MediaCodec.createByCodecName(mediaCodecInfo.getName());
    }
}
