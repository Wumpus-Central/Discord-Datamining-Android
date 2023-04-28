.class final Lcom/discord/chat/presentation/message/decorations/SpineDrawer$lineDrawable$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/decorations/SpineDrawer;-><init>(Landroid/content/Context;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/graphics/drawable/PaintDrawable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/drawable/PaintDrawable;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/decorations/SpineDrawer;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/decorations/SpineDrawer;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/decorations/SpineDrawer$lineDrawable$2;->this$0:Lcom/discord/chat/presentation/message/decorations/SpineDrawer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/graphics/drawable/PaintDrawable;
    .locals 3

    .line 2
    new-instance v0, Landroid/graphics/drawable/PaintDrawable;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundAccent()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    iget-object v1, p0, Lcom/discord/chat/presentation/message/decorations/SpineDrawer$lineDrawable$2;->this$0:Lcom/discord/chat/presentation/message/decorations/SpineDrawer;

    .line 3
    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/decorations/SpineDrawer;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/discord/chat/R$dimen;->spine_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;->setIntrinsicWidth(I)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/decorations/SpineDrawer$lineDrawable$2;->invoke()Landroid/graphics/drawable/PaintDrawable;

    move-result-object v0

    return-object v0
.end method
