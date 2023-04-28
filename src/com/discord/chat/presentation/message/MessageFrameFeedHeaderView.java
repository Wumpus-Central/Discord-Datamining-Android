package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bj.C3622a2;
import bj.C3643f;
import bj.C3681n1;
import com.discord.chat.databinding.MessageFrameFeedHeaderBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageFrameFeedHeaderBinding;", "configure", "", "messageFrame", "Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;", "onOverflowClick", "Landroid/view/View$OnClickListener;", "MessageBundleHeader", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageFrameFeedHeaderView extends ConstraintLayout {
    private final MessageFrameFeedHeaderBinding binding;

    @AbstractC14435f
    @Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BS\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rBG\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006("}, m15073d2 = {"Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;", "", "seen1", "", "channelIconURL", "", "chatIconURL", "avatarURLs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "channelName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getAvatarURLs", "()Ljava/util/ArrayList;", "getChannelIconURL", "()Ljava/lang/String;", "getChannelName", "getChatIconURL", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class MessageBundleHeader {
        public static final Companion Companion = new Companion(null);
        private final ArrayList<String> avatarURLs;
        private final String channelIconURL;
        private final String channelName;
        private final String chatIconURL;

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<MessageBundleHeader> serializer() {
                return MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE;
            }
        }

        public MessageBundleHeader() {
            this((String) null, (String) null, (ArrayList) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ MessageBundleHeader(int i, String str, String str2, ArrayList arrayList, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                C3681n1.m33818b(i, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.channelIconURL = null;
            } else {
                this.channelIconURL = str;
            }
            if ((i & 2) == 0) {
                this.chatIconURL = null;
            } else {
                this.chatIconURL = str2;
            }
            if ((i & 4) == 0) {
                this.avatarURLs = null;
            } else {
                this.avatarURLs = arrayList;
            }
            if ((i & 8) == 0) {
                this.channelName = null;
            } else {
                this.channelName = str3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageBundleHeader copy$default(MessageBundleHeader messageBundleHeader, String str, String str2, ArrayList arrayList, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageBundleHeader.channelIconURL;
            }
            if ((i & 2) != 0) {
                str2 = messageBundleHeader.chatIconURL;
            }
            if ((i & 4) != 0) {
                arrayList = messageBundleHeader.avatarURLs;
            }
            if ((i & 8) != 0) {
                str3 = messageBundleHeader.channelName;
            }
            return messageBundleHeader.copy(str, str2, arrayList, str3);
        }

        public static final void write$Self(MessageBundleHeader self, CompositeEncoder output, SerialDescriptor serialDesc) {
            boolean z;
            boolean z2;
            boolean z3;
            C9971q.m14633g(self, "self");
            C9971q.m14633g(output, "output");
            C9971q.m14633g(serialDesc, "serialDesc");
            boolean z4 = false;
            if (!output.mo13893A(serialDesc, 0) && self.channelIconURL == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                output.mo13874p(serialDesc, 0, C3622a2.f5917a, self.channelIconURL);
            }
            if (!output.mo13893A(serialDesc, 1) && self.chatIconURL == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                output.mo13874p(serialDesc, 1, C3622a2.f5917a, self.chatIconURL);
            }
            if (!output.mo13893A(serialDesc, 2) && self.avatarURLs == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                output.mo13874p(serialDesc, 2, new C3643f(C3622a2.f5917a), self.avatarURLs);
            }
            if (output.mo13893A(serialDesc, 3) || self.channelName != null) {
                z4 = true;
            }
            if (z4) {
                output.mo13874p(serialDesc, 3, C3622a2.f5917a, self.channelName);
            }
        }

        public final String component1() {
            return this.channelIconURL;
        }

        public final String component2() {
            return this.chatIconURL;
        }

        public final ArrayList<String> component3() {
            return this.avatarURLs;
        }

        public final String component4() {
            return this.channelName;
        }

        public final MessageBundleHeader copy(String str, String str2, ArrayList<String> arrayList, String str3) {
            return new MessageBundleHeader(str, str2, arrayList, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageBundleHeader)) {
                return false;
            }
            MessageBundleHeader messageBundleHeader = (MessageBundleHeader) obj;
            return C9971q.m14638b(this.channelIconURL, messageBundleHeader.channelIconURL) && C9971q.m14638b(this.chatIconURL, messageBundleHeader.chatIconURL) && C9971q.m14638b(this.avatarURLs, messageBundleHeader.avatarURLs) && C9971q.m14638b(this.channelName, messageBundleHeader.channelName);
        }

        public final ArrayList<String> getAvatarURLs() {
            return this.avatarURLs;
        }

        public final String getChannelIconURL() {
            return this.channelIconURL;
        }

        public final String getChannelName() {
            return this.channelName;
        }

        public final String getChatIconURL() {
            return this.chatIconURL;
        }

        public int hashCode() {
            String str = this.channelIconURL;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.chatIconURL;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ArrayList<String> arrayList = this.avatarURLs;
            int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str3 = this.channelName;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            String str = this.channelIconURL;
            String str2 = this.chatIconURL;
            ArrayList<String> arrayList = this.avatarURLs;
            String str3 = this.channelName;
            return "MessageBundleHeader(channelIconURL=" + str + ", chatIconURL=" + str2 + ", avatarURLs=" + arrayList + ", channelName=" + str3 + ")";
        }

        public MessageBundleHeader(String str, String str2, ArrayList<String> arrayList, String str3) {
            this.channelIconURL = str;
            this.chatIconURL = str2;
            this.avatarURLs = arrayList;
            this.channelName = str3;
        }

        public /* synthetic */ MessageBundleHeader(String str, String str2, ArrayList arrayList, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageFrameFeedHeaderView(Context context) {
        this(context, null, 0, 6, null);
        C9971q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageFrameFeedHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ MessageFrameFeedHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r8 = kotlin.collections.C9914r.m14741x0(r8, 3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void configure(com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader r8, android.view.View.OnClickListener r9) {
        /*
            r7 = this;
            java.lang.String r0 = "messageFrame"
            kotlin.jvm.internal.C9971q.m14633g(r8, r0)
            com.discord.chat.databinding.MessageFrameFeedHeaderBinding r0 = r7.binding
            android.widget.TextView r0 = r0.feedChannelText
            java.lang.String r1 = "configure$lambda$2"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.lang.String r1 = r8.getChannelName()
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r1)
            java.lang.String r1 = r8.getChannelIconURL()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            r1 = r2
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            r4 = 8
            if (r1 == 0) goto L_0x0026
            r1 = r3
            goto L_0x0027
        L_0x0026:
            r1 = r4
        L_0x0027:
            r0.setVisibility(r1)
            com.discord.chat.databinding.MessageFrameFeedHeaderBinding r0 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r0.feedChannelIcon
            java.lang.String r1 = "binding.feedChannelIcon"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.lang.String r1 = r8.getChannelIconURL()
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r0, r1)
            com.discord.chat.databinding.MessageFrameFeedHeaderBinding r0 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r0.feedReplyIcon
            java.lang.String r1 = "configure$lambda$3"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.lang.String r1 = r8.getChatIconURL()
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r0, r1)
            r1 = 0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(r0, r3, r9, r2, r1)
            java.util.ArrayList r9 = r8.getAvatarURLs()
            if (r9 == 0) goto L_0x0059
            int r9 = r9.size()
            goto L_0x005a
        L_0x0059:
            r9 = r3
        L_0x005a:
            com.discord.chat.databinding.MessageFrameFeedHeaderBinding r0 = r7.binding
            android.widget.TextView r0 = r0.feedReplyCount
            java.lang.String r5 = "binding.feedReplyCount"
            kotlin.jvm.internal.C9971q.m14634f(r0, r5)
            r5 = 3
            if (r9 <= r5) goto L_0x0069
            java.lang.String r6 = "3+"
            goto L_0x0071
        L_0x0069:
            if (r9 <= 0) goto L_0x0070
            java.lang.String r6 = java.lang.String.valueOf(r9)
            goto L_0x0071
        L_0x0070:
            r6 = r1
        L_0x0071:
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r6)
            com.discord.chat.databinding.MessageFrameFeedHeaderBinding r0 = r7.binding
            com.discord.overlapping_circles.OverlappingCirclesView r0 = r0.feedReplyParticipants
            java.util.ArrayList r8 = r8.getAvatarURLs()
            if (r8 == 0) goto L_0x00a8
            java.util.List r8 = kotlin.collections.C9904h.m14833x0(r8, r5)
            if (r8 == 0) goto L_0x00a8
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C9904h.m14841t(r8, r5)
            r1.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x0093:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x00a8
            java.lang.Object r5 = r8.next()
            java.lang.String r5 = (java.lang.String) r5
            com.discord.overlapping_circles.OverlappingItem r6 = new com.discord.overlapping_circles.OverlappingItem
            r6.<init>(r5)
            r1.add(r6)
            goto L_0x0093
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            java.util.List r1 = kotlin.collections.C9904h.m14862i()
        L_0x00ae:
            r0.setItems(r1)
            java.lang.String r8 = "configure$lambda$5"
            kotlin.jvm.internal.C9971q.m14634f(r0, r8)
            if (r9 <= 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r2 = r3
        L_0x00ba:
            if (r2 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r3 = r4
        L_0x00be:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.MessageFrameFeedHeaderView.configure(com.discord.chat.presentation.message.MessageFrameFeedHeaderView$MessageBundleHeader, android.view.View$OnClickListener):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFrameFeedHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9971q.m14633g(context, "context");
        MessageFrameFeedHeaderBinding inflate = MessageFrameFeedHeaderBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.feedChannelText;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9971q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        TextView _init_$lambda$1 = inflate.feedReplyCount;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9971q.m14634f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SimpleDraweeView simpleDraweeView = inflate.feedChannelIcon;
        C9971q.m14634f(simpleDraweeView, "binding.feedChannelIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        SimpleDraweeView simpleDraweeView2 = inflate.feedReplyIcon;
        C9971q.m14634f(simpleDraweeView2, "binding.feedReplyIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getTextNormal()));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12));
    }
}
