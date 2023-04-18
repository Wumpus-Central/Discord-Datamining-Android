.class public final Lcom/discord/chat/presentation/message/MessageHighlightHeader;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageHighlightHeader;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;",
        "chat_release"
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
.field private final binding:Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/MessageHighlightHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;

    move-result-object p2

    const-string v0, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageHighlightHeader;->binding:Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;

    .line 4
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;->header:Landroid/widget/TextView;

    .line 5
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getTextBrand()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v1, "_init_$lambda$0"

    .line 6
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {v0, v1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 7
    sget-object v1, Lcom/discord/react_strings/I18nMessage;->HIGHLIGHT:Lcom/discord/react_strings/I18nMessage;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v1, v2, v3, v2}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p2, Lcom/discord/chat/databinding/MessageHighlightHeaderBinding;->highlightIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string p2, "binding.highlightIcon"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/discord/react_asset_fetcher/ReactAsset;->Highlight:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p1, p2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageHighlightHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method
