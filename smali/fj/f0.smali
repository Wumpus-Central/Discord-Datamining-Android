.class public abstract Lfj/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj/f0$b;
    }
.end annotation


# static fields
.field public static final a:Lfj/f0;

.field public static final b:Lfj/f0;

.field public static final c:Lfj/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lfj/f0;->a(I)Lfj/f0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lfj/f0;->a:Lfj/f0;

    .line 7
    .line 8
    const/16 v0, -0x5460

    .line 9
    .line 10
    invoke-static {v0}, Lfj/f0;->a(I)Lfj/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lfj/f0;->b:Lfj/f0;

    .line 15
    .line 16
    const/16 v0, 0x5460

    .line 17
    .line 18
    invoke-static {v0}, Lfj/f0;->a(I)Lfj/f0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lfj/f0;->c:Lfj/f0;

    .line 23
    .line 24
    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)Lfj/f0;
    .locals 2

    new-instance v0, Lfj/f0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfj/f0$b;-><init>(ILfj/f0$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract b(Lfj/g;Lnet/time4j/tz/k;)I
.end method
