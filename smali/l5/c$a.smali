.class Ll5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll5/c;-><init>(Lcom/facebook/cache/common/CacheKey;Lo5/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/i$b<",
        "Lcom/facebook/cache/common/CacheKey;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ll5/c;


# direct methods
.method constructor <init>(Ll5/c;)V
    .locals 0

    iput-object p1, p0, Ll5/c$a;->a:Ll5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Lcom/facebook/cache/common/CacheKey;

    invoke-virtual {p0, p1, p2}, Ll5/c$a;->b(Lcom/facebook/cache/common/CacheKey;Z)V

    return-void
.end method

.method public b(Lcom/facebook/cache/common/CacheKey;Z)V
    .locals 1

    iget-object v0, p0, Ll5/c$a;->a:Ll5/c;

    invoke-virtual {v0, p1, p2}, Ll5/c;->f(Lcom/facebook/cache/common/CacheKey;Z)V

    return-void
.end method
