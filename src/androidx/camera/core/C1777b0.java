package androidx.camera.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p390w.AbstractC13634m0;
import p390w.AbstractC13651p0;

/* renamed from: androidx.camera.core.b0 */
/* loaded from: classes.dex */
final class C1777b0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.b0$a */
    /* loaded from: classes.dex */
    public static final class C1778a implements AbstractC13634m0 {

        /* renamed from: a */
        final List<AbstractC13651p0> f1617a;

        C1778a(List<AbstractC13651p0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f1617a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // p390w.AbstractC13634m0
        /* renamed from: c */
        public List<AbstractC13651p0> mo3159c() {
            return this.f1617a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC13634m0 m39858a(List<AbstractC13651p0> list) {
        return new C1778a(list);
    }

    /* renamed from: b */
    static AbstractC13634m0 m39857b(AbstractC13651p0... p0VarArr) {
        return new C1778a(Arrays.asList(p0VarArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static AbstractC13634m0 m39856c() {
        return m39857b(new AbstractC13651p0.C13652a());
    }
}
