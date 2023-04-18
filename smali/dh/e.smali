.class public final Ldh/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh/e$a;
    }
.end annotation


# static fields
.field public static final e:Ldh/e$a;

.field private static final f:Ldh/e;


# instance fields
.field private final a:Ldh/h;

.field private final b:Ldh/f;

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ldh/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldh/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldh/e;->e:Ldh/e$a;

    .line 8
    .line 9
    new-instance v0, Ldh/e;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/16 v7, 0x8

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    move-object v2, v0

    .line 19
    invoke-direct/range {v2 .. v8}, Ldh/e;-><init>(Ldh/h;Ldh/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ldh/e;->f:Ldh/e;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ldh/h;Ldh/f;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldh/e;->a:Ldh/h;

    .line 3
    iput-object p2, p0, Ldh/e;->b:Ldh/f;

    .line 4
    iput-boolean p3, p0, Ldh/e;->c:Z

    .line 5
    iput-boolean p4, p0, Ldh/e;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Ldh/h;Ldh/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ldh/e;-><init>(Ldh/h;Ldh/f;ZZ)V

    return-void
.end method

.method public static final synthetic a()Ldh/e;
    .locals 1

    sget-object v0, Ldh/e;->f:Ldh/e;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Ldh/e;->c:Z

    return v0
.end method

.method public final c()Ldh/f;
    .locals 1

    iget-object v0, p0, Ldh/e;->b:Ldh/f;

    return-object v0
.end method

.method public final d()Ldh/h;
    .locals 1

    iget-object v0, p0, Ldh/e;->a:Ldh/h;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Ldh/e;->d:Z

    return v0
.end method
