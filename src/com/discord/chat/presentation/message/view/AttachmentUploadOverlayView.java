package com.discord.chat.presentation.message.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.AttachmentUploadOverlayViewBinding;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u000256B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001bJS\u0010\u001c\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u000fH\u0002J\u0014\u0010%\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ!\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0014\u0010-\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u000202H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationStartDelay", "", "binding", "Lcom/discord/chat/databinding/AttachmentUploadOverlayViewBinding;", "completeViewConfig", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$CompleteViewConfig;", "onAnimationComplete", "Lkotlin/Function0;", "", "progressViewConfig", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$ProgressViewConfig;", "transitionDelay", "transitionInDuration", "transitionOutDuration", "uploadContext", "Lcom/discord/chat/presentation/message/view/UploadContext;", "configureCompleteView", "backgroundSize", "", "checkmarkButtonSize", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "configureProgressView", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "cancelButtonSize", "primaryColor", "progressIndicatorSize", "trackColor", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "resetUploadOverlay", "setOnProgressAnimationComplete", "setProgress", "progress", "(Ljava/lang/Integer;Lcom/discord/chat/presentation/message/view/UploadContext;)V", "setSquareLayoutParam", "view", "Landroid/view/View;", "dimension", "setUploadCancel", "onCancelUpload", "setUploadCompleteBackgroundVisible", "Landroid/animation/ValueAnimator;", "uploadCompleteAnimationSequence", "Landroid/animation/AnimatorSet;", "uploadCompleteCheckmarkFadeInAnim", "uploadCompleteCheckmarkFadeOutAnim", "CompleteViewConfig", "ProgressViewConfig", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AttachmentUploadOverlayView extends ConstraintLayout {
    private final long animationStartDelay;
    private final AttachmentUploadOverlayViewBinding binding;
    private CompleteViewConfig completeViewConfig;
    private Function0<Unit> onAnimationComplete;
    private ProgressViewConfig progressViewConfig;
    private final long transitionDelay;
    private final long transitionInDuration;
    private final long transitionOutDuration;
    private UploadContext uploadContext;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$CompleteViewConfig;", "", "backgroundSize", "", "checkmarkButtonSize", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCheckmarkButtonSize", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$CompleteViewConfig;", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class CompleteViewConfig {
        private final Integer backgroundSize;
        private final Integer checkmarkButtonSize;

        public CompleteViewConfig(Integer num, Integer num2) {
            this.backgroundSize = num;
            this.checkmarkButtonSize = num2;
        }

        public static /* synthetic */ CompleteViewConfig copy$default(CompleteViewConfig completeViewConfig, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = completeViewConfig.backgroundSize;
            }
            if ((i & 2) != 0) {
                num2 = completeViewConfig.checkmarkButtonSize;
            }
            return completeViewConfig.copy(num, num2);
        }

        public final Integer component1() {
            return this.backgroundSize;
        }

        public final Integer component2() {
            return this.checkmarkButtonSize;
        }

        public final CompleteViewConfig copy(Integer num, Integer num2) {
            return new CompleteViewConfig(num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompleteViewConfig)) {
                return false;
            }
            CompleteViewConfig completeViewConfig = (CompleteViewConfig) obj;
            return C9971q.m14638b(this.backgroundSize, completeViewConfig.backgroundSize) && C9971q.m14638b(this.checkmarkButtonSize, completeViewConfig.checkmarkButtonSize);
        }

        public final Integer getBackgroundSize() {
            return this.backgroundSize;
        }

        public final Integer getCheckmarkButtonSize() {
            return this.checkmarkButtonSize;
        }

        public int hashCode() {
            Integer num = this.backgroundSize;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.checkmarkButtonSize;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            Integer num = this.backgroundSize;
            Integer num2 = this.checkmarkButtonSize;
            return "CompleteViewConfig(backgroundSize=" + num + ", checkmarkButtonSize=" + num2 + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\""}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$ProgressViewConfig;", "", "backgroundSize", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "cancelButtonSize", "primaryColor", "progressIndicatorSize", "trackColor", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getBackgroundSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCancelButtonSize", "getPrimaryColor", "getProgressIndicatorSize", "getTrackColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$ProgressViewConfig;", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProgressViewConfig {
        private final Drawable backgroundDrawable;
        private final Integer backgroundSize;
        private final Integer cancelButtonSize;
        private final Integer primaryColor;
        private final Integer progressIndicatorSize;
        private final Integer trackColor;

        public ProgressViewConfig(Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.backgroundSize = num;
            this.backgroundDrawable = drawable;
            this.cancelButtonSize = num2;
            this.primaryColor = num3;
            this.progressIndicatorSize = num4;
            this.trackColor = num5;
        }

        public static /* synthetic */ ProgressViewConfig copy$default(ProgressViewConfig progressViewConfig, Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
            if ((i & 1) != 0) {
                num = progressViewConfig.backgroundSize;
            }
            if ((i & 2) != 0) {
                drawable = progressViewConfig.backgroundDrawable;
            }
            if ((i & 4) != 0) {
                num2 = progressViewConfig.cancelButtonSize;
            }
            if ((i & 8) != 0) {
                num3 = progressViewConfig.primaryColor;
            }
            if ((i & 16) != 0) {
                num4 = progressViewConfig.progressIndicatorSize;
            }
            if ((i & 32) != 0) {
                num5 = progressViewConfig.trackColor;
            }
            return progressViewConfig.copy(num, drawable, num2, num3, num4, num5);
        }

        public final Integer component1() {
            return this.backgroundSize;
        }

        public final Drawable component2() {
            return this.backgroundDrawable;
        }

        public final Integer component3() {
            return this.cancelButtonSize;
        }

        public final Integer component4() {
            return this.primaryColor;
        }

        public final Integer component5() {
            return this.progressIndicatorSize;
        }

        public final Integer component6() {
            return this.trackColor;
        }

        public final ProgressViewConfig copy(Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5) {
            return new ProgressViewConfig(num, drawable, num2, num3, num4, num5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressViewConfig)) {
                return false;
            }
            ProgressViewConfig progressViewConfig = (ProgressViewConfig) obj;
            return C9971q.m14638b(this.backgroundSize, progressViewConfig.backgroundSize) && C9971q.m14638b(this.backgroundDrawable, progressViewConfig.backgroundDrawable) && C9971q.m14638b(this.cancelButtonSize, progressViewConfig.cancelButtonSize) && C9971q.m14638b(this.primaryColor, progressViewConfig.primaryColor) && C9971q.m14638b(this.progressIndicatorSize, progressViewConfig.progressIndicatorSize) && C9971q.m14638b(this.trackColor, progressViewConfig.trackColor);
        }

        public final Drawable getBackgroundDrawable() {
            return this.backgroundDrawable;
        }

        public final Integer getBackgroundSize() {
            return this.backgroundSize;
        }

        public final Integer getCancelButtonSize() {
            return this.cancelButtonSize;
        }

        public final Integer getPrimaryColor() {
            return this.primaryColor;
        }

        public final Integer getProgressIndicatorSize() {
            return this.progressIndicatorSize;
        }

        public final Integer getTrackColor() {
            return this.trackColor;
        }

        public int hashCode() {
            Integer num = this.backgroundSize;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Drawable drawable = this.backgroundDrawable;
            int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            Integer num2 = this.cancelButtonSize;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.primaryColor;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.progressIndicatorSize;
            int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.trackColor;
            if (num5 != null) {
                i = num5.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            Integer num = this.backgroundSize;
            Drawable drawable = this.backgroundDrawable;
            Integer num2 = this.cancelButtonSize;
            Integer num3 = this.primaryColor;
            Integer num4 = this.progressIndicatorSize;
            Integer num5 = this.trackColor;
            return "ProgressViewConfig(backgroundSize=" + num + ", backgroundDrawable=" + drawable + ", cancelButtonSize=" + num2 + ", primaryColor=" + num3 + ", progressIndicatorSize=" + num4 + ", trackColor=" + num5 + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachmentUploadOverlayView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ AttachmentUploadOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void configureCompleteView$default(AttachmentUploadOverlayView attachmentUploadOverlayView, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        attachmentUploadOverlayView.configureCompleteView(num, num2);
    }

    public static /* synthetic */ void configureProgressView$default(AttachmentUploadOverlayView attachmentUploadOverlayView, Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        if ((i & 32) != 0) {
            num5 = null;
        }
        attachmentUploadOverlayView.configureProgressView(num, drawable, num2, num3, num4, num5);
    }

    private final void resetUploadOverlay() {
        this.binding.uploadProgressLayout.setAlpha(1.0f);
        this.binding.uploadComplete.setAlpha(0.0f);
        this.binding.uploadProgress.setProgress(0);
    }

    public static /* synthetic */ void setProgress$default(AttachmentUploadOverlayView attachmentUploadOverlayView, Integer num, UploadContext uploadContext, int i, Object obj) {
        if ((i & 2) != 0) {
            uploadContext = null;
        }
        attachmentUploadOverlayView.setProgress(num, uploadContext);
    }

    private final void setSquareLayoutParam(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C9971q.m14634f(layoutParams, "view.layoutParams");
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUploadCancel$lambda$19(Function0 onCancelUpload, View view) {
        C9971q.m14633g(onCancelUpload, "$onCancelUpload");
        onCancelUpload.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUploadCancel$lambda$20(View view) {
    }

    private final ValueAnimator setUploadCompleteBackgroundVisible() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setStartDelay(this.animationStartDelay);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(0L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AttachmentUploadOverlayView.setUploadCompleteBackgroundVisible$lambda$3$lambda$2(AttachmentUploadOverlayView.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUploadCompleteBackgroundVisible$lambda$3$lambda$2(AttachmentUploadOverlayView this$0, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.binding.uploadCompleteLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    private final AnimatorSet uploadCompleteAnimationSequence() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(setUploadCompleteBackgroundVisible(), uploadCompleteCheckmarkFadeInAnim(), uploadCompleteCheckmarkFadeOutAnim());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.message.view.AttachmentUploadOverlayView$uploadCompleteAnimationSequence$lambda$18$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C9971q.m14633g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Function0 function0;
                C9971q.m14633g(animator, "animator");
                function0 = AttachmentUploadOverlayView.this.onAnimationComplete;
                function0.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                C9971q.m14633g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C9971q.m14633g(animator, "animator");
            }
        });
        return animatorSet;
    }

    private final AnimatorSet uploadCompleteCheckmarkFadeInAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.transitionInDuration);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$5$lambda$4(AttachmentUploadOverlayView.this, valueAnimator2);
            }
        });
        Unit unit = Unit.f22042a;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setFloatValues(0.8f, 0.9f);
        valueAnimator2.setInterpolator(new OvershootInterpolator(8.0f));
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$7$lambda$6(AttachmentUploadOverlayView.this, valueAnimator3);
            }
        });
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setFloatValues(1.0f, 0.0f);
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$9$lambda$8(AttachmentUploadOverlayView.this, valueAnimator4);
            }
        });
        animatorSet.playTogether(valueAnimator, valueAnimator2, valueAnimator3);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$5$lambda$4(AttachmentUploadOverlayView this$0, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.binding.uploadComplete.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$7$lambda$6(AttachmentUploadOverlayView this$0, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.binding.uploadCompleteBackground.setScaleX(floatValue);
        this$0.binding.uploadCompleteBackground.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$9$lambda$8(AttachmentUploadOverlayView this$0, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.binding.uploadProgressLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    private final AnimatorSet uploadCompleteCheckmarkFadeOutAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.transitionOutDuration);
        animatorSet.setStartDelay(this.transitionDelay);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.9f, 0.8f);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeOutAnim$lambda$16$lambda$12$lambda$11(AttachmentUploadOverlayView.this, valueAnimator2);
            }
        });
        Unit unit = Unit.f22042a;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setFloatValues(1.0f, 0.0f);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeOutAnim$lambda$16$lambda$14$lambda$13(AttachmentUploadOverlayView.this, valueAnimator3);
            }
        });
        animatorSet.playTogether(valueAnimator, valueAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.message.view.AttachmentUploadOverlayView$uploadCompleteCheckmarkFadeOutAnim$lambda$16$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C9971q.m14633g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AttachmentUploadOverlayViewBinding attachmentUploadOverlayViewBinding;
                AttachmentUploadOverlayViewBinding attachmentUploadOverlayViewBinding2;
                C9971q.m14633g(animator, "animator");
                attachmentUploadOverlayViewBinding = AttachmentUploadOverlayView.this.binding;
                ConstraintLayout constraintLayout = attachmentUploadOverlayViewBinding.uploadProgressLayout;
                C9971q.m14634f(constraintLayout, "binding.uploadProgressLayout");
                constraintLayout.setVisibility(8);
                attachmentUploadOverlayViewBinding2 = AttachmentUploadOverlayView.this.binding;
                ConstraintLayout constraintLayout2 = attachmentUploadOverlayViewBinding2.uploadCompleteLayout;
                C9971q.m14634f(constraintLayout2, "binding.uploadCompleteLayout");
                constraintLayout2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                C9971q.m14633g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C9971q.m14633g(animator, "animator");
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeOutAnim$lambda$16$lambda$12$lambda$11(AttachmentUploadOverlayView this$0, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.binding.uploadCompleteLayout.setScaleX(floatValue);
        this$0.binding.uploadCompleteLayout.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeOutAnim$lambda$16$lambda$14$lambda$13(AttachmentUploadOverlayView this$0, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.binding.uploadCompleteLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public final void configureCompleteView(Integer num, Integer num2) {
        CompleteViewConfig completeViewConfig = new CompleteViewConfig(num, num2);
        if (!C9971q.m14638b(this.completeViewConfig, completeViewConfig)) {
            if (num != null) {
                MaterialCardView materialCardView = this.binding.uploadCompleteBackground;
                C9971q.m14634f(materialCardView, "binding.uploadCompleteBackground");
                setSquareLayoutParam(materialCardView, num.intValue());
            }
            if (num2 != null) {
                SimpleDraweeView simpleDraweeView = this.binding.uploadComplete;
                C9971q.m14634f(simpleDraweeView, "binding.uploadComplete");
                setSquareLayoutParam(simpleDraweeView, num2.intValue());
            }
            this.completeViewConfig = completeViewConfig;
        }
    }

    public final void configureProgressView(Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5) {
        ProgressViewConfig progressViewConfig = new ProgressViewConfig(num, drawable, num2, num3, num4, num5);
        if (!C9971q.m14638b(this.progressViewConfig, progressViewConfig)) {
            if (num != null) {
                View view = this.binding.uploadProgressBackground;
                C9971q.m14634f(view, "binding.uploadProgressBackground");
                setSquareLayoutParam(view, num.intValue());
            }
            if (drawable != null) {
                this.binding.uploadProgressBackground.setBackground(drawable);
            }
            if (num2 != null) {
                SimpleDraweeView simpleDraweeView = this.binding.uploadCancel;
                C9971q.m14634f(simpleDraweeView, "binding.uploadCancel");
                setSquareLayoutParam(simpleDraweeView, num2.intValue());
            }
            if (num3 != null) {
                SimpleDraweeView simpleDraweeView2 = this.binding.uploadCancel;
                C9971q.m14634f(simpleDraweeView2, "binding.uploadCancel");
                ColorUtilsKt.setTintColor(simpleDraweeView2, num3);
                this.binding.uploadProgress.setIndicatorColor(num3.intValue());
            }
            if (num4 != null) {
                this.binding.uploadProgress.setIndicatorSize(num4.intValue());
            }
            if (num5 != null) {
                this.binding.uploadProgress.setTrackColor(num5.intValue());
            }
            this.progressViewConfig = progressViewConfig;
        }
    }

    public final void setOnProgressAnimationComplete(Function0<Unit> onAnimationComplete) {
        C9971q.m14633g(onAnimationComplete, "onAnimationComplete");
        this.onAnimationComplete = onAnimationComplete;
    }

    public final void setProgress(Integer num, UploadContext uploadContext) {
        boolean z;
        if (!C9971q.m14638b(this.uploadContext, uploadContext)) {
            this.uploadContext = uploadContext;
            resetUploadOverlay();
        }
        int progress = this.binding.uploadProgress.getProgress();
        if (num != null && num.intValue() == progress) {
            z = false;
        } else {
            z = true;
        }
        if (num != null && z) {
            ConstraintLayout constraintLayout = this.binding.uploadProgressLayout;
            C9971q.m14634f(constraintLayout, "binding.uploadProgressLayout");
            constraintLayout.setVisibility(0);
            this.binding.uploadProgress.m27804o(num.intValue(), true);
            if (num.intValue() >= 100) {
                ConstraintLayout constraintLayout2 = this.binding.uploadCompleteLayout;
                C9971q.m14634f(constraintLayout2, "binding.uploadCompleteLayout");
                constraintLayout2.setVisibility(0);
                uploadCompleteAnimationSequence().start();
            }
        }
    }

    public final void setUploadCancel(final Function0<Unit> onCancelUpload) {
        C9971q.m14633g(onCancelUpload, "onCancelUpload");
        if (this.binding.uploadProgress.getProgress() != 100) {
            ConstraintLayout constraintLayout = this.binding.uploadProgressLayout;
            C9971q.m14634f(constraintLayout, "binding.uploadProgressLayout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AttachmentUploadOverlayView.setUploadCancel$lambda$19(Function0.this, view);
                }
            }, 1, null);
            return;
        }
        ConstraintLayout constraintLayout2 = this.binding.uploadProgressLayout;
        C9971q.m14634f(constraintLayout2, "binding.uploadProgressLayout");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout2, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AttachmentUploadOverlayView.setUploadCancel$lambda$20(view);
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentUploadOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        this.transitionInDuration = 250L;
        this.transitionOutDuration = 175L;
        this.transitionDelay = 400L;
        this.animationStartDelay = 1000L;
        AttachmentUploadOverlayViewBinding inflate = AttachmentUploadOverlayViewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.onAnimationComplete = AttachmentUploadOverlayView$onAnimationComplete$1.INSTANCE;
        SimpleDraweeView it = inflate.uploadCancel;
        C9971q.m14634f(it, "it");
        ReactAssetUtilsKt.setReactAsset(it, ReactAsset.Cancel);
        ColorUtilsKt.setTintColor(it, Integer.valueOf(Color.argb(255, 255, 255, 255)));
        I18nUtilsKt.i18nContentDescription$default(it, I18nMessage.CANCEL, (Function1) null, 2, (Object) null);
        SimpleDraweeView it2 = inflate.uploadComplete;
        C9971q.m14634f(it2, "it");
        ReactAssetUtilsKt.setReactAsset(it2, ReactAsset.Checkmark);
        ColorUtilsKt.setTintColor(it2, Integer.valueOf(Color.argb(255, 88, 101, 242)));
        I18nUtilsKt.i18nContentDescription$default(it2, I18nMessage.UPLOAD_COMPLETE, (Function1) null, 2, (Object) null);
    }
}
