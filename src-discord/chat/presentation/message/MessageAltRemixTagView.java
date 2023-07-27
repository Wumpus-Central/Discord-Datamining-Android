package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.databinding.MessageAltRemixTagViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react.utilities.ReactColorToAndroidColorKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import e.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JS\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAltRemixTagView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageAltRemixTagViewBinding;", "configureTagView", "", "tagText", "", "tagTextColor", "", "tagBackgroundColor", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "tagType", "configureTagView-e2j04IU", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;JLjava/lang/String;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageAltRemixTagView extends FrameLayout {
    private final MessageAltRemixTagViewBinding binding;

    
    public MessageAltRemixTagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        q.g(context, "context");
        q.g(attrs, "attrs");
        MessageAltRemixTagViewBinding inflate = MessageAltRemixTagViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView textView = inflate.altRemixTag;
        q.f(textView, "binding.altRemixTag");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        SimpleDraweeView simpleDraweeView = inflate.remixIcon;
        q.f(simpleDraweeView, "binding.remixIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Remix);
    }

    
    public static final void configureTagView_e2j04IU$lambda$0(ChatEventHandler eventHandler, String messageId, long j10, String str, View view) {
        q.g(eventHandler, "$eventHandler");
        q.g(messageId, "$messageId");
        eventHandler.mo176onTapTagEqy5D80(messageId, j10, str);
    }

    
    public final void m211configureTagViewe2j04IU(String str, Integer num, Integer num2, final ChatEventHandler eventHandler, final String messageId, final long j10, final String str2) {
        int i10;
        int i11;
        q.g(eventHandler, "eventHandler");
        q.g(messageId, "messageId");
        if (str != null) {
            this.binding.altRemixTag.setText(str);
            TextView textView = this.binding.altRemixTag;
            if (num != null) {
                i10 = num.intValue();
            } else {
                Context context = getContext();
                q.f(context, "context");
                i10 = ColorUtilsKt.getColorCompat(context, R.color.white);
            }
            textView.setTextColor(i10);
            SimpleDraweeView simpleDraweeView = this.binding.remixIcon;
            q.f(simpleDraweeView, "binding.remixIcon");
            if (num != null) {
                i11 = num.intValue();
            } else {
                Context context2 = getContext();
                q.f(context2, "context");
                i11 = ColorUtilsKt.getColorCompat(context2, R.color.white);
            }
            ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(i11));
            ConstraintLayout constraintLayout = this.binding.layout;
            q.f(constraintLayout, "binding.layout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout, false, new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAltRemixTagView.configureTagView_e2j04IU$lambda$0(ChatEventHandler.this, messageId, j10, str2, view);
                }
            }, 1, null);
            SimpleDraweeView simpleDraweeView2 = this.binding.remixIcon;
            q.f(simpleDraweeView2, "binding.remixIcon");
            simpleDraweeView2.setVisibility(0);
            if (num2 != null) {
                ConstraintLayout constraintLayout2 = this.binding.layout;
                q.f(constraintLayout2, "binding.layout");
                ViewBackgroundUtilsKt.setBackgroundRectangle$default(constraintLayout2, ReactColorToAndroidColorKt.reactColorToAndroidColor(num2.intValue()), SizeUtilsKt.getDpToPx(3), null, 0, 12, null);
                return;
            }
            this.binding.layout.setBackground(a.b(getContext(), R.drawable.drawable_message_author_tag_bg));
        }
    }
}
