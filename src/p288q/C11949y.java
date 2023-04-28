package p288q;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.C1909q1;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1921t;
import com.discord.nearby.NearbyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p308r.C12275i;
import p308r.C12306v0;
import p390w.AbstractC13584d0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13616k0;
import p390w.C13610j0;

/* renamed from: q.y */
/* loaded from: classes.dex */
public final class C11949y implements AbstractC13584d0 {

    /* renamed from: a */
    private final AbstractC13616k0 f26746a;

    /* renamed from: c */
    private final C12306v0 f26748c;

    /* renamed from: d */
    private final List<String> f26749d;

    /* renamed from: e */
    private final Map<String, C11872m0> f26750e = new HashMap();

    /* renamed from: b */
    private final C13610j0 f26747b = new C13610j0(1);

    public C11949y(Context context, AbstractC13616k0 k0Var, C1921t tVar) {
        this.f26746a = k0Var;
        this.f26748c = C12306v0.m7181b(context, k0Var.mo3210c());
        this.f26749d = m8154d(C11858k1.m8447b(this, tVar));
    }

    /* renamed from: d */
    private List<String> m8154d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals(NearbyManager.PERMISSION_DENIED)) {
                arrayList.add(str);
            } else if (m8151g(str)) {
                arrayList.add(str);
            } else {
                C1915r1.m39527a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private boolean m8151g(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f26748c.m7180c(str).m7252a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C12275i e) {
            throw new C1909q1(C11874m1.m8406a(e));
        }
    }

    @Override // p390w.AbstractC13584d0
    /* renamed from: a */
    public AbstractC13597g0 mo3308a(String str) {
        if (this.f26749d.contains(str)) {
            return new C11840j0(this.f26748c, str, m8153e(str), this.f26747b, this.f26746a.mo3211b(), this.f26746a.mo3210c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // p390w.AbstractC13584d0
    /* renamed from: b */
    public Set<String> mo3307b() {
        return new LinkedHashSet(this.f26749d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C11872m0 m8153e(String str) {
        try {
            C11872m0 m0Var = this.f26750e.get(str);
            if (m0Var != null) {
                return m0Var;
            }
            C11872m0 m0Var2 = new C11872m0(str, this.f26748c);
            this.f26750e.put(str, m0Var2);
            return m0Var2;
        } catch (C12275i e) {
            throw C11874m1.m8406a(e);
        }
    }

    /* renamed from: f */
    public C12306v0 mo3306c() {
        return this.f26748c;
    }
}
