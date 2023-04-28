package p124h0;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h0.f */
/* loaded from: classes.dex */
class C7723f {

    /* renamed from: e */
    private static AtomicInteger f16752e = new AtomicInteger(0);

    /* renamed from: a */
    private C7726c f16753a;

    /* renamed from: b */
    private int f16754b;

    /* renamed from: c */
    private String f16755c;

    /* renamed from: d */
    private List<AbstractC7722e> f16756d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7724a extends C7726c implements AbstractC7731i {
        /* renamed from: g */
        static AbstractC7724a m21569g(Size size, int i, int i2) {
            return new C7719b(size, i, i2);
        }

        /* renamed from: a */
        public abstract int mo21553a();

        /* renamed from: b */
        public abstract int mo21552b();

        public abstract Size getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.f$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7725b extends C7726c implements AbstractC7732j {
        /* renamed from: g */
        static AbstractC7725b m21566g(int i, int i2) {
            return new C7720c(i, i2);
        }

        /* renamed from: a */
        public abstract int mo21568a();

        /* renamed from: b */
        public abstract int mo21567b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.f$c */
    /* loaded from: classes.dex */
    public static class C7726c implements AbstractC7722e {

        /* renamed from: a */
        private int f16757a = -1;

        /* renamed from: b */
        private int f16758b = 0;

        /* renamed from: c */
        private String f16759c = null;

        /* renamed from: d */
        private List<AbstractC7722e> f16760d = Collections.emptyList();

        C7726c() {
        }

        /* renamed from: c */
        public void m21565c(int i) {
            this.f16757a = i;
        }

        /* renamed from: d */
        public void m21564d(String str) {
            this.f16759c = str;
        }

        /* renamed from: e */
        public void m21563e(int i) {
            this.f16758b = i;
        }

        /* renamed from: f */
        public void m21562f(List<AbstractC7722e> list) {
            this.f16760d = list;
        }

        @Override // p124h0.AbstractC7722e
        public int getId() {
            return this.f16757a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.f$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7727d extends C7726c implements AbstractC7735m {
        /* renamed from: g */
        static AbstractC7727d m21561g(Surface surface) {
            return new C7721d(surface);
        }

        public abstract Surface getSurface();
    }

    private C7723f(C7726c cVar) {
        this.f16753a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C7723f m21571b(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        C7726c cVar;
        if (camera2OutputConfigImpl instanceof SurfaceOutputConfigImpl) {
            cVar = AbstractC7727d.m21561g(((SurfaceOutputConfigImpl) camera2OutputConfigImpl).getSurface());
        } else if (camera2OutputConfigImpl instanceof ImageReaderOutputConfigImpl) {
            ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            cVar = AbstractC7724a.m21569g(imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        } else if (camera2OutputConfigImpl instanceof MultiResolutionImageReaderOutputConfigImpl) {
            MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            cVar = AbstractC7725b.m21566g(multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
        } else {
            cVar = null;
        }
        cVar.m21564d(camera2OutputConfigImpl.getPhysicalCameraId());
        cVar.m21563e(camera2OutputConfigImpl.getSurfaceGroupId());
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            ArrayList arrayList = new ArrayList();
            for (Camera2OutputConfigImpl camera2OutputConfigImpl2 : camera2OutputConfigImpl.getSurfaceSharingOutputConfigs()) {
                arrayList.add(m21571b(camera2OutputConfigImpl2).m21572a());
            }
            cVar.m21562f(arrayList);
        }
        return new C7723f(cVar);
    }

    /* renamed from: c */
    private int m21570c() {
        return f16752e.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC7722e m21572a() {
        this.f16753a.m21565c(m21570c());
        this.f16753a.m21564d(this.f16755c);
        this.f16753a.m21563e(this.f16754b);
        List<AbstractC7722e> list = this.f16756d;
        if (list != null) {
            this.f16753a.m21562f(list);
        }
        return this.f16753a;
    }
}
