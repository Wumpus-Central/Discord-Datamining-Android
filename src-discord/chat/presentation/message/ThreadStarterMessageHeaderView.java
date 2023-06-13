package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.ThreadStarterMessageHeaderViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ThreadStarterMessageHeaderViewBinding;", "configure", "", "headerText", "", "hasMessageReference", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThreadStarterMessageHeaderView extends LinearLayout {
    private final ThreadStarterMessageHeaderViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadStarterMessageHeaderView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ ThreadStarterMessageHeaderView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void configure(String str, boolean z10) {
        boolean z11;
        int i10;
        View root = this.binding.getRoot();
        q.f(root, "binding.root");
        int i11 = 0;
        if (str != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        root.setVisibility(i10);
        this.binding.threadStarterHeaderText.setText(str);
        View root2 = this.binding.getRoot();
        q.f(root2, "binding.root");
        ViewGroup.LayoutParams layoutParams = root2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z10) {
                i11 = SizeUtilsKt.getDpToPx(4);
            }
            marginLayoutParams.bottomMargin = i11;
            root2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadStarterMessageHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        ThreadStarterMessageHeaderViewBinding inflate = ThreadStarterMessageHeaderViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        setOrientation(0);
        SimpleDraweeView simpleDraweeView = inflate.threadStarterHeaderIcon;
        q.f(simpleDraweeView, "binding.threadStarterHeaderIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.TextChannel);
        SimpleDraweeView simpleDraweeView2 = inflate.threadStarterHeaderIcon;
        q.f(simpleDraweeView2, "binding.threadStarterHeaderIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        inflate.threadStarterHeaderText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        TextView textView = inflate.threadStarterHeaderText;
        q.f(textView, "binding.threadStarterHeaderText");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        TextView textView2 = inflate.threadStarterHeaderText;
        q.f(textView2, "binding.threadStarterHeaderText");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
    }
}
