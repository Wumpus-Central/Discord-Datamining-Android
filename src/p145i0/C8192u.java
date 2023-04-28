package p145i0;

import android.content.Context;
import androidx.camera.core.impl.utils.C1849j;
import androidx.core.content.C2350h;
import androidx.core.util.AbstractC2511b;
import androidx.core.util.C2517g;
import java.util.concurrent.Executor;

/* renamed from: i0.u */
/* loaded from: classes.dex */
public final class C8192u {

    /* renamed from: a */
    private final Context f17713a;

    /* renamed from: b */
    private final C8166o0 f17714b;

    /* renamed from: c */
    private final AbstractC8188s f17715c;

    /* renamed from: d */
    private AbstractC2511b<AbstractC8143i1> f17716d;

    /* renamed from: e */
    private Executor f17717e;

    /* renamed from: f */
    private boolean f17718f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8192u(Context context, C8166o0 o0Var, AbstractC8188s sVar) {
        this.f17713a = C1849j.m39678a(context);
        this.f17714b = o0Var;
        this.f17715c = sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Context m20342a() {
        return this.f17713a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC2511b<AbstractC8143i1> m20341b() {
        return this.f17716d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Executor m20340c() {
        return this.f17717e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC8188s m20339d() {
        return this.f17715c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C8166o0 m20338e() {
        return this.f17714b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m20337f() {
        return this.f17718f;
    }

    /* renamed from: g */
    public C8201x0 m20336g(Executor executor, AbstractC2511b<AbstractC8143i1> bVar) {
        C2517g.m37587h(executor, "Listener Executor can't be null.");
        C2517g.m37587h(bVar, "Event listener can't be null");
        this.f17717e = executor;
        this.f17716d = bVar;
        return this.f17714b.m20413x0(this);
    }

    /* renamed from: h */
    public C8192u m20335h() {
        if (C2350h.m38098b(this.f17713a, "android.permission.RECORD_AUDIO") != -1) {
            C2517g.m37585j(this.f17714b.m20484F(), "The Recorder this recording is associated to doesn't support audio.");
            this.f17718f = true;
            return this;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }
}
