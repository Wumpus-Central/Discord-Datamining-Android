.class public final Lcom/linecorp/apng/ApngDrawable$a;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/linecorp/apng/ApngDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bB\u0011\u0008\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001dJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000eR\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u000b\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/linecorp/apng/ApngDrawable$a;",
        "Landroid/graphics/drawable/Drawable$ConstantState;",
        "Landroid/graphics/drawable/Drawable;",
        "newDrawable",
        "",
        "getChangingConfigurations",
        "Lcom/linecorp/apng/decoder/Apng;",
        "a",
        "Lcom/linecorp/apng/decoder/Apng;",
        "()Lcom/linecorp/apng/decoder/Apng;",
        "apng",
        "b",
        "I",
        "d",
        "()I",
        "width",
        "c",
        "height",
        "getSourceDensity",
        "sourceDensity",
        "Lkotlin/Function0;",
        "",
        "e",
        "Lkotlin/jvm/functions/Function0;",
        "()Lkotlin/jvm/functions/Function0;",
        "currentTimeProvider",
        "<init>",
        "(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V",
        "apngState",
        "(Lcom/linecorp/apng/ApngDrawable$a;)V",
        "apng-drawable_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private final a:Lcom/linecorp/apng/decoder/Apng;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/linecorp/apng/ApngDrawable$a;)V
    .locals 7

    const-string v0, "apngState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p1, Lcom/linecorp/apng/ApngDrawable$a;->a:Lcom/linecorp/apng/decoder/Apng;

    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng;->copy()Lcom/linecorp/apng/decoder/Apng;

    move-result-object v2

    .line 4
    iget v3, p1, Lcom/linecorp/apng/ApngDrawable$a;->b:I

    .line 5
    iget v4, p1, Lcom/linecorp/apng/ApngDrawable$a;->c:I

    .line 6
    iget v5, p1, Lcom/linecorp/apng/ApngDrawable$a;->d:I

    .line 7
    iget-object v6, p1, Lcom/linecorp/apng/ApngDrawable$a;->e:Lkotlin/jvm/functions/Function0;

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v6}, Lcom/linecorp/apng/ApngDrawable$a;-><init>(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public constructor <init>(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/linecorp/apng/decoder/Apng;",
            "III",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "apng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentTimeProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iput-object p1, p0, Lcom/linecorp/apng/ApngDrawable$a;->a:Lcom/linecorp/apng/decoder/Apng;

    iput p2, p0, Lcom/linecorp/apng/ApngDrawable$a;->b:I

    iput p3, p0, Lcom/linecorp/apng/ApngDrawable$a;->c:I

    iput p4, p0, Lcom/linecorp/apng/ApngDrawable$a;->d:I

    iput-object p5, p0, Lcom/linecorp/apng/ApngDrawable$a;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 1
    sget-object p5, Lcom/linecorp/apng/ApngDrawable$a$a;->k:Lcom/linecorp/apng/ApngDrawable$a$a;

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/linecorp/apng/ApngDrawable$a;-><init>(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/linecorp/apng/decoder/Apng;
    .locals 1

    iget-object v0, p0, Lcom/linecorp/apng/ApngDrawable$a;->a:Lcom/linecorp/apng/decoder/Apng;

    return-object v0
.end method

.method public final b()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/linecorp/apng/ApngDrawable$a;->e:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/ApngDrawable$a;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/ApngDrawable$a;->b:I

    return v0
.end method

.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lcom/linecorp/apng/ApngDrawable;

    new-instance v1, Lcom/linecorp/apng/ApngDrawable$a;

    invoke-direct {v1, p0}, Lcom/linecorp/apng/ApngDrawable$a;-><init>(Lcom/linecorp/apng/ApngDrawable$a;)V

    invoke-direct {v0, v1}, Lcom/linecorp/apng/ApngDrawable;-><init>(Lcom/linecorp/apng/ApngDrawable$a;)V

    return-object v0
.end method
