package com.discord.segmented.control;

import com.discord.reactevents.ReactEvents;
import com.discord.segmented.control.events.ValueChangeEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "label", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class SegmentedControlViewManager$createViewInstance$1$1 extends s implements Function2<Integer, String, Unit> {
    final  SegmentedControlView $this_apply;
    final  SegmentedControlViewManager this$0;

    
    
    public SegmentedControlViewManager$createViewInstance$1$1(SegmentedControlViewManager segmentedControlViewManager, SegmentedControlView segmentedControlView) {
        super(2);
        this.this$0 = segmentedControlViewManager;
        this.$this_apply = segmentedControlView;
    }

    @Override 
    public   Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.f20664a;
    }

    public final void invoke(int i10, String label) {
        ReactEvents reactEvents;
        q.g(label, "label");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$this_apply, new ValueChangeEvent(label, i10));
    }
}
