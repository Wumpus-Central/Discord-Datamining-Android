.class public final Ltimber/log/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltimber/log/a$c;,
        Ltimber/log/a$a;,
        Ltimber/log/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Ltimber/log/a;",
        "",
        "<init>",
        "()V",
        "a",
        "b",
        "c",
        "timber_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final a:Ltimber/log/a$b;

.field private static final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ltimber/log/a$c;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile c:[Ltimber/log/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltimber/log/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltimber/log/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltimber/log/a;->a:Ltimber/log/a$b;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ltimber/log/a;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    new-array v0, v0, [Ltimber/log/a$c;

    .line 18
    .line 19
    sput-object v0, Ltimber/log/a;->c:[Ltimber/log/a$c;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/AssertionError;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
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
.end method

.method public static final synthetic a()[Ltimber/log/a$c;
    .locals 1

    sget-object v0, Ltimber/log/a;->c:[Ltimber/log/a$c;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Ltimber/log/a;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static final synthetic c([Ltimber/log/a$c;)V
    .locals 0

    sput-object p0, Ltimber/log/a;->c:[Ltimber/log/a$c;

    return-void
.end method
