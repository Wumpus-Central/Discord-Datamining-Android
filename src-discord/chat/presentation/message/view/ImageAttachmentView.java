package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.a;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.w0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.ImageAttachmentViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00015B\u001d\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0081\u0001\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002J0\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u001fj\u0002` J\u0010\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\u0002R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00066"}, d2 = {"Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "url", "", "width", "height", "maxHeightPx", "maxWidthPx", "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", ViewProps.RESIZE_MODE, "", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "radiusPx", "progress", "Lkotlin/Function0;", "", "onCancelUpload", "Lcom/discord/chat/presentation/message/view/UploadContext;", "uploadContext", "", "attachmentsOpacity", "setContent", "(Ljava/lang/String;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ILjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;)V", "description", "hint", "setDescription", "show", "showDescription", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onTapShowAltText", "showAltTextButton", "role", "setRole", "Lcom/discord/chat/databinding/ImageAttachmentViewBinding;", "binding", "Lcom/discord/chat/databinding/ImageAttachmentViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ImageAttachmentViewBinding;", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView$TargetSize;", "targetSize", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView$TargetSize;", "targetUrl", "Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TargetSize", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ImageAttachmentView extends ConstraintLayout {
    private final ImageAttachmentViewBinding binding;
    private TargetSize targetSize;
    private String targetUrl;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/ImageAttachmentView$TargetSize;", "", "width", "", "height", "maxHeightPx", "(III)V", "getHeight", "()I", "getMaxHeightPx", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class TargetSize {
        private final int height;
        private final int maxHeightPx;
        private final int width;

        public TargetSize(int i10, int i11, int i12) {
            this.width = i10;
            this.height = i11;
            this.maxHeightPx = i12;
        }

        public static  TargetSize copy$default(TargetSize targetSize, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = targetSize.width;
            }
            if ((i13 & 2) != 0) {
                i11 = targetSize.height;
            }
            if ((i13 & 4) != 0) {
                i12 = targetSize.maxHeightPx;
            }
            return targetSize.copy(i10, i11, i12);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.maxHeightPx;
        }

        public final TargetSize copy(int i10, int i11, int i12) {
            return new TargetSize(i10, i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetSize)) {
                return false;
            }
            TargetSize targetSize = (TargetSize) obj;
            return this.width == targetSize.width && this.height == targetSize.height && this.maxHeightPx == targetSize.maxHeightPx;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxHeightPx() {
            return this.maxHeightPx;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((this.width * 31) + this.height) * 31) + this.maxHeightPx;
        }

        public String toString() {
            int i10 = this.width;
            int i11 = this.height;
            int i12 = this.maxHeightPx;
            return "TargetSize(width=" + i10 + ", height=" + i11 + ", maxHeightPx=" + i12 + ")";
        }
    }

    
    public ImageAttachmentView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  ImageAttachmentView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final ImageAttachmentViewBinding getBinding() {
        return this.binding;
    }

    
    
    
    
    
    public final void setContent(java.lang.String r14, int r15, int r16, int r17, int r18, com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode r19, boolean r20, com.discord.chat.bridge.spoiler.SpoilerConfig r21, int r22, java.lang.Integer r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, com.discord.chat.presentation.message.view.UploadContext r25, java.lang.Float r26) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.ImageAttachmentView.setContent(java.lang.String, int, int, int, int, com.discord.chat.presentation.media.MediaContainingViewResizer$ResizeMode, boolean, com.discord.chat.bridge.spoiler.SpoilerConfig, int, java.lang.Integer, kotlin.jvm.functions.Function0, com.discord.chat.presentation.message.view.UploadContext, java.lang.Float):void");
    }

    public final void setDescription(String str, String str2) {
        if (str != null) {
            SimpleDraweeView simpleDraweeView = this.binding.image;
            if (str2 == null) {
                str2 = "";
            }
            simpleDraweeView.setContentDescription(str + " " + str2);
        }
    }

    public final void setRole(final String str) {
        if (str != null) {
            w0.q0(this.binding.image, new a() { 
                @Override 
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                    q.h(host, "host");
                    q.h(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.B0(str);
                }
            });
        }
    }

    public final void showAltTextButton(boolean z10, String str, Function1<? super String, Unit> onTapShowAltText) {
        q.h(onTapShowAltText, "onTapShowAltText");
        AltTextButtonView altTextButtonView = this.binding.mediaViewAltTextButton;
        if (!z10) {
            str = null;
        }
        altTextButtonView.configure(str, onTapShowAltText);
    }

    public final void showDescription(boolean z10, String str) {
        boolean z11;
        TextView showDescription$lambda$1 = this.binding.imageAltText;
        q.g(showDescription$lambda$1, "showDescription$lambda$1");
        ViewUtilsKt.setOptionalText(showDescription$lambda$1, str);
        int i10 = 0;
        if (str == null || !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            i10 = 8;
        }
        showDescription$lambda$1.setVisibility(i10);
    }

    
    public ImageAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        ImageAttachmentViewBinding inflate = ImageAttachmentViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.image.getHierarchy().z(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
        TextView _init_$lambda$0 = inflate.imageAltText;
        _init_$lambda$0.setImportantForAccessibility(4);
        q.g(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryNormal);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
    }
}
