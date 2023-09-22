package com.discord.sticker_picker;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.k2;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.sticker.StickerView;
import com.discord.sticker_picker.StickerPickerRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/discord/sticker_picker/StickerPickerRowView;", "Landroid/widget/LinearLayout;", "Lcom/discord/sticker_picker/StickerPickerRow;", "rowData", "", "configureRowStickerViews", "createRowStickerViews", "clean", "setRowData", "", "firstRenderPass", "Z", "Lkotlin/Function1;", "", "onPressSticker", "Lkotlin/jvm/functions/Function1;", "getOnPressSticker", "()Lkotlin/jvm/functions/Function1;", "setOnPressSticker", "(Lkotlin/jvm/functions/Function1;)V", "onLongPressSticker", "getOnLongPressSticker", "setOnLongPressSticker", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sticker_picker_release"}, k = 1, mv = {1, 8, 0})

public final class StickerPickerRowView extends LinearLayout {
    private boolean firstRenderPass;
    private Function1<? super String, Unit> onPressSticker = StickerPickerRowView$onPressSticker$1.INSTANCE;
    private Function1<? super String, Unit> onLongPressSticker = StickerPickerRowView$onLongPressSticker$1.INSTANCE;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerPickerRow.Sticker.Type.values().length];
            try {
                iArr[StickerPickerRow.Sticker.Type.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerPickerRow.Sticker.Type.APNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerPickerRow.Sticker.Type.LOTTIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerPickerRow.Sticker.Type.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    
    public StickerPickerRowView(Context context) {
        super(context);
        q.h(context, "context");
        setOrientation(0);
    }

    private final void configureRowStickerViews(StickerPickerRow stickerPickerRow) {
        float f10;
        int i10 = 0;
        for (Object obj : stickerPickerRow.getItems()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j.s();
            }
            final StickerPickerRow.Sticker sticker = (StickerPickerRow.Sticker) obj;
            View childAt = getChildAt(i10);
            q.f(childAt, "null cannot be cast to non-null type com.discord.sticker.StickerView");
            StickerView stickerView = (StickerView) childAt;
            if (sticker == null) {
                stickerView.setVisibility(4);
                stickerView.recycle();
            } else {
                stickerView.setVisibility(0);
                if (sticker.getOpaque()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.3f;
                }
                stickerView.setAlpha(f10);
                stickerView.setEnabled(!sticker.getDisabled());
                NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(stickerView, false, new View.OnClickListener() { 
                    @Override 
                    public final void onClick(View view) {
                        StickerPickerRowView.configureRowStickerViews$lambda$3$lambda$1(StickerPickerRowView.this, sticker, view);
                    }
                }, 1, null);
                NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(stickerView, false, new View.OnLongClickListener() { 
                    @Override 
                    public final boolean onLongClick(View view) {
                        boolean configureRowStickerViews$lambda$3$lambda$2;
                        configureRowStickerViews$lambda$3$lambda$2 = StickerPickerRowView.configureRowStickerViews$lambda$3$lambda$2(StickerPickerRowView.this, sticker, view);
                        return configureRowStickerViews$lambda$3$lambda$2;
                    }
                }, 1, null);
                int i12 = WhenMappings.$EnumSwitchMapping$0[sticker.getType().ordinal()];
                if (i12 == 1) {
                    stickerView.asPng(sticker.getUrl(), Integer.valueOf(stickerPickerRow.getItemSize()), Integer.valueOf(stickerPickerRow.getItemSize()));
                } else if (i12 == 2) {
                    stickerView.asApng(sticker.getUrl(), Integer.valueOf(stickerPickerRow.getItemSize()), Integer.valueOf(stickerPickerRow.getItemSize()), sticker.getAnimated());
                } else if (i12 == 3) {
                    stickerView.asLottie(sticker.getUrl(), stickerPickerRow.getItemSize(), stickerPickerRow.getItemSize(), sticker.getAnimated(), sticker.getId(), !sticker.getAnimated());
                } else if (i12 == 4) {
                    stickerView.asGif(sticker.getUrl(), Integer.valueOf(stickerPickerRow.getItemSize()), Integer.valueOf(stickerPickerRow.getItemSize()), sticker.getAnimated());
                }
            }
            i10 = i11;
        }
    }

    
    public static final void configureRowStickerViews$lambda$3$lambda$1(StickerPickerRowView this$0, StickerPickerRow.Sticker sticker, View view) {
        q.h(this$0, "this$0");
        this$0.onPressSticker.invoke(sticker.getId());
    }

    
    public static final boolean configureRowStickerViews$lambda$3$lambda$2(StickerPickerRowView this$0, StickerPickerRow.Sticker sticker, View view) {
        q.h(this$0, "this$0");
        this$0.onLongPressSticker.invoke(sticker.getId());
        return true;
    }

    private final void createRowStickerViews(StickerPickerRow stickerPickerRow) {
        int i10;
        removeAllViews();
        int dpToPx = SizeUtilsKt.getDpToPx(stickerPickerRow.getItemSize());
        int size = stickerPickerRow.getItems().size();
        int dpToPx2 = (SizeUtilsKt.getDpToPx(stickerPickerRow.getRowContentWidth()) - (dpToPx * size)) / (size - 1);
        int dpToPx3 = SizeUtilsKt.getDpToPx(stickerPickerRow.getRowContentPaddingVertical());
        int i11 = 0;
        for (Object obj : stickerPickerRow.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                j.s();
            }
            StickerPickerRow.Sticker sticker = (StickerPickerRow.Sticker) obj;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = dpToPx2;
            }
            Context context = getContext();
            q.g(context, "context");
            View stickerView = new StickerView(context, null, 0, 6, null);
            RippleUtilsKt.addRipple$default(stickerView, true, 0, 2, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpToPx, dpToPx);
            layoutParams.setMargins(i10, dpToPx3, 0, dpToPx3);
            stickerView.setLayoutParams(layoutParams);
            addView(stickerView);
            i11 = i12;
        }
    }

    public final void clean() {
        for (View view : k2.a(this)) {
            q.f(view, "null cannot be cast to non-null type com.discord.sticker.StickerView");
            ((StickerView) view).recycle();
        }
    }

    public final Function1<String, Unit> getOnLongPressSticker() {
        return this.onLongPressSticker;
    }

    public final Function1<String, Unit> getOnPressSticker() {
        return this.onPressSticker;
    }

    public final void setOnLongPressSticker(Function1<? super String, Unit> function1) {
        q.h(function1, "<set-?>");
        this.onLongPressSticker = function1;
    }

    public final void setOnPressSticker(Function1<? super String, Unit> function1) {
        q.h(function1, "<set-?>");
        this.onPressSticker = function1;
    }

    public final void setRowData(StickerPickerRow rowData) {
        q.h(rowData, "rowData");
        if (rowData.getItems().size() != getChildCount()) {
            createRowStickerViews(rowData);
        }
        configureRowStickerViews(rowData);
        if (this.firstRenderPass) {
            this.firstRenderPass = false;
        } else {
            ViewMeasureExtensionsKt.measureAndLayout(this);
        }
    }
}
