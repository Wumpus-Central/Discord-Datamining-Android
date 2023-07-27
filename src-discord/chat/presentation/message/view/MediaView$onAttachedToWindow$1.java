package com.discord.chat.presentation.message.view;

import com.discord.portals.PortalViewContextManager;
import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$1", f = "MediaView.kt", l = {127}, m = "invokeSuspend")

final class MediaView$onAttachedToWindow$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final  MediaView this$0;

    
    
    public MediaView$onAttachedToWindow$1(MediaView mediaView, Continuation<? super MediaView$onAttachedToWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaView;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaView$onAttachedToWindow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaView$onAttachedToWindow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20670a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            Flow<PortalViewContextManager.Event> portalContextIdsFlow = PortalViewContextManager.INSTANCE.getPortalContextIdsFlow();
            final MediaView mediaView = this.this$0;
            FlowCollector<? super PortalViewContextManager.Event> flowCollector = new FlowCollector() { 
                @Override 
                public   Object emit(Object obj2, Continuation continuation) {
                    return emit((PortalViewContextManager.Event) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(PortalViewContextManager.Event event, Continuation<? super Unit> continuation) {
                    MediaView.setMediaData$default(MediaView.this, null, false, false, false, null, false, null, event, false, false, false, 1919, null);
                    return Unit.f20670a;
                }
            };
            this.label = 1;
            if (portalContextIdsFlow.collect(flowCollector, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f20670a;
    }
}
