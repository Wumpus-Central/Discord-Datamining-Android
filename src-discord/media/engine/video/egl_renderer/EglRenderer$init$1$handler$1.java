package com.discord.media.engine.video.egl_renderer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import org.webrtc.Logging;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EglRenderer$init$1$handler$1 extends s implements Function1<Exception, Unit> {
    final /* synthetic */ EglRenderer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EglRenderer$init$1$handler$1(EglRenderer eglRenderer) {
        super(1);
        this.this$0 = eglRenderer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f20663a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Exception ex) {
        Object obj;
        q.g(ex, "ex");
        Logging.e("EglRenderer", "Exception on EglRenderer thread", ex);
        obj = this.this$0.handlerLock;
        EglRenderer eglRenderer = this.this$0;
        synchronized (obj) {
            eglRenderer.renderThreadHandler = null;
            Unit unit = Unit.f20663a;
        }
    }
}
