package p384v9;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC5374b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p384v9.C13456a;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;
import p400w9.AbstractC13829j;

@Deprecated
/* renamed from: v9.f */
/* loaded from: classes5.dex */
public abstract class AbstractC13470f {

    /* renamed from: a */
    private static final Set<AbstractC13470f> f30083a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: v9.f$a */
    /* loaded from: classes5.dex */
    public interface AbstractC13471a extends AbstractC13817d {
    }

    @Deprecated
    /* renamed from: v9.f$b */
    /* loaded from: classes5.dex */
    public interface AbstractC13472b extends AbstractC13825h {
    }

    /* renamed from: c */
    public static Set<AbstractC13470f> m3614c() {
        Set<AbstractC13470f> set = f30083a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C13456a.AbstractC13457b, R extends AbstractC13478k, T extends AbstractC5374b<R, A>> T mo2547a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C13456a.AbstractC13457b, T extends AbstractC5374b<? extends AbstractC13478k, A>> T mo2546b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public Looper mo2545d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public boolean m3613e(AbstractC13829j jVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void m3612f() {
        throw new UnsupportedOperationException();
    }
}
