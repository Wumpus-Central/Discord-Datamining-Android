.class final Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/markdown/MarkdownRules;->createMarkdownRules(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/text/style/BulletSpan;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Landroid/text/style/BulletSpan;",
        "R",
        "S",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;

    invoke-direct {v0}, Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;-><init>()V

    sput-object v0, Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;->INSTANCE:Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/text/style/BulletSpan;
    .locals 3

    .line 2
    new-instance v0, Landroid/text/style/BulletSpan;

    const-string v1, "#6E7B7F"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x18

    invoke-direct {v0, v2, v1}, Landroid/text/style/BulletSpan;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/simpleast/markdown/MarkdownRules$createMarkdownRules$1;->invoke()Landroid/text/style/BulletSpan;

    move-result-object v0

    return-object v0
.end method
