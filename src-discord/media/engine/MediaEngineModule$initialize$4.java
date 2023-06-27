package com.discord.media.engine;

import com.discord.media.engine.video.events.DeviceChangedEvent;
import com.discord.reactevents.ReactEvents;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "inputDevices", "", "", "", "", "outputDevices", "videoInputDevices", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class MediaEngineModule$initialize$4 extends s implements Function3<List<? extends Map<String, ? extends Object>>, List<? extends Map<String, ? extends Object>>, List<? extends Map<String, ? extends Object>>, Unit> {
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$initialize$4(MediaEngineModule mediaEngineModule) {
        super(3);
        this.this$0 = mediaEngineModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        invoke2(list, list2, list3);
        return Unit.f20685a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Map<String, ? extends Object>> inputDevices, List<? extends Map<String, ? extends Object>> outputDevices, List<? extends Map<String, ? extends Object>> videoInputDevices) {
        ReactEvents reactEvents;
        q.g(inputDevices, "inputDevices");
        q.g(outputDevices, "outputDevices");
        q.g(videoInputDevices, "videoInputDevices");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new DeviceChangedEvent(inputDevices, outputDevices, videoInputDevices));
    }
}
