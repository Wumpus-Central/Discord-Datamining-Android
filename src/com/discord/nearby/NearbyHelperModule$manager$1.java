package com.discord.nearby;

import com.discord.nearby.reactevents.OnNearbyMessageReceivedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class NearbyHelperModule$manager$1 extends AbstractC9973s implements Function1<String, Unit> {
    final /* synthetic */ NearbyHelperModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyHelperModule$manager$1(NearbyHelperModule nearbyHelperModule) {
        super(1);
        this.this$0 = nearbyHelperModule;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        C9971q.m14633g(it, "it");
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new OnNearbyMessageReceivedEvent(it));
    }
}
