package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.style.DynamicDrawableSpan;
import com.discord.chat.R;
import com.discord.chat.presentation.message.viewholder.RoleDotDrawable;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.FontManager;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/RoleDotSpan;", "Landroid/text/style/DynamicDrawableSpan;", "context", "Landroid/content/Context;", ViewProps.BACKGROUND_COLOR, "", "spSize", "(Landroid/content/Context;II)V", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", ViewProps.BORDER_COLOR, "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "pxSize", "roleDot", "Lcom/discord/chat/presentation/message/viewholder/RoleDotDrawable;", "scale", "", "topPos", "getDrawable", "Landroid/graphics/drawable/Drawable;", "setColor", "", "roleColor", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoleDotSpan extends DynamicDrawableSpan {
    private final ColorDrawable backgroundDrawable;
    private final int borderColor;
    private final LayerDrawable layerDrawable;
    private final int pxSize;
    private final RoleDotDrawable roleDot;
    private final float scale;
    private final int spSize;
    private final int topPos;

    public RoleDotSpan(Context context, int i10, int i11) {
        q.g(context, "context");
        this.spSize = i11;
        float fontScale = FontManager.INSTANCE.getFontScale(context);
        this.scale = fontScale;
        this.pxSize = (int) (SizeUtilsKt.getSpToPx(i11) * fontScale);
        this.topPos = SizeUtilsKt.getSpToPx((i11 * (-1)) / 4);
        int themeColor = ColorUtilsKt.getThemeColor(context, R.color.black, R.color.white);
        this.borderColor = themeColor;
        RoleDotDrawable roleDotDrawable = new RoleDotDrawable(context, themeColor, i11);
        this.roleDot = roleDotDrawable;
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.backgroundDrawable = colorDrawable;
        this.layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, roleDotDrawable});
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        LayerDrawable layerDrawable = this.layerDrawable;
        int i10 = this.topPos;
        int i11 = this.pxSize;
        layerDrawable.setBounds(0, i10, i11, i11);
        return this.layerDrawable;
    }

    public final void setColor(int i10) {
        this.roleDot.setColor(i10);
    }

    public /* synthetic */ RoleDotSpan(Context context, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i10, (i12 & 4) != 0 ? 20 : i11);
    }
}
