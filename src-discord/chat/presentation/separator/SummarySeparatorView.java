package com.discord.chat.presentation.separator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.SeparatorSummaryViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/separator/SummarySeparatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SeparatorSummaryViewBinding;", "setDividerColor", "", ViewProps.COLOR, "", "setIsBeforeContent", "isBeforeContent", "", "setText", "text", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SummarySeparatorView extends ConstraintLayout {
    private final SeparatorSummaryViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ SummarySeparatorView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setDividerColor(int i10) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        separatorSummaryViewBinding.leftBar.setBackgroundColor(i10);
        separatorSummaryViewBinding.rightBar.setBackgroundColor(i10);
        SimpleDraweeView icon = separatorSummaryViewBinding.icon;
        q.f(icon, "icon");
        ColorUtilsKt.setTintColor(icon, Integer.valueOf(i10));
    }

    public final void setIsBeforeContent(boolean z10) {
        this.binding.icon.setVisibility(z10 ? 0 : 8);
    }

    public final void setText(CharSequence text) {
        q.g(text, "text");
        this.binding.middleText.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        SeparatorSummaryViewBinding inflate = SeparatorSummaryViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        View root = inflate.getRoot();
        q.f(root, "root");
        root.setPaddingRelative(dimensionPixelSize, root.getPaddingTop(), dimensionPixelSize, root.getPaddingBottom());
        TextView lambda$1$lambda$0 = inflate.middleText;
        q.f(lambda$1$lambda$0, "lambda$1$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(lambda$1$lambda$0, SizeUtilsKt.getDpToPx(4));
        DiscordFontUtilsKt.setDiscordFont(lambda$1$lambda$0, DiscordFont.PrimarySemibold);
        SetTextSizeSpKt.setTextSizeSp(lambda$1$lambda$0, 12.0f);
        lambda$1$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        lambda$1$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        SimpleDraweeView icon = inflate.icon;
        q.f(icon, "icon");
        ReactAssetUtilsKt.setReactAsset(icon, ReactAsset.Summary);
    }
}
