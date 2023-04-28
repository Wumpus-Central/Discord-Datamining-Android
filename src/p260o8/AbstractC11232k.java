package p260o8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import java.io.IOException;
import p153i8.AbstractC8233b0;
import p244n8.AbstractC10738g;

/* renamed from: o8.k */
/* loaded from: classes7.dex */
public interface AbstractC11232k {

    /* renamed from: o8.k$a */
    /* loaded from: classes7.dex */
    public interface AbstractC11233a {
        /* renamed from: a */
        AbstractC11232k mo10375a(AbstractC10738g gVar, AbstractC5318g gVar2, AbstractC11231j jVar);
    }

    /* renamed from: o8.k$b */
    /* loaded from: classes7.dex */
    public interface AbstractC11234b {
        /* renamed from: e */
        void mo10374e();

        /* renamed from: k */
        boolean mo10373k(Uri uri, long j);
    }

    /* renamed from: o8.k$c */
    /* loaded from: classes7.dex */
    public static final class C11235c extends IOException {

        /* renamed from: k */
        public final Uri f25135k;

        public C11235c(Uri uri) {
            this.f25135k = uri;
        }
    }

    /* renamed from: o8.k$d */
    /* loaded from: classes7.dex */
    public static final class C11236d extends IOException {

        /* renamed from: k */
        public final Uri f25136k;

        public C11236d(Uri uri) {
            this.f25136k = uri;
        }
    }

    /* renamed from: o8.k$e */
    /* loaded from: classes7.dex */
    public interface AbstractC11237e {
        /* renamed from: a */
        void mo10372a(C11220g gVar);
    }

    /* renamed from: a */
    void mo10386a(AbstractC11234b bVar);

    /* renamed from: b */
    void mo10385b(Uri uri);

    /* renamed from: c */
    long mo10384c();

    /* renamed from: d */
    C11217f mo10383d();

    /* renamed from: e */
    void mo10382e(Uri uri);

    /* renamed from: f */
    boolean mo10381f(Uri uri);

    /* renamed from: g */
    void mo10380g(AbstractC11234b bVar);

    /* renamed from: h */
    boolean mo10379h();

    /* renamed from: j */
    void mo10378j();

    /* renamed from: l */
    C11220g mo10377l(Uri uri, boolean z);

    /* renamed from: m */
    void mo10376m(Uri uri, AbstractC8233b0.C8234a aVar, AbstractC11237e eVar);

    void stop();
}
