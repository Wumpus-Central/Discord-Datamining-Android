package com.discord.chat.bridge.spoiler;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÂ\u0003ø\u0001\u0000J\u0018\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÂ\u0003ø\u0001\u0000JB\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001ø\u0001\u0000J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u0004\u001a\u00020\u0007J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "", "attributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onReveal", "Lkotlin/Function1;", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "", "onHide", "(Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SpoilerConfig {
    private final SpoilerAttributes attributes;
    private final Function1<SpoilerIdentifier, Unit> onHide;
    private final Function1<SpoilerIdentifier, Unit> onReveal;

    
    public SpoilerConfig(SpoilerAttributes attributes, Function1<? super SpoilerIdentifier, Unit> onReveal, Function1<? super SpoilerIdentifier, Unit> onHide) {
        q.h(attributes, "attributes");
        q.h(onReveal, "onReveal");
        q.h(onHide, "onHide");
        this.attributes = attributes;
        this.onReveal = onReveal;
        this.onHide = onHide;
    }

    private final Function1<SpoilerIdentifier, Unit> component2() {
        return this.onReveal;
    }

    private final Function1<SpoilerIdentifier, Unit> component3() {
        return this.onHide;
    }

    
    public static  SpoilerConfig copy$default(SpoilerConfig spoilerConfig, SpoilerAttributes spoilerAttributes, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            spoilerAttributes = spoilerConfig.attributes;
        }
        if ((i10 & 2) != 0) {
            function1 = spoilerConfig.onReveal;
        }
        if ((i10 & 4) != 0) {
            function12 = spoilerConfig.onHide;
        }
        return spoilerConfig.copy(spoilerAttributes, function1, function12);
    }

    public final SpoilerAttributes component1() {
        return this.attributes;
    }

    public final SpoilerConfig copy(SpoilerAttributes attributes, Function1<? super SpoilerIdentifier, Unit> onReveal, Function1<? super SpoilerIdentifier, Unit> onHide) {
        q.h(attributes, "attributes");
        q.h(onReveal, "onReveal");
        q.h(onHide, "onHide");
        return new SpoilerConfig(attributes, onReveal, onHide);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpoilerConfig)) {
            return false;
        }
        SpoilerConfig spoilerConfig = (SpoilerConfig) obj;
        return q.c(this.attributes, spoilerConfig.attributes) && q.c(this.onReveal, spoilerConfig.onReveal) && q.c(this.onHide, spoilerConfig.onHide);
    }

    public final SpoilerAttributes getAttributes() {
        return this.attributes;
    }

    public int hashCode() {
        return (((this.attributes.hashCode() * 31) + this.onReveal.hashCode()) * 31) + this.onHide.hashCode();
    }

    public final void onHide() {
        this.onHide.invoke(SpoilerIdentifier.m132boximpl(this.attributes.m128getIdentifierBq9X6Gg()));
    }

    public final void onReveal() {
        this.onReveal.invoke(SpoilerIdentifier.m132boximpl(this.attributes.m128getIdentifierBq9X6Gg()));
    }

    public String toString() {
        SpoilerAttributes spoilerAttributes = this.attributes;
        Function1<SpoilerIdentifier, Unit> function1 = this.onReveal;
        Function1<SpoilerIdentifier, Unit> function12 = this.onHide;
        return "SpoilerConfig(attributes=" + spoilerAttributes + ", onReveal=" + function1 + ", onHide=" + function12 + ")";
    }
}
