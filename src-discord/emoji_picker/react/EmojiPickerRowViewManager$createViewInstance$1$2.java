package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "emojiName", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class EmojiPickerRowViewManager$createViewInstance$1$2 extends s implements Function1<String, Unit> {
    final  ThemedReactContext $reactContext;
    final  EmojiPickerRowView $view;
    final  EmojiPickerRowViewManager this$0;

    
    
    public EmojiPickerRowViewManager$createViewInstance$1$2(EmojiPickerRowViewManager emojiPickerRowViewManager, ThemedReactContext themedReactContext, EmojiPickerRowView emojiPickerRowView) {
        super(1);
        this.this$0 = emojiPickerRowViewManager;
        this.$reactContext = themedReactContext;
        this.$view = emojiPickerRowView;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21601a;
    }

    
    public final void invoke2(String emojiName) {
        ReactEvents reactEvents;
        q.h(emojiName, "emojiName");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$reactContext, this.$view, new OnLongPressEmojiEvent(emojiName));
    }
}
