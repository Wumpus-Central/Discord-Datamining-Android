package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.C1991b;
import java.util.Objects;

/* renamed from: androidx.camera.video.internal.encoder.a */
/* loaded from: classes.dex */
public abstract class AbstractC1980a implements AbstractC2021m {

    /* renamed from: androidx.camera.video.internal.encoder.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0022a {
        /* renamed from: a */
        abstract AbstractC1980a mo39227a();

        /* renamed from: b */
        public AbstractC1980a m39336b() {
            AbstractC1980a a = mo39227a();
            if (!Objects.equals(a.mo39230e(), "audio/mp4a-latm") || a.mo39229f() != AbstractC2021m.f2235a) {
                return a;
            }
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }

        /* renamed from: c */
        public abstract AbstractC0022a mo39226c(int i);

        /* renamed from: d */
        public abstract AbstractC0022a mo39225d(int i);

        /* renamed from: e */
        public abstract AbstractC0022a mo39224e(String str);

        /* renamed from: f */
        public abstract AbstractC0022a mo39223f(int i);

        /* renamed from: g */
        public abstract AbstractC0022a mo39222g(int i);
    }

    /* renamed from: b */
    public static AbstractC0022a m39337b() {
        return new C1991b.C0024b().mo39223f(AbstractC2021m.f2235a);
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2021m
    /* renamed from: a */
    public MediaFormat mo39195a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(mo39230e(), mo39228g(), mo39231d());
        createAudioFormat.setInteger("bitrate", mo39232c());
        if (mo39229f() != AbstractC2021m.f2235a) {
            if (mo39230e().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", mo39229f());
            } else {
                createAudioFormat.setInteger("profile", mo39229f());
            }
        }
        return createAudioFormat;
    }

    /* renamed from: c */
    public abstract int mo39232c();

    /* renamed from: d */
    public abstract int mo39231d();

    /* renamed from: e */
    public abstract String mo39230e();

    /* renamed from: f */
    public abstract int mo39229f();

    /* renamed from: g */
    public abstract int mo39228g();
}
