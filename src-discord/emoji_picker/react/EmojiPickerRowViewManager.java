package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent;
import com.discord.emoji_picker.react_events.OnPressEmojiEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import ff.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/emoji_picker/react/EmojiPickerRowViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/emoji_picker/EmojiPickerRowView;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setRowData", "", "view", "data", "Lcom/facebook/react/bridge/ReadableMap;", "emoji_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmojiPickerRowViewManager extends SimpleViewManager<EmojiPickerRowView> {
    private final ReactEvents reactEvents = new ReactEvents(x.a("onPressEmoji", f0.b(OnPressEmojiEvent.class)), x.a("onLongPressEmoji", f0.b(OnLongPressEmojiEvent.class)));

    @Override 
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override 
    public String getName() {
        return "EmojiPickerRowView";
    }

    @ReactProp(name = "rowData")
    public final void setRowData(EmojiPickerRowView view, ReadableMap data) {
        q.g(view, "view");
        q.g(data, "data");
        view.setRowData(EmojiPickerRowDataSerializationUtilsKt.deserializeEmojiPickerRowData(data));
    }

    
    @Override 
    public EmojiPickerRowView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        EmojiPickerRowView emojiPickerRowView = new EmojiPickerRowView(reactContext);
        emojiPickerRowView.setOnPressEmoji(new EmojiPickerRowViewManager$createViewInstance$1$1(this, emojiPickerRowView));
        emojiPickerRowView.setOnLongPressEmoji(new EmojiPickerRowViewManager$createViewInstance$1$2(this, emojiPickerRowView));
        return emojiPickerRowView;
    }
}
