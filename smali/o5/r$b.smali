.class Lo5/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/r;->v(Lo5/i$a;)Lcom/facebook/common/references/CloseableReference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz3/c<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo5/i$a;

.field final synthetic b:Lo5/r;


# direct methods
.method constructor <init>(Lo5/r;Lo5/i$a;)V
    .locals 0

    iput-object p1, p0, Lo5/r$b;->b:Lo5/r;

    iput-object p2, p0, Lo5/r$b;->a:Lo5/i$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public release(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget-object p1, p0, Lo5/r$b;->b:Lo5/r;

    iget-object v0, p0, Lo5/r$b;->a:Lo5/i$a;

    invoke-static {p1, v0}, Lo5/r;->g(Lo5/r;Lo5/i$a;)V

    return-void
.end method
