.class final Lo5/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/n;->a(Lo5/s;Lo5/o;)Lo5/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/t<",
        "Lcom/facebook/cache/common/CacheKey;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo5/o;


# direct methods
.method constructor <init>(Lo5/o;)V
    .locals 0

    iput-object p1, p0, Lo5/n$a;->a:Lo5/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/cache/common/CacheKey;

    invoke-virtual {p0, p1}, Lo5/n$a;->d(Lcom/facebook/cache/common/CacheKey;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/cache/common/CacheKey;

    invoke-virtual {p0, p1}, Lo5/n$a;->e(Lcom/facebook/cache/common/CacheKey;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/cache/common/CacheKey;

    invoke-virtual {p0, p1}, Lo5/n$a;->f(Lcom/facebook/cache/common/CacheKey;)V

    return-void
.end method

.method public d(Lcom/facebook/cache/common/CacheKey;)V
    .locals 1

    iget-object v0, p0, Lo5/n$a;->a:Lo5/o;

    invoke-interface {v0, p1}, Lo5/o;->f(Lcom/facebook/cache/common/CacheKey;)V

    return-void
.end method

.method public e(Lcom/facebook/cache/common/CacheKey;)V
    .locals 1

    iget-object v0, p0, Lo5/n$a;->a:Lo5/o;

    invoke-interface {v0, p1}, Lo5/o;->a(Lcom/facebook/cache/common/CacheKey;)V

    return-void
.end method

.method public f(Lcom/facebook/cache/common/CacheKey;)V
    .locals 1

    iget-object v0, p0, Lo5/n$a;->a:Lo5/o;

    invoke-interface {v0, p1}, Lo5/o;->l(Lcom/facebook/cache/common/CacheKey;)V

    return-void
.end method
