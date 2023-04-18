.class public final Lic/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsc/b<",
            "Lic/i;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lic/d<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lic/n$b;->b:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lic/n$b;->c:Ljava/util/List;

    .line 17
    .line 18
    iput-object p1, p0, Lic/n$b;->a:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static synthetic a(Lic/i;)Lic/i;
    .locals 0

    invoke-static {p0}, Lic/n$b;->f(Lic/i;)Lic/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Lic/i;)Lic/i;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public b(Lic/d;)Lic/n$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/d<",
            "*>;)",
            "Lic/n$b;"
        }
    .end annotation

    iget-object v0, p0, Lic/n$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Lic/i;)Lic/n$b;
    .locals 2

    iget-object v0, p0, Lic/n$b;->b:Ljava/util/List;

    new-instance v1, Lic/o;

    invoke-direct {v1, p1}, Lic/o;-><init>(Lic/i;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d(Ljava/util/Collection;)Lic/n$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lsc/b<",
            "Lic/i;",
            ">;>;)",
            "Lic/n$b;"
        }
    .end annotation

    iget-object v0, p0, Lic/n$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public e()Lic/n;
    .locals 5

    new-instance v0, Lic/n;

    iget-object v1, p0, Lic/n$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lic/n$b;->b:Ljava/util/List;

    iget-object v3, p0, Lic/n$b;->c:Ljava/util/List;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lic/n;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;Ljava/util/Collection;Lic/n$a;)V

    return-object v0
.end method
