package com.discord.emoji_picker;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerRowView;", "Landroid/widget/LinearLayout;", "", "Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "emojis", "", "configureRowEmojiViews", "Lcom/discord/emoji_picker/EmojiPickerRow;", "rowData", "createRowEmojiViews", "setRowData", "Lkotlin/Function1;", "", "onPressEmoji", "Lkotlin/jvm/functions/Function1;", "getOnPressEmoji", "()Lkotlin/jvm/functions/Function1;", "setOnPressEmoji", "(Lkotlin/jvm/functions/Function1;)V", "onLongPressEmoji", "getOnLongPressEmoji", "setOnLongPressEmoji", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "emoji_picker_release"}, k = 1, mv = {1, 8, 0})

public final class EmojiPickerRowView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private static final GradientDrawable placeholder;
    private Function1<? super String, Unit> onPressEmoji = EmojiPickerRowView$onPressEmoji$1.INSTANCE;
    private Function1<? super String, Unit> onLongPressEmoji = EmojiPickerRowView$onLongPressEmoji$1.INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerRowView$Companion;", "", "()V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/GradientDrawable;", "emoji_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
        placeholder = gradientDrawable;
    }

    
    public EmojiPickerRowView(Context context) {
        super(context);
        q.g(context, "context");
        setOrientation(0);
    }

    private final void configureRowEmojiViews(List<EmojiPickerRow.Emoji> list) {
        float f10;
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j.r();
            }
            final EmojiPickerRow.Emoji emoji = (EmojiPickerRow.Emoji) obj;
            View childAt = getChildAt(i10);
            q.e(childAt, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) childAt;
            if (emoji == null) {
                simpleDraweeView.setImageURI((String) null);
                simpleDraweeView.setVisibility(4);
            } else {
                SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, emoji.getUrl(), false, null, 6, null);
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.setContentDescription(emoji.getName());
                if (emoji.getDisabled()) {
                    f10 = 0.2f;
                } else {
                    f10 = 1.0f;
                }
                simpleDraweeView.setAlpha(f10);
                NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, new View.OnClickListener() { 
                    @Override 
                    public final void onClick(View view) {
                        EmojiPickerRowView.configureRowEmojiViews$lambda$2$lambda$0(EmojiPickerRowView.this, emoji, view);
                    }
                }, 1, null);
                NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeView, false, new View.OnLongClickListener() { 
                    @Override 
                    public final boolean onLongClick(View view) {
                        boolean configureRowEmojiViews$lambda$2$lambda$1;
                        configureRowEmojiViews$lambda$2$lambda$1 = EmojiPickerRowView.configureRowEmojiViews$lambda$2$lambda$1(EmojiPickerRowView.this, emoji, view);
                        return configureRowEmojiViews$lambda$2$lambda$1;
                    }
                }, 1, null);
            }
            i10 = i11;
        }
    }

    
    public static final void configureRowEmojiViews$lambda$2$lambda$0(EmojiPickerRowView this$0, EmojiPickerRow.Emoji emoji, View view) {
        q.g(this$0, "this$0");
        this$0.onPressEmoji.invoke(emoji.getName());
    }

    
    public static final boolean configureRowEmojiViews$lambda$2$lambda$1(EmojiPickerRowView this$0, EmojiPickerRow.Emoji emoji, View view) {
        q.g(this$0, "this$0");
        this$0.onLongPressEmoji.invoke(emoji.getName());
        return true;
    }

    private final void createRowEmojiViews(EmojiPickerRow emojiPickerRow) {
        int i10;
        removeAllViews();
        int dpToPx = SizeUtilsKt.getDpToPx(emojiPickerRow.getItemSize());
        int size = emojiPickerRow.getItems().size();
        int dpToPx2 = (SizeUtilsKt.getDpToPx(emojiPickerRow.getRowContentWidth()) - (dpToPx * size)) / (size - 1);
        int dpToPx3 = SizeUtilsKt.getDpToPx(emojiPickerRow.getRowContentPaddingVertical());
        int i11 = 0;
        for (Object obj : emojiPickerRow.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                j.r();
            }
            EmojiPickerRow.Emoji emoji = (EmojiPickerRow.Emoji) obj;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = dpToPx2;
            }
            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
            RippleUtilsKt.addCircleRipple$default(simpleDraweeView, false, 1, null);
            ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).z(placeholder);
            ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).t(ScalingUtils.ScaleType.f7400e);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpToPx, dpToPx);
            layoutParams.setMargins(i10, dpToPx3, 0, dpToPx3);
            simpleDraweeView.setLayoutParams(layoutParams);
            addView(simpleDraweeView);
            i11 = i12;
        }
    }

    public final Function1<String, Unit> getOnLongPressEmoji() {
        return this.onLongPressEmoji;
    }

    public final Function1<String, Unit> getOnPressEmoji() {
        return this.onPressEmoji;
    }

    public final void setOnLongPressEmoji(Function1<? super String, Unit> function1) {
        q.g(function1, "<set-?>");
        this.onLongPressEmoji = function1;
    }

    public final void setOnPressEmoji(Function1<? super String, Unit> function1) {
        q.g(function1, "<set-?>");
        this.onPressEmoji = function1;
    }

    public final void setRowData(EmojiPickerRow rowData) {
        q.g(rowData, "rowData");
        if (rowData.getItems().size() != getChildCount()) {
            createRowEmojiViews(rowData);
        }
        configureRowEmojiViews(rowData.getItems());
    }
}
