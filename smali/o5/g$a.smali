.class Lo5/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/g;->a(Lcom/facebook/common/internal/Supplier;Ly3/c;Lo5/s$a;Lo5/i$b;)Lo5/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/x<",
        "Lu5/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo5/g;


# direct methods
.method constructor <init>(Lo5/g;)V
    .locals 0

    iput-object p1, p0, Lo5/g$a;->a:Lo5/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lu5/c;

    invoke-virtual {p0, p1}, Lo5/g$a;->b(Lu5/c;)I

    move-result p1

    return p1
.end method

.method public b(Lu5/c;)I
    .locals 0

    invoke-virtual {p1}, Lu5/c;->f()I

    move-result p1

    return p1
.end method
