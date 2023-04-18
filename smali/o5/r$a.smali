.class Lo5/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/r;->z(Lo5/x;)Lo5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/x<",
        "Lo5/i$a<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo5/x;

.field final synthetic b:Lo5/r;


# direct methods
.method constructor <init>(Lo5/r;Lo5/x;)V
    .locals 0

    iput-object p1, p0, Lo5/r$a;->b:Lo5/r;

    iput-object p2, p0, Lo5/r$a;->a:Lo5/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lo5/i$a;

    invoke-virtual {p0, p1}, Lo5/r$a;->b(Lo5/i$a;)I

    move-result p1

    return p1
.end method

.method public b(Lo5/i$a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/i$a<",
            "TK;TV;>;)I"
        }
    .end annotation

    iget-object v0, p0, Lo5/r$a;->a:Lo5/x;

    iget-object p1, p1, Lo5/i$a;->b:Lcom/facebook/common/references/CloseableReference;

    invoke-virtual {p1}, Lcom/facebook/common/references/CloseableReference;->F()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lo5/x;->a(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
