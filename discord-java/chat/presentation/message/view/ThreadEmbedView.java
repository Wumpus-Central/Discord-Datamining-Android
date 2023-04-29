package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.ThreadEmbedViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014J*\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012J\u0010\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/ThreadEmbedViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ThreadEmbedViewBinding;", "getLeadingMarginSpan", "Landroid/text/style/LeadingMarginSpan;", "setArchived", "", "archived", "", "iconUrl", "", "setLabel", "label", "setMessage", "imageUrl", "username", "message", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "italicizeMessage", "setTitle", "title", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThreadEmbedView extends ConstraintLayout {
    private final ThreadEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ThreadEmbedView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final LeadingMarginSpan getLeadingMarginSpan() {
        this.binding.threadEmbedMostRecentMessageHeader.measure(0, 0);
        return new LeadingMarginSpan.Standard(this.binding.threadEmbedMostRecentMessageHeader.getMeasuredWidth(), 0);
    }

    public static /* synthetic */ void setArchived$default(ThreadEmbedView threadEmbedView, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        threadEmbedView.setArchived(z10, str);
    }

    public final ThreadEmbedViewBinding getBinding() {
        return this.binding;
    }

    public final void setArchived(boolean z10, String str) {
        int i10;
        SimpleDraweeView simpleDraweeView = this.binding.threadEmbedIcon;
        q.f(simpleDraweeView, "binding.threadEmbedIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, str);
        SimpleDraweeView simpleDraweeView2 = this.binding.threadEmbedIcon;
        q.f(simpleDraweeView2, "binding.threadEmbedIcon");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        simpleDraweeView2.setVisibility(i10);
    }

    public final void setLabel(String label) {
        q.g(label, "label");
        TextView textView = this.binding.threadEmbedMessagesCount;
        q.f(textView, "binding.threadEmbedMessagesCount");
        ViewUtilsKt.setOptionalText(textView, label);
    }

    public final void setMessage(String str, String str2, DraweeSpanStringBuilder message, boolean z10) {
        boolean z11;
        int i10;
        DiscordFont discordFont;
        q.g(message, "message");
        TextView textView = this.binding.threadEmbedMostRecentMessageName;
        q.f(textView, "binding.threadEmbedMostRecentMessageName");
        ViewUtilsKt.setOptionalText(textView, str2);
        this.binding.threadEmbedMostRecentMessageAvatar.setImageURI(str);
        if (str2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        LinearLayout linearLayout = this.binding.threadEmbedMostRecentMessageHeader;
        q.f(linearLayout, "binding.threadEmbedMostRecentMessageHeader");
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.threadEmbedMostRecentMessageContent;
        q.f(simpleDraweeSpanTextView, "binding.threadEmbedMostRecentMessageContent");
        if (z10) {
            discordFont = DiscordFont.PrimaryNormalItalic;
        } else {
            discordFont = DiscordFont.PrimaryMedium;
        }
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont);
        if (z11) {
            message.setSpan(getLeadingMarginSpan(), 0, message.length(), 33);
        }
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = this.binding.threadEmbedMostRecentMessageContent;
        q.f(simpleDraweeSpanTextView2, "binding.threadEmbedMostRecentMessageContent");
        SpannableExtensionsKt.coverWithSpan(message, new BackgroundSpanDrawer(simpleDraweeSpanTextView2));
        this.binding.threadEmbedMostRecentMessageContent.setDraweeSpanStringBuilder(message);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.binding.threadEmbedName;
        q.f(textView, "binding.threadEmbedName");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        ThreadEmbedViewBinding inflate = ThreadEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.threadEmbedName;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFont discordFont = DiscordFont.PrimaryBold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 14.0f);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView _init_$lambda$1 = inflate.threadEmbedMessagesCount;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        TextView _init_$lambda$2 = inflate.threadEmbedMostRecentMessageName;
        q.f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 14.0f);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        SimpleDraweeSpanTextView _init_$lambda$3 = inflate.threadEmbedMostRecentMessageContent;
        q.f(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 14.0f);
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundSecondary()));
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, -1, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        RippleUtilsKt.addRipple(this, true, SizeUtilsKt.getDpToPx(4));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
    }
}
