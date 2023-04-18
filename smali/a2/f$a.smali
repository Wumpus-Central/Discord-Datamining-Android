.class La2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La2/f;->f(La2/d;Ljava/util/concurrent/Executor;La2/c;)La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La2/d<",
        "TTResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La2/g;

.field final synthetic b:La2/d;

.field final synthetic c:Ljava/util/concurrent/Executor;

.field final synthetic d:La2/f;


# direct methods
.method constructor <init>(La2/f;La2/g;La2/d;Ljava/util/concurrent/Executor;La2/c;)V
    .locals 0

    iput-object p1, p0, La2/f$a;->d:La2/f;

    iput-object p2, p0, La2/f$a;->a:La2/g;

    iput-object p3, p0, La2/f$a;->b:La2/d;

    iput-object p4, p0, La2/f$a;->c:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(La2/f;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, La2/f$a;->b(La2/f;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(La2/f;)Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/f<",
            "TTResult;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    iget-object v0, p0, La2/f$a;->a:La2/g;

    iget-object v1, p0, La2/f$a;->b:La2/d;

    iget-object v2, p0, La2/f$a;->c:Ljava/util/concurrent/Executor;

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v2, v3}, La2/f;->a(La2/g;La2/d;La2/f;Ljava/util/concurrent/Executor;La2/c;)V

    return-object v3
.end method
