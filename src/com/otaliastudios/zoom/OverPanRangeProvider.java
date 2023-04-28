package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, m15073d2 = {"Lcom/otaliastudios/zoom/OverPanRangeProvider;", "", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "horizontal", "", "a", "b", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface OverPanRangeProvider {

    /* renamed from: a */
    public static final C6090b f12378a = C6090b.f12381a;

    /* renamed from: b */
    public static final OverPanRangeProvider f12379b = new C6089a();

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m15073d2 = {"com/otaliastudios/zoom/OverPanRangeProvider$a", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "horizontal", "", "a", "c", "F", "DEFAULT_OVERPAN_FACTOR", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.OverPanRangeProvider$a */
    /* loaded from: classes6.dex */
    public static final class C6089a implements OverPanRangeProvider {

        /* renamed from: c */
        private final float f12380c = 0.1f;

        C6089a() {
        }

        @Override // com.otaliastudios.zoom.OverPanRangeProvider
        /* renamed from: a */
        public float mo26352a(ZoomEngine engine, boolean z) {
            float u;
            float f;
            C9971q.m14633g(engine, "engine");
            if (z) {
                u = engine.m26271v();
                f = this.f12380c;
            } else if (!z) {
                u = engine.m26273u();
                f = this.f12380c;
            } else {
                throw new C11088q();
            }
            return u * f;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, m15073d2 = {"Lcom/otaliastudios/zoom/OverPanRangeProvider$b;", "", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "DEFAULT", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.OverPanRangeProvider$b */
    /* loaded from: classes6.dex */
    public static final class C6090b {

        /* renamed from: a */
        static final /* synthetic */ C6090b f12381a = new C6090b();

        private C6090b() {
        }
    }

    /* renamed from: a */
    float mo26352a(ZoomEngine zoomEngine, boolean z);
}
