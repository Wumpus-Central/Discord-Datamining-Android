.class final Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/textutils/EmojiRendererKt;->renderEmoji(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/discord/chat/bridge/contentnode/EmojiContentNode;Lcom/discord/chat/presentation/textutils/RenderContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $rc:Lcom/discord/chat/presentation/textutils/RenderContext;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/textutils/RenderContext;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;->invoke(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)V
    .locals 3

    const-string v0, "$this$renderEmojiInto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->D(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 3
    invoke-virtual {p1, v1}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->z(I)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 4
    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerExists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerIsRevealed()Z

    move-result v0

    .line 6
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v2

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getSpoilerRevealedBackground()I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getSpoilerHiddenBackground()I

    move-result v2

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getSpoilerHiddenBackground()I

    move-result v1

    .line 8
    :goto_1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->x(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 9
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->C(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    :cond_2
    return-void
.end method
