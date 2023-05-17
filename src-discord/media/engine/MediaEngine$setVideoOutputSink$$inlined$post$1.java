package com.discord.media.engine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/discord/async_init/AsyncInitDispatcher$post$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaEngine$setVideoOutputSink$$inlined$post$1 extends s implements Function0<Unit> {
    final /* synthetic */ Function1 $callback$inlined;
    final /* synthetic */ String $streamIdentifier$inlined;
    final /* synthetic */ MediaEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngine$setVideoOutputSink$$inlined$post$1(Function1 function1, MediaEngine mediaEngine, String str) {
        super(0);
        this.$callback$inlined = function1;
        this.this$0 = mediaEngine;
        this.$streamIdentifier$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$callback$inlined == null) {
            this.this$0.getEngine().setVideoOutputSink(this.$streamIdentifier$inlined, null);
        } else {
            this.this$0.getEngine().setVideoOutputSink(this.$streamIdentifier$inlined, new MediaEngine$setVideoOutputSink$1$1(this.$callback$inlined));
        }
    }
}
