package p072e0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1915r1;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.core.util.C2517g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p163j$.util.Spliterator;
import p374v.C13382h;
import p390w.AbstractC13630l2;

/* renamed from: e0.g */
/* loaded from: classes.dex */
public class C6532g implements AbstractC6547n {

    /* renamed from: a */
    private final int f13682a;

    /* renamed from: b */
    private PreviewExtenderImpl f13683b;

    /* renamed from: c */
    private ImageCaptureExtenderImpl f13684c;

    /* renamed from: d */
    private AbstractC1911r f13685d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0.g$a */
    /* loaded from: classes.dex */
    public class C6533a implements PreviewExtenderImpl {
        C6533a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0.g$b */
    /* loaded from: classes.dex */
    public class C6534b implements ImageCaptureExtenderImpl {
        C6534b() {
        }
    }

    public C6532g(int i) {
        this.f13682a = i;
        try {
            if (i == 1) {
                this.f13683b = new BokehPreviewExtenderImpl();
                this.f13684c = new BokehImageCaptureExtenderImpl();
            } else if (i == 2) {
                this.f13683b = new HdrPreviewExtenderImpl();
                this.f13684c = new HdrImageCaptureExtenderImpl();
            } else if (i == 3) {
                this.f13683b = new NightPreviewExtenderImpl();
                this.f13684c = new NightImageCaptureExtenderImpl();
            } else if (i == 4) {
                this.f13683b = new BeautyPreviewExtenderImpl();
                this.f13684c = new BeautyImageCaptureExtenderImpl();
            } else if (i == 5) {
                this.f13683b = new AutoPreviewExtenderImpl();
                this.f13684c = new AutoImageCaptureExtenderImpl();
            } else {
                throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
            }
        } catch (NoClassDefFoundError unused) {
            this.f13683b = m25361g();
            this.f13684c = m25362f();
            C1915r1.m39525c("BasicVendorExtender", "OEM implementation for extension mode " + i + "does not exist!");
        }
    }

    /* renamed from: f */
    private ImageCaptureExtenderImpl m25362f() {
        return new C6534b();
    }

    /* renamed from: g */
    private PreviewExtenderImpl m25361g() {
        return new C6533a();
    }

    /* renamed from: h */
    private int m25360h() {
        if (this.f13684c.getCaptureProcessor() != null) {
            return 35;
        }
        return Spliterator.NONNULL;
    }

    /* renamed from: j */
    private Size[] m25358j(int i) {
        return ((StreamConfigurationMap) C13382h.m3786b(this.f13685d).m3785c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i);
    }

    /* renamed from: l */
    private int m25356l() {
        return this.f13683b.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR ? 35 : 34;
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: a */
    public List<Pair<Integer, Size[]>> mo25339a() {
        C2517g.m37587h(this.f13685d, "VendorExtender#init() must be called first");
        if (AbstractC6537j.m25351b().compareTo(AbstractC6548o.f13720l) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f13684c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int h = m25360h();
        return Arrays.asList(new Pair(Integer.valueOf(h), m25358j(h)));
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: b */
    public List<Pair<Integer, Size[]>> mo25338b() {
        C2517g.m37587h(this.f13685d, "VendorExtender#init() must be called first");
        if (AbstractC6537j.m25351b().compareTo(AbstractC6548o.f13720l) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f13683b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int l = m25356l();
        return Arrays.asList(new Pair(Integer.valueOf(l), m25358j(l)));
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: c */
    public AbstractC13630l2 mo25337c(Context context) {
        C2517g.m37587h(this.f13685d, "VendorExtender#init() must be called first");
        return null;
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: d */
    public boolean mo25336d(String str, Map<String, CameraCharacteristics> map) {
        CameraCharacteristics cameraCharacteristics = map.get(str);
        if (!this.f13683b.isExtensionAvailable(str, cameraCharacteristics) || !this.f13684c.isExtensionAvailable(str, cameraCharacteristics)) {
            return false;
        }
        return true;
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: e */
    public void mo25335e(AbstractC1911r rVar) {
        this.f13685d = rVar;
        String e = C13382h.m3786b(rVar).m3783e();
        CameraCharacteristics a = C13382h.m3787a(rVar);
        this.f13683b.init(e, a);
        this.f13684c.init(e, a);
        C1915r1.m39527a("BasicVendorExtender", "Extension init Mode = " + this.f13682a);
        C1915r1.m39527a("BasicVendorExtender", "PreviewExtender processorType= " + this.f13683b.getProcessorType());
        C1915r1.m39527a("BasicVendorExtender", "ImageCaptureExtender processor= " + this.f13684c.getCaptureProcessor());
    }

    /* renamed from: i */
    public ImageCaptureExtenderImpl m25359i() {
        return this.f13684c;
    }

    /* renamed from: k */
    public PreviewExtenderImpl m25357k() {
        return this.f13683b;
    }
}
