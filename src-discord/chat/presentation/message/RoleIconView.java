package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.databinding.RoleIconViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/RoleIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/RoleIconViewBinding;", "configureRoleIcon", "", "roleIcon", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoleIconView extends FrameLayout {
    private final RoleIconViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        q.g(context, "context");
        q.g(attrs, "attrs");
        RoleIconViewBinding inflate = RoleIconViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureRoleIcon$lambda$3$lambda$2(ChatEventHandler eventHandler, RoleIcon roleIcon, RenderableEmoji renderableEmoji, View view) {
        q.g(eventHandler, "$eventHandler");
        q.g(roleIcon, "$roleIcon");
        eventHandler.onTapRoleIcon(roleIcon.getName(), renderableEmoji.getUrl(true, roleIcon.getSize()));
    }

    public final void configureRoleIcon(final RoleIcon roleIcon, final ChatEventHandler eventHandler) {
        final RenderableEmoji renderableEmoji;
        boolean z10;
        int i10;
        q.g(roleIcon, "roleIcon");
        q.g(eventHandler, "eventHandler");
        String source = roleIcon.getSource();
        if (source == null || (renderableEmoji = RenderableEmoji.Companion.customWithUrl(source, roleIcon.getAlt())) == null) {
            String unicodeEmoji = roleIcon.getUnicodeEmoji();
            if (unicodeEmoji != null) {
                renderableEmoji = RenderableEmoji.Companion.unicode(unicodeEmoji);
            } else {
                renderableEmoji = null;
            }
        }
        if (renderableEmoji != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        if (renderableEmoji != null) {
            SimpleDraweeSpanTextView configureRoleIcon$lambda$3 = this.binding.roleIconViewUnicodeEmoji;
            Context context = configureRoleIcon$lambda$3.getContext();
            q.f(context, "context");
            configureRoleIcon$lambda$3.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(renderableEmoji, context, SizeUtilsKt.getSpToPx(roleIcon.getSize()), true, 0, null, 48, null));
            q.f(configureRoleIcon$lambda$3, "configureRoleIcon$lambda$3");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureRoleIcon$lambda$3, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoleIconView.configureRoleIcon$lambda$3$lambda$2(ChatEventHandler.this, roleIcon, renderableEmoji, view);
                }
            }, 1, null);
        }
    }
}
