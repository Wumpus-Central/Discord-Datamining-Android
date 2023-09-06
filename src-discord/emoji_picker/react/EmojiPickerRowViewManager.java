package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent;
import com.discord.emoji_picker.react_events.OnPressEmojiEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.EmojiPickerRowViewManagerInterface;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = EmojiPickerRowViewManager.NAME)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/emoji_picker/react/EmojiPickerRowViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/emoji_picker/EmojiPickerRowView;", "Lcom/facebook/react/viewmanagers/EmojiPickerRowViewManagerInterface;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setRowData", "", "view", "data", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "emoji_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmojiPickerRowViewManager extends SimpleViewManager<EmojiPickerRowView> implements EmojiPickerRowViewManagerInterface<EmojiPickerRowView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "EmojiPickerRowView";
    private final ReactEvents reactEvents = new ReactEvents(x.a("onPressEmoji", f0.b(OnPressEmojiEvent.class)), x.a("onLongPressEmoji", f0.b(OnLongPressEmojiEvent.class)));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/emoji_picker/react/EmojiPickerRowViewManager$Companion;", "", "()V", "NAME", "", "emoji_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public EmojiPickerRowView createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        EmojiPickerRowView emojiPickerRowView = new EmojiPickerRowView(reactContext);
        emojiPickerRowView.setOnPressEmoji(new EmojiPickerRowViewManager$createViewInstance$1$1(this, reactContext, emojiPickerRowView));
        emojiPickerRowView.setOnLongPressEmoji(new EmojiPickerRowViewManager$createViewInstance$1$2(this, reactContext, emojiPickerRowView));
        return emojiPickerRowView;
    }

    @ReactProp(name = "rowData")
    public void setRowData(EmojiPickerRowView view, ReadableMap readableMap) {
        q.h(view, "view");
        if (readableMap != null) {
            view.setRowData(EmojiPickerRowDataSerializationUtilsKt.deserializeEmojiPickerRowData(readableMap));
        }
    }
}
