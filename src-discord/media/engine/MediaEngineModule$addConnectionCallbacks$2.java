package com.discord.media.engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.media.engine.video.events.PingCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "ping", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "seq", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaEngineModule$addConnectionCallbacks$2 extends s implements Function4<Integer, String, Integer, Integer, Unit> {
    final /* synthetic */ int $connectionId;
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$addConnectionCallbacks$2(MediaEngineModule mediaEngineModule, int i10) {
        super(4);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i10;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, Integer num2, Integer num3) {
        invoke(num.intValue(), str, num2.intValue(), num3.intValue());
        return Unit.f22105a;
    }

    public final void invoke(int i10, String server, int i11, int i12) {
        ReactEvents reactEvents;
        q.g(server, "server");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new PingCallbackEvent(this.$connectionId, i10, server, i11, i12));
    }
}
