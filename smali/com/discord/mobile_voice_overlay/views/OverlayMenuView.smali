.class public final Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/mobile_voice_overlay/views/OverlayMenuView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "attributeSetId",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "assets",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;",
        "binding",
        "Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;",
        "getBinding",
        "()Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;",
        "setAssets",
        "",
        "setData",
        "data",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;",
        "mobile_voice_overlay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private assets:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

.field private final binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    move-result-object p1

    const-string v0, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 3
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    const-string v1, "binding.overlayGuildName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {v0, v1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 4
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    const-string v2, "binding.overlayInviteLink"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 5
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    const-string v2, "binding.overlaySwitchChannels"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 6
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    const-string v2, "binding.overlayOpenApp"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 7
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTop:Landroidx/cardview/widget/CardView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 8
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 9
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuBottom:Landroidx/cardview/widget/CardView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 11
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    iget-object v0, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getHeaderPrimary()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 15
    iget-object p1, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayChannelName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 18
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    const-string v0, "binding.overlayGuildName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 19
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    const-string v1, "binding.overlayInviteLink"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 20
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    const-string v1, "binding.overlaySwitchChannels"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 21
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    const-string v1, "binding.overlayOpenApp"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 22
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTop:Landroidx/cardview/widget/CardView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 23
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 24
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 25
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuBottom:Landroidx/cardview/widget/CardView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 26
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 28
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getHeaderPrimary()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    iget-object p1, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayChannelName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 33
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    const-string p3, "binding.overlayGuildName"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, p3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 34
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    const-string v0, "binding.overlayInviteLink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 35
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    const-string v0, "binding.overlaySwitchChannels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 36
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    const-string v0, "binding.overlayOpenApp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 37
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTop:Landroidx/cardview/widget/CardView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result p3

    invoke-virtual {p2, p3}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 38
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 39
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result p3

    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 40
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuBottom:Landroidx/cardview/widget/CardView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result p3

    invoke-virtual {p2, p3}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 41
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    iget-object p2, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getHeaderPrimary()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    iget-object p1, p1, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayChannelName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method public final getBinding()Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    return-object v0
.end method

.method public final setAssets(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V
    .locals 2

    .line 1
    const-string v0, "assets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->assets:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->srcToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getUseSpeaker()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "setAssets$lambda$0"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->Speaker:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->muteToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getMute()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "setAssets$lambda$1"

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->Mic:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 61
    .line 62
    invoke-static {v0, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->disconnectBtn:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getDisconnectFromVoice()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    const-string v1, "setAssets$lambda$2"

    .line 92
    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->Disconnect:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 97
    .line 98
    invoke-static {v0, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 117
    .line 118
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getGetInvite()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 128
    .line 129
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getSwitchChannels()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 139
    .line 140
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getOpenDiscord()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    return-void
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
.end method

.method public final setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    .line 9
    .line 10
    const-string v1, "binding.overlayInviteLink"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->getCanGenerateInvite()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v1, 0x8

    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->muteToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 31
    .line 32
    const-string v1, "binding.muteToggle"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->getMuted()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->MicMutedDark:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->Mic:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 47
    .line 48
    :goto_1
    invoke-static {v0, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayNetworkIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 54
    .line 55
    const-string v1, "binding.overlayNetworkIcon"

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->getConnectionQuality()Lcom/discord/mobile_voice_overlay/ConnectionQuality;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    aget v1, v2, v1

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    if-eq v1, v2, :cond_5

    .line 74
    .line 75
    const/4 v2, 0x2

    .line 76
    if-eq v1, v2, :cond_4

    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    if-eq v1, v2, :cond_3

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    if-ne v1, v2, :cond_2

    .line 83
    .line 84
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->CallStatusUnknown:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-instance p1, Llf/q;

    .line 88
    .line 89
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_3
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->CallStatusRed:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->CallStatusYellow:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->CallStatusGreen:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 100
    .line 101
    :goto_2
    invoke-static {v0, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->getGuildName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;->binding:Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 116
    .line 117
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayChannelName:Landroid/widget/TextView;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->getChannelName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    return-void
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
.end method
