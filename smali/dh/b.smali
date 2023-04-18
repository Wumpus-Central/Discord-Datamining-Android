.class final Ldh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/c;


# static fields
.field public static final a:Ldh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldh/b;

    invoke-direct {v0}, Ldh/b;-><init>()V

    sput-object v0, Ldh/b;->a:Ldh/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
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
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/f;",
            "Lrh/g<",
            "*>;>;"
        }
    .end annotation

    invoke-direct {p0}, Ldh/b;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public d()Llh/c;
    .locals 1

    invoke-static {p0}, Lng/c$a;->a(Lng/c;)Llh/c;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ldi/g0;
    .locals 1

    invoke-direct {p0}, Ldh/b;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public j()Lmg/a1;
    .locals 1

    invoke-direct {p0}, Ldh/b;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "[EnhancedType]"

    return-object v0
.end method
