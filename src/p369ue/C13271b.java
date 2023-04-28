package p369ue;

import com.otaliastudios.zoom.ZoomEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lue/b;", "", "", "c", "()V", "b", "Lcom/otaliastudios/zoom/ZoomEngine$c;", "listener", "a", "(Lcom/otaliastudios/zoom/ZoomEngine$c;)V", "Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "Ljava/util/List;", "listeners", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: ue.b */
/* loaded from: classes6.dex */
public final class C13271b {

    /* renamed from: a */
    private final ZoomEngine f29795a;

    /* renamed from: b */
    private final List<ZoomEngine.AbstractC6097c> f29796b = new ArrayList();

    public C13271b(ZoomEngine engine) {
        C9971q.m14633g(engine, "engine");
        this.f29795a = engine;
    }

    /* renamed from: a */
    public final void m4089a(ZoomEngine.AbstractC6097c listener) {
        C9971q.m14633g(listener, "listener");
        if (!this.f29796b.contains(listener)) {
            this.f29796b.add(listener);
        }
    }

    /* renamed from: b */
    public final void m4088b() {
        for (ZoomEngine.AbstractC6097c cVar : this.f29796b) {
            cVar.onIdle(this.f29795a);
        }
    }

    /* renamed from: c */
    public final void m4087c() {
        for (ZoomEngine.AbstractC6097c cVar : this.f29796b) {
            ZoomEngine zoomEngine = this.f29795a;
            cVar.onUpdate(zoomEngine, zoomEngine.m26268y());
        }
    }
}
