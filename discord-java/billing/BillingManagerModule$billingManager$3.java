package com.discord.billing;

import com.discord.billing.react.events.BillingManagerDowngradeCommand;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "downgradeCommand", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BillingManagerModule$billingManager$3 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ ReactApplicationContext $reactContext;
    final /* synthetic */ BillingManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule$billingManager$3(BillingManagerModule billingManagerModule, ReactApplicationContext reactApplicationContext) {
        super(1);
        this.this$0 = billingManagerModule;
        this.$reactContext = reactApplicationContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f22042a;
    }

    public final void invoke(int i10) {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.$reactContext, new BillingManagerDowngradeCommand(i10));
    }
}
