package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.video.internal.encoder.C1995c;

/* renamed from: androidx.camera.video.internal.encoder.c1 */
/* loaded from: classes.dex */
public abstract class AbstractC1999c1 implements AbstractC2021m {

    /* renamed from: androidx.camera.video.internal.encoder.c1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2000a {
        /* renamed from: a */
        public abstract AbstractC1999c1 mo39212a();

        /* renamed from: b */
        public abstract AbstractC2000a mo39211b(int i);

        /* renamed from: c */
        public abstract AbstractC2000a mo39210c(int i);

        /* renamed from: d */
        public abstract AbstractC2000a mo39209d(int i);

        /* renamed from: e */
        public abstract AbstractC2000a mo39208e(int i);

        /* renamed from: f */
        public abstract AbstractC2000a mo39207f(String str);

        /* renamed from: g */
        public abstract AbstractC2000a mo39206g(Size size);
    }

    /* renamed from: b */
    public static AbstractC2000a m39220b() {
        return new C1995c.C1997b().m39221h(AbstractC2021m.f2235a).mo39208e(1).mo39210c(2130708361);
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2021m
    /* renamed from: a */
    public MediaFormat mo39195a() {
        Size i = mo39213i();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(mo39215g(), i.getWidth(), i.getHeight());
        createVideoFormat.setInteger("color-format", mo39218d());
        createVideoFormat.setInteger("bitrate", mo39219c());
        createVideoFormat.setInteger("frame-rate", mo39217e());
        createVideoFormat.setInteger("i-frame-interval", mo39216f());
        if (mo39214h() != AbstractC2021m.f2235a) {
            createVideoFormat.setInteger("profile", mo39214h());
        }
        return createVideoFormat;
    }

    /* renamed from: c */
    public abstract int mo39219c();

    /* renamed from: d */
    public abstract int mo39218d();

    /* renamed from: e */
    public abstract int mo39217e();

    /* renamed from: f */
    public abstract int mo39216f();

    /* renamed from: g */
    public abstract String mo39215g();

    /* renamed from: h */
    public abstract int mo39214h();

    /* renamed from: i */
    public abstract Size mo39213i();
}
