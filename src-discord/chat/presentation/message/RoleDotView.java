package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.discord.chat.R;
import com.discord.chat.databinding.RoleDotViewBinding;
import com.discord.chat.presentation.message.viewholder.RoleDotDrawable;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/RoleDotView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/RoleDotViewBinding;", "configure", "", "roleColor", "", "spSize", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoleDotView extends FrameLayout {
    private final RoleDotViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        RoleDotViewBinding inflate = RoleDotViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }

    public static /* synthetic */ void configure$default(RoleDotView roleDotView, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 20;
        }
        roleDotView.configure(i10, i11);
    }

    public final void configure(int i10, int i11) {
        FrameLayout frameLayout = this.binding.roleDotViewBackground;
        q.f(frameLayout, "binding.roleDotViewBackground");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(frameLayout, ThemeManagerKt.getTheme().getBackgroundSecondaryAlt(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        int colorCompat = ColorUtilsKt.getColorCompat(this, ThemeManagerKt.getTheme().getColorRes(R.color.black, R.color.white));
        Context context = getContext();
        q.f(context, "context");
        RoleDotDrawable roleDotDrawable = new RoleDotDrawable(context, colorCompat, i11);
        roleDotDrawable.setColor(i10);
        this.binding.roleDotViewDot.setImageDrawable(roleDotDrawable);
    }

    public /* synthetic */ RoleDotView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
