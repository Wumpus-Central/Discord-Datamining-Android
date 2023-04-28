package com.discord.chat.bridge.automod;

import bj.C2500a2;
import bj.C2560n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p164j$.util.Spliterator;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267Bs\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J!\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205HÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00068"}, m15073d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationContext;", "", "seen1", "", "headerText", "", "headerBadgeText", "ruleDisplayText", "keywordDisplayText", "actionsIconURL", "actionsText", "feedbackText", "message", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "notification", "Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;Lcom/discord/chat/bridge/automod/AutoModerationNotification;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;Lcom/discord/chat/bridge/automod/AutoModerationNotification;)V", "getActionsIconURL", "()Ljava/lang/String;", "getActionsText", "getFeedbackText", "getHeaderBadgeText", "getHeaderText", "getKeywordDisplayText", "getMessage", "()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "getNotification", "()Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "getRuleDisplayText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
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

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
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

    public /* synthetic */ AutoModerationContext(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, FlaggedMessageEmbed flaggedMessageEmbed, AutoModerationNotification autoModerationNotification, SerializationConstructorMarker serializationConstructorMarker) {
        if (227 != (i & 227)) {
            C2560n1.m33818b(i, 227, AutoModerationContext$$serializer.INSTANCE.getDescriptor());
        }
        this.headerText = str;
        this.headerBadgeText = str2;
        if ((i & 4) == 0) {
            this.ruleDisplayText = null;
        } else {
            this.ruleDisplayText = str3;
        }
        if ((i & 8) == 0) {
            this.keywordDisplayText = null;
        } else {
            this.keywordDisplayText = str4;
        }
        if ((i & 16) == 0) {
            this.actionsIconURL = null;
        } else {
            this.actionsIconURL = str5;
        }
        this.actionsText = str6;
        this.feedbackText = str7;
        this.message = flaggedMessageEmbed;
        if ((i & Spliterator.NONNULL) == 0) {
            this.notification = null;
        } else {
            this.notification = autoModerationNotification;
        }
    }

    public static final void write$Self(AutoModerationContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo13864z(serialDesc, 0, self.headerText);
        output.mo13864z(serialDesc, 1, self.headerBadgeText);
        if (!output.mo13893A(serialDesc, 2) && self.ruleDisplayText == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, C2500a2.f6719a, self.ruleDisplayText);
        }
        if (!output.mo13893A(serialDesc, 3) && self.keywordDisplayText == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 3, C2500a2.f6719a, self.keywordDisplayText);
        }
        if (!output.mo13893A(serialDesc, 4) && self.actionsIconURL == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            output.mo13874p(serialDesc, 4, C2500a2.f6719a, self.actionsIconURL);
        }
        output.mo13864z(serialDesc, 5, self.actionsText);
        output.mo13864z(serialDesc, 6, self.feedbackText);
        output.mo13870t(serialDesc, 7, FlaggedMessageEmbed$$serializer.INSTANCE, self.message);
        if (output.mo13893A(serialDesc, 8) || self.notification != null) {
            z4 = true;
        }
        if (z4) {
            output.mo13874p(serialDesc, 8, AutoModerationNotification$$serializer.INSTANCE, self.notification);
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
        C9677q.m14633g(headerText, "headerText");
        C9677q.m14633g(headerBadgeText, "headerBadgeText");
        C9677q.m14633g(actionsText, "actionsText");
        C9677q.m14633g(feedbackText, "feedbackText");
        C9677q.m14633g(message, "message");
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
        return C9677q.m14638b(this.headerText, autoModerationContext.headerText) && C9677q.m14638b(this.headerBadgeText, autoModerationContext.headerBadgeText) && C9677q.m14638b(this.ruleDisplayText, autoModerationContext.ruleDisplayText) && C9677q.m14638b(this.keywordDisplayText, autoModerationContext.keywordDisplayText) && C9677q.m14638b(this.actionsIconURL, autoModerationContext.actionsIconURL) && C9677q.m14638b(this.actionsText, autoModerationContext.actionsText) && C9677q.m14638b(this.feedbackText, autoModerationContext.feedbackText) && C9677q.m14638b(this.message, autoModerationContext.message) && C9677q.m14638b(this.notification, autoModerationContext.notification);
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
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keywordDisplayText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionsIconURL;
        int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.actionsText.hashCode()) * 31) + this.feedbackText.hashCode()) * 31) + this.message.hashCode()) * 31;
        AutoModerationNotification autoModerationNotification = this.notification;
        if (autoModerationNotification != null) {
            i = autoModerationNotification.hashCode();
        }
        return hashCode4 + i;
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
        C9677q.m14633g(headerText, "headerText");
        C9677q.m14633g(headerBadgeText, "headerBadgeText");
        C9677q.m14633g(actionsText, "actionsText");
        C9677q.m14633g(feedbackText, "feedbackText");
        C9677q.m14633g(message, "message");
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

    public /* synthetic */ AutoModerationContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, FlaggedMessageEmbed flaggedMessageEmbed, AutoModerationNotification autoModerationNotification, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, str7, flaggedMessageEmbed, (i & Spliterator.NONNULL) != 0 ? null : autoModerationNotification);
    }
}
