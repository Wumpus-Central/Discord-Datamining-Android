package p145i0;

import android.annotation.SuppressLint;
import androidx.camera.video.internal.encoder.AbstractC2021m;
import androidx.core.util.AbstractC2511b;
import java.util.Objects;
import p145i0.AbstractC8151j1;
import p145i0.C8132g;

/* renamed from: i0.q */
/* loaded from: classes.dex */
public abstract class AbstractC8183q {

    /* renamed from: i0.q$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC8184a {
        /* renamed from: a */
        public abstract AbstractC8183q mo20355a();

        /* renamed from: b */
        public AbstractC8184a m20354b(AbstractC2511b<AbstractC8151j1.AbstractC8152a> bVar) {
            AbstractC8151j1.AbstractC8152a f = mo20353c().mo20505f();
            bVar.accept(f);
            mo20350f(f.mo20504a());
            return this;
        }

        @SuppressLint({"KotlinPropertyAccess"})
        /* renamed from: c */
        abstract AbstractC8151j1 mo20353c();

        /* renamed from: d */
        public abstract AbstractC8184a mo20352d(AbstractC8105a aVar);

        /* renamed from: e */
        public abstract AbstractC8184a mo20351e(int i);

        /* renamed from: f */
        public abstract AbstractC8184a mo20350f(AbstractC8151j1 j1Var);
    }

    /* renamed from: a */
    public static AbstractC8184a m20364a() {
        return new C8132g.C8134b().mo20351e(-1).mo20352d(AbstractC8105a.m20590a().mo20577a()).mo20350f(AbstractC8151j1.m20510a().mo20504a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m20360e(int i) {
        return i != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m20359f(int i) {
        if (Objects.equals(m20360e(i), "audio/mp4a-latm")) {
            return 2;
        }
        return AbstractC2021m.f2235a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m20358g(int i) {
        return i != 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m20357h(int i) {
        return i != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    /* renamed from: b */
    public abstract AbstractC8105a mo20363b();

    /* renamed from: c */
    public abstract int mo20362c();

    /* renamed from: d */
    public abstract AbstractC8151j1 mo20361d();

    /* renamed from: i */
    public abstract AbstractC8184a mo20356i();
}
