package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.producers.AbstractC5001l0;
import com.facebook.imagepipeline.producers.C5025r0;
import p416x5.AbstractC13937d;

/* renamed from: com.facebook.imagepipeline.datasource.d */
/* loaded from: classes7.dex */
public class C4912d<T> extends AbstractC4909a<T> {
    private C4912d(AbstractC5001l0<T> l0Var, C5025r0 r0Var, AbstractC13937d dVar) {
        super(l0Var, r0Var, dVar);
    }

    /* renamed from: H */
    public static <T> DataSource<T> m31324H(AbstractC5001l0<T> l0Var, C5025r0 r0Var, AbstractC13937d dVar) {
        return new C4912d(l0Var, r0Var, dVar);
    }
}
