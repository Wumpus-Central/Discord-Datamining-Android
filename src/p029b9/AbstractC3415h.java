package p029b9;

import com.google.android.exoplayer2.Timeline;
import java.util.List;
import p079e7.C6722k;
import p081e9.AbstractC6769e;
import p153i8.AbstractC8299u;
import p153i8.C8302u0;
import p194k8.AbstractC9827e;
import p194k8.AbstractC9838m;
import p194k8.AbstractC9839n;

/* renamed from: b9.h */
/* loaded from: classes5.dex */
public interface AbstractC3415h extends AbstractC3421k {

    /* renamed from: b9.h$a */
    /* loaded from: classes5.dex */
    public static final class C3416a {

        /* renamed from: a */
        public final C8302u0 f5533a;

        /* renamed from: b */
        public final int[] f5534b;

        /* renamed from: c */
        public final int f5535c;

        /* renamed from: d */
        public final Object f5536d;

        public C3416a(C8302u0 u0Var, int... iArr) {
            this(u0Var, iArr, 0, null);
        }

        public C3416a(C8302u0 u0Var, int[] iArr, int i, Object obj) {
            this.f5533a = u0Var;
            this.f5534b = iArr;
            this.f5535c = i;
            this.f5536d = obj;
        }
    }

    /* renamed from: b9.h$b */
    /* loaded from: classes5.dex */
    public interface AbstractC3417b {
        /* renamed from: a */
        AbstractC3415h[] mo34426a(C3416a[] aVarArr, AbstractC6769e eVar, AbstractC8299u.C8300a aVar, Timeline timeline);
    }

    /* renamed from: a */
    int mo12503a();

    /* renamed from: b */
    boolean mo34435b(int i, long j);

    void disable();

    /* renamed from: e */
    void mo12502e(long j, long j2, long j3, List<? extends AbstractC9838m> list, AbstractC9839n[] nVarArr);

    void enable();

    /* renamed from: f */
    void mo34434f(float f);

    /* renamed from: g */
    Object mo12501g();

    /* renamed from: h */
    void mo34433h();

    /* renamed from: j */
    boolean mo34432j(long j, AbstractC9827e eVar, List<? extends AbstractC9838m> list);

    /* renamed from: m */
    void mo34431m(boolean z);

    /* renamed from: n */
    int mo34430n(long j, List<? extends AbstractC9838m> list);

    /* renamed from: o */
    int mo34429o();

    /* renamed from: p */
    C6722k mo34428p();

    /* renamed from: q */
    int mo12500q();

    /* renamed from: r */
    void mo34427r();
}
