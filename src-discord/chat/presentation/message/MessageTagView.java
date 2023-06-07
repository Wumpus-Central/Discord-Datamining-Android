package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.databinding.MessageTagViewBinding;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J;\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/MessageTagView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageTagViewBinding;", "configureTagView", "", "tagText", "", "isVerifiedBot", "", "tagBackgroundColor", "", "opTagText", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageTagView extends FrameLayout {
    private final MessageTagViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        q.g(context, "context");
        q.g(attrs, "attrs");
        MessageTagViewBinding inflate = MessageTagViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView textView = inflate.tag;
        q.f(textView, "binding.tag");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        SimpleDraweeView simpleDraweeView = inflate.verifiedBotIcon;
        q.f(simpleDraweeView, "binding.verifiedBotIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Check);
        SimpleDraweeView simpleDraweeView2 = inflate.verifiedBotIcon;
        q.f(simpleDraweeView2, "binding.verifiedBotIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, (Integer) (-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureTagView$lambda$0(ChatEventHandler eventHandler, View view) {
        q.g(eventHandler, "$eventHandler");
        eventHandler.onTapOpTag();
    }

    public final void configureTagView(String str, Boolean bool, Integer num, String str2, final ChatEventHandler eventHandler) {
        q.g(eventHandler, "eventHandler");
        int i10 = 8;
        if (str != null) {
            this.binding.tag.setText(str);
            TextView textView = this.binding.tag;
            Context context = getContext();
            q.f(context, "context");
            textView.setTextColor(ColorUtilsKt.getColorCompat(context, R.color.white));
            ConstraintLayout constraintLayout = this.binding.layout;
            q.f(constraintLayout, "binding.layout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout, false, null, 1, null);
            SimpleDraweeView simpleDraweeView = this.binding.verifiedBotIcon;
            q.f(simpleDraweeView, "binding.verifiedBotIcon");
            if (q.b(bool, Boolean.TRUE)) {
                i10 = 0;
            }
            simpleDraweeView.setVisibility(i10);
            if (num != null) {
                ConstraintLayout constraintLayout2 = this.binding.layout;
                q.f(constraintLayout2, "binding.layout");
                ViewBackgroundUtilsKt.setBackgroundRectangle$default(constraintLayout2, ReactColorToAndroidColorKt.reactColorToAndroidColor(num.intValue()), SizeUtilsKt.getDpToPx(3), null, 0, 12, null);
                return;
            }
            this.binding.layout.setBackground(a.b(getContext(), R.drawable.drawable_message_author_tag_bg));
        } else if (str2 != null) {
            this.binding.tag.setText(str2);
            TextView textView2 = this.binding.tag;
            Context context2 = getContext();
            q.f(context2, "context");
            textView2.setTextColor(ColorUtilsKt.getColorCompat(context2, R.color.brand_560));
            ConstraintLayout constraintLayout3 = this.binding.layout;
            q.f(constraintLayout3, "binding.layout");
            Context context3 = getContext();
            q.f(context3, "context");
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(constraintLayout3, ColorUtilsKt.getThemeColor(context3, R.color.brand_200, R.color.brand_260), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
            ConstraintLayout constraintLayout4 = this.binding.layout;
            q.f(constraintLayout4, "binding.layout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout4, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageTagView.configureTagView$lambda$0(ChatEventHandler.this, view);
                }
            }, 1, null);
            SimpleDraweeView simpleDraweeView2 = this.binding.verifiedBotIcon;
            q.f(simpleDraweeView2, "binding.verifiedBotIcon");
            simpleDraweeView2.setVisibility(8);
        }
    }
}
