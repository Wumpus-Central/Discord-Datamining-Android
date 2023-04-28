package p390w;

import android.media.CamcorderProfile;

/* renamed from: w.j */
/* loaded from: classes.dex */
public abstract class AbstractC13609j {

    /* renamed from: a */
    public static int f30411a = -1;

    /* renamed from: a */
    public static AbstractC13609j m3247a(CamcorderProfile camcorderProfile) {
        return new C13564a(camcorderProfile.duration, camcorderProfile.quality, camcorderProfile.fileFormat, camcorderProfile.videoCodec, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, camcorderProfile.audioCodec, camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels);
    }

    /* renamed from: b */
    public abstract int mo3246b();

    /* renamed from: c */
    public abstract int mo3245c();

    /* renamed from: d */
    public abstract int mo3244d();

    /* renamed from: e */
    public String m3243e() {
        switch (mo3244d()) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return null;
        }
    }

    /* renamed from: f */
    public abstract int mo3242f();

    /* renamed from: g */
    public abstract int mo3241g();

    /* renamed from: h */
    public abstract int mo3240h();

    /* renamed from: i */
    public abstract int mo3239i();

    /* renamed from: j */
    public int m3238j() {
        int d = mo3244d();
        if (d == 3) {
            return 2;
        }
        if (d == 4) {
            return 5;
        }
        if (d != 5) {
            return f30411a;
        }
        return 39;
    }

    /* renamed from: k */
    public abstract int mo3237k();

    /* renamed from: l */
    public abstract int mo3236l();

    /* renamed from: m */
    public String m3235m() {
        int l = mo3236l();
        if (l == 1) {
            return "video/3gpp";
        }
        if (l == 2) {
            return "video/avc";
        }
        if (l == 3) {
            return "video/mp4v-es";
        }
        if (l == 4) {
            return "video/x-vnd.on2.vp8";
        }
        if (l != 5) {
            return null;
        }
        return "video/hevc";
    }

    /* renamed from: n */
    public abstract int mo3234n();

    /* renamed from: o */
    public abstract int mo3233o();

    /* renamed from: p */
    public abstract int mo3232p();
}
