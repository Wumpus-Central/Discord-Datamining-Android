.class public Lnh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh/g$a;
    }
.end annotation


# static fields
.field private static final b:Lnh/g;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnh/g$a;",
            "Lnh/i$f<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnh/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lnh/g;-><init>(Z)V

    sput-object v0, Lnh/g;->b:Lnh/g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnh/g;->a:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lnh/g;->a:Ljava/util/Map;

    return-void
.end method

.method public static c()Lnh/g;
    .locals 1

    sget-object v0, Lnh/g;->b:Lnh/g;

    return-object v0
.end method

.method public static d()Lnh/g;
    .locals 1

    new-instance v0, Lnh/g;

    invoke-direct {v0}, Lnh/g;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(Lnh/i$f;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$f<",
            "**>;)V"
        }
    .end annotation

    iget-object v0, p0, Lnh/g;->a:Ljava/util/Map;

    new-instance v1, Lnh/g$a;

    invoke-virtual {p1}, Lnh/i$f;->b()Lnh/q;

    move-result-object v2

    invoke-virtual {p1}, Lnh/i$f;->d()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lnh/g$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Lnh/q;I)Lnh/i$f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lnh/q;",
            ">(TContainingType;I)",
            "Lnh/i$f<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lnh/g;->a:Ljava/util/Map;

    new-instance v1, Lnh/g$a;

    invoke-direct {v1, p1, p2}, Lnh/g$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnh/i$f;

    return-object p1
.end method
