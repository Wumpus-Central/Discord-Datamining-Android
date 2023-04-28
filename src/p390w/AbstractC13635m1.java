package p390w;

import android.view.Surface;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* renamed from: w.m1 */
/* loaded from: classes.dex */
public interface AbstractC13635m1 {

    /* renamed from: w.m1$a */
    /* loaded from: classes.dex */
    public interface AbstractC13636a {
        /* renamed from: a */
        void mo3152a(AbstractC13635m1 m1Var);
    }

    /* renamed from: a */
    int mo3158a();

    /* renamed from: b */
    int mo3157b();

    void close();

    /* renamed from: d */
    ImageProxy mo3156d();

    /* renamed from: e */
    void mo3155e();

    /* renamed from: f */
    void mo3154f(AbstractC13636a aVar, Executor executor);

    /* renamed from: g */
    ImageProxy mo3153g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
