package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C1936v2;
import p120gc.AbstractFutureC7576b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.m */
/* loaded from: classes.dex */
public abstract class AbstractC2073m {

    /* renamed from: a */
    Size f2364a;

    /* renamed from: b */
    FrameLayout f2365b;

    /* renamed from: c */
    private final C2059f f2366c;

    /* renamed from: d */
    private boolean f2367d = false;

    /* renamed from: androidx.camera.view.m$a */
    /* loaded from: classes.dex */
    interface AbstractC2074a {
        /* renamed from: a */
        void mo39117a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2073m(FrameLayout frameLayout, C2059f fVar) {
        this.f2365b = frameLayout;
        this.f2366c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m39120a() {
        Bitmap c = mo39112c();
        if (c == null) {
            return null;
        }
        return this.f2366c.m39153a(c, new Size(this.f2365b.getWidth(), this.f2365b.getHeight()), this.f2365b.getLayoutDirection());
    }

    /* renamed from: b */
    abstract View mo39113b();

    /* renamed from: c */
    abstract Bitmap mo39112c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo39111d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo39110e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39119f() {
        this.f2367d = true;
        m39118h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo39109g(C1936v2 v2Var, AbstractC2074a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m39118h() {
        View b = mo39113b();
        if (b != null && this.f2367d) {
            this.f2366c.m39138p(new Size(this.f2365b.getWidth(), this.f2365b.getHeight()), this.f2365b.getLayoutDirection(), b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract AbstractFutureC7576b<Void> mo39108i();
}
