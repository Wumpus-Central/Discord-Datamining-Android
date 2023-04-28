package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.VideoAttachmentViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002;<B\u001d\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0099\u0001\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002J0\u0010%\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\"j\u0002`#J\u0010\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0002J&\u0010+\u001a\u00020\u00152\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00150\"2\b\u0010*\u001a\u0004\u0018\u00010)R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006="}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/VideoAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "sourceUrl", "previewUrl", "", "width", "height", "maxWidthPx", "maxHeightPx", "radiusPx", "", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "", "portal", "canPlayInline", "progress", "hideMediaPlayButton", "Lkotlin/Function0;", "", "onCancelUpload", "Lcom/discord/chat/presentation/message/view/UploadContext;", "uploadContext", "", "attachmentsOpacity", "setContent", "(Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/discord/chat/bridge/spoiler/SpoilerConfig;DZLjava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;)V", "description", "hint", "setDescription", "show", "showDescription", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onTapShowAltText", "showAltTextButton", "role", "setRole", "onClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "setOnMediaClickListeners", "Lcom/discord/chat/presentation/message/view/VideoAttachmentView$TargetSize;", "targetSize", "Lcom/discord/chat/presentation/message/view/VideoAttachmentView$TargetSize;", "Lcom/discord/chat/presentation/message/view/VideoAttachmentView$TargetUrl;", "targetUrl", "Lcom/discord/chat/presentation/message/view/VideoAttachmentView$TargetUrl;", "Lcom/discord/chat/databinding/VideoAttachmentViewBinding;", "binding", "Lcom/discord/chat/databinding/VideoAttachmentViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TargetSize", "TargetUrl", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VideoAttachmentView extends ConstraintLayout {
    private final VideoAttachmentViewBinding binding;
    private TargetSize targetSize;
    private TargetUrl targetUrl;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/VideoAttachmentView$TargetSize;", "", "width", "", "height", "maxHeightPx", "(III)V", "getHeight", "()I", "getMaxHeightPx", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class TargetSize {
        private final int height;
        private final int maxHeightPx;
        private final int width;

        public TargetSize(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.maxHeightPx = i3;
        }

        public static /* synthetic */ TargetSize copy$default(TargetSize targetSize, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = targetSize.width;
            }
            if ((i4 & 2) != 0) {
                i2 = targetSize.height;
            }
            if ((i4 & 4) != 0) {
                i3 = targetSize.maxHeightPx;
            }
            return targetSize.copy(i, i2, i3);
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

        public final TargetSize copy(int i, int i2, int i3) {
            return new TargetSize(i, i2, i3);
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
            int i = this.width;
            int i2 = this.height;
            int i3 = this.maxHeightPx;
            return "TargetSize(width=" + i + ", height=" + i2 + ", maxHeightPx=" + i3 + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/VideoAttachmentView$TargetUrl;", "", "sourceUrl", "", "previewUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreviewUrl", "()Ljava/lang/String;", "getSourceUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class TargetUrl {
        private final String previewUrl;
        private final String sourceUrl;

        public TargetUrl(String sourceUrl, String previewUrl) {
            C9971q.m14633g(sourceUrl, "sourceUrl");
            C9971q.m14633g(previewUrl, "previewUrl");
            this.sourceUrl = sourceUrl;
            this.previewUrl = previewUrl;
        }

        public static /* synthetic */ TargetUrl copy$default(TargetUrl targetUrl, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = targetUrl.sourceUrl;
            }
            if ((i & 2) != 0) {
                str2 = targetUrl.previewUrl;
            }
            return targetUrl.copy(str, str2);
        }

        public final String component1() {
            return this.sourceUrl;
        }

        public final String component2() {
            return this.previewUrl;
        }

        public final TargetUrl copy(String sourceUrl, String previewUrl) {
            C9971q.m14633g(sourceUrl, "sourceUrl");
            C9971q.m14633g(previewUrl, "previewUrl");
            return new TargetUrl(sourceUrl, previewUrl);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetUrl)) {
                return false;
            }
            TargetUrl targetUrl = (TargetUrl) obj;
            return C9971q.m14638b(this.sourceUrl, targetUrl.sourceUrl) && C9971q.m14638b(this.previewUrl, targetUrl.previewUrl);
        }

        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        public final String getSourceUrl() {
            return this.sourceUrl;
        }

        public int hashCode() {
            return (this.sourceUrl.hashCode() * 31) + this.previewUrl.hashCode();
        }

        public String toString() {
            String str = this.sourceUrl;
            String str2 = this.previewUrl;
            return "TargetUrl(sourceUrl=" + str + ", previewUrl=" + str2 + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoAttachmentView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ VideoAttachmentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
        if (kotlin.jvm.internal.C9971q.m14638b(r1, r0) == false) goto L_0x00a1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (kotlin.jvm.internal.C9971q.m14638b(r3, r0) == false) goto L_0x003a;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setContent(java.lang.String r30, java.lang.String r31, int r32, int r33, int r34, int r35, int r36, boolean r37, com.discord.chat.bridge.spoiler.SpoilerConfig r38, double r39, boolean r41, java.lang.Integer r42, boolean r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, com.discord.chat.presentation.message.view.UploadContext r45, java.lang.Float r46) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.VideoAttachmentView.setContent(java.lang.String, java.lang.String, int, int, int, int, int, boolean, com.discord.chat.bridge.spoiler.SpoilerConfig, double, boolean, java.lang.Integer, boolean, kotlin.jvm.functions.Function0, com.discord.chat.presentation.message.view.UploadContext, java.lang.Float):void");
    }

    public final void setDescription(String str, String str2) {
        MediaView mediaView = this.binding.mediaView;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        mediaView.setContentDescription(str + " " + str2);
    }

    public final void setOnMediaClickListeners(Function1<? super Double, Unit> onClickListener, View.OnLongClickListener onLongClickListener) {
        C9971q.m14633g(onClickListener, "onClickListener");
        this.binding.mediaView.setOnMediaClickListeners(onClickListener, onLongClickListener);
    }

    public final void setRole(final String str) {
        if (str != null) {
            C2733w0.m36990q0(this.binding.mediaView, new C2549a() { // from class: com.discord.chat.presentation.message.view.VideoAttachmentView$setRole$1
                @Override // androidx.core.view.C2549a
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                    C9971q.m14633g(host, "host");
                    C9971q.m14633g(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.m37347v0(str);
                }
            });
        }
    }

    public final void showAltTextButton(boolean z, String str, Function1<? super String, Unit> onTapShowAltText) {
        C9971q.m14633g(onTapShowAltText, "onTapShowAltText");
        AltTextButtonView altTextButtonView = this.binding.mediaViewAltTextButton;
        if (!z) {
            str = null;
        }
        altTextButtonView.configure(str, onTapShowAltText);
    }

    public final void showDescription(boolean z, String str) {
        boolean z2;
        TextView showDescription$lambda$1 = this.binding.mediaViewAltText;
        C9971q.m14634f(showDescription$lambda$1, "showDescription$lambda$1");
        ViewUtilsKt.setOptionalText(showDescription$lambda$1, str);
        int i = 0;
        if (str == null || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            i = 8;
        }
        showDescription$lambda$1.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        VideoAttachmentViewBinding inflate = VideoAttachmentViewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.mediaViewAltText;
        _init_$lambda$0.setImportantForAccessibility(4);
        C9971q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryNormal);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
    }
}
