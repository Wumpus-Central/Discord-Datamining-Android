package com.discord.chat.bridge.automod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.a2;
import ti.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267Bs\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J!\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205HÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00068"}, d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationContext;", "", "seen1", "", "headerText", "", "headerBadgeText", "ruleDisplayText", "keywordDisplayText", "actionsIconURL", "actionsText", "feedbackText", "message", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "notification", "Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;Lcom/discord/chat/bridge/automod/AutoModerationNotification;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;Lcom/discord/chat/bridge/automod/AutoModerationNotification;)V", "getActionsIconURL", "()Ljava/lang/String;", "getActionsText", "getFeedbackText", "getHeaderBadgeText", "getHeaderText", "getKeywordDisplayText", "getMessage", "()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "getNotification", "()Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "getRuleDisplayText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoModerationContext {
    public static final Companion Companion = new Companion(null);
    private final String actionsIconURL;
    private final String actionsText;
    private final String feedbackText;
    private final String headerBadgeText;
    private final String headerText;
    private final String keywordDisplayText;
    private final FlaggedMessageEmbed message;
    private final AutoModerationNotification notification;
    private final String ruleDisplayText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoModerationContext> serializer() {
            return AutoModerationContext$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoModerationContext(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, FlaggedMessageEmbed flaggedMessageEmbed, AutoModerationNotification autoModerationNotification, SerializationConstructorMarker serializationConstructorMarker) {
        if (227 != (i10 & 227)) {
            n1.b(i10, 227, AutoModerationContext$$serializer.INSTANCE.getDescriptor());
        }
        this.headerText = str;
        this.headerBadgeText = str2;
        if ((i10 & 4) == 0) {
            this.ruleDisplayText = null;
        } else {
            this.ruleDisplayText = str3;
        }
        if ((i10 & 8) == 0) {
            this.keywordDisplayText = null;
        } else {
            this.keywordDisplayText = str4;
        }
        if ((i10 & 16) == 0) {
            this.actionsIconURL = null;
        } else {
            this.actionsIconURL = str5;
        }
        this.actionsText = str6;
        this.feedbackText = str7;
        this.message = flaggedMessageEmbed;
        if ((i10 & 256) == 0) {
            this.notification = null;
        } else {
            this.notification = autoModerationNotification;
        }
    }

    public static final void write$Self(AutoModerationContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        output.t(serialDesc, 0, self.headerText);
        output.t(serialDesc, 1, self.headerBadgeText);
        if (!output.w(serialDesc, 2) && self.ruleDisplayText == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 2, a2.f26939a, self.ruleDisplayText);
        }
        if (!output.w(serialDesc, 3) && self.keywordDisplayText == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 3, a2.f26939a, self.keywordDisplayText);
        }
        if (!output.w(serialDesc, 4) && self.actionsIconURL == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.e(serialDesc, 4, a2.f26939a, self.actionsIconURL);
        }
        output.t(serialDesc, 5, self.actionsText);
        output.t(serialDesc, 6, self.feedbackText);
        output.C(serialDesc, 7, FlaggedMessageEmbed$$serializer.INSTANCE, self.message);
        if (output.w(serialDesc, 8) || self.notification != null) {
            z13 = true;
        }
        if (z13) {
            output.e(serialDesc, 8, AutoModerationNotification$$serializer.INSTANCE, self.notification);
        }
    }

    public final String component1() {
        return this.headerText;
    }

    public final String component2() {
        return this.headerBadgeText;
    }

    public final String component3() {
        return this.ruleDisplayText;
    }

    public final String component4() {
        return this.keywordDisplayText;
    }

    public final String component5() {
        return this.actionsIconURL;
    }

    public final String component6() {
        return this.actionsText;
    }

    public final String component7() {
        return this.feedbackText;
    }

    public final FlaggedMessageEmbed component8() {
        return this.message;
    }

    public final AutoModerationNotification component9() {
        return this.notification;
    }

    public final AutoModerationContext copy(String headerText, String headerBadgeText, String str, String str2, String str3, String actionsText, String feedbackText, FlaggedMessageEmbed message, AutoModerationNotification autoModerationNotification) {
        q.g(headerText, "headerText");
        q.g(headerBadgeText, "headerBadgeText");
        q.g(actionsText, "actionsText");
        q.g(feedbackText, "feedbackText");
        q.g(message, "message");
        return new AutoModerationContext(headerText, headerBadgeText, str, str2, str3, actionsText, feedbackText, message, autoModerationNotification);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoModerationContext)) {
            return false;
        }
        AutoModerationContext autoModerationContext = (AutoModerationContext) obj;
        return q.b(this.headerText, autoModerationContext.headerText) && q.b(this.headerBadgeText, autoModerationContext.headerBadgeText) && q.b(this.ruleDisplayText, autoModerationContext.ruleDisplayText) && q.b(this.keywordDisplayText, autoModerationContext.keywordDisplayText) && q.b(this.actionsIconURL, autoModerationContext.actionsIconURL) && q.b(this.actionsText, autoModerationContext.actionsText) && q.b(this.feedbackText, autoModerationContext.feedbackText) && q.b(this.message, autoModerationContext.message) && q.b(this.notification, autoModerationContext.notification);
    }

    public final String getActionsIconURL() {
        return this.actionsIconURL;
    }

    public final String getActionsText() {
        return this.actionsText;
    }

    public final String getFeedbackText() {
        return this.feedbackText;
    }

    public final String getHeaderBadgeText() {
        return this.headerBadgeText;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getKeywordDisplayText() {
        return this.keywordDisplayText;
    }

    public final FlaggedMessageEmbed getMessage() {
        return this.message;
    }

    public final AutoModerationNotification getNotification() {
        return this.notification;
    }

    public final String getRuleDisplayText() {
        return this.ruleDisplayText;
    }

    public int hashCode() {
        int hashCode = ((this.headerText.hashCode() * 31) + this.headerBadgeText.hashCode()) * 31;
        String str = this.ruleDisplayText;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keywordDisplayText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionsIconURL;
        int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.actionsText.hashCode()) * 31) + this.feedbackText.hashCode()) * 31) + this.message.hashCode()) * 31;
        AutoModerationNotification autoModerationNotification = this.notification;
        if (autoModerationNotification != null) {
            i10 = autoModerationNotification.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.headerText;
        String str2 = this.headerBadgeText;
        String str3 = this.ruleDisplayText;
        String str4 = this.keywordDisplayText;
        String str5 = this.actionsIconURL;
        String str6 = this.actionsText;
        String str7 = this.feedbackText;
        FlaggedMessageEmbed flaggedMessageEmbed = this.message;
        AutoModerationNotification autoModerationNotification = this.notification;
        return "AutoModerationContext(headerText=" + str + ", headerBadgeText=" + str2 + ", ruleDisplayText=" + str3 + ", keywordDisplayText=" + str4 + ", actionsIconURL=" + str5 + ", actionsText=" + str6 + ", feedbackText=" + str7 + ", message=" + flaggedMessageEmbed + ", notification=" + autoModerationNotification + ")";
    }

    public AutoModerationContext(String headerText, String headerBadgeText, String str, String str2, String str3, String actionsText, String feedbackText, FlaggedMessageEmbed message, AutoModerationNotification autoModerationNotification) {
        q.g(headerText, "headerText");
        q.g(headerBadgeText, "headerBadgeText");
        q.g(actionsText, "actionsText");
        q.g(feedbackText, "feedbackText");
        q.g(message, "message");
        this.headerText = headerText;
        this.headerBadgeText = headerBadgeText;
        this.ruleDisplayText = str;
        this.keywordDisplayText = str2;
        this.actionsIconURL = str3;
        this.actionsText = actionsText;
        this.feedbackText = feedbackText;
        this.message = message;
        this.notification = autoModerationNotification;
    }

    public /* synthetic */ AutoModerationContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, FlaggedMessageEmbed flaggedMessageEmbed, AutoModerationNotification autoModerationNotification, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, str6, str7, flaggedMessageEmbed, (i10 & 256) != 0 ? null : autoModerationNotification);
    }
}
