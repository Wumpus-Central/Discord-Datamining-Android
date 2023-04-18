.class final Lo5/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/m;->a(Lcom/facebook/common/internal/Supplier;Ly3/c;)Lo5/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/x<",
        "Ly3/g;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ly3/g;

    invoke-virtual {p0, p1}, Lo5/m$a;->b(Ly3/g;)I

    move-result p1

    return p1
.end method

.method public b(Ly3/g;)I
    .locals 0

    invoke-interface {p1}, Ly3/g;->size()I

    move-result p1

    return p1
.end method
