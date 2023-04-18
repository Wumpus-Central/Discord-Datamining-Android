.class final Lbc/v1$a;
.super Lbc/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/y0<",
        "TK;>;"
    }
.end annotation


# instance fields
.field private final m:Lbc/v1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/v1<",
            "TK;*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lbc/v1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/v1<",
            "TK;*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbc/y0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/v1$a;->m:Lbc/v1;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lbc/v1$a;->m:Lbc/v1;

    invoke-virtual {v0, p1}, Lbc/l0;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget-object v0, p0, Lbc/v1$a;->m:Lbc/v1;

    iget-object v0, v0, Lbc/v1;->o:[Ljava/util/Map$Entry;

    aget-object p1, v0, p1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lbc/v1$a;->m:Lbc/v1;

    invoke-virtual {v0}, Lbc/v1;->size()I

    move-result v0

    return v0
.end method
