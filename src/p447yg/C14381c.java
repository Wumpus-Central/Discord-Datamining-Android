package p447yg;

import bh.C3498e;
import java.util.Map;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p013ah.C1399g;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6891d;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p267of.C11289v;
import p427xg.C14108b0;
import pg.AbstractC11666c;

/* renamed from: yg.c */
/* loaded from: classes8.dex */
public final class C14381c {

    /* renamed from: a */
    public static final C14381c f32552a = new C14381c();

    /* renamed from: b */
    private static final C11142f f32553b;

    /* renamed from: c */
    private static final C11142f f32554c;

    /* renamed from: d */
    private static final C11142f f32555d;

    /* renamed from: e */
    private static final Map<C11137c, C11137c> f32556e;

    static {
        Map<C11137c, C11137c> k;
        C11142f f = C11142f.m10767f("message");
        C9971q.m14634f(f, "identifier(\"message\")");
        f32553b = f;
        C11142f f2 = C11142f.m10767f("allowedTargets");
        C9971q.m14634f(f2, "identifier(\"allowedTargets\")");
        f32554c = f2;
        C11142f f3 = C11142f.m10767f("value");
        C9971q.m14634f(f3, "identifier(\"value\")");
        f32555d = f3;
        k = C11289v.m10248k(C11098x.m10921a(C10434k.C10435a.f38779H, C14108b0.f31849d), C11098x.m10921a(C10434k.C10435a.f38786L, C14108b0.f31851f), C11098x.m10921a(C10434k.C10435a.f38790P, C14108b0.f31854i));
        f32556e = k;
    }

    private C14381c() {
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC11666c m714f(C14381c cVar, AbstractC6885a aVar, C1399g gVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return cVar.m715e(aVar, gVar, z);
    }

    /* renamed from: a */
    public final AbstractC11666c m719a(C11137c kotlinName, AbstractC6891d annotationOwner, C1399g c) {
        AbstractC6885a c2;
        C9971q.m14633g(kotlinName, "kotlinName");
        C9971q.m14633g(annotationOwner, "annotationOwner");
        C9971q.m14633g(c, "c");
        if (C9971q.m14638b(kotlinName, C10434k.C10435a.f22948y)) {
            C11137c DEPRECATED_ANNOTATION = C14108b0.f31853h;
            C9971q.m14634f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            AbstractC6885a c3 = annotationOwner.mo3966c(DEPRECATED_ANNOTATION);
            if (c3 != null || annotationOwner.mo3971D()) {
                return new C14384e(c3, c);
            }
        }
        C11137c cVar = f32556e.get(kotlinName);
        if (cVar == null || (c2 = annotationOwner.mo3966c(cVar)) == null) {
            return null;
        }
        return m714f(f32552a, c2, c, false, 4, null);
    }

    /* renamed from: b */
    public final C11142f m718b() {
        return f32553b;
    }

    /* renamed from: c */
    public final C11142f m717c() {
        return f32555d;
    }

    /* renamed from: d */
    public final C11142f m716d() {
        return f32554c;
    }

    /* renamed from: e */
    public final AbstractC11666c m715e(AbstractC6885a annotation, C1399g c, boolean z) {
        C9971q.m14633g(annotation, "annotation");
        C9971q.m14633g(c, "c");
        C11136b k = annotation.mo4039k();
        if (C9971q.m14638b(k, C11136b.m10805m(C14108b0.f31849d))) {
            return new C14392i(annotation, c);
        }
        if (C9971q.m14638b(k, C11136b.m10805m(C14108b0.f31851f))) {
            return new C14390h(annotation, c);
        }
        if (C9971q.m14638b(k, C11136b.m10805m(C14108b0.f31854i))) {
            return new C14379b(c, annotation, C10434k.C10435a.f38790P);
        }
        if (C9971q.m14638b(k, C11136b.m10805m(C14108b0.f31853h))) {
            return null;
        }
        return new C3498e(c, annotation, z);
    }
}
