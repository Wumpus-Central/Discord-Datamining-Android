.class final Lcom/discord/simpleast/code/CodeStyleProvidersKt$emptyProvider$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/code/CodeStyleProvidersKt;->emptyProvider()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RC:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0004\u0010\u0000\u001a\u0006\u0012\u0002\u0008\u00030\u0001\"\u0004\u0008\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "R",
        "it",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Iterable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/simpleast/code/CodeStyleProvidersKt$emptyProvider$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/simpleast/code/CodeStyleProvidersKt$emptyProvider$1;

    invoke-direct {v0}, Lcom/discord/simpleast/code/CodeStyleProvidersKt$emptyProvider$1;-><init>()V

    sput-object v0, Lcom/discord/simpleast/code/CodeStyleProvidersKt$emptyProvider$1;->INSTANCE:Lcom/discord/simpleast/code/CodeStyleProvidersKt$emptyProvider$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)",
            "Ljava/lang/Iterable<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
