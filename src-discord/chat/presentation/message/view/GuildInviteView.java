package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.GuildInviteViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ+\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001e\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$J\u001a\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0012J\u0010\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0012J\u0017\u0010*\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0016J\u0019\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildInviteViewBinding;", "setBackgroundRectangleColor", "", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "setButtonBackgroundColor", "setButtonText", "text", "", "setButtonTextColor", "setGuildImage", "url", "", "thumbnailText", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setHeaderColor", "(Ljava/lang/Integer;)Lkotlin/Unit;", "setHeaderText", "headerText", "setInviteSplash", "setLoading", "loading", "", "setOnButtonClickListener", "listener", "Landroid/view/View$OnClickListener;", "setPresence", "onlineText", "memberText", "setSubtitle", "subtitle", "setSubtitleColor", "setSubtitleIcon", "subtitleIconUrl", "setTitleColor", "setTitleText", ZeroconfModule.KEY_SERVICE_NAME, "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildInviteView extends ConstraintLayout {
    private final GuildInviteViewBinding binding;

    
    public GuildInviteView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public GuildInviteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  GuildInviteView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setBackgroundRectangleColor(Integer num) {
        int i10;
        if (num != null) {
            i10 = num.intValue();
        } else {
            Context context = getContext();
            q.g(context, "context");
            i10 = ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_100, R.color.primary_630));
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, i10, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }

    public final void setButtonBackgroundColor(Integer num) {
        this.binding.itemInviteJoinedButton.setBackgroundColor(num);
    }

    
    
    public final void setButtonText(java.lang.CharSequence r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildInviteView.setButtonText(java.lang.CharSequence):void");
    }

    public final void setButtonTextColor(Integer num) {
        this.binding.itemInviteJoinedButton.setTextColor(num);
    }

    public final void setGuildImage(String str, String str2, Integer num) {
        this.binding.itemInviteImage.configure(str, str2, num);
    }

    public final Unit setHeaderColor(Integer num) {
        if (num == null) {
            return null;
        }
        this.binding.itemInviteHeader.setTextColor(num.intValue());
        return Unit.f21436a;
    }

    public final void setHeaderText(CharSequence charSequence) {
        boolean z10;
        TextView textView = this.binding.itemInviteHeader;
        q.g(textView, "binding.itemInviteHeader");
        int i10 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(true ^ z10)) {
            i10 = 8;
        }
        textView.setVisibility(i10);
        this.binding.itemInviteHeader.setText(charSequence);
    }

    public final void setInviteSplash(String str) {
        boolean z10;
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSplash;
        q.g(simpleDraweeView, "binding.itemInviteSplash");
        int i10 = 0;
        if (str == null || str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(true ^ z10)) {
            i10 = 8;
        }
        simpleDraweeView.setVisibility(i10);
        this.binding.itemInviteSplash.setImageURI(str);
    }

    public final void setLoading(boolean z10) {
        this.binding.itemInviteJoinedButton.setLoading(z10);
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        this.binding.itemInviteJoinedButton.setOnClickButtonListener(onClickListener);
    }

    
    
    
    
    
    
    
    
    
    
    public final void setPresence(java.lang.CharSequence r9, java.lang.CharSequence r10) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildInviteView.setPresence(java.lang.CharSequence, java.lang.CharSequence):void");
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.binding.itemInviteSubtitle;
        q.g(textView, "binding.itemInviteSubtitle");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    public final void setSubtitleColor(Integer num) {
        if (num != null) {
            this.binding.itemInviteSubtitle.setTextColor(num.intValue());
        }
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSubtitleIcon;
        q.g(simpleDraweeView, "binding.itemInviteSubtitleIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView, num);
    }

    public final void setSubtitleIcon(String str) {
        SimpleDraweeView setSubtitleIcon$lambda$9 = this.binding.itemInviteSubtitleIcon;
        q.g(setSubtitleIcon$lambda$9, "setSubtitleIcon$lambda$9");
        ReactAssetUtilsKt.setOptionalReactImageUrl(setSubtitleIcon$lambda$9, str);
    }

    public final Unit setTitleColor(Integer num) {
        if (num == null) {
            return null;
        }
        this.binding.itemInviteTitle.setTextColor(num.intValue());
        return Unit.f21436a;
    }

    public final void setTitleText(CharSequence charSequence) {
        this.binding.itemInviteTitle.setText(charSequence);
    }

    
    public GuildInviteView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        GuildInviteViewBinding inflate = GuildInviteViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$6$lambda$0 = inflate.itemInviteHeader;
        lambda$6$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(lambda$6$lambda$0, "lambda$6$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$0, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$0, DiscordFont.PrimaryBold);
        TextView lambda$6$lambda$1 = inflate.itemInviteTitle;
        lambda$6$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(lambda$6$lambda$1, "lambda$6$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$1, discordFont);
        TextView lambda$6$lambda$2 = inflate.itemInviteSubtitle;
        lambda$6$lambda$2.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(lambda$6$lambda$2, "lambda$6$lambda$2");
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$2, discordFont2);
        TextView lambda$6$lambda$3 = inflate.itemInviteOnlineText;
        lambda$6$lambda$3.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(lambda$6$lambda$3, "lambda$6$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$3, discordFont);
        TextView lambda$6$lambda$4 = inflate.itemInviteTotalMemberText;
        lambda$6$lambda$4.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(lambda$6$lambda$4, "lambda$6$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$4, discordFont);
        TextView lambda$6$lambda$5 = inflate.itemInviteHubLink;
        lambda$6$lambda$5.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(lambda$6$lambda$5, "lambda$6$lambda$5");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$5, discordFont2);
        inflate.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(context, R.color.brand));
    }
}
