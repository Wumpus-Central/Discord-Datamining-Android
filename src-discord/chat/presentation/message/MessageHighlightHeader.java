package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.databinding.MessageHighlightHeaderBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/MessageHighlightHeader;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageHighlightHeader extends LinearLayout {
    private final MessageHighlightHeaderBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageHighlightHeader(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ MessageHighlightHeader(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageHighlightHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        MessageHighlightHeaderBinding inflate = MessageHighlightHeaderBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.header;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        _init_$lambda$0.setText(I18nUtilsKt.i18nFormat$default(context, I18nMessage.HIGHLIGHT, null, 2, null));
        SimpleDraweeView simpleDraweeView = inflate.highlightIcon;
        q.f(simpleDraweeView, "binding.highlightIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Highlight);
    }
}
