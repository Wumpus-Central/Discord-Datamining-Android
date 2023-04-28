package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&¨\u0006\r"}, m15073d2 = {"Lcom/otaliastudios/zoom/c;", "", "", "transformation", "gravity", "", "setTransformation", "", "maxZoom", "type", "setMaxZoom", "minZoom", "setMinZoom", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: com.otaliastudios.zoom.c */
/* loaded from: classes6.dex */
public interface AbstractC6108c {

    @Metadata(m15072k = 3, m15071mv = {1, 5, 1}, m15069xi = 48)
    /* renamed from: com.otaliastudios.zoom.c$a */
    /* loaded from: classes6.dex */
    public static final class C6109a {
        /* renamed from: a */
        public static void m26244a(AbstractC6108c cVar, float f) {
            C9971q.m14633g(cVar, "this");
            cVar.setMaxZoom(f, 0);
        }

        /* renamed from: b */
        public static void m26243b(AbstractC6108c cVar, float f) {
            C9971q.m14633g(cVar, "this");
            cVar.setMinZoom(f, 0);
        }

        /* renamed from: c */
        public static void m26242c(AbstractC6108c cVar, int i) {
            C9971q.m14633g(cVar, "this");
            cVar.setTransformation(i, 0);
        }
    }

    void setMaxZoom(float f, int i);

    void setMinZoom(float f, int i);

    void setTransformation(int i, int i2);
}
