package p072e0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p124h0.C7716a;
import p374v.C13382h;
import p390w.AbstractC13630l2;

/* renamed from: e0.e */
/* loaded from: classes.dex */
public class C6530e implements AbstractC6547n {

    /* renamed from: a */
    private final AdvancedExtenderImpl f13676a;

    /* renamed from: b */
    private String f13677b;

    public C6530e(int i) {
        try {
            if (i == 1) {
                this.f13676a = new BokehAdvancedExtenderImpl();
            } else if (i == 2) {
                this.f13676a = new HdrAdvancedExtenderImpl();
            } else if (i == 3) {
                this.f13676a = new NightAdvancedExtenderImpl();
            } else if (i == 4) {
                this.f13676a = new BeautyAdvancedExtenderImpl();
            } else if (i == 5) {
                this.f13676a = new AutoAdvancedExtenderImpl();
            } else {
                throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
            }
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    /* renamed from: f */
    private List<Pair<Integer, Size[]>> m25363f(Map<Integer, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) map.get(num).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: a */
    public List<Pair<Integer, Size[]>> mo25339a() {
        C2517g.m37587h(this.f13677b, "VendorExtender#init() must be called first");
        return m25363f(this.f13676a.getSupportedCaptureOutputResolutions(this.f13677b));
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: b */
    public List<Pair<Integer, Size[]>> mo25338b() {
        C2517g.m37587h(this.f13677b, "VendorExtender#init() must be called first");
        return m25363f(this.f13676a.getSupportedPreviewOutputResolutions(this.f13677b));
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: c */
    public AbstractC13630l2 mo25337c(Context context) {
        C2517g.m37587h(this.f13677b, "VendorExtender#init() must be called first");
        return new C7716a(this.f13676a.createSessionProcessor(), context);
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: d */
    public boolean mo25336d(String str, Map<String, CameraCharacteristics> map) {
        return this.f13676a.isExtensionAvailable(str, map);
    }

    @Override // p072e0.AbstractC6547n
    /* renamed from: e */
    public void mo25335e(AbstractC1911r rVar) {
        this.f13677b = C13382h.m3786b(rVar).m3783e();
        this.f13676a.init(this.f13677b, C13382h.m3786b(rVar).m3784d());
    }
}
