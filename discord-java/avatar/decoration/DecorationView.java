package com.discord.avatar.decoration;

import android.content.Context;
import android.util.AttributeSet;
import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ/\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/discord/avatar/decoration/DecorationView;", "Lcom/discord/image/animated_image/apng/APNGImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "asDecoration", "", "url", "", "widthDp", "heightDp", "animate", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "avatar_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecorationView extends APNGImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorationView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ DecorationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void asDecoration(String url, Integer num, Integer num2, boolean z10) {
        q.g(url, "url");
        inflateApngView(false);
        getApngView().loadImage(new APNGView.Config(url, z10, false, num, num2, "decorations"));
        resetViews(getApngView(), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecorationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }
}
