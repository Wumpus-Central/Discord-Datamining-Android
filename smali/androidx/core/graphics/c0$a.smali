.class Landroidx/core/graphics/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/graphics/c0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/graphics/c0;->f([Landroidx/core/provider/g$b;I)Landroidx/core/provider/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/core/graphics/c0$b<",
        "Landroidx/core/provider/g$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/graphics/c0;


# direct methods
.method constructor <init>(Landroidx/core/graphics/c0;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/graphics/c0$a;->a:Landroidx/core/graphics/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/core/provider/g$b;

    invoke-virtual {p0, p1}, Landroidx/core/graphics/c0$a;->c(Landroidx/core/provider/g$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroidx/core/provider/g$b;

    invoke-virtual {p0, p1}, Landroidx/core/graphics/c0$a;->d(Landroidx/core/provider/g$b;)Z

    move-result p1

    return p1
.end method

.method public c(Landroidx/core/provider/g$b;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/core/provider/g$b;->e()I

    move-result p1

    return p1
.end method

.method public d(Landroidx/core/provider/g$b;)Z
    .locals 0

    invoke-virtual {p1}, Landroidx/core/provider/g$b;->f()Z

    move-result p1

    return p1
.end method
