package com.discord.sticker_picker.react;

import com.discord.reactevents.ReactEvents;
import com.discord.sticker_picker.StickerPickerRowView;
import com.discord.sticker_picker.react_events.OnPressStickerEvent;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "stickerId", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class StickerPickerRowViewManager$createViewInstance$1$1 extends s implements Function1<String, Unit> {
    final  ThemedReactContext $reactContext;
    final  StickerPickerRowView $view;
    final  StickerPickerRowViewManager this$0;

    
    
    public StickerPickerRowViewManager$createViewInstance$1$1(StickerPickerRowViewManager stickerPickerRowViewManager, ThemedReactContext themedReactContext, StickerPickerRowView stickerPickerRowView) {
        super(1);
        this.this$0 = stickerPickerRowViewManager;
        this.$reactContext = themedReactContext;
        this.$view = stickerPickerRowView;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f20664a;
    }

    
    public final void invoke2(String stickerId) {
        ReactEvents reactEvents;
        q.g(stickerId, "stickerId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$reactContext, this.$view, new OnPressStickerEvent(stickerId));
    }
}
