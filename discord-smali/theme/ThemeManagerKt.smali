.class public final Lcom/discord/theme/ThemeManagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Theme",
        "Lcom/discord/theme/DiscordTheme;",
        "getTheme",
        "()Lcom/discord/theme/DiscordTheme;",
        "theme_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getTheme()Lcom/discord/theme/DiscordTheme;
    .locals 2

    sget-object v0, Lcom/discord/theme/ThemeManager;->INSTANCE:Lcom/discord/theme/ThemeManager;

    invoke-virtual {v0}, Lcom/discord/theme/ThemeManager;->getThemeOverride()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/discord/theme/ThemeManager;->getCurrentTheme$theme_release()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    :cond_0
    return-object v1
.end method
