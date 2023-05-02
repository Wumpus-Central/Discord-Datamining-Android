package com.discord.sticker.sticker_types;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/sticker/sticker_types/RLottieStubView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/ShapeDrawable;", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RLottieStubView extends View {
    private final ShapeDrawable placeholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieStubView(Context context) {
        super(context);
        q.g(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
        this.placeholder = shapeDrawable;
        setBackground(shapeDrawable);
    }
}
