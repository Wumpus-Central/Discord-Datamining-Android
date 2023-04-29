package com.discord.media.engine;

import com.discord.media.engine.video.events.ActiveSinksChangeEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "streamId", "", AppStateModule.APP_STATE_ACTIVE, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MediaEngineModule$initialize$3 extends s implements Function2<String, Boolean, Unit> {
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$initialize$3(MediaEngineModule mediaEngineModule) {
        super(2);
        this.this$0 = mediaEngineModule;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.f22042a;
    }

    public final void invoke(String streamId, boolean z10) {
        ReactEvents reactEvents;
        q.g(streamId, "streamId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new ActiveSinksChangeEvent(streamId, z10));
    }
}
