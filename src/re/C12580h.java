package re;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.util.JSStackTrace;
import com.linkedin.android.litr.C6007b;
import com.linkedin.android.litr.p050io.MediaRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import p266oe.AbstractC11261c;

/* renamed from: re.h */
/* loaded from: classes6.dex */
public final class C12580h {

    /* renamed from: a */
    private static final String f28279a = "h";

    /* renamed from: a */
    public static int m6483a(AbstractC11261c cVar, int i) {
        MediaFormat trackFormat = cVar.getTrackFormat(i);
        if (trackFormat.containsKey("bitrate")) {
            return trackFormat.getInteger("bitrate");
        }
        float a = C12579g.m6484a(trackFormat.getLong("durationUs"));
        if (a == 0.0f) {
            return 0;
        }
        float size = (float) cVar.getSize();
        int trackCount = cVar.getTrackCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < trackCount; i2++) {
            MediaFormat trackFormat2 = cVar.getTrackFormat(i2);
            if (trackFormat2.containsKey("mime")) {
                if (trackFormat2.containsKey("bitrate") && trackFormat2.containsKey("durationUs")) {
                    size -= (trackFormat2.getInteger("bitrate") * C12579g.m6484a(trackFormat2.getLong("durationUs"))) / 8.0f;
                } else if (trackFormat2.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    f += trackFormat2.getInteger("width") * trackFormat2.getInteger("height") * C12579g.m6484a(trackFormat2.getLong("durationUs"));
                }
            }
        }
        float integer = trackFormat.getInteger("width") * trackFormat.getInteger("height") * a;
        if (f > 0.0f) {
            size = (size * integer) / f;
        }
        return (int) ((size * 8.0f) / a);
    }

    /* renamed from: b */
    private static int m6482b(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return -1;
    }

    /* renamed from: c */
    private static long m6481c(C6007b bVar) {
        MediaFormat trackFormat = bVar.m26461c().getTrackFormat(bVar.m26458f());
        if (!trackFormat.containsKey("durationUs")) {
            return -1L;
        }
        long j = trackFormat.getLong("durationUs");
        MediaRange selection = bVar.m26461c().getSelection();
        return Math.min(j, selection.m26437a()) - Math.max(0L, selection.m26436b());
    }

    /* renamed from: d */
    public static long m6480d(List<C6007b> list) {
        long j = 0;
        for (C6007b bVar : list) {
            j = Math.max(m6481c(bVar), j);
        }
        float f = 0.0f;
        for (C6007b bVar2 : list) {
            MediaFormat trackFormat = bVar2.m26461c().getTrackFormat(bVar2.m26458f());
            int b = m6482b(trackFormat);
            long c = m6481c(bVar2);
            if (c < 0) {
                Log.d(f28279a, "Track duration is not available, using maximum duration");
                c = j;
            }
            String e = m6479e(trackFormat);
            if (e != null) {
                if (bVar2.m26457g() != null) {
                    b = m6482b(bVar2.m26457g());
                } else if (e.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) && b < 0) {
                    b = 320000;
                }
            }
            if (b < 0) {
                Log.d(f28279a, "Bitrate is not available, cannot use that track to estimate size");
                b = 0;
            }
            f += b * C12579g.m6484a(c);
        }
        return f / 8.0f;
    }

    /* renamed from: e */
    private static String m6479e(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime")) {
            return mediaFormat.getString("mime");
        }
        return null;
    }

    /* renamed from: f */
    public static long m6478f(Context context, Uri uri) {
        long j;
        long j2 = -1;
        if ("content".equals(uri.getScheme())) {
            AssetFileDescriptor assetFileDescriptor = null;
            try {
                try {
                    assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptor != null) {
                        j = assetFileDescriptor.getParcelFileDescriptor().getStatSize();
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                    return j2;
                } finally {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e) {
                            Log.e(f28279a, "Unable to close file descriptor from targetFile: " + uri, e);
                        }
                    }
                }
            } catch (FileNotFoundException | IllegalStateException e2) {
                Log.e(f28279a, "Unable to extract length from targetFile: " + uri, e2);
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                        Log.e(f28279a, "Unable to close file descriptor from targetFile: " + uri, e3);
                    }
                }
                return -1L;
            }
        } else if (!JSStackTrace.FILE_KEY.equals(uri.getScheme()) || uri.getPath() == null) {
            return -1L;
        } else {
            return new File(uri.getPath()).length();
        }
    }
}
