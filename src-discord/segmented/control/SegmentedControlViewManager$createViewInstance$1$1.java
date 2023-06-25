package com.discord.segmented.control;

import com.discord.reactevents.ReactEvents;
import com.discord.segmented.control.events.ValueChangeEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "label", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SegmentedControlViewManager$createViewInstance$1$1 extends s implements Function2<Integer, String, Unit> {
    final /* synthetic */ SegmentedControlView $this_apply;
    final /* synthetic */ SegmentedControlViewManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedControlViewManager$createViewInstance$1$1(SegmentedControlViewManager segmentedControlViewManager, SegmentedControlView segmentedControlView) {
        super(2);
        this.this$0 = segmentedControlViewManager;
        this.$this_apply = segmentedControlView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.f20684a;
    }

    public final void invoke(int i10, String label) {
        ReactEvents reactEvents;
        q.g(label, "label");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$this_apply, new ValueChangeEvent(label, i10));
    }
}
