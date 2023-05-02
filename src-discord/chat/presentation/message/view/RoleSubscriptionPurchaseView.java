package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.RoleSubscriptionPurchaseViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/RoleSubscriptionPurchaseViewBinding;", "configure", "", "authorUsername", "", "authorAvatar", "widthPx", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoleSubscriptionPurchaseView extends ConstraintLayout {
    private final RoleSubscriptionPurchaseViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ RoleSubscriptionPurchaseView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void configure(String str, String str2, int i10) {
        this.binding.roleSubscriptionPurchaserUsername.setText(str);
        this.binding.roleSubscriptionPurchaserAvatar.setImageURI(str2);
        ViewGroup.LayoutParams layoutParams = this.binding.roleSubscriptionPurchaseCardBg.getLayoutParams();
        layoutParams.width = i10;
        double d10 = i10;
        layoutParams.height = (int) (0.339d * d10);
        ViewGroup.LayoutParams layoutParams2 = this.binding.roleSubscriptionPurchaseBadge.getLayoutParams();
        int i11 = (int) (0.21d * d10);
        layoutParams2.width = i11;
        layoutParams2.height = (int) (i11 * 1.37d);
        ViewGroup.LayoutParams layoutParams3 = this.binding.roleSubscriptionPurchaseLanyard.getLayoutParams();
        int i12 = (int) (d10 * 0.18d);
        layoutParams3.width = i12;
        layoutParams3.height = (int) (i12 * 2.327d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        RoleSubscriptionPurchaseViewBinding inflate = RoleSubscriptionPurchaseViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.roleSubscriptionWelcome;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getStatusPositiveText());
        TextView _init_$lambda$1 = inflate.roleSubscriptionPurchaserUsername;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 20.0f);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getStatusPositiveText());
        SimpleDraweeView simpleDraweeView = inflate.roleSubscriptionPurchaseBadge;
        q.f(simpleDraweeView, "binding.roleSubscriptionPurchaseBadge");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.RoleSubscriptionBadge);
        SimpleDraweeView simpleDraweeView2 = inflate.roleSubscriptionPurchaseLanyard;
        q.f(simpleDraweeView2, "binding.roleSubscriptionPurchaseLanyard");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.RoleSubscriptionLanyard);
        SimpleDraweeView simpleDraweeView3 = inflate.roleSubscriptionPurchaseCardBg;
        q.f(simpleDraweeView3, "binding.roleSubscriptionPurchaseCardBg");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView3, ReactAsset.RoleSubscriptionPurchaseCardBg);
        SimpleDraweeView simpleDraweeView4 = inflate.roleSubscriptionPurchaserAvatar;
        q.f(simpleDraweeView4, "binding.roleSubscriptionPurchaserAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView4);
        inflate.roleSubscriptionWelcome.setText(I18nUtilsKt.i18nFormat$default(context, I18nMessage.ROLE_SUBSCRIPTION_WELCOME_LABEL, null, 2, null));
    }
}