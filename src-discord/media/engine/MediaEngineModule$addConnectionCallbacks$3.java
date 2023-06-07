package com.discord.media.engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.media.engine.video.events.PingTimeoutCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "", "seq", "timeout", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaEngineModule$addConnectionCallbacks$3 extends s implements Function4<String, Integer, Integer, Integer, Unit> {
    final /* synthetic */ int $connectionId;
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$addConnectionCallbacks$3(MediaEngineModule mediaEngineModule, int i10) {
        super(4);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i10;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Integer num2, Integer num3) {
        invoke(str, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f22063a;
    }

    public final void invoke(String server, int i10, int i11, int i12) {
        ReactEvents reactEvents;
        q.g(server, "server");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new PingTimeoutCallbackEvent(this.$connectionId, server, i10, i11, i12));
    }
}
