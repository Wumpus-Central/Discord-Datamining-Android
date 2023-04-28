package p133h9;

import android.view.Surface;
import p439y7.C14287l;
import p439y7.C14288m;

/* renamed from: h9.g */
/* loaded from: classes5.dex */
public class C7951g extends C14287l {

    /* renamed from: m */
    public final int f17080m;

    /* renamed from: n */
    public final boolean f17081n;

    public C7951g(Throwable th2, C14288m mVar, Surface surface) {
        super(th2, mVar);
        boolean z;
        this.f17080m = System.identityHashCode(surface);
        if (surface == null || surface.isValid()) {
            z = true;
        } else {
            z = false;
        }
        this.f17081n = z;
    }
}
