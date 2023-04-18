.class Lgj/w$h;
.super Lgj/w$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lgj/w$b<",
        "TU;>;"
    }
.end annotation


# instance fields
.field private final b:Lgj/w$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/w$e<",
            "TU;>;"
        }
    .end annotation
.end field

.field private final c:Lgj/w$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgj/w$b<",
            "TU;>;"
        }
    .end annotation
.end field

.field private final d:Lgj/p;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lgj/n;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:I


# direct methods
.method private constructor <init>(ILgj/w$e;Lgj/w$b;Lgj/p;Ljava/util/Map;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgj/w$e<",
            "TU;>;",
            "Lgj/w$b<",
            "TU;>;",
            "Lgj/p;",
            "Ljava/util/Map<",
            "Lgj/n;",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1}, Lgj/w$b;-><init>(I)V

    .line 12
    iput-object p2, p0, Lgj/w$h;->b:Lgj/w$e;

    .line 13
    iput-object p3, p0, Lgj/w$h;->c:Lgj/w$b;

    .line 14
    iput-object p4, p0, Lgj/w$h;->d:Lgj/p;

    .line 15
    iput-object p5, p0, Lgj/w$h;->e:Ljava/util/Map;

    .line 16
    iput p6, p0, Lgj/w$h;->f:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lgj/p;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;",
            "Ljava/lang/String;",
            "Lgj/p;",
            "Ljava/util/Map<",
            "Lgj/n;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lgj/w$b;-><init>(I)V

    .line 3
    new-instance v0, Lgj/w$e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x12

    const/4 v6, 0x0

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lgj/w$e;-><init>(IIILjava/lang/Object;Lgj/w$a;)V

    iput-object v0, p0, Lgj/w$h;->b:Lgj/w$e;

    .line 4
    new-instance p1, Lgj/w$d;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, p2, v0, v1}, Lgj/w$d;-><init>(Ljava/lang/String;ZLgj/w$a;)V

    iput-object p1, p0, Lgj/w$h;->c:Lgj/w$b;

    .line 5
    iput-object p3, p0, Lgj/w$h;->d:Lgj/p;

    .line 6
    iput-object p4, p0, Lgj/w$h;->e:Ljava/util/Map;

    .line 7
    invoke-interface {p4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const p2, 0x7fffffff

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 8
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    if-ge p4, p2, :cond_0

    .line 9
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    goto :goto_0

    .line 10
    :cond_1
    iput p2, p0, Lgj/w$h;->f:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lgj/p;Ljava/util/Map;Lgj/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lgj/w$h;-><init>(Ljava/lang/Object;Ljava/lang/String;Lgj/p;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lgj/w$h;->f:I

    return v0
.end method

.method b(I)Lgj/w$b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lgj/w$b<",
            "TU;>;"
        }
    .end annotation

    new-instance v7, Lgj/w$h;

    iget-object v2, p0, Lgj/w$h;->b:Lgj/w$e;

    iget-object v3, p0, Lgj/w$h;->c:Lgj/w$b;

    iget-object v4, p0, Lgj/w$h;->d:Lgj/p;

    iget-object v5, p0, Lgj/w$h;->e:Ljava/util/Map;

    iget v6, p0, Lgj/w$h;->f:I

    move-object v0, v7

    move v1, p1

    invoke-direct/range {v0 .. v6}, Lgj/w$h;-><init>(ILgj/w$e;Lgj/w$b;Lgj/p;Ljava/util/Map;I)V

    return-object v7
.end method
