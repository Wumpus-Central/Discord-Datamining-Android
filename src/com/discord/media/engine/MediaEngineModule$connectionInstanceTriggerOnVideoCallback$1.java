package com.discord.media.engine;

import com.discord.media.engine.video.events.OnVideoCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\n¢\u0006\u0002\b\t"}, m15073d2 = {"<anonymous>", "", "userId", "", "ssrc", "", "Lcom/discord/media/engine/types/SSRC64;", "streamId", "videoStreamParametersJSON", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1 extends AbstractC9973s implements Function4<String, Long, String, String, Unit> {
    final /* synthetic */ int $connectionId;
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1(MediaEngineModule mediaEngineModule, int i) {
        super(4);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(String str, Long l, String str2, String str3) {
        invoke(str, l.longValue(), str2, str3);
        return Unit.f22042a;
    }

    public final void invoke(String userId, long j, String streamId, String videoStreamParametersJSON) {
        ReactEvents reactEvents;
        C9971q.m14633g(userId, "userId");
        C9971q.m14633g(streamId, "streamId");
        C9971q.m14633g(videoStreamParametersJSON, "videoStreamParametersJSON");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new OnVideoCallbackEvent(this.$connectionId, userId, j, streamId, videoStreamParametersJSON));
    }
}
