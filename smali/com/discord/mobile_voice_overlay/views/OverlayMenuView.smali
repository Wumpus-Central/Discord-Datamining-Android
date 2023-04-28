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
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
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
    new-instance p1, Lnf/q;

    .line 88
    .line 89
    invoke-direct {p1}, Lnf/q;-><init>()V

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
.end method
