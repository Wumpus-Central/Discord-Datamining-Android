package p288q;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1909q1;
import androidx.camera.core.C1921t;
import androidx.camera.core.C1933v;
import com.discord.nearby.NearbyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p308r.C12275i;
import p308r.C12306v0;
import p390w.AbstractC13589e0;

/* renamed from: q.k1 */
/* loaded from: classes.dex */
class C11858k1 {
    /* renamed from: a */
    private static String m8448a(C12306v0 v0Var, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains(NearbyManager.PERMISSION_DENIED)) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) v0Var.m7180c("0").m7252a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return NearbyManager.PERMISSION_DENIED;
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) v0Var.m7180c(NearbyManager.PERMISSION_DENIED).m7252a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<String> m8447b(C11949y yVar, C1921t tVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(yVar.mo3306c().m7179d());
            if (tVar == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
                return arrayList;
            }
            try {
                str = m8448a(yVar.mo3306c(), tVar.m39512d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : asList) {
                if (!str3.equals(str)) {
                    arrayList2.add(yVar.m8153e(str3));
                }
            }
            Iterator<AbstractC1911r> it = tVar.m39514b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC13589e0) it.next()).mo3297b());
            }
            return arrayList;
        } catch (C1933v e) {
            throw new C1909q1(e);
        } catch (C12275i e2) {
            throw new C1909q1(C11874m1.m8406a(e2));
        }
    }
}
