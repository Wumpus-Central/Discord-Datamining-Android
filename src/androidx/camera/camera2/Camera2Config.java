package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.C1766a0;
import androidx.camera.core.C1909q1;
import androidx.camera.core.C1921t;
import androidx.camera.core.C1933v;
import java.util.Set;
import p288q.C11803d1;
import p288q.C11820g1;
import p288q.C11949y;
import p390w.AbstractC13579c0;
import p390w.AbstractC13584d0;
import p390w.AbstractC13616k0;
import p390w.AbstractC13702y2;

/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements C1766a0.AbstractC1768b {
        @Override // androidx.camera.core.C1766a0.AbstractC1768b
        public C1766a0 getCameraXConfig() {
            return Camera2Config.m39916c();
        }
    }

    /* renamed from: c */
    public static C1766a0 m39916c() {
        AbstractC13584d0.AbstractC13585a aVar = new AbstractC13584d0.AbstractC13585a() { // from class: o.a
            @Override // p390w.AbstractC13584d0.AbstractC13585a
            /* renamed from: a */
            public final AbstractC13584d0 mo3305a(Context context, AbstractC13616k0 k0Var, C1921t tVar) {
                return new C11949y(context, k0Var, tVar);
            }
        };
        AbstractC13579c0.AbstractC13580a bVar = new AbstractC13579c0.AbstractC13580a() { // from class: o.b
            @Override // p390w.AbstractC13579c0.AbstractC13580a
            /* renamed from: a */
            public final AbstractC13579c0 mo3315a(Context context, Object obj, Set set) {
                AbstractC13579c0 d;
                d = Camera2Config.m39915d(context, obj, set);
                return d;
            }
        };
        return new C1766a0.C1767a().m39890c(aVar).m39889d(bVar).m39886g(new AbstractC13702y2.AbstractC13705c() { // from class: o.c
            @Override // p390w.AbstractC13702y2.AbstractC13705c
            /* renamed from: a */
            public final AbstractC13702y2 mo2993a(Context context) {
                AbstractC13702y2 e;
                e = Camera2Config.m39914e(context);
                return e;
            }
        }).m39892a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC13579c0 m39915d(Context context, Object obj, Set set) {
        try {
            return new C11803d1(context, obj, set);
        } catch (C1933v e) {
            throw new C1909q1(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ AbstractC13702y2 m39914e(Context context) {
        return new C11820g1(context);
    }
}
