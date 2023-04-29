package com.discord.chat.presentation.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.databinding.ErrorMessageViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/ErrorMessageView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ErrorMessageViewBinding;", "setErrorMessage", "", "message", "Lcom/discord/chat/bridge/ErrorMessage;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
/* loaded from: classes4.dex */
public final class ErrorMessageView extends LinearLayout {
    private final ErrorMessageViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorMessageView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ ErrorMessageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setErrorMessage(ErrorMessage message) {
        q.g(message, "message");
        this.binding.errorLabel.setText(message.getStackTrace());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        ErrorMessageViewBinding inflate = ErrorMessageViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setOrientation(1);
        int backgroundMobileSecondary = ThemeManagerKt.getTheme().getBackgroundMobileSecondary();
        int statusDangerBackground = ThemeManagerKt.getTheme().getStatusDangerBackground();
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, backgroundMobileSecondary, SizeUtilsKt.getDpToPx(8), Integer.valueOf(statusDangerBackground), SizeUtilsKt.getDpToPx(1));
        inflate.header.setText("Something went wrong here.");
        inflate.header.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView = inflate.header;
        q.f(textView, "binding.header");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        inflate.errorLabel.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView2 = inflate.errorLabel;
        q.f(textView2, "binding.errorLabel");
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryMedium);
    }
}
