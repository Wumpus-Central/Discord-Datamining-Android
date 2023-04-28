package p380v5;

import p191k5.AbstractC9751c;
import p191k5.C9753e;

/* renamed from: v5.a */
/* loaded from: classes7.dex */
public class C13430a extends AbstractC13432c {

    /* renamed from: m */
    private C9753e f29976m;

    /* renamed from: n */
    private boolean f29977n;

    public C13430a(C9753e eVar) {
        this(eVar, true);
    }

    @Override // p380v5.AbstractC13432c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            C9753e eVar = this.f29976m;
            if (eVar != null) {
                this.f29976m = null;
                eVar.m15434a();
            }
        }
    }

    @Override // p380v5.AbstractC13432c
    /* renamed from: g */
    public synchronized int mo3733g() {
        int i;
        C9753e eVar = this.f29976m;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.m15431d().mo15441g();
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public synchronized int getHeight() {
        int i;
        C9753e eVar = this.f29976m;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.m15431d().getHeight();
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public synchronized int getWidth() {
        int i;
        C9753e eVar = this.f29976m;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.m15431d().getWidth();
        }
        return i;
    }

    @Override // p380v5.AbstractC13432c
    /* renamed from: h */
    public boolean mo3738h() {
        return this.f29977n;
    }

    @Override // p380v5.AbstractC13432c
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f29976m == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: n */
    public synchronized AbstractC9751c m3740n() {
        AbstractC9751c cVar;
        C9753e eVar = this.f29976m;
        if (eVar == null) {
            cVar = null;
        } else {
            cVar = eVar.m15431d();
        }
        return cVar;
    }

    /* renamed from: p */
    public synchronized C9753e m3739p() {
        return this.f29976m;
    }

    public C13430a(C9753e eVar, boolean z) {
        this.f29976m = eVar;
        this.f29977n = z;
    }
}
