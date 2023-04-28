.class public final Lcom/discord/theme/utils/ColorUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0001H\u0007\u001a \u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0001H\u0007\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u001b\u0010\u000b\u001a\u00020\u000c*\u00020\r2\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u000b\u001a\u00020\u000c*\u00020\u00102\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "getColorCompat",
        "",
        "Landroid/content/Context;",
        "id",
        "Landroid/view/View;",
        "colorRes",
        "getThemeColor",
        "lightColorRes",
        "darkColorRes",
        "theme",
        "Lcom/discord/theme/DiscordTheme;",
        "setTintColor",
        "",
        "Landroid/widget/ImageView;",
        "colorInt",
        "(Landroid/widget/ImageView;Ljava/lang/Integer;)V",
        "Lcom/facebook/drawee/view/SimpleDraweeView;",
        "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V",
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
.method public static final getColorCompat(Landroid/content/Context;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I

    move-result p0

    return p0
.end method

.method public static final getColorCompat(Landroid/view/View;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method public static final getThemeColor(Landroid/content/Context;II)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result p0

    return p0
.end method

.method public static final getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3, p1, p2}, Lcom/discord/theme/DiscordTheme;->getColorRes(II)I

    move-result p1

    invoke-static {p0, p1}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method public static final setTintColor(Landroid/widget/ImageView;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Landroidx/core/widget/h;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static final setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->clearColorFilter()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, p1, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method
