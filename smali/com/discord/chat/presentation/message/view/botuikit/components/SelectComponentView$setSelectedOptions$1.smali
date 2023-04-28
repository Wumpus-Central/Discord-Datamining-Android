.class final Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$setSelectedOptions$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->setSelectedOptions(Lcom/google/android/flexbox/FlexboxLayout;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/view/View;",
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
.field final synthetic $inflater:Landroid/view/LayoutInflater;


# direct methods
.method constructor <init>(Landroid/view/LayoutInflater;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$setSelectedOptions$1;->$inflater:Landroid/view/LayoutInflater;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/view/View;
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$setSelectedOptions$1;->$inflater:Landroid/view/LayoutInflater;

    invoke-static {v0}, Lcom/discord/chat/databinding/MessageComponentSelectPillViewBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/discord/chat/databinding/MessageComponentSelectPillViewBinding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/chat/databinding/MessageComponentSelectPillViewBinding;->getRoot()Lcom/google/android/material/textview/MaterialTextView;

    move-result-object v0

    const-string v1, "inflate(inflater).root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v1, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {v0, v1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 4
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundAccent()I

    move-result v2

    const/4 v1, 0x4

    .line 5
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, v0

    .line 6
    invoke-static/range {v1 .. v7}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundRectangle$default(Landroid/view/View;IILjava/lang/Integer;IILjava/lang/Object;)V

    .line 7
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$setSelectedOptions$1;->invoke()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
