package p208l4;

import android.content.Context;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.core.C4908b;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.util.Set;
import p115g5.AbstractC7415b;
import p240n4.AbstractC10713f;
import p277p4.AbstractC11528a;
import p359u3.C13190h;

/* renamed from: l4.d */
/* loaded from: classes7.dex */
public class C10339d implements Supplier<PipelineDraweeControllerBuilder> {

    /* renamed from: a */
    private final Context f22664a;

    /* renamed from: b */
    private final ImagePipeline f22665b;

    /* renamed from: c */
    private final C10340e f22666c;

    /* renamed from: d */
    private final Set<ControllerListener> f22667d;

    /* renamed from: e */
    private final Set<AbstractC7415b> f22668e;

    /* renamed from: f */
    private final AbstractC10713f f22669f;

    public C10339d(Context context, C10337b bVar) {
        this(context, C4908b.m31351l(), bVar);
    }

    /* renamed from: a */
    public PipelineDraweeControllerBuilder get() {
        return new PipelineDraweeControllerBuilder(this.f22664a, this.f22666c, this.f22665b, this.f22667d, this.f22668e).m31960M(this.f22669f);
    }

    public C10339d(Context context, C4908b bVar, C10337b bVar2) {
        this(context, bVar, null, null, bVar2);
    }

    public C10339d(Context context, C4908b bVar, Set<ControllerListener> set, Set<AbstractC7415b> set2, C10337b bVar2) {
        this.f22664a = context;
        ImagePipeline j = bVar.m31353j();
        this.f22665b = j;
        C10340e eVar = new C10340e();
        this.f22666c = eVar;
        eVar.m13581a(context.getResources(), AbstractC11528a.m9451b(), bVar.m31361b(context), C13190h.m4376g(), j.m31481j(), null, null);
        this.f22667d = set;
        this.f22668e = set2;
        this.f22669f = null;
    }
}
