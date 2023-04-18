.class Ls1/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/a;->k(Ljava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ls1/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ls1/a;


# direct methods
.method constructor <init>(Ls1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls1/a$g;->b:Ls1/a;

    iput-object p2, p0, Ls1/a$g;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ls1/b$a;
    .locals 2

    iget-object v0, p0, Ls1/a$g;->b:Ls1/a;

    iget-object v0, v0, Ls1/a;->b:Ljava/util/Map;

    iget-object v1, p0, Ls1/a$g;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/b$a;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls1/a$g;->a()Ls1/b$a;

    move-result-object v0

    return-object v0
.end method
