package ug;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6889c;
import p249nh.C11142f;

/* renamed from: ug.g */
/* loaded from: classes8.dex */
public final class C13289g extends AbstractC13287f implements AbstractC6889c {

    /* renamed from: c */
    private final Annotation f29832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13289g(C11142f fVar, Annotation annotation) {
        super(fVar, null);
        C9971q.m14633g(annotation, "annotation");
        this.f29832c = annotation;
    }

    @Override // p086eh.AbstractC6889c
    /* renamed from: a */
    public AbstractC6885a mo4035a() {
        return new C13286e(this.f29832c);
    }
}
