package p167j2;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p343t2.C12949j;

/* renamed from: j2.b */
/* loaded from: classes.dex */
public class C9464b {

    /* renamed from: a */
    private final List<C9485u> f20863a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16191a(C9485u uVar) {
        this.f20863a.add(uVar);
    }

    /* renamed from: b */
    public void m16190b(Path path) {
        for (int size = this.f20863a.size() - 1; size >= 0; size--) {
            C12949j.m4970b(path, this.f20863a.get(size));
        }
    }
}
