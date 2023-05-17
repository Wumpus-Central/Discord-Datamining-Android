package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ+\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u001d\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#J\u001a\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u0011J\u0010\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0011J\u0017\u0010)\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0015J\u0019\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildInviteViewBinding;", "setButtonBackgroundColor", "", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "setButtonText", "text", "", "setButtonTextColor", "setGuildImage", "url", "", "thumbnailText", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setHeaderColor", "(Ljava/lang/Integer;)Lkotlin/Unit;", "setHeaderText", "headerText", "setInviteSplash", "setLoading", "loading", "", "setOnButtonClickListener", "listener", "Landroid/view/View$OnClickListener;", "setPresence", "onlineText", "memberText", "setSubtitle", "subtitle", "setSubtitleColor", "setSubtitleIcon", "subtitleIconUrl", "setTitleColor", "setTitleText", "name", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GuildInviteView extends ConstraintLayout {
    private final GuildInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ GuildInviteView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setButtonBackgroundColor(Integer num) {
        this.binding.itemInviteJoinedButton.setBackgroundColor(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setButtonText(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r4.binding
            com.discord.core.DCDButton r0 = r0.itemInviteJoinedButton
            java.lang.String r1 = "binding.itemInviteJoinedButton"
            kotlin.jvm.internal.q.f(r0, r1)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0016
            boolean r3 = ri.l.w(r5)
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 8
        L_0x001d:
            r0.setVisibility(r1)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r4.binding
            com.discord.core.DCDButton r0 = r0.itemInviteJoinedButton
            r0.setText(r5)
            return
        */
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
        return Unit.f22036a;
    }

    public final void setHeaderText(CharSequence charSequence) {
        boolean z10;
        TextView textView = this.binding.itemInviteHeader;
        q.f(textView, "binding.itemInviteHeader");
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
        q.f(simpleDraweeView, "binding.itemInviteSplash");
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPresence(java.lang.CharSequence r9, java.lang.CharSequence r10) {
        /*
            r8 = this;
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteOnlineDot
            java.lang.String r1 = "binding.itemInviteOnlineDot"
            kotlin.jvm.internal.q.f(r0, r1)
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x0016
            boolean r4 = ri.l.w(r9)
            if (r4 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r4 = r3
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            r4 = r4 ^ r2
            r5 = 8
            if (r4 == 0) goto L_0x001e
            r4 = r3
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            r0.setVisibility(r4)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteOnlineDot
            kotlin.jvm.internal.q.f(r0, r1)
            int r1 = com.discord.chat.R.color.green_360
            int r1 = com.discord.theme.utils.ColorUtilsKt.getColorCompat(r8, r1)
            r4 = 2
            r6 = 0
            com.discord.misc.utilities.view.ViewBackgroundUtilsKt.setBackgroundOval$default(r0, r1, r3, r4, r6)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.TextView r0 = r0.itemInviteOnlineText
            r0.setText(r9)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteTotalMemberDot
            java.lang.String r1 = "binding.itemInviteTotalMemberDot"
            kotlin.jvm.internal.q.f(r0, r1)
            if (r10 == 0) goto L_0x004f
            boolean r7 = ri.l.w(r10)
            if (r7 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r7 = r3
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0055
            r7 = r3
            goto L_0x0056
        L_0x0055:
            r7 = r5
        L_0x0056:
            r0.setVisibility(r7)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteTotalMemberDot
            kotlin.jvm.internal.q.f(r0, r1)
            int r1 = com.discord.chat.R.color.primary_500
            int r1 = com.discord.theme.utils.ColorUtilsKt.getColorCompat(r8, r1)
            com.discord.misc.utilities.view.ViewBackgroundUtilsKt.setBackgroundOval$default(r0, r1, r3, r4, r6)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.TextView r0 = r0.itemInviteTotalMemberText
            r0.setText(r10)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.LinearLayout r0 = r0.itemInviteMemberContainer
            java.lang.String r1 = "binding.itemInviteMemberContainer"
            kotlin.jvm.internal.q.f(r0, r1)
            if (r9 == 0) goto L_0x0084
            boolean r9 = ri.l.w(r9)
            if (r9 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r9 = r3
            goto L_0x0085
        L_0x0084:
            r9 = r2
        L_0x0085:
            if (r9 == 0) goto L_0x0097
            if (r10 == 0) goto L_0x0092
            boolean r9 = ri.l.w(r10)
            if (r9 == 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r9 = r3
            goto L_0x0093
        L_0x0092:
            r9 = r2
        L_0x0093:
            if (r9 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r3 = r5
        L_0x009b:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildInviteView.setPresence(java.lang.CharSequence, java.lang.CharSequence):void");
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.binding.itemInviteSubtitle;
        q.f(textView, "binding.itemInviteSubtitle");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    public final void setSubtitleColor(Integer num) {
        if (num != null) {
            this.binding.itemInviteSubtitle.setTextColor(num.intValue());
        }
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSubtitleIcon;
        q.f(simpleDraweeView, "binding.itemInviteSubtitleIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView, num);
    }

    public final void setSubtitleIcon(String str) {
        SimpleDraweeView setSubtitleIcon$lambda$9 = this.binding.itemInviteSubtitleIcon;
        q.f(setSubtitleIcon$lambda$9, "setSubtitleIcon$lambda$9");
        ReactAssetUtilsKt.setOptionalReactImageUrl(setSubtitleIcon$lambda$9, str);
    }

    public final Unit setTitleColor(Integer num) {
        if (num == null) {
            return null;
        }
        this.binding.itemInviteTitle.setTextColor(num.intValue());
        return Unit.f22036a;
    }

    public final void setTitleText(CharSequence charSequence) {
        this.binding.itemInviteTitle.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        GuildInviteViewBinding inflate = GuildInviteViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$6$lambda$0 = inflate.itemInviteHeader;
        lambda$6$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.f(lambda$6$lambda$0, "lambda$6$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$0, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$0, DiscordFont.PrimaryBold);
        TextView lambda$6$lambda$1 = inflate.itemInviteTitle;
        lambda$6$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.f(lambda$6$lambda$1, "lambda$6$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$1, discordFont);
        TextView lambda$6$lambda$2 = inflate.itemInviteSubtitle;
        lambda$6$lambda$2.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.f(lambda$6$lambda$2, "lambda$6$lambda$2");
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$2, discordFont2);
        TextView lambda$6$lambda$3 = inflate.itemInviteOnlineText;
        lambda$6$lambda$3.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.f(lambda$6$lambda$3, "lambda$6$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$3, discordFont);
        TextView lambda$6$lambda$4 = inflate.itemInviteTotalMemberText;
        lambda$6$lambda$4.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.f(lambda$6$lambda$4, "lambda$6$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$4, discordFont);
        TextView lambda$6$lambda$5 = inflate.itemInviteHubLink;
        lambda$6$lambda$5.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.f(lambda$6$lambda$5, "lambda$6$lambda$5");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$5, discordFont2);
        inflate.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(context, R.color.brand));
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_100, R.color.primary_630)), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }
}
