package p153i8;

import android.os.Handler;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p193k7.AbstractC9815v;

/* renamed from: i8.u */
/* loaded from: classes7.dex */
public interface AbstractC8299u {

    /* renamed from: i8.u$a */
    /* loaded from: classes7.dex */
    public static final class C8300a extends C8290s {
        public C8300a(Object obj) {
            super(obj);
        }

        /* renamed from: c */
        public C8300a m19992c(Object obj) {
            return new C8300a(super.m20021a(obj));
        }

        public C8300a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public C8300a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C8300a(C8290s sVar) {
            super(sVar);
        }
    }

    /* renamed from: i8.u$b */
    /* loaded from: classes7.dex */
    public interface AbstractC8301b {
        /* renamed from: a */
        void mo19991a(AbstractC8299u uVar, Timeline timeline);
    }

    /* renamed from: b */
    void mo20005b(Handler handler, AbstractC9815v vVar);

    /* renamed from: c */
    MediaItem mo20004c();

    /* renamed from: d */
    void mo20003d(AbstractC8233b0 b0Var);

    /* renamed from: e */
    void mo20002e(AbstractC8301b bVar, AbstractC6795x xVar);

    /* renamed from: f */
    void mo20001f(AbstractC8301b bVar);

    /* renamed from: g */
    void mo20000g(AbstractC8301b bVar);

    /* renamed from: h */
    void mo19999h(Handler handler, AbstractC8233b0 b0Var);

    /* renamed from: l */
    void mo19998l(AbstractC8287r rVar);

    /* renamed from: m */
    AbstractC8287r mo19997m(C8300a aVar, AbstractC6765b bVar, long j);

    /* renamed from: n */
    void mo19996n();

    /* renamed from: p */
    boolean mo19995p();

    /* renamed from: q */
    Timeline mo19994q();

    /* renamed from: r */
    void mo19993r(AbstractC8301b bVar);
}
