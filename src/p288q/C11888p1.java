package p288q;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
import p390w.AbstractC13615k;
import p390w.C13626l;

/* renamed from: q.p1 */
/* loaded from: classes.dex */
final class C11888p1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m8400a(AbstractC13615k kVar) {
        if (kVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m8399b(kVar, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return C11877n0.m8405a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m8399b(AbstractC13615k kVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (kVar instanceof C13626l) {
            for (AbstractC13615k kVar2 : ((C13626l) kVar).m3169d()) {
                m8399b(kVar2, list);
            }
        } else if (kVar instanceof C11884o1) {
            list.add(((C11884o1) kVar).m8401e());
        } else {
            list.add(new C11880n1(kVar));
        }
    }
}
