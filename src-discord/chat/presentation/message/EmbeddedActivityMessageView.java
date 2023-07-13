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
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/EmbeddedActivityMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/EmbeddedActivityMessageViewBinding;", "setItem", "", "item", "Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;", "onJoinButtonClickListener", "Landroid/view/View$OnClickListener;", "onDismissClickListener", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmbeddedActivityMessageView extends ConstraintLayout {
    private final EmbeddedActivityMessageViewBinding binding;

    
    public EmbeddedActivityMessageView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  EmbeddedActivityMessageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setItem(EmbeddedActivityChatListItem item, View.OnClickListener onJoinButtonClickListener, View.OnClickListener onDismissClickListener) {
        int s10;
        q.g(item, "item");
        q.g(onJoinButtonClickListener, "onJoinButtonClickListener");
        q.g(onDismissClickListener, "onDismissClickListener");
        this.binding.message.setText(item.getContent());
        this.binding.joinButton.setText(item.getButtonText());
        this.binding.joinButton.setOnClickButtonListener(onJoinButtonClickListener);
        SimpleDraweeView simpleDraweeView = this.binding.dismiss;
        q.f(simpleDraweeView, "binding.dismiss");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onDismissClickListener, 1, null);
        this.binding.dismiss.setContentDescription(item.getDismissButtonAccessibilityLabel());
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        List<String> avatarUrls = item.getAvatarUrls();
        s10 = k.s(avatarUrls, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (String str : avatarUrls) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView.setItems(arrayList);
    }

    
    public EmbeddedActivityMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        EmbeddedActivityMessageViewBinding inflate = EmbeddedActivityMessageViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        ConstraintLayout constraintLayout = inflate.card;
        q.f(constraintLayout, "binding.card");
        AddSystemMessageCardStyleKt.addSystemMessageCardStyle(constraintLayout);
        SimpleDraweeView _init_$lambda$0 = inflate.icon;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$0, ReactAsset.Activity);
        ColorUtilsKt.setTintColor(_init_$lambda$0, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView _init_$lambda$1 = inflate.message;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        SimpleDraweeView _init_$lambda$2 = inflate.dismiss;
        q.f(_init_$lambda$2, "_init_$lambda$2");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$2, ReactAsset.Close);
        ColorUtilsKt.setTintColor(_init_$lambda$2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        I18nUtilsKt.i18nContentDescription$default(_init_$lambda$2, I18nMessage.DISMISS, (Function1) null, 2, (Object) null);
        RippleUtilsKt.addCircleRipple$default(_init_$lambda$2, false, 1, null);
        DCDButton dCDButton = inflate.joinButton;
        dCDButton.setDiscordFont(discordFont);
        dCDButton.setTextSizeSp(14.0f);
    }
}
