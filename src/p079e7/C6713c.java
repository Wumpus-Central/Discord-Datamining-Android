package p079e7;

import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* renamed from: e7.c */
/* loaded from: classes7.dex */
public final class C6713c {

    /* renamed from: a */
    public static final UUID f14277a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f14278b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID f14279c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID f14280d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f14281e = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* renamed from: a */
    public static int m24568a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: b */
    public static String m24567b(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public static long m24566c(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: d */
    public static long m24565d(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
