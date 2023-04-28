package p353te;

import android.annotation.SuppressLint;
import androidx.camera.core.AbstractC1906q;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1902p;
import androidx.camera.core.C1921t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p374v.C13382h;
import p390w.AbstractC13586d1;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, m15073d2 = {"Landroidx/camera/core/t$a;", "", "cameraId", "b", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.e */
/* loaded from: classes6.dex */
public final class C13061e {
    @SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: b */
    public static final C1921t.C1922a m4672b(C1921t.C1922a aVar, final String cameraId) {
        C9971q.m14633g(aVar, "<this>");
        C9971q.m14633g(cameraId, "cameraId");
        C1921t.C1922a a = aVar.m39510a(new AbstractC1906q() { // from class: te.d
            @Override // androidx.camera.core.AbstractC1906q
            /* renamed from: a */
            public /* synthetic */ AbstractC13586d1 mo3124a() {
                return C1902p.m39563a(this);
            }

            @Override // androidx.camera.core.AbstractC1906q
            /* renamed from: b */
            public final List mo3123b(List list) {
                List c;
                c = C13061e.m4671c(cameraId, list);
                return c;
            }
        });
        C9971q.m14634f(a, "this.addCameraFilter { c…r false\n      }\n    }\n  }");
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final List m4671c(String cameraId, List cameras) {
        boolean z;
        C9971q.m14633g(cameraId, "$cameraId");
        C9971q.m14633g(cameras, "cameras");
        ArrayList arrayList = new ArrayList();
        for (Object obj : cameras) {
            try {
                C13382h b = C13382h.m3786b((AbstractC1911r) obj);
                C9971q.m14634f(b, "from(cameraInfoX)");
                z = C9971q.m14638b(b.m3783e(), cameraId);
            } catch (IllegalArgumentException unused) {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
