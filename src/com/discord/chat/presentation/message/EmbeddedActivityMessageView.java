package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.EmbeddedActivityMessageViewBinding;
import com.discord.chat.presentation.list.item.EmbeddedActivityChatListItem;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9611k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/presentation/message/EmbeddedActivityMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/EmbeddedActivityMessageViewBinding;", "setItem", "", "item", "Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;", "onJoinButtonClickListener", "Landroid/view/View$OnClickListener;", "onDismissClickListener", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EmbeddedActivityMessageView extends ConstraintLayout {
    private final EmbeddedActivityMessageViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityMessageView(Context context) {
        this(context, null, 2, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ EmbeddedActivityMessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setItem(EmbeddedActivityChatListItem item, View.OnClickListener onJoinButtonClickListener, View.OnClickListener onDismissClickListener) {
        int t;
        C9677q.m14633g(item, "item");
        C9677q.m14633g(onJoinButtonClickListener, "onJoinButtonClickListener");
        C9677q.m14633g(onDismissClickListener, "onDismissClickListener");
        this.binding.message.setText(item.getContent());
        this.binding.joinButton.setText(item.getButtonText());
        this.binding.joinButton.setOnClickButtonListener(onJoinButtonClickListener);
        SimpleDraweeView simpleDraweeView = this.binding.dismiss;
        C9677q.m14634f(simpleDraweeView, "binding.dismiss");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onDismissClickListener, 1, null);
        this.binding.dismiss.setContentDescription(item.getDismissButtonAccessibilityLabel());
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        List<String> avatarUrls = item.getAvatarUrls();
        t = C9611k.m14809t(avatarUrls, 10);
        ArrayList arrayList = new ArrayList(t);
        for (String str : avatarUrls) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView.setItems(arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9677q.m14633g(context, "context");
        EmbeddedActivityMessageViewBinding inflate = EmbeddedActivityMessageViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        ConstraintLayout constraintLayout = inflate.card;
        C9677q.m14634f(constraintLayout, "binding.card");
        AddSystemMessageCardStyleKt.addSystemMessageCardStyle(constraintLayout);
        SimpleDraweeView _init_$lambda$0 = inflate.icon;
        C9677q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$0, ReactAsset.Activity);
        ColorUtilsKt.setTintColor(_init_$lambda$0, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView _init_$lambda$1 = inflate.message;
        C9677q.m14634f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        SimpleDraweeView _init_$lambda$2 = inflate.dismiss;
        C9677q.m14634f(_init_$lambda$2, "_init_$lambda$2");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$2, ReactAsset.Close);
        ColorUtilsKt.setTintColor(_init_$lambda$2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        I18nUtilsKt.i18nContentDescription$default(_init_$lambda$2, I18nMessage.DISMISS, (Function1) null, 2, (Object) null);
        RippleUtilsKt.addCircleRipple$default(_init_$lambda$2, false, 1, null);
        DCDButton dCDButton = inflate.joinButton;
        dCDButton.setDiscordFont(discordFont);
        dCDButton.setTextSizeSp(14.0f);
    }
}
