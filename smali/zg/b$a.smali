.class public final Lzg/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lzg/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzg/b$a;

    invoke-direct {v0}, Lzg/b$a;-><init>()V

    sput-object v0, Lzg/b$a;->a:Lzg/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/u;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Llh/f;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, Lzg/b$a;->g(Llh/f;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Llh/f;)Lch/w;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/u;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/u;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public f(Llh/f;)Lch/n;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Llh/f;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            ")",
            "Ljava/util/List<",
            "Lch/r;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
