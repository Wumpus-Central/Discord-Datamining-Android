package com.discord.react_gesture_handler.nested_touch;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "", "touchPriority", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "getTouchPriority", "()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "enableHighlight", "", "textView", "Landroid/widget/TextView;", "onClick", "view", "Landroid/view/View;", "onLongClick", "", "TouchPriority", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public interface NestedClickableSpan {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "", "(Ljava/lang/String;I)V", "DEFAULT", "HIGH", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum TouchPriority {
        DEFAULT,
        HIGH
    }

    void enableHighlight(TextView textView);

    TouchPriority getTouchPriority();

    void onClick(View view);

    boolean onLongClick(View view);
}
