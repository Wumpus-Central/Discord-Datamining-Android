package com.discord.chat.presentation.deserializationerror;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.a;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.DeserializationErrorViewBinding;
import com.discord.chat.presentation.deserializationerror.DeserializationErrorView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/DeserializationErrorViewBinding;", "configure", "", "json", "", "causeMessage", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DeserializationErrorView extends LinearLayout {
    private final DeserializationErrorViewBinding binding;

    
    public DeserializationErrorView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  DeserializationErrorView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    
    public static final void configure$lambda$0(DeserializationErrorView this$0, String json, View view) {
        q.g(this$0, "this$0");
        q.g(json, "$json");
        Object i10 = a.i(this$0.getContext(), ClipboardManager.class);
        q.d(i10);
        ((ClipboardManager) i10).setPrimaryClip(ClipData.newPlainText("Error JSON", json));
        Toast.makeText(this$0.getContext(), "Copied error json to clipboard", 0).show();
    }

    public final void configure(final String json, String causeMessage) {
        q.g(json, "json");
        q.g(causeMessage, "causeMessage");
        this.binding.json.setText(json);
        this.binding.exception.setText(causeMessage);
        Button button = this.binding.copyButton;
        q.f(button, "binding.copyButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                DeserializationErrorView.configure$lambda$0(DeserializationErrorView.this, json, view);
            }
        }, 1, null);
    }

    
    public DeserializationErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        DeserializationErrorViewBinding inflate = DeserializationErrorViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.json.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView = inflate.json;
        q.f(textView, "binding.json");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        inflate.exception.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView2 = inflate.exception;
        q.f(textView2, "binding.exception");
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        inflate.causeHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
        TextView textView3 = inflate.causeHeader;
        q.f(textView3, "binding.causeHeader");
        SetTextSizeSpKt.setTextSizeSp(textView3, 24.0f);
        TextView textView4 = inflate.causeHeader;
        q.f(textView4, "binding.causeHeader");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
        inflate.jsonHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
        TextView textView5 = inflate.jsonHeader;
        q.f(textView5, "binding.jsonHeader");
        SetTextSizeSpKt.setTextSizeSp(textView5, 24.0f);
        TextView textView6 = inflate.jsonHeader;
        q.f(textView6, "binding.jsonHeader");
        DiscordFontUtilsKt.setDiscordFont(textView6, discordFont2);
        TextView textView7 = inflate.header;
        q.f(textView7, "binding.header");
        DiscordFontUtilsKt.setDiscordFont(textView7, discordFont);
        TextView textView8 = inflate.header;
        q.f(textView8, "binding.header");
        SetTextSizeSpKt.setTextSizeSp(textView8, 24.0f);
        Button button = inflate.copyButton;
        q.f(button, "binding.copyButton");
        DiscordFontUtilsKt.setDiscordFont(button, discordFont);
        setOrientation(1);
    }
}
