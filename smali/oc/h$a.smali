.class public final Loc/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmc/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loc/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lmc/b<",
        "Loc/h$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:Llc/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llc/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Llc/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Llc/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:Llc/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llc/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loc/g;

    invoke-direct {v0}, Loc/g;-><init>()V

    sput-object v0, Loc/h$a;->d:Llc/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Loc/h$a;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Loc/h$a;->b:Ljava/util/Map;

    .line 17
    .line 18
    sget-object v0, Loc/h$a;->d:Llc/d;

    .line 19
    .line 20
    iput-object v0, p0, Loc/h$a;->c:Llc/d;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public static synthetic b(Ljava/lang/Object;Llc/e;)V
    .locals 0

    invoke-static {p0, p1}, Loc/h$a;->e(Ljava/lang/Object;Llc/e;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Object;Llc/e;)V
    .locals 2

    .line 1
    new-instance p1, Llc/b;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "Couldn\'t find encoder for type "

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {p1, p0}, Llc/b;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Llc/d;)Lmc/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Loc/h$a;->f(Ljava/lang/Class;Llc/d;)Loc/h$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Loc/h;
    .locals 4

    new-instance v0, Loc/h;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Loc/h$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Loc/h$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, Loc/h$a;->c:Llc/d;

    invoke-direct {v0, v1, v2, v3}, Loc/h;-><init>(Ljava/util/Map;Ljava/util/Map;Llc/d;)V

    return-object v0
.end method

.method public d(Lmc/a;)Loc/h$a;
    .locals 0

    invoke-interface {p1, p0}, Lmc/a;->a(Lmc/b;)V

    return-object p0
.end method

.method public f(Ljava/lang/Class;Llc/d;)Loc/h$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TU;>;",
            "Llc/d<",
            "-TU;>;)",
            "Loc/h$a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loc/h$a;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Loc/h$a;->b:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
