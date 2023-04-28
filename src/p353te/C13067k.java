package p353te;

import androidx.camera.core.C1813g1;
import androidx.camera.core.C1872j1;
import androidx.camera.core.ImageProxy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m15073d2 = {"Lte/k;", "Landroidx/camera/core/g1$i;", "Landroidx/camera/core/ImageProxy;", "image", "", "a", "Landroidx/camera/core/j1;", "exception", "b", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: te.k */
/* loaded from: classes6.dex */
public final class C13067k extends C1813g1.AbstractC1825i {

    /* renamed from: a */
    final /* synthetic */ Continuation<ImageProxy> f29371a;

    /* JADX WARN: Multi-variable type inference failed */
    public C13067k(Continuation<? super ImageProxy> continuation) {
        this.f29371a = continuation;
    }

    @Override // androidx.camera.core.C1813g1.AbstractC1825i
    /* renamed from: a */
    public void mo4663a(ImageProxy image) {
        C9971q.m14633g(image, "image");
        super.mo4663a(image);
        this.f29371a.resumeWith(C11090s.m10940b(image));
    }

    @Override // androidx.camera.core.C1813g1.AbstractC1825i
    /* renamed from: b */
    public void mo4662b(C1872j1 exception) {
        C9971q.m14633g(exception, "exception");
        super.mo4662b(exception);
        Continuation<ImageProxy> continuation = this.f29371a;
        C11090s.C11091a aVar = C11090s.f24606l;
        continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(exception)));
    }
}
